package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.FECFileConstant;

public class FECScheduleDRecord {

	public static final String RECORD_NAME = "SD";
	
	private String formType;
	private String filterFECCommitteeId;
	private String debtName;
	private String debtLastName;
	private String debtFirstName;
	private String debtMiddleName;
	private String debtPrefix;
	private String debtSuffix;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private String naturePurposeDebtDescription;
	private String beginningBalance;
	private String incurredThisPeriod;
	private String paymentThisPeriod;
	private String balanceAtClose;
	private String imageNumber;
	
	public String getFormType() {
		if(StringUtils.isBlank(formType)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(formType), 8) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setFormType(String formType) {
		this.formType = formType;
	}
	public String getFilterFECCommitteeId() {
		if(StringUtils.isBlank(filterFECCommitteeId)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(filterFECCommitteeId),9) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setFilterFECCommitteeId(String filterFECCommitteeId) {
		this.filterFECCommitteeId = filterFECCommitteeId;
	}
	public String getDebtName() {
		if(StringUtils.isBlank(debtName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(debtName),200) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setDebtName(String debtName) {
		this.debtName = debtName;
	}
	public String getDebtLastName() {
		if(StringUtils.isBlank(debtLastName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(debtLastName),30) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setDebtLastName(String debtLastName) {
		this.debtLastName = debtLastName;
	}
	public String getDebtFirstName() {
		if(StringUtils.isBlank(debtFirstName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(debtFirstName),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setDebtFirstName(String debtFirstName) {
		this.debtFirstName = debtFirstName;
	}
	public String getDebtMiddleName() {
		if(StringUtils.isBlank(debtMiddleName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(debtMiddleName),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setDebtMiddleName(String debtMiddleName) {
		this.debtMiddleName = debtMiddleName;
	}
	public String getDebtPrefix() {
		if(StringUtils.isBlank(debtPrefix)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(debtPrefix),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setDebtPrefix(String debtPrefix) {
		this.debtPrefix = debtPrefix;
	}
	public String getDebtSuffix() {
		if(StringUtils.isBlank(debtSuffix)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(debtSuffix),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setDebtSuffix(String debtSuffix) {
		this.debtSuffix = debtSuffix;
	}
	public String getStreet1() {
		if(StringUtils.isBlank(street1)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(street1),34) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		if(StringUtils.isBlank(street2)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(street2),34) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		if(StringUtils.isBlank(city)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(city),30) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		if(StringUtils.isBlank(state)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(state),2) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		if(StringUtils.isBlank(zip)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(zip),9) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getNaturePurposeDebtDescription() {
		if(StringUtils.isBlank(naturePurposeDebtDescription)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(naturePurposeDebtDescription),40) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setNaturePurposeDebtDescription(String naturePurposeDebtDescription) {
		this.naturePurposeDebtDescription = naturePurposeDebtDescription;
	}
	public String getBeginningBalance() {
		if(StringUtils.isBlank(beginningBalance)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(beginningBalance, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setBeginningBalance(String beginningBalance) {
		this.beginningBalance = beginningBalance;
	}
	public String getIncurredThisPeriod() {
		if(StringUtils.isBlank(incurredThisPeriod)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(incurredThisPeriod, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIncurredThisPeriod(String incurredThisPeriod) {
		this.incurredThisPeriod = incurredThisPeriod;
	}
	public String getPaymentThisPeriod() {
		if(StringUtils.isBlank(paymentThisPeriod)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(paymentThisPeriod, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setPaymentThisPeriod(String paymentThisPeriod) {
		this.paymentThisPeriod = paymentThisPeriod;
	}
	public String getBalanceAtClose() {
		if(StringUtils.isBlank(balanceAtClose)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(balanceAtClose, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setBalanceAtClose(String balanceAtClose) {
		this.balanceAtClose = balanceAtClose;
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
