package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.CSVFileConstant;

public class CSVScheduleARecord {
	
	private String name;
	private String formType;
	
	private String contributorLateName_A;
	private String contribOrganizationName_A;
	private String contributorSuffix_A;
	private String contributorMiddleName_A;
	private String contributorFirstName_A;
	private String personOrOrganization_A;
	private String contributorPrefix_A;
	private String street2_A;
	private String street1_A;
	private String dateReceived_A;
	private String city_A;
	private String state_A;
	private String zip_A;
	private String fecCommitteeIdNumber_A;
	private String amountReceived_A;
	private String indEmployer_A;
	private String indOccupation_A;
	private String itemElectCode_A;
	private String aggregateYTD_A;
	private String memoDescription_A;
	private String itemElectOther_A;
	
	private String contributorMiddleName_B;
	private String contribOrganizationName_B;
	private String contributorFirstName_B;
	private String contributorPrefix_B;
	private String contributorLastName_B;
	private String personOrOrganization_B;
	private String contributorSuffix_B;
	private String street2_B;
	private String street1_B;
	private String dateReceived_B;
	private String city_B;
	private String state_B;
	private String zip_B;
	private String fecCommitteeIdNumber_B;
	private String amountReceived_B;
	private String indEmployer_B;
	private String indOccupation_B;
	private String itemElectCode_B;
	private String aggregateYTD_B;
	private String memoDescription_B;
	private String itemElectOther_B;
	
	private String contributorMiddleName_C;
	private String contributorLastName_C;
	private String contributorFirstName_C;
	private String contribOrganizationName_C;
	private String contributorPrefix_C;
	private String contributorSuffix_C;
	private String personOrOrganization_C;
	private String street2_C;
	private String street1_C;
	private String dateReceived_C;
	private String city_C;
	private String state_C;
	private String zip_C;
	private String fecCommitteeIdNumber_C;
	private String indEmployer_C;
	private String indOccupation_C;
	private String amountReceived_C;
	private String itemElectCode_C;
	private String aggregateYTD_C;
	private String memoDescription_C;
	private String itemElectOther_C;
	
	private String subtotal;
	private String total;
	
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
		return StringUtils.upperCase(formType);
	}
	public void setFormType(String formType) {
		this.formType = formType;
	}
	public String getContributorLateName_A() {
		if(StringUtils.containsIgnoreCase(contributorLateName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorLateName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorLateName_A);
	}
	public void setContributorLateName_A(String contributorLateName_A) {
		this.contributorLateName_A = contributorLateName_A;
	}
	public String getContributorSuffix_A() {
		if(StringUtils.containsIgnoreCase(contributorSuffix_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorSuffix_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorSuffix_A);
	}
	public void setContributorSuffix_A(String contributorSuffix_A) {
		this.contributorSuffix_A = contributorSuffix_A;
	}
	public String getContributorMiddleName_A() {
		if(StringUtils.containsIgnoreCase(contributorMiddleName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorMiddleName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorMiddleName_A);		
	}
	public void setContributorMiddleName_A(String contributorMiddleName_A) {
		this.contributorMiddleName_A = contributorMiddleName_A;
	}
	public String getContributorFirstName_A() {
		if(StringUtils.containsIgnoreCase(contributorFirstName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorFirstName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorFirstName_A);		
	}
	public void setContributorFirstName_A(String contributorFirstName_A) {
		this.contributorFirstName_A = contributorFirstName_A;
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
	public String getContributorPrefix_A() {
		if(StringUtils.containsIgnoreCase(contributorPrefix_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorPrefix_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorPrefix_A);
	}
	public void setContributorPrefix_A(String contributorPrefix_A) {
		this.contributorPrefix_A = contributorPrefix_A;
	}
	public String getStreet2_A() {
		if(StringUtils.containsIgnoreCase(street2_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(street2_A);
	}
	public void setStreet2_A(String street2_A) {
		this.street2_A = street2_A;
	}
	public String getStreet1_A() {
		if(StringUtils.containsIgnoreCase(street1_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(street1_A);
	}
	public void setStreet1_A(String street1_A) {
		this.street1_A = street1_A;
	}
	public String getDateReceived_A() {
		if(StringUtils.containsIgnoreCase(dateReceived_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dateReceived_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(dateReceived_A);
	}
	public void setDateReceived_A(String dateReceived_A) {
		this.dateReceived_A = dateReceived_A;
	}
	public String getCity_A() {
		if(StringUtils.containsIgnoreCase(city_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(city_A);
	}
	public void setCity_A(String city_A) {
		this.city_A = city_A;
	}
	public String getState_A() {
		if(StringUtils.containsIgnoreCase(state_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(state_A);
	}
	public void setState_A(String state_A) {
		this.state_A = state_A;
	}
	public String getZip_A() {
		if(StringUtils.containsIgnoreCase(zip_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(zip_A);
	}
	public void setZip_A(String zip_A) {
		this.zip_A = zip_A;
	}
	public String getFecCommitteeIdNumber_A() {
		if(StringUtils.containsIgnoreCase(fecCommitteeIdNumber_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(fecCommitteeIdNumber_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(fecCommitteeIdNumber_A);
	}
	public void setFecCommitteeIdNumber_A(String fecCommitteeIdNumber_A) {
		this.fecCommitteeIdNumber_A = fecCommitteeIdNumber_A;
	}
	public String getAmountReceived_A() {
		if(StringUtils.containsIgnoreCase(amountReceived_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountReceived_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(amountReceived_A);
	}
	public void setAmountReceived_A(String amountReceived_A) {
		this.amountReceived_A = amountReceived_A;
	}
	public String getIndEmployer_A() {
		if(StringUtils.containsIgnoreCase(indEmployer_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indEmployer_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(indEmployer_A);
	}
	public void setIndEmployer_A(String indEmployer_A) {
		this.indEmployer_A = indEmployer_A;
	}
	public String getIndOccupation_A() {
		if(StringUtils.containsIgnoreCase(indOccupation_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indOccupation_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(indOccupation_A);
	}
	public void setIndOccupation_A(String indOccupation_A) {
		this.indOccupation_A = indOccupation_A;
	}
	public String getItemElectCode_A() {
		if(StringUtils.containsIgnoreCase(itemElectCode_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectCode_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(itemElectCode_A);
	}
	public void setItemElectCode_A(String itemElectCode_A) {
		this.itemElectCode_A = itemElectCode_A;
	}
	public String getAggregateYTD_A() {
		if(StringUtils.containsIgnoreCase(aggregateYTD_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(aggregateYTD_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(aggregateYTD_A);
	}
	public void setAggregateYTD_A(String aggregateYTD_A) {
		this.aggregateYTD_A = aggregateYTD_A;
	}
	public String getMemoDescription_A() {
		if(StringUtils.containsIgnoreCase(memoDescription_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(memoDescription_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(memoDescription_A);
	}
	public void setMemoDescription_A(String memoDescription_A) {
		this.memoDescription_A = memoDescription_A;
	}
	public String getItemElectOther_A() {
		if(StringUtils.containsIgnoreCase(itemElectOther_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectOther_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(itemElectOther_A);
	}
	public void setItemElectOther_A(String itemElectOther_A) {
		this.itemElectOther_A = itemElectOther_A;
	}
	public String getContributorMiddleName_B() {
		if(StringUtils.containsIgnoreCase(contributorMiddleName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorMiddleName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorMiddleName_B);
	}
	public void setContributorMiddleName_B(String contributorMiddleName_B) {
		this.contributorMiddleName_B = contributorMiddleName_B;
	}
	public String getContributorFirstName_B() {
		if(StringUtils.containsIgnoreCase(contributorFirstName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorFirstName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorFirstName_B);
	}
	public void setContributorFirstName_B(String contributorFirstName_B) {
		this.contributorFirstName_B = contributorFirstName_B;
	}
	public String getContributorPrefix_B() {
		if(StringUtils.containsIgnoreCase(contributorPrefix_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorPrefix_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorPrefix_B);
	}
	public void setContributorPrefix_B(String contributorPrefix_B) {
		this.contributorPrefix_B = contributorPrefix_B;
	}
	public String getContributorLastName_B() {
		if(StringUtils.containsIgnoreCase(contributorLastName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorLastName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorLastName_B);
	}
	public void setContributorLastName_B(String contributorLastName_B) {
		this.contributorLastName_B = contributorLastName_B;
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
	public String getContributorSuffix_B() {
		if(StringUtils.containsIgnoreCase(contributorSuffix_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorSuffix_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorSuffix_B);
	}
	public void setContributorSuffix_B(String contributorSuffix_B) {
		this.contributorSuffix_B = contributorSuffix_B;
	}
	public String getStreet2_B() {
		if(StringUtils.containsIgnoreCase(street2_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(street2_B);
	}
	public void setStreet2_B(String street2_B) {
		this.street2_B = street2_B;
	}
	public String getStreet1_B() {
		if(StringUtils.containsIgnoreCase(street1_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(street1_B);
	}
	public void setStreet1_B(String street1_B) {
		this.street1_B = street1_B;
	}
	public String getDateReceived_B() {
		if(StringUtils.containsIgnoreCase(dateReceived_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dateReceived_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(dateReceived_B);
	}
	public void setDateReceived_B(String dateReceived_B) {
		this.dateReceived_B = dateReceived_B;
	}
	public String getCity_B() {
		if(StringUtils.containsIgnoreCase(city_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(city_B);
	}
	public void setCity_B(String city_B) {
		this.city_B = city_B;
	}
	public String getState_B() {
		if(StringUtils.containsIgnoreCase(state_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(state_B);
	}
	public void setState_B(String state_B) {
		this.state_B = state_B;
	}
	public String getZip_B() {
		if(StringUtils.containsIgnoreCase(zip_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(zip_B);
	}
	public void setZip_B(String zip_B) {
		this.zip_B = zip_B;
	}
	public String getFecCommitteeIdNumber_B() {
		if(StringUtils.containsIgnoreCase(fecCommitteeIdNumber_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(fecCommitteeIdNumber_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(fecCommitteeIdNumber_B);
	}
	public void setFecCommitteeIdNumber_B(String fecCommitteeIdNumber_B) {
		this.fecCommitteeIdNumber_B = fecCommitteeIdNumber_B;
	}
	public String getAmountReceived_B() {
		if(StringUtils.containsIgnoreCase(amountReceived_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountReceived_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(amountReceived_B);
	}
	public void setAmountReceived_B(String amountReceived_B) {
		this.amountReceived_B = amountReceived_B;
	}
	public String getIndEmployer_B() {
		if(StringUtils.containsIgnoreCase(indEmployer_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indEmployer_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(indEmployer_B);
	}
	public void setIndEmployer_B(String indEmployer_B) {
		this.indEmployer_B = indEmployer_B;
	}
	public String getIndOccupation_B() {
		if(StringUtils.containsIgnoreCase(indOccupation_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indOccupation_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(indOccupation_B);
	}
	public void setIndOccupation_B(String indOccupation_B) {
		this.indOccupation_B = indOccupation_B;
	}
	public String getItemElectCode_B() {
		if(StringUtils.containsIgnoreCase(itemElectCode_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectCode_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(itemElectCode_B);
	}
	public void setItemElectCode_B(String itemElectCode_B) {
		this.itemElectCode_B = itemElectCode_B;
	}
	public String getAggregateYTD_B() {
		if(StringUtils.containsIgnoreCase(aggregateYTD_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(aggregateYTD_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(aggregateYTD_B);
	}
	public void setAggregateYTD_B(String aggregateYTD_B) {
		this.aggregateYTD_B = aggregateYTD_B;
	}
	public String getMemoDescription_B() {
		if(StringUtils.containsIgnoreCase(memoDescription_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(memoDescription_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(memoDescription_B);
	}
	public void setMemoDescription_B(String memoDescription_B) {
		this.memoDescription_B = memoDescription_B;
	}
	public String getItemElectOther_B() {
		if(StringUtils.containsIgnoreCase(itemElectOther_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectOther_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(itemElectOther_B);
	}
	public void setItemElectOther_B(String itemElectOther_B) {
		this.itemElectOther_B = itemElectOther_B;
	}
	public String getContributorMiddleName_C() {
		if(StringUtils.containsIgnoreCase(contributorMiddleName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorMiddleName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorMiddleName_C);
	}
	public void setContributorMiddleName_C(String contributorMiddleName_C) {
		this.contributorMiddleName_C = contributorMiddleName_C;
	}
	public String getContributorLastName_C() {
		if(StringUtils.containsIgnoreCase(contributorLastName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorLastName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorLastName_C);
	}
	public void setContributorLastName_C(String contributorLastName_C) {
		this.contributorLastName_C = contributorLastName_C;
	}
	public String getContributorFirstName_C() {
		if(StringUtils.containsIgnoreCase(contributorFirstName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorFirstName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorFirstName_C);
	}
	public void setContributorFirstName_C(String contributorFirstName_C) {
		this.contributorFirstName_C = contributorFirstName_C;
	}
	public String getContributorPrefix_C() {
		if(StringUtils.containsIgnoreCase(contributorPrefix_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorPrefix_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorPrefix_C);
	}
	public void setContributorPrefix_C(String contributorPrefix_C) {
		this.contributorPrefix_C = contributorPrefix_C;
	}
	public String getContributorSuffix_C() {
		if(StringUtils.containsIgnoreCase(contributorSuffix_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contributorSuffix_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contributorSuffix_C);
	}
	public void setContributorSuffix_C(String contributorSuffix_C) {
		this.contributorSuffix_C = contributorSuffix_C;
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
	public String getStreet2_C() {
		if(StringUtils.containsIgnoreCase(street2_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(street2_C);
	}
	public void setStreet2_C(String street2_C) {
		this.street2_C = street2_C;
	}
	public String getDateReceived_C() {
		if(StringUtils.containsIgnoreCase(dateReceived_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dateReceived_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(dateReceived_C);
	}
	public void setDateReceived_C(String dateReceived_C) {
		this.dateReceived_C = dateReceived_C;
	}
	public String getCity_C() {
		if(StringUtils.containsIgnoreCase(city_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(city_C);
	}
	public void setCity_C(String city_C) {
		this.city_C = city_C;
	}
	public String getState_C() {
		if(StringUtils.containsIgnoreCase(state_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(state_C);
	}
	public void setState_C(String state_C) {
		this.state_C = state_C;
	}
	public String getZip_C() {
		if(StringUtils.containsIgnoreCase(zip_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(zip_C);
	}
	public void setZip_C(String zip_C) {
		this.zip_C = zip_C;
	}
	public String getFecCommitteeIdNumber_C() {
		if(StringUtils.containsIgnoreCase(fecCommitteeIdNumber_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(fecCommitteeIdNumber_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(fecCommitteeIdNumber_C);
	}
	public void setFecCommitteeIdNumber_C(String fecCommitteeIdNumber_C) {
		this.fecCommitteeIdNumber_C = fecCommitteeIdNumber_C;
	}
	public String getIndEmployer_C() {
		if(StringUtils.containsIgnoreCase(indEmployer_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indEmployer_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(indEmployer_C);
	}
	public void setIndEmployer_C(String indEmployer_C) {
		this.indEmployer_C = indEmployer_C;
	}
	public String getIndOccupation_C() {
		if(StringUtils.containsIgnoreCase(indOccupation_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indOccupation_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(indOccupation_C);
	}
	public void setIndOccupation_C(String indOccupation_C) {
		this.indOccupation_C = indOccupation_C;
	}
	public String getAmountReceived_C() {
		if(StringUtils.containsIgnoreCase(amountReceived_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountReceived_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(amountReceived_C);
	}
	public void setAmountReceived_C(String amountReceived_C) {
		this.amountReceived_C = amountReceived_C;
	}
	public String getItemElectCode_C() {
		if(StringUtils.containsIgnoreCase(itemElectCode_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectCode_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(itemElectCode_C);
	}
	public void setItemElectCode_C(String itemElectCode_C) {
		this.itemElectCode_C = itemElectCode_C;
	}
	public String getAggregateYTD_C() {
		if(StringUtils.containsIgnoreCase(aggregateYTD_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(aggregateYTD_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(aggregateYTD_C);
	}
	public void setAggregateYTD_C(String aggregateYTD_C) {
		this.aggregateYTD_C = aggregateYTD_C;
	}
	public String getMemoDescription_C() {
		if(StringUtils.containsIgnoreCase(memoDescription_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(memoDescription_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(memoDescription_C);
	}
	public void setMemoDescription_C(String memoDescription_C) {
		this.memoDescription_C = memoDescription_C;
	}
	public String getItemElectOther_C() {
		if(StringUtils.containsIgnoreCase(itemElectOther_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(itemElectOther_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(itemElectOther_C);
	}
	public void setItemElectOther_C(String itemElectOther_C) {
		this.itemElectOther_C = itemElectOther_C;
	}
	public String getSubtotal() {
		if(StringUtils.containsIgnoreCase(subtotal, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(subtotal, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(subtotal);
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	public String getTotal() {
		if(StringUtils.containsIgnoreCase(total, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(total, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(total);
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getContribOrganizationName_A() {
		if(StringUtils.containsIgnoreCase(contribOrganizationName_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contribOrganizationName_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contribOrganizationName_A);
	}
	public void setContribOrganizationName_A(String contribOrganizationName_A) {
		this.contribOrganizationName_A = contribOrganizationName_A;
	}
	public String getContribOrganizationName_B() {
		if(StringUtils.containsIgnoreCase(contribOrganizationName_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contribOrganizationName_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contribOrganizationName_B);
	}
	public void setContribOrganizationName_B(String contribOrganizationName_B) {
		this.contribOrganizationName_B = contribOrganizationName_B;
	}
	public String getContribOrganizationName_C() {
		if(StringUtils.containsIgnoreCase(contribOrganizationName_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(contribOrganizationName_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(contribOrganizationName_C);
	}
	public void setContribOrganizationName_C(String contribOrganizationName_C) {
		this.contribOrganizationName_C = contribOrganizationName_C;
	}
	public String getStreet1_C() {
		if(StringUtils.containsIgnoreCase(street1_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return StringUtils.upperCase(street1_C);
	}
	public void setStreet1_C(String street1_C) {
		this.street1_C = street1_C;
	}
}
