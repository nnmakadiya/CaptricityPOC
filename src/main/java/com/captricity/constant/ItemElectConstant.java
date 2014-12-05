package com.captricity.constant;

public enum ItemElectConstant {
	
	PRIMARY("P","Primary"),
	GENERAL("G","General"),
	OTHER("O","Other (specify)");
	
	private ItemElectConstant(String code, String description){
		this.code = code;
		this.description = description;
	}
	
	private String code;
	private String description;

	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
}
