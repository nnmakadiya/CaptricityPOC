package com.captricity.constant;

public enum SuffixConstant {
	
	JR("Jr."),
	SR("Sr."),
	I("I"),
	II("II"),
	III("III"),
	MD("MD"),
	PHD("PhD"),
	OTHER("Other");
	
	private SuffixConstant(String suffix){
		this.suffix = suffix;
	}
	
	private String suffix;
	
	public String getSuffix(){
		return suffix;
	}
}
