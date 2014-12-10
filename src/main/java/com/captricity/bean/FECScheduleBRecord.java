package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.FECFileConstant;

public class FECScheduleBRecord {
	
	public static final String RECORD_NAME = "SB";
	
	private String formType;
	private String fecCommitteeId;
	private String recipientOrganizationName;
	private String recipientLastName;
	private String recipientFirstName;
	private String recipientMiddleName;
	private String recipientPrefix;
	private String recipientSuffix;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private String dateOfDisbursement;
	private String purposeOfDisbursement;
	private String beneficiaryCommitteeName;
	private String canLastName;
	private String canFirstName;
	private String canMiddleName;
	private String canPrefix;
	private String canSuffix;
	private String categoryCode;
	private String canOffice;
	private String canState;
	private String canDist;
	private String itemElectCode;
	private String itemElectOther;
	private String amountOfDisbursement;
	private String semiAnnualRefundedBundledAmt;
	private String memoTextDescription;
	private String imageNumber;
	
	public String getFormType() {
		if(StringUtils.isBlank(formType)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(formType) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setFormType(String formType) {
		this.formType = formType;
	}
	public String getFecCommitteeId() {
		if(StringUtils.isBlank(fecCommitteeId)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(fecCommitteeId) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setFecCommitteeId(String fecCommitteeId) {
		this.fecCommitteeId = fecCommitteeId;
	}
	public String getRecipientOrganizationName() {
		if(StringUtils.isBlank(recipientOrganizationName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(recipientOrganizationName) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setRecipientOrganizationName(String recipientOrganizationName) {
		this.recipientOrganizationName = recipientOrganizationName;
	}
	public String getRecipientLastName() {
		if(StringUtils.isBlank(recipientLastName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(recipientLastName) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setRecipientLastName(String recipientLastName) {
		this.recipientLastName = recipientLastName;
	}
	public String getRecipientFirstName() {
		if(StringUtils.isBlank(recipientFirstName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(recipientFirstName) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setRecipientFirstName(String recipientFirstName) {
		this.recipientFirstName = recipientFirstName;
	}
	public String getRecipientMiddleName() {
		if(StringUtils.isBlank(recipientMiddleName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(recipientMiddleName) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setRecipientMiddleName(String recipientMiddleName) {
		this.recipientMiddleName = recipientMiddleName;
	}
	public String getRecipientPrefix() {
		if(StringUtils.isBlank(recipientPrefix)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(recipientPrefix) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setRecipientPrefix(String recipientPrefix) {
		this.recipientPrefix = recipientPrefix;
	}
	public String getRecipientSuffix() {
		if(StringUtils.isBlank(recipientSuffix)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(recipientSuffix) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setRecipientSuffix(String recipientSuffix) {
		this.recipientSuffix = recipientSuffix;
	}
	public String getStreet1() {
		if(StringUtils.isBlank(street1)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(street1) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		if(StringUtils.isBlank(street2)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(street2) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		if(StringUtils.isBlank(city)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(city) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		if(StringUtils.isBlank(state)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(state) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		if(StringUtils.isBlank(zip)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(zip) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getDateOfDisbursement() {
		if(StringUtils.isBlank(dateOfDisbursement)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(dateOfDisbursement) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setDateOfDisbursement(String dateOfDisbursement) {
		this.dateOfDisbursement = dateOfDisbursement;
	}
	public String getPurposeOfDisbursement() {
		if(StringUtils.isBlank(purposeOfDisbursement)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(purposeOfDisbursement) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setPurposeOfDisbursement(String purposeOfDisbursement) {
		this.purposeOfDisbursement = purposeOfDisbursement;
	}
	public String getBeneficiaryCommitteeName() {
		if(StringUtils.isBlank(beneficiaryCommitteeName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(beneficiaryCommitteeName) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setBeneficiaryCommitteeName(String beneficiaryCommitteeName) {
		this.beneficiaryCommitteeName = beneficiaryCommitteeName;
	}
	public String getCanLastName() {
		if(StringUtils.isBlank(canLastName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(canLastName) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCanLastName(String canLastName) {
		this.canLastName = canLastName;
	}
	public String getCanFirstName() {
		if(StringUtils.isBlank(canFirstName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(canFirstName) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCanFirstName(String canFirstName) {
		this.canFirstName = canFirstName;
	}
	public String getCanMiddleName() {
		if(StringUtils.isBlank(canMiddleName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(canMiddleName) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCanMiddleName(String canMiddleName) {
		this.canMiddleName = canMiddleName;
	}
	public String getCanPrefix() {
		if(StringUtils.isBlank(canPrefix)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(canPrefix) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCanPrefix(String canPrefix) {
		this.canPrefix = canPrefix;
	}
	public String getCanSuffix() {
		if(StringUtils.isBlank(canSuffix)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(canSuffix) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCanSuffix(String canSuffix) {
		this.canSuffix = canSuffix;
	}
	public String getCategoryCode() {
		if(StringUtils.isBlank(categoryCode)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(categoryCode) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCanOffice() {
		if(StringUtils.isBlank(canOffice)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(canOffice) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCanOffice(String canOffice) {
		this.canOffice = canOffice;
	}
	public String getCanState() {
		if(StringUtils.isBlank(canState)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(canState) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCanState(String canState) {
		this.canState = canState;
	}
	public String getCanDist() {
		if(StringUtils.isBlank(canDist)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(canDist) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCanDist(String canDist) {
		this.canDist = canDist;
	}
	public String getItemElectCode() {
		if(StringUtils.isBlank(itemElectCode)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(itemElectCode) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setItemElectCode(String itemElectCode) {
		this.itemElectCode = itemElectCode;
	}
	public String getItemElectOther() {
		if(StringUtils.isBlank(itemElectOther)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(itemElectOther) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setItemElectOther(String itemElectOther) {
		this.itemElectOther = itemElectOther;
	}
	public String getAmountOfDisbursement() {
		if(StringUtils.isBlank(amountOfDisbursement)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(amountOfDisbursement, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setAmountOfDisbursement(String amountOfDisbursement) {
		this.amountOfDisbursement = amountOfDisbursement;
	}
	public String getSemiAnnualRefundedBundledAmt() {
		if(StringUtils.isBlank(semiAnnualRefundedBundledAmt)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(semiAnnualRefundedBundledAmt, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setSemiAnnualRefundedBundledAmt(String semiAnnualRefundedBundledAmt) {
		this.semiAnnualRefundedBundledAmt = semiAnnualRefundedBundledAmt;
	}
	public String getMemoTextDescription() {
		if(StringUtils.isBlank(memoTextDescription)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.upperCase(memoTextDescription) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setMemoTextDescription(String memoTextDescription) {
		this.memoTextDescription = memoTextDescription;
	}
	public String getImageNumber() {
		if(StringUtils.isBlank(imageNumber)){
			return "";
		}
		return StringUtils.upperCase(imageNumber);
	}
	public void setImageNumber(String imageNumber) {
		this.imageNumber = imageNumber;
	}
}
