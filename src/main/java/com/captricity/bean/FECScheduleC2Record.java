package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;
import com.captricity.constant.FECFileConstant;


public class FECScheduleC2Record {
	
	public static final String RECORD_NAME = "SC2";
	
	private String formType;
	private String fecCommitteeId;
	private String indLastName;
	private String indFirstName;
	private String indMiddleName;
	private String indPrefix;
	private String indSuffix;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private String indEmployer;
	private String indOccupation;
	private String amountGuaranteedBalance;
	private String imageNumber;
	
	public String getFormType() {
		if(StringUtils.isBlank(formType)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(formType),8) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setFormType(String formType) {
		this.formType = formType;
	}
	public String getFecCommitteeId() {
		if(StringUtils.isBlank(fecCommitteeId)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(fecCommitteeId),9) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setFecCommitteeId(String fecCommitteeId) {
		this.fecCommitteeId = fecCommitteeId;
	}
	public String getIndLastName() {
		if(StringUtils.isBlank(indLastName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(indLastName),30) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIndLastName(String indLastName) {
		this.indLastName = indLastName;
	}
	public String getIndFirstName() {
		if(StringUtils.isBlank(indFirstName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(indFirstName),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIndFirstName(String indFirstName) {
		this.indFirstName = indFirstName;
	}
	public String getIndMiddleName() {
		if(StringUtils.isBlank(indMiddleName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(indMiddleName),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIndMiddleName(String indMiddleName) {
		this.indMiddleName = indMiddleName;
	}
	public String getIndPrefix() {
		if(StringUtils.isBlank(indPrefix)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(indPrefix),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIndPrefix(String indPrefix) {
		this.indPrefix = indPrefix;
	}
	public String getIndSuffix() {
		if(StringUtils.isBlank(indSuffix)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(indSuffix),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIndSuffix(String indSuffix) {
		this.indSuffix = indSuffix;
	}
	public String getStreet1() {
		if(StringUtils.isBlank(street1)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(street1),34) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		if(StringUtils.isBlank(street2)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(street2),34) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		if(StringUtils.isBlank(city)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(city),30) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		if(StringUtils.isBlank(state)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(state),2) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		if(StringUtils.isBlank(zip)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(zip),9) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getIndEmployer() {
		if(StringUtils.isBlank(indEmployer)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(indEmployer),38) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIndEmployer(String indEmployer) {
		this.indEmployer = indEmployer;
	}
	public String getIndOccupation() {
		if(StringUtils.isBlank(indOccupation)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(indOccupation),38) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIndOccupation(String indOccupation) {
		this.indOccupation = indOccupation;
	}
	public String getAmountGuaranteedBalance() {
		if(StringUtils.isBlank(amountGuaranteedBalance)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(amountGuaranteedBalance, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setAmountGuaranteedBalance(String amountGuaranteedBalance) {
		this.amountGuaranteedBalance = amountGuaranteedBalance;
	}
	public String getImageNumber() {
		if(StringUtils.isBlank(imageNumber)){
			return "";
		}
		return StringUtils.left(StringUtils.upperCase(imageNumber),11);
	}
	public void setImageNumber(String imageNumber) {
		this.imageNumber = imageNumber;
	}
}
