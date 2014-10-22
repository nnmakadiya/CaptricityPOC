package com.captricity.api;

import org.json.JSONException;
import org.json.JSONObject;

public class Job {

	private int id;
	private String status;
	private int percent_completed;
	private String name;
	
	
	public Job() {
	}
	
	public Job(JSONObject jsonObject) {
		this();
		try {
			setName(jsonObject.getString("name"));
			setId(jsonObject.getInt("id"));
			setPercent_completed(jsonObject.getInt("percent_completed"));
			setStatus(jsonObject.getString("status"));
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPercent_completed() {
		return percent_completed;
	}
	public void setPercent_completed(int percent_completed) {
		this.percent_completed = percent_completed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id: " + id + "\tname: " + name + "\tpercent_completedt: " + percent_completed
				+ "\tstatus: " + status;
	}
	
}
