package com.captricity.mainfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AuroTechFileMaker {

	
	// It is in the project
	static String csvFile = "employeeDetails.csv";
	
	//Comma separated csv file 
	static String cvsSplitBy = ",";

	// AuroTech file 
	static String auroTechFile = "D://POC_TEST.aurotech";
	
    static BufferedReader br=null;
	
    // Additional 2 columns 
	String addColumn1="Time";
	String addColumn2="Date";

	public static void main(String[] args) {

		try {
			// Read csv file
			br = new BufferedReader(new FileReader(new File(csvFile)));
			String line = null;

			// Create .aurotech file in D:\
			OutputStream os = (OutputStream) new FileOutputStream(new File(auroTechFile));
			String encoding = "UTF8";
			OutputStreamWriter osw = new OutputStreamWriter(os, encoding);
			BufferedWriter bw = new BufferedWriter(osw);
			
			
		    LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(csvFile));
			lineNumberReader.skip(Long.MAX_VALUE);
			int lines = lineNumberReader.getLineNumber()-1;
			
			//Write file header in .aurotech file
			String header="HDR,P3.1,5.0,\"ILM'S Aurotech SYSTEM\",\""+lines+"\",\""+new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime())+"\",,";
			bw.write(header);
			bw.newLine();	

			int skipLine=0;
			// Read the records from .csv file
			while ((line = br.readLine()) != null) {
				skipLine++;
				if(skipLine==1) continue;
				
				// use comma as separator
				String[] cols = line.split(cvsSplitBy);
				System.out.println("Coulmn 1= " + cols[1] + " , Column 2="+ cols[2]);
				
				
				if (cols != null && cols.length > 0) {
					
					System.out.println("col0:"+cols[0]);
					// Write record from .csv file to .aurotech file
					bw.write(cols[0]);
					for (int j = 1; j < cols.length; j++) {
						bw.write(',');
						bw.write(cols[j]);
					}
					
					// add additional column which are not in .csv file but should include in .aurotech file
					bw.write(',');
					bw.write((new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime())));
					bw.write(',');
					bw.write(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
				}
				bw.newLine();
			}
			bw.flush();
			// Close .aurotech file
			bw.close();
		} catch (UnsupportedEncodingException e) {
			System.err.println(e.toString());
		} catch (IOException e) {
			System.err.println(e.toString());
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally { 
			if(br!=null){ 
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}



