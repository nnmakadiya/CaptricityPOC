package com.captricity.constant;

public enum IdentifyNameConstant {
	
	PERSON("Name of Person"),
	ORGANIZATION("Name of Organization");
	
	private IdentifyNameConstant(String identfyDetail){
		this.identfyDetail = identfyDetail;
	}
	
	private String identfyDetail;

	public String getIdentfyDetail() {
		return identfyDetail;
	}
}
