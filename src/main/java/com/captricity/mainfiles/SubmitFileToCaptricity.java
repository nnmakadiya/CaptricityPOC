package com.captricity.mainfiles;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.json.JSONObject;

import com.captricity.api.Batch;
import com.captricity.api.BatchFile;
import com.captricity.api.BatchReadiness;
import com.captricity.api.Job;

public class SubmitFileToCaptricity {

	public static final String api_base_url = "https://shreddr.captricity.com/api/v1/";

	public static final String api_auth_token = "cfacdf1a9db8412cb484b58f5ed399ff";

	public static final String api_version = "v1";

	public static final String api_user_agent = "Susheel.Sarin-App";

	public static void main(String args[]) {

		SubmitFileToCaptricity capApi = new SubmitFileToCaptricity();

		// Create Batch file
		Batch batch = capApi.createBatch("BatchFromUnitTesting8");

		// Add file to created batch
		capApi.addFileToBatch(batch,"Employee_Unit_Teting_Form_Data_4.pdf");
		//capApi.addFileToBatch(batch,"Test_Employee_Form_Data_2.pdf");
		//capApi.addFileToBatch(batch,"Unit_Testing_Form_Data_3.pdf");
		

		// Check readiness of the batch after attached file
		capApi.checkBatchReadiness(batch);

		// Submit batch for the process
		capApi.submitBatch(batch);

		// Get latest batch after submitting for the process so that we can get
		// job_id
		Batch updatedBatch = capApi.getBatch(batch.getId());

		// Check the status of the job
		capApi.getJob(updatedBatch.getRelated_job_id());

		// Pass the job_id to see the job related information
		// capApi.getJob(61543);

	}

	
	// Create new Batch
	@SuppressWarnings("deprecation")
	public Batch createBatch(String batchName) {

		String url = "batch/";

		HttpPost postRequest = createAPIPost(url);

		List<NameValuePair> postParams = new ArrayList<NameValuePair>();
		postParams.add(new BasicNameValuePair("name", batchName));

		String responseText = null;
		UrlEncodedFormEntity entity;
		try {
			entity = new UrlEncodedFormEntity(postParams);
			entity.setContentEncoding(HTTP.UTF_8);
			postRequest.setEntity(entity);

			responseText = executeAPICall(postRequest);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Batch batch = new Batch(new JSONObject(responseText));
		System.out.println("\nBatch created  :: " + batch.toString());
		return batch;
	}

	// Attach file to the batch
	public BatchFile addFileToBatch(Batch batch, String fileName) {
		String url = "batch/" + batch.getId() + "/batch-file/";
		HttpPost postRequest = createAPIPost(url);

		File file = new File(fileName);

		MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder
				.create();

		FileBody fileBody = new FileBody(file);

		multipartEntityBuilder.addPart("uploaded_file", fileBody);

		postRequest.setEntity(multipartEntityBuilder.build());

		String responseText = executeAPICall(postRequest);

		BatchFile batchFile = new BatchFile(new JSONObject(responseText));

		System.out.println("\nFile added to batch :: " + batchFile.toString());

		return batchFile;
	}

	// Check the readiness of the batch
	public void checkBatchReadiness(Batch batch) {
		String url = "batch/" + batch.getId() + "/readiness";
		HttpGet getRequest = createAPIGet(url);

		String responseText = executeAPICall(getRequest);

		BatchReadiness batchReadiness = new BatchReadiness(new JSONObject(
				responseText));

		System.out.println("\nBatch Readiness :: " + batchReadiness.toString());
	}

	// Submit batch for the process
	public void submitBatch(Batch batch) {
		String url = "batch/" + batch.getId() + "/submit";
		HttpPost postRequest = createAPIPost(url);

		System.out.println("\nSubmitting Batch : " + batch.getId());

		executeAPICall(postRequest);

		System.out.println("\nBatch Submitted ..");
	}

	// Get the latest information regarding batch
	public Batch getBatch(int id) {

		String url = "batch/" + id;
		HttpGet getRequest = createAPIGet(url);

		String responseText = executeAPICall(getRequest);

		Batch batch = new Batch(new JSONObject(responseText));

		System.out.println("Batch : " + batch);

		return batch;
	}

	// Get the job related information
	public Job getJob(int id) {

		String url = "job/" + id;
		HttpGet getRequest = createAPIGet(url);

		String responseText = executeAPICall(getRequest);

		Job job = new Job(new JSONObject(responseText));

		System.out.println("Job : " + job);

		return job;
	}

	
	// Create Get URL
	private HttpGet createAPIGet(String url) {
		HttpGet http_get = new HttpGet(api_base_url + url);
		System.out.println("\nGET URL: " + api_base_url + url);
		setHeaders(http_get);
		return http_get;
	}

	// Create Post URL
	private HttpPost createAPIPost(String url) {
		HttpPost http_post = new HttpPost(api_base_url + url);
		System.out.println("\nPOST URL: " + api_base_url + url);
		setHeaders(http_post);
		return http_post;
	}

	// Set Header values
	private void setHeaders(HttpRequestBase request) {
		request.addHeader("Accept", "application/json");
		request.addHeader("User-Agent", api_user_agent);
		request.addHeader("X_API_TOKEN", api_auth_token);
		request.addHeader("X_API_VERSION", api_version);
	}

	// Execute URL
	@SuppressWarnings("deprecation")
	private String executeAPICall(HttpRequestBase request) {

		System.out.println("\nSending request to Captricity ...");
		HttpClient httpclient = new DefaultHttpClient();

		// To avoid 301 response
		((DefaultHttpClient) httpclient)
				.setRedirectStrategy(new DefaultRedirectStrategy() {
					public boolean isRedirected(HttpRequest request,
							HttpResponse response, HttpContext context) {
						boolean isRedirect = false;
						try {
							isRedirect = super.isRedirected(request, response,
									context);

						} catch (ProtocolException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if (!isRedirect) {
							int responseCode = response.getStatusLine()
									.getStatusCode();
							if (responseCode == 301 || responseCode == 302) {
								return true;
							}
						}
						return isRedirect;
					}
				});

		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		try {
			String response = httpclient.execute(request, responseHandler);
			// HttpResponse response = httpclient.execute(request);
			System.out.println("\nReceived response from Captricity ...");
			// System.out.println("\nResponse Text: \n" + response);
			return response;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nDidn't received response from Captricity ...");
		return "[]";
	}

}
