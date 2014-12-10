package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.CSVFileConstant;

public class CSVScheduleBRecord {
		
	private String name;
	private String formType;
	
	private String recipientFirstName_A;
	private String recipientLastName_A;
	private String recipientMiddleName_A;
	private String recipientPrefix_A;
	private String recipientSuffix_A;
	private String personOrOrganization_A;
	private String recipientOrganizationName_A;
	private String street1_A;
	private String dateOfDisbursement_A;
	private String street2_A;
	private String city_A;
	private String state_A;
	private String zip_A;
	private String purposeOfDisbursement_A;
	private String amountOfDisbursement_A; 
	private String categoryCode_A;
	private String canMiddleName_A;
	private String canLastName_A;
	private String canPrefix_A;
	private String canFirstName_A;
	private String beneficiaryCommitteeName_A;	
	private String canSuffix_A;
	private String canState_A;
	private String canOffice_A;
	private String memoTextDescription_A;
	private String canDist_A;
	private String itemElectOther_A; 
	private String itemElectCode_A;
	
	private String recipientSuffix_B;
	private String recipientLastName_B;
	private String personOrOrganization_B;
	private String recipientOrganizationName_B;
	private String recipientMiddleName_B;
	private String recipientFirstName_B;
	private String recipientPrefix_B;
	private String street1_B;
	private String street2_B;
	private String dateOfDisbursement_B;
	private String city_B;
	private String state_B;
	private String zip_B;
	private String purposeOfDisbursement_B;
	private String amountOfDisbursement_B;
	private String categoryCode_B;
	private String canLastName_B;
	private String beneficiaryCommitteeName_B;
	private String canFirstName_B;
	private String canSuffix_B;
	private String canPrefix_B;
	private String canMiddleName_B;
	private String canState_B;
	private String canOffice_B;
	private String itemElectOther_B;
	private String memoTextDescription_B;
	private String itemElectCode_B;
	private String canDist_B;
	
	private String recipientOrganizationName_C;
	private String recipientFirstName_C;
	private String personOrOrganization_C;
	private String recipientSuffix_C;
	private String recipientLastName_C;
	private String recipientPrefix_C;
	private String recipientMiddleName_C;
	private String street2_C;
	private String street1_C;
	private String dateOfDisbursement_C;
	private String city_C;
	private String state_C;
	private String zip_C;
	private String purposeOfDisbursement_C;
	private String amountOfDisbursement_C;
	private String categoryCode_C;
	private String canMiddleName_C;
	private String canSuffix_C;
	private String canFirstName_C;
	private String beneficiaryCommitteeName_C;
	private String canLastName_C;
	private String canPrefix_C;
	private String canOffice_C;
	private String itemElectOther_C;
	private String memoTextDescription_C;
	private String canState_C;
	private String itemElectCode_C;
	private String canDist_C;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFormType() {
		if(StringUtils.containsIgnoreCase(formType, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(formType, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return formType;
	}
	public void setFormType(String formType) {
		this.formType = formType;
	}
	public String getRecipientFirstName_A() {
		if(StringUtils.containsIgnoreCase(recipientFirstName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientFirstName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientFirstName_A;
	}
	public void setRecipientFirstName_A(String recipientFirstName_A) {
		this.recipientFirstName_A = recipientFirstName_A;
	}
	public String getRecipientLastName_A() {
		if(StringUtils.containsIgnoreCase(recipientLastName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientLastName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientLastName_A;
	}
	public void setRecipientLastName_A(String recipientLastName_A) {
		this.recipientLastName_A = recipientLastName_A;
	}
	public String getRecipientMiddleName_A() {
		if(StringUtils.containsIgnoreCase(recipientMiddleName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientMiddleName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientMiddleName_A;
	}
	public void setRecipientMiddleName_A(String recipientMiddleName_A) {
		this.recipientMiddleName_A = recipientMiddleName_A;
	}
	public String getRecipientPrefix_A() {
		if(StringUtils.containsIgnoreCase(recipientPrefix_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientPrefix_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientPrefix_A;
	}
	public void setRecipientPrefix_A(String recipientPrefix_A) {
		this.recipientPrefix_A = recipientPrefix_A;
	}
	public String getRecipientSuffix_A() {
		if(StringUtils.containsIgnoreCase(recipientSuffix_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientSuffix_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientSuffix_A;
	}
	public void setRecipientSuffix_A(String recipientSuffix_A) {
		this.recipientSuffix_A = recipientSuffix_A;
	}
	public String getPersonOrOrganization_A() {
		if(StringUtils.containsIgnoreCase(personOrOrganization_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(personOrOrganization_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return personOrOrganization_A;
	}
	public void setPersonOrOrganization_A(String personOrOrganization_A) {
		this.personOrOrganization_A = personOrOrganization_A;
	}
	public String getRecipientOrganizationName_A() {
		if(StringUtils.containsIgnoreCase(recipientOrganizationName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientOrganizationName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientOrganizationName_A;
	}
	public void setRecipientOrganizationName_A(String recipientOrganizationName_A) {
		this.recipientOrganizationName_A = recipientOrganizationName_A;
	}
	public String getStreet1_A() {
		if(StringUtils.containsIgnoreCase(street1_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street1_A;
	}
	public void setStreet1_A(String street1_A) {
		this.street1_A = street1_A;
	}
	public String getDateOfDisbursement_A() {
		if(StringUtils.containsIgnoreCase(dateOfDisbursement_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dateOfDisbursement_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return dateOfDisbursement_A;
	}
	public void setDateOfDisbursement_A(String dateOfDisbursement_A) {
		this.dateOfDisbursement_A = dateOfDisbursement_A;
	}
	public String getStreet2_A() {
		if(StringUtils.containsIgnoreCase(street2_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street2_A;
	}
	public void setStreet2_A(String street2_A) {
		this.street2_A = street2_A;
	}
	public String getCity_A() {
		if(StringUtils.containsIgnoreCase(city_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return city_A;
	}
	public void setCity_A(String city_A) {
		this.city_A = city_A;
	}
	public String getState_A() {
		if(StringUtils.containsIgnoreCase(state_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return state_A;
	}
	public void setState_A(String state_A) {
		this.state_A = state_A;
	}
	public String getZip_A() {
		if(StringUtils.containsIgnoreCase(zip_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return zip_A;
	}
	public void setZip_A(String zip_A) {
		this.zip_A = zip_A;
	}
	public String getPurposeOfDisbursement_A() {
		if(StringUtils.containsIgnoreCase(purposeOfDisbursement_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(purposeOfDisbursement_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return purposeOfDisbursement_A;
	}
	public void setPurposeOfDisbursement_A(String purposeOfDisbursement_A) {
		this.purposeOfDisbursement_A = purposeOfDisbursement_A;
	}
	public String getAmountOfDisbursement_A() {
		if(StringUtils.containsIgnoreCase(amountOfDisbursement_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountOfDisbursement_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return amountOfDisbursement_A;
	}
	public void setAmountOfDisbursement_A(String amountOfDisbursement_A) {
		this.amountOfDisbursement_A = amountOfDisbursement_A;
	}
	public String getCategoryCode_A() {
		if(StringUtils.containsIgnoreCase(categoryCode_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(categoryCode_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return categoryCode_A;
	}
	public void setCategoryCode_A(String categoryCode_A) {
		this.categoryCode_A = categoryCode_A;
	}
	public String getCanMiddleName_A() {
		if(StringUtils.containsIgnoreCase(canMiddleName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canMiddleName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canMiddleName_A;
	}
	public void setCanMiddleName_A(String canMiddleName_A) {
		this.canMiddleName_A = canMiddleName_A;
	}
	public String getCanLastName_A() {
		if(StringUtils.containsIgnoreCase(canLastName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canLastName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canLastName_A;
	}
	public void setCanLastName_A(String canLastName_A) {
		this.canLastName_A = canLastName_A;
	}
	public String getCanPrefix_A() {
		if(StringUtils.containsIgnoreCase(canPrefix_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canPrefix_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canPrefix_A;
	}
	public void setCanPrefix_A(String canPrefix_A) {
		this.canPrefix_A = canPrefix_A;
	}
	public String getCanFirstName_A() {
		if(StringUtils.containsIgnoreCase(canFirstName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canFirstName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canFirstName_A;
	}
	public void setCanFirstName_A(String canFirstName_A) {
		this.canFirstName_A = canFirstName_A;
	}
	public String getBeneficiaryCommitteeName_A() {
		if(StringUtils.containsIgnoreCase(beneficiaryCommitteeName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(beneficiaryCommitteeName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return beneficiaryCommitteeName_A;
	}
	public void setBeneficiaryCommitteeName_A(String beneficiaryCommitteeName_A) {
		this.beneficiaryCommitteeName_A = beneficiaryCommitteeName_A;
	}
	public String getCanSuffix_A() {
		if(StringUtils.containsIgnoreCase(canSuffix_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canSuffix_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canSuffix_A;
	}
	public void setCanSuffix_A(String canSuffix_A) {
		this.canSuffix_A = canSuffix_A;
	}
	public String getCanState_A() {
		if(StringUtils.containsIgnoreCase(canState_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canState_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canState_A;
	}
	public void setCanState_A(String canState_A) {
		this.canState_A = canState_A;
	}
	public String getCanOffice_A() {
		if(StringUtils.containsIgnoreCase(canOffice_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canOffice_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canOffice_A;
	}
	public void setCanOffice_A(String canOffice_A) {
		this.canOffice_A = canOffice_A;
	}
	public String getMemoTextDescription_A() {
		if(StringUtils.containsIgnoreCase(memoTextDescription_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(memoTextDescription_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return memoTextDescription_A;
	}
	public void setMemoTextDescription_A(String memoTextDescription_A) {
		this.memoTextDescription_A = memoTextDescription_A;
	}
	public String getCanDist_A() {
		if(StringUtils.containsIgnoreCase(canDist_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canDist_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canDist_A;
	}
	public void setCanDist_A(String canDist_A) {
		this.canDist_A = canDist_A;
	}
	public String getItemElectOther_A() {
		if(StringUtils.containsIgnoreCase(itemElectOther_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectOther_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return itemElectOther_A;
	}
	public void setItemElectOther_A(String itemElectOther_A) {
		this.itemElectOther_A = itemElectOther_A;
	}
	public String getItemElectCode_A() {
		if(StringUtils.containsIgnoreCase(itemElectCode_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectCode_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return itemElectCode_A;
	}
	public void setItemElectCode_A(String itemElectCode_A) {
		this.itemElectCode_A = itemElectCode_A;
	}
	public String getRecipientSuffix_B() {
		if(StringUtils.containsIgnoreCase(recipientSuffix_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientSuffix_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientSuffix_B;
	}
	public void setRecipientSuffix_B(String recipientSuffix_B) {
		this.recipientSuffix_B = recipientSuffix_B;
	}
	public String getRecipientLastName_B() {
		if(StringUtils.containsIgnoreCase(recipientLastName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientLastName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientLastName_B;
	}
	public void setRecipientLastName_B(String recipientLastName_B) {
		this.recipientLastName_B = recipientLastName_B;
	}
	public String getPersonOrOrganization_B() {
		if(StringUtils.containsIgnoreCase(personOrOrganization_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(personOrOrganization_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return personOrOrganization_B;
	}
	public void setPersonOrOrganization_B(String personOrOrganization_B) {
		this.personOrOrganization_B = personOrOrganization_B;
	}
	public String getRecipientOrganizationName_B() {
		if(StringUtils.containsIgnoreCase(recipientOrganizationName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientOrganizationName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientOrganizationName_B;
	}
	public void setRecipientOrganizationName_B(String recipientOrganizationName_B) {
		this.recipientOrganizationName_B = recipientOrganizationName_B;
	}
	public String getRecipientMiddleName_B() {
		if(StringUtils.containsIgnoreCase(recipientMiddleName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientMiddleName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientMiddleName_B;
	}
	public void setRecipientMiddleName_B(String recipientMiddleName_B) {
		this.recipientMiddleName_B = recipientMiddleName_B;
	}
	public String getRecipientFirstName_B() {
		if(StringUtils.containsIgnoreCase(recipientFirstName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientFirstName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientFirstName_B;
	}
	public void setRecipientFirstName_B(String recipientFirstName_B) {
		this.recipientFirstName_B = recipientFirstName_B;
	}
	public String getRecipientPrefix_B() {
		if(StringUtils.containsIgnoreCase(recipientPrefix_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientPrefix_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientPrefix_B;
	}
	public void setRecipientPrefix_B(String recipientPrefix_B) {
		this.recipientPrefix_B = recipientPrefix_B;
	}
	public String getStreet1_B() {
		if(StringUtils.containsIgnoreCase(street1_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street1_B;
	}
	public void setStreet1_B(String street1_B) {
		this.street1_B = street1_B;
	}
	public String getStreet2_B() {
		if(StringUtils.containsIgnoreCase(street2_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street2_B;
	}
	public void setStreet2_B(String street2_B) {
		this.street2_B = street2_B;
	}
	public String getDateOfDisbursement_B() {
		if(StringUtils.containsIgnoreCase(dateOfDisbursement_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dateOfDisbursement_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return dateOfDisbursement_B;
	}
	public void setDateOfDisbursement_B(String dateOfDisbursement_B) {
		this.dateOfDisbursement_B = dateOfDisbursement_B;
	}
	public String getCity_B() {
		if(StringUtils.containsIgnoreCase(city_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return city_B;
	}
	public void setCity_B(String city_B) {
		this.city_B = city_B;
	}
	public String getState_B() {
		if(StringUtils.containsIgnoreCase(state_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return state_B;
	}
	public void setState_B(String state_B) {
		this.state_B = state_B;
	}
	public String getZip_B() {
		if(StringUtils.containsIgnoreCase(zip_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return zip_B;
	}
	public void setZip_B(String zip_B) {
		this.zip_B = zip_B;
	}
	public String getPurposeOfDisbursement_B() {
		if(StringUtils.containsIgnoreCase(purposeOfDisbursement_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(purposeOfDisbursement_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return purposeOfDisbursement_B;
	}
	public void setPurposeOfDisbursement_B(String purposeOfDisbursement_B) {
		this.purposeOfDisbursement_B = purposeOfDisbursement_B;
	}
	public String getAmountOfDisbursement_B() {
		if(StringUtils.containsIgnoreCase(amountOfDisbursement_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountOfDisbursement_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return amountOfDisbursement_B;
	}
	public void setAmountOfDisbursement_B(String amountOfDisbursement_B) {
		this.amountOfDisbursement_B = amountOfDisbursement_B;
	}
	public String getCategoryCode_B() {
		if(StringUtils.containsIgnoreCase(categoryCode_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(categoryCode_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return categoryCode_B;
	}
	public void setCategoryCode_B(String categoryCode_B) {
		this.categoryCode_B = categoryCode_B;
	}
	public String getCanLastName_B() {
		if(StringUtils.containsIgnoreCase(canLastName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canLastName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canLastName_B;
	}
	public void setCanLastName_B(String canLastName_B) {
		this.canLastName_B = canLastName_B;
	}
	public String getBeneficiaryCommitteeName_B() {
		if(StringUtils.containsIgnoreCase(beneficiaryCommitteeName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(beneficiaryCommitteeName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return beneficiaryCommitteeName_B;
	}
	public void setBeneficiaryCommitteeName_B(String beneficiaryCommitteeName_B) {
		this.beneficiaryCommitteeName_B = beneficiaryCommitteeName_B;
	}
	public String getCanFirstName_B() {
		if(StringUtils.containsIgnoreCase(canFirstName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canFirstName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canFirstName_B;
	}
	public void setCanFirstName_B(String canFirstName_B) {
		this.canFirstName_B = canFirstName_B;
	}
	public String getCanSuffix_B() {
		if(StringUtils.containsIgnoreCase(canSuffix_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canSuffix_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canSuffix_B;
	}
	public void setCanSuffix_B(String canSuffix_B) {
		this.canSuffix_B = canSuffix_B;
	}
	public String getCanPrefix_B() {
		if(StringUtils.containsIgnoreCase(canPrefix_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canPrefix_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canPrefix_B;
	}
	public void setCanPrefix_B(String canPrefix_B) {
		this.canPrefix_B = canPrefix_B;
	}
	public String getCanMiddleName_B() {
		if(StringUtils.containsIgnoreCase(canMiddleName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canMiddleName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canMiddleName_B;
	}
	public void setCanMiddleName_B(String canMiddleName_B) {
		this.canMiddleName_B = canMiddleName_B;
	}
	public String getCanState_B() {
		if(StringUtils.containsIgnoreCase(canState_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canState_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canState_B;
	}
	public void setCanState_B(String canState_B) {
		this.canState_B = canState_B;
	}
	public String getCanOffice_B() {
		if(StringUtils.containsIgnoreCase(canOffice_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canOffice_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canOffice_B;
	}
	public void setCanOffice_B(String canOffice_B) {
		this.canOffice_B = canOffice_B;
	}
	public String getItemElectOther_B() {
		if(StringUtils.containsIgnoreCase(itemElectOther_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectOther_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return itemElectOther_B;
	}
	public void setItemElectOther_B(String itemElectOther_B) {
		this.itemElectOther_B = itemElectOther_B;
	}
	public String getMemoTextDescription_B() {
		if(StringUtils.containsIgnoreCase(memoTextDescription_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(memoTextDescription_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return memoTextDescription_B;
	}
	public void setMemoTextDescription_B(String memoTextDescription_B) {
		this.memoTextDescription_B = memoTextDescription_B;
	}
	public String getItemElectCode_B() {
		if(StringUtils.containsIgnoreCase(itemElectCode_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectCode_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return itemElectCode_B;
	}
	public void setItemElectCode_B(String itemElectCode_B) {
		this.itemElectCode_B = itemElectCode_B;
	}
	public String getCanDist_B() {
		if(StringUtils.containsIgnoreCase(canDist_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canDist_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canDist_B;
	}
	public void setCanDist_B(String canDist_B) {
		this.canDist_B = canDist_B;
	}
	public String getRecipientOrganizationName_C() {
		if(StringUtils.containsIgnoreCase(recipientOrganizationName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientOrganizationName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientOrganizationName_C;
	}
	public void setRecipientOrganizationName_C(String recipientOrganizationName_C) {
		this.recipientOrganizationName_C = recipientOrganizationName_C;
	}
	public String getRecipientFirstName_C() {
		if(StringUtils.containsIgnoreCase(recipientFirstName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientFirstName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientFirstName_C;
	}
	public void setRecipientFirstName_C(String recipientFirstName_C) {
		this.recipientFirstName_C = recipientFirstName_C;
	}
	public String getPersonOrOrganization_C() {
		if(StringUtils.containsIgnoreCase(personOrOrganization_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(personOrOrganization_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return personOrOrganization_C;
	}
	public void setPersonOrOrganization_C(String personOrOrganization_C) {
		this.personOrOrganization_C = personOrOrganization_C;
	}
	public String getRecipientSuffix_C() {
		if(StringUtils.containsIgnoreCase(recipientSuffix_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientSuffix_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientSuffix_C;
	}
	public void setRecipientSuffix_C(String recipientSuffix_C) {
		this.recipientSuffix_C = recipientSuffix_C;
	}
	public String getRecipientLastName_C() {
		if(StringUtils.containsIgnoreCase(recipientLastName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientLastName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientLastName_C;
	}
	public void setRecipientLastName_C(String recipientLastName_C) {
		this.recipientLastName_C = recipientLastName_C;
	}
	public String getRecipientPrefix_C() {
		if(StringUtils.containsIgnoreCase(recipientPrefix_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientPrefix_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientPrefix_C;
	}
	public void setRecipientPrefix_C(String recipientPrefix_C) {
		this.recipientPrefix_C = recipientPrefix_C;
	}
	public String getRecipientMiddleName_C() {
		if(StringUtils.containsIgnoreCase(recipientMiddleName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(recipientMiddleName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return recipientMiddleName_C;
	}
	public void setRecipientMiddleName_C(String recipientMiddleName_C) {
		this.recipientMiddleName_C = recipientMiddleName_C;
	}
	public String getStreet2_C() {
		if(StringUtils.containsIgnoreCase(street2_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street2_C;
	}
	public void setStreet2_C(String street2_C) {
		this.street2_C = street2_C;
	}
	public String getStreet1_C() {
		if(StringUtils.containsIgnoreCase(street1_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street1_C;
	}
	public void setStreet1_C(String street1_C) {
		this.street1_C = street1_C;
	}
	public String getDateOfDisbursement_C() {
		if(StringUtils.containsIgnoreCase(dateOfDisbursement_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dateOfDisbursement_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return dateOfDisbursement_C;
	}
	public void setDateOfDisbursement_C(String dateOfDisbursement_C) {
		this.dateOfDisbursement_C = dateOfDisbursement_C;
	}
	public String getCity_C() {
		if(StringUtils.containsIgnoreCase(city_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return city_C;
	}
	public void setCity_C(String city_C) {
		this.city_C = city_C;
	}
	public String getState_C() {
		if(StringUtils.containsIgnoreCase(state_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return state_C;
	}
	public void setState_C(String state_C) {
		this.state_C = state_C;
	}
	public String getZip_C() {
		if(StringUtils.containsIgnoreCase(zip_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return zip_C;
	}
	public void setZip_C(String zip_C) {
		this.zip_C = zip_C;
	}
	public String getPurposeOfDisbursement_C() {
		if(StringUtils.containsIgnoreCase(purposeOfDisbursement_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(purposeOfDisbursement_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return purposeOfDisbursement_C;
	}
	public void setPurposeOfDisbursement_C(String purposeOfDisbursement_C) {
		this.purposeOfDisbursement_C = purposeOfDisbursement_C;
	}
	public String getAmountOfDisbursement_C() {
		if(StringUtils.containsIgnoreCase(amountOfDisbursement_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountOfDisbursement_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return amountOfDisbursement_C;
	}
	public void setAmountOfDisbursement_C(String amountOfDisbursement_C) {
		this.amountOfDisbursement_C = amountOfDisbursement_C;
	}
	public String getCategoryCode_C() {
		if(StringUtils.containsIgnoreCase(categoryCode_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(categoryCode_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return categoryCode_C;
	}
	public void setCategoryCode_C(String categoryCode_C) {
		this.categoryCode_C = categoryCode_C;
	}
	public String getCanMiddleName_C() {
		if(StringUtils.containsIgnoreCase(canMiddleName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canMiddleName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canMiddleName_C;
	}
	public void setCanMiddleName_C(String canMiddleName_C) {
		this.canMiddleName_C = canMiddleName_C;
	}
	public String getCanSuffix_C() {
		if(StringUtils.containsIgnoreCase(canSuffix_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canSuffix_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canSuffix_C;
	}
	public void setCanSuffix_C(String canSuffix_C) {
		this.canSuffix_C = canSuffix_C;
	}
	public String getCanFirstName_C() {
		if(StringUtils.containsIgnoreCase(canFirstName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canFirstName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canFirstName_C;
	}
	public void setCanFirstName_C(String canFirstName_C) {
		this.canFirstName_C = canFirstName_C;
	}
	public String getBeneficiaryCommitteeName_C() {
		if(StringUtils.containsIgnoreCase(beneficiaryCommitteeName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(beneficiaryCommitteeName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return beneficiaryCommitteeName_C;
	}
	public void setBeneficiaryCommitteeName_C(String beneficiaryCommitteeName_C) {
		this.beneficiaryCommitteeName_C = beneficiaryCommitteeName_C;
	}
	public String getCanLastName_C() {
		if(StringUtils.containsIgnoreCase(canLastName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canLastName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canLastName_C;
	}
	public void setCanLastName_C(String canLastName_C) {
		this.canLastName_C = canLastName_C;
	}
	public String getCanPrefix_C() {
		if(StringUtils.containsIgnoreCase(canPrefix_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canPrefix_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canPrefix_C;
	}
	public void setCanPrefix_C(String canPrefix_C) {
		this.canPrefix_C = canPrefix_C;
	}
	public String getCanOffice_C() {
		if(StringUtils.containsIgnoreCase(canOffice_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canOffice_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canOffice_C;
	}
	public void setCanOffice_C(String canOffice_C) {
		this.canOffice_C = canOffice_C;
	}
	public String getItemElectOther_C() {
		if(StringUtils.containsIgnoreCase(itemElectOther_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectOther_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return itemElectOther_C;
	}
	public void setItemElectOther_C(String itemElectOther_C) {
		this.itemElectOther_C = itemElectOther_C;
	}
	public String getMemoTextDescription_C() {
		if(StringUtils.containsIgnoreCase(memoTextDescription_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(memoTextDescription_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return memoTextDescription_C;
	}
	public void setMemoTextDescription_C(String memoTextDescription_C) {
		this.memoTextDescription_C = memoTextDescription_C;
	}
	public String getCanState_C() {
		if(StringUtils.containsIgnoreCase(canState_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canState_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canState_C;
	}
	public void setCanState_C(String canState_C) {
		this.canState_C = canState_C;
	}
	public String getItemElectCode_C() {
		if(StringUtils.containsIgnoreCase(itemElectCode_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectCode_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}

		return itemElectCode_C;
	}
	public void setItemElectCode_C(String itemElectCode_C) {
		this.itemElectCode_C = itemElectCode_C;
	}
	public String getCanDist_C() {
		if(StringUtils.containsIgnoreCase(canDist_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(canDist_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return canDist_C;
	}
	public void setCanDist_C(String canDist_C) {
		this.canDist_C = canDist_C;
	}
}
