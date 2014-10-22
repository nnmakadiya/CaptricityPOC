package com.captricity.api;

import org.json.JSONException;
import org.json.JSONObject;

public class BatchReadiness {

	private String status;
	private boolean has_files;
	private boolean has_sufficient_fund;
	private int valid_page_count;
	
	public BatchReadiness() {
	}
	
	public BatchReadiness(JSONObject jsonObject) {
		this();
		try {
			setStatus(jsonObject.getString("status"));
			setHas_files(jsonObject.getBoolean("has_files"));
			setHas_sufficient_fund(jsonObject.getBoolean("has_sufficient_funds"));
			setValid_page_count(jsonObject.getInt("valid_page_count"));
		} catch (JSONException e) {
			//e.printStackTrace();
		}
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isHas_files() {
		return has_files;
	}
	public void setHas_files(boolean has_files) {
		this.has_files = has_files;
	}
	public boolean isHas_sufficient_fund() {
		return has_sufficient_fund;
	}
	public void setHas_sufficient_fund(boolean has_sufficient_fund) {
		this.has_sufficient_fund = has_sufficient_fund;
	}
	public int getValid_page_count() {
		return valid_page_count;
	}
	public void setValid_page_count(int valid_page_count) {
		this.valid_page_count = valid_page_count;
	}
	
	
	@Override
	public String toString() {
		return "status: " + status + "\thas_files: " + has_files + "\thas_sufficient_fund: " + has_sufficient_fund
				+ "\tvalid_page_count: " + valid_page_count;
	}
	
}
