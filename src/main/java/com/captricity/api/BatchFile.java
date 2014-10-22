/**
 * 
 */
package com.captricity.api;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author jjvirani
 *
 */
public class BatchFile {
	private int id;
	private String name;
	private int page_count;
	private String reject_reason;
	
	
	public BatchFile() {
	}
	
	public BatchFile(JSONObject jsonObject) {
		this();
		try {
			setName(jsonObject.getString("name"));
			setId(jsonObject.getInt("id"));
			setPage_count(jsonObject.getInt("page_count"));
			setReject_reason(jsonObject.getString("reject_reason"));
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
	public int getPage_count() {
		return page_count;
	}
	public void setPage_count(int page_count) {
		this.page_count = page_count;
	}
	public String getReject_reason() {
		return reject_reason;
	}
	public void setReject_reason(String reject_reason) {
		this.reject_reason = reject_reason;
	}
	
	
	@Override
	public String toString() {
		return "id: " + id + "\tname: " + name + "\tpage_count: " + page_count
				+ "\treject_reason: " + reject_reason;
	}
	
}
