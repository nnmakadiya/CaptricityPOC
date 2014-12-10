package com.captricity.constant;

public class FECFileConstant {
	
	public static final String SUMMARY_PREFIX="F3";
	public static final String SCHEDULE_A_PREFIX = "SA";
	public static final String SCHEDULE_B_PREFIX = "SB";
	public static final String SCHEDULE_C_PREFIX = "SC";
	public static final String SCHEDULE_C2_PREFIX = "SC2";
	public static final String SCHEDULE_D_PREFIX = "SD";
	public static final String SCHEDULE_C1_PREFIX = "SC1";
	
	public static final byte COLUMN_SEPARATOR = 28;
	public static final int AMOUNT_LENGTH = 12;
	
	public static final String SUMMARY_PAGE_CHANGE_OF_ADDRESS = "X";
	
	public enum YesNoConstant {
		
		YES("Y","Yes"),
		NO("N","No");
		
		private YesNoConstant(String code, String description){
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
	
	public enum TypeOfReportConstant {
		
		NEW("N","New"),
		AMENDED("A","Amended"),
		TERMINATION("T","Termination");
		
		private TypeOfReportConstant(String code, String description){
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
	
	

}
