package com.captricity.constant;

public enum PrefixConstant {
	
	MR("Mr."),
	MRS("Mrs."),
	MS("Ms."),
	DR("Dr."),
	LT("Lt."),
	CPT("Cpt."),
	FR("Fr."),
	ATTY("Atty."),
	PROF("Prof."),
	HON("Hon."),
	PRES("Pres."),
	GOV("Gov."),
	OTHER("Other");
	
	private PrefixConstant(String prefix){
		this.prefix = prefix;
	}
	
	private String prefix;
	
	public String getPrefix(){
		return prefix;
	}
}
