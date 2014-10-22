package com.captricity.api;

import org.json.JSONException;
import org.json.JSONObject;

public class Batch {
 
	private int id;
	private String name;
	private String status;
	private int file_count;
	private int related_job_id;
	
	
	public Batch() {
	}

	public Batch(JSONObject jsonObject){
		this();
		try {
			setName(jsonObject.getString("name"));
			setId(jsonObject.getInt("id"));
			setStatus(jsonObject.getString("status"));
			setFile_count(jsonObject.getInt("file_count"));
			setRelated_job_id(jsonObject.getInt("related_job_id"));
		} catch (JSONException e) {
			//e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getFile_count() {
		return file_count;
	}

	public void setFile_count(int file_count) {
		this.file_count = file_count;
	}
	
	
	public int getRelated_job_id() {
		return related_job_id;
	}
	
	public void setRelated_job_id(int related_job_id) {
		this.related_job_id = related_job_id;
	}
	
	@Override
	public String toString() {
		return "id: " + id + "\tname: " + name + "\tstatus: " + status
				+ "\tfile_count: " + file_count + "\trelated_job_id: " + related_job_id;
	}
}
