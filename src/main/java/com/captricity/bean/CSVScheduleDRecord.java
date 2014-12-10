package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.CSVFileConstant;

public class CSVScheduleDRecord {
		
	private String name;
	private String formType;
	
	private String personOrOrganization_A;
	private String debtPrefix_A;
	private String debtLastName_A;
	private String debtFirstName_A;
	private String debtName_A;
	private String debtMiddleName_A;
	private String debtSuffix_A;
	private String street1_A;
	private String street2_A;
	private String naturePurposeDebtDescription_A;
	private String city_A;
	private String state_A;
	private String zip_A;
	private String beginningBalance_A;
	private String incurredThisPeriod_A;
	private String paymentThisPeriod_A;
	private String balanceAtClose_A;
	
	private String debtPrefix_B;
	private String debtName_B;
	private String debtLastName_B;
	private String debtFirstName_B;
	private String debtMiddleName_B;
	private String debtSuffix_B;
	private String personOrOrganization_B;
	private String street2_B;
	private String street1_B;
	private String naturePurposeDebtDescription_B;
	private String city_B;
	private String state_B;
	private String zip_B;
	private String beginningBalance_B; 
	private String incurredThisPeriod_B;
	private String paymentThisPeriod_B;
	private String balanceAtClose_B;
	
	private String debtSuffix_C;
	private String personOrOrganization_C;
	private String debtName_C;
	private String debtFirstName_C;
	private String debtMiddleName_C;
	private String debtLastName_C;
	private String debtPrefix_C;
	private String street2_C;
	private String street1_C;
	private String naturePurposeDebtDescription_C;
	private String city_C;
	private String state_C;
	private String zip_C;
	private String beginningBalance_C;
	private String incurredThisPeriod_C;
	private String paymentThisPeriod_C;
	private String balanceAtClose_C;
	
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
	public String getDebtPrefix_A() {
		if(StringUtils.containsIgnoreCase(debtPrefix_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtPrefix_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtPrefix_A;
	}
	public void setDebtPrefix_A(String debtPrefix_A) {
		this.debtPrefix_A = debtPrefix_A;
	}
	public String getDebtLastName_A() {
		if(StringUtils.containsIgnoreCase(debtLastName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtLastName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtLastName_A;
	}
	public void setDebtLastName_A(String debtLastName_A) {
		this.debtLastName_A = debtLastName_A;
	}
	public String getDebtFirstName_A() {
		if(StringUtils.containsIgnoreCase(debtFirstName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtFirstName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtFirstName_A;
	}
	public void setDebtFirstName_A(String debtFirstName_A) {
		this.debtFirstName_A = debtFirstName_A;
	}
	public String getDebtName_A() {
		if(StringUtils.containsIgnoreCase(debtName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtName_A;
	}
	public void setDebtName_A(String debtName_A) {
		this.debtName_A = debtName_A;
	}
	public String getDebtMiddleName_A() {
		if(StringUtils.containsIgnoreCase(debtMiddleName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtMiddleName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtMiddleName_A;
	}
	public void setDebtMiddleName_A(String debtMiddleName_A) {
		this.debtMiddleName_A = debtMiddleName_A;
	}
	public String getDebtSuffix_A() {
		if(StringUtils.containsIgnoreCase(debtSuffix_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtSuffix_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtSuffix_A;
	}
	public void setDebtSuffix_A(String debtSuffix_A) {
		this.debtSuffix_A = debtSuffix_A;
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
	public String getNaturePurposeDebtDescription_A() {
		if(StringUtils.containsIgnoreCase(naturePurposeDebtDescription_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(naturePurposeDebtDescription_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return naturePurposeDebtDescription_A;
	}
	public void setNaturePurposeDebtDescription_A(
			String naturePurposeDebtDescription_A) {
		this.naturePurposeDebtDescription_A = naturePurposeDebtDescription_A;
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
	public String getBeginningBalance_A() {
		if(StringUtils.containsIgnoreCase(beginningBalance_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(beginningBalance_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return beginningBalance_A;
	}
	public void setBeginningBalance_A(String beginningBalance_A) {
		this.beginningBalance_A = beginningBalance_A;
	}
	public String getIncurredThisPeriod_A() {
		if(StringUtils.containsIgnoreCase(incurredThisPeriod_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(incurredThisPeriod_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return incurredThisPeriod_A;
	}
	public void setIncurredThisPeriod_A(String incurredThisPeriod_A) {
		this.incurredThisPeriod_A = incurredThisPeriod_A;
	}
	public String getPaymentThisPeriod_A() {
		if(StringUtils.containsIgnoreCase(paymentThisPeriod_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(paymentThisPeriod_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return paymentThisPeriod_A;
	}
	public void setPaymentThisPeriod_A(String paymentThisPeriod_A) {
		this.paymentThisPeriod_A = paymentThisPeriod_A;
	}
	public String getBalanceAtClose_A() {
		if(StringUtils.containsIgnoreCase(balanceAtClose_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(balanceAtClose_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return balanceAtClose_A;
	}
	public void setBalanceAtClose_A(String balanceAtClose_A) {
		this.balanceAtClose_A = balanceAtClose_A;
	}
	public String getDebtPrefix_B() {
		if(StringUtils.containsIgnoreCase(debtPrefix_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtPrefix_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtPrefix_B;
	}
	public void setDebtPrefix_B(String debtPrefix_B) {
		this.debtPrefix_B = debtPrefix_B;
	}
	public String getDebtName_B() {
		if(StringUtils.containsIgnoreCase(debtName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtName_B;
	}
	public void setDebtName_B(String debtName_B) {
		this.debtName_B = debtName_B;
	}
	public String getDebtLastName_B() {
		if(StringUtils.containsIgnoreCase(debtLastName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtLastName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtLastName_B;
	}
	public void setDebtLastName_B(String debtLastName_B) {
		this.debtLastName_B = debtLastName_B;
	}
	public String getDebtFirstName_B() {
		if(StringUtils.containsIgnoreCase(debtFirstName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtFirstName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtFirstName_B;
	}
	public void setDebtFirstName_B(String debtFirstName_B) {
		this.debtFirstName_B = debtFirstName_B;
	}
	public String getDebtMiddleName_B() {
		if(StringUtils.containsIgnoreCase(debtMiddleName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtMiddleName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtMiddleName_B;
	}
	public void setDebtMiddleName_B(String debtMiddleName_B) {
		this.debtMiddleName_B = debtMiddleName_B;
	}
	public String getDebtSuffix_B() {
		if(StringUtils.containsIgnoreCase(debtSuffix_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtSuffix_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtSuffix_B;
	}
	public void setDebtSuffix_B(String debtSuffix_B) {
		this.debtSuffix_B = debtSuffix_B;
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
	public String getNaturePurposeDebtDescription_B() {
		if(StringUtils.containsIgnoreCase(naturePurposeDebtDescription_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(naturePurposeDebtDescription_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return naturePurposeDebtDescription_B;
	}
	public void setNaturePurposeDebtDescription_B(
			String naturePurposeDebtDescription_B) {
		this.naturePurposeDebtDescription_B = naturePurposeDebtDescription_B;
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
	public String getBeginningBalance_B() {
		if(StringUtils.containsIgnoreCase(beginningBalance_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(beginningBalance_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return beginningBalance_B;
	}
	public void setBeginningBalance_B(String beginningBalance_B) {
		this.beginningBalance_B = beginningBalance_B;
	}
	public String getIncurredThisPeriod_B() {
		if(StringUtils.containsIgnoreCase(incurredThisPeriod_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(incurredThisPeriod_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return incurredThisPeriod_B;
	}
	public void setIncurredThisPeriod_B(String incurredThisPeriod_B) {
		this.incurredThisPeriod_B = incurredThisPeriod_B;
	}
	public String getPaymentThisPeriod_B() {
		if(StringUtils.containsIgnoreCase(paymentThisPeriod_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(paymentThisPeriod_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return paymentThisPeriod_B;
	}
	public void setPaymentThisPeriod_B(String paymentThisPeriod_B) {
		this.paymentThisPeriod_B = paymentThisPeriod_B;
	}
	public String getBalanceAtClose_B() {
		if(StringUtils.containsIgnoreCase(balanceAtClose_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(balanceAtClose_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return balanceAtClose_B;
	}
	public void setBalanceAtClose_B(String balanceAtClose_B) {
		this.balanceAtClose_B = balanceAtClose_B;
	}
	public String getDebtSuffix_C() {
		if(StringUtils.containsIgnoreCase(debtSuffix_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtSuffix_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtSuffix_C;
	}
	public void setDebtSuffix_C(String debtSuffix_C) {
		this.debtSuffix_C = debtSuffix_C;
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
	public String getDebtName_C() {
		if(StringUtils.containsIgnoreCase(debtName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtName_C;
	}
	public void setDebtName_C(String debtName_C) {
		this.debtName_C = debtName_C;
	}
	public String getDebtFirstName_C() {
		if(StringUtils.containsIgnoreCase(debtFirstName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtFirstName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtFirstName_C;
	}
	public void setDebtFirstName_C(String debtFirstName_C) {
		this.debtFirstName_C = debtFirstName_C;
	}
	public String getDebtMiddleName_C() {
		if(StringUtils.containsIgnoreCase(debtMiddleName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtMiddleName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtMiddleName_C;
	}
	public void setDebtMiddleName_C(String debtMiddleName_C) {
		this.debtMiddleName_C = debtMiddleName_C;
	}
	public String getDebtLastName_C() {
		if(StringUtils.containsIgnoreCase(debtLastName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtLastName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtLastName_C;
	}
	public void setDebtLastName_C(String debtLastName_C) {
		this.debtLastName_C = debtLastName_C;
	}
	public String getDebtPrefix_C() {
		if(StringUtils.containsIgnoreCase(debtPrefix_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(debtPrefix_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return debtPrefix_C;
	}
	public void setDebtPrefix_C(String debtPrefix_C) {
		this.debtPrefix_C = debtPrefix_C;
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
	public String getNaturePurposeDebtDescription_C() {
		if(StringUtils.containsIgnoreCase(naturePurposeDebtDescription_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(naturePurposeDebtDescription_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return naturePurposeDebtDescription_C;
	}
	public void setNaturePurposeDebtDescription_C(
			String naturePurposeDebtDescription_C) {
		this.naturePurposeDebtDescription_C = naturePurposeDebtDescription_C;
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
	public String getBeginningBalance_C() {
		if(StringUtils.containsIgnoreCase(beginningBalance_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(beginningBalance_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return beginningBalance_C;
	}
	public void setBeginningBalance_C(String beginningBalance_C) {
		this.beginningBalance_C = beginningBalance_C;
	}
	public String getIncurredThisPeriod_C() {
		if(StringUtils.containsIgnoreCase(incurredThisPeriod_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(incurredThisPeriod_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return incurredThisPeriod_C;
	}
	public void setIncurredThisPeriod_C(String incurredThisPeriod_C) {
		this.incurredThisPeriod_C = incurredThisPeriod_C;
	}
	public String getPaymentThisPeriod_C() {
		if(StringUtils.containsIgnoreCase(paymentThisPeriod_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(paymentThisPeriod_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return paymentThisPeriod_C;
	}
	public void setPaymentThisPeriod_C(String paymentThisPeriod_C) {
		this.paymentThisPeriod_C = paymentThisPeriod_C;
	}
	public String getBalanceAtClose_C() {
		if(StringUtils.containsIgnoreCase(balanceAtClose_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(balanceAtClose_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return balanceAtClose_C;
	}
	public void setBalanceAtClose_C(String balanceAtClose_C) {
		this.balanceAtClose_C = balanceAtClose_C;
	}
}
