package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.CSVFileConstant;

public class CSVScheduleCRecord {
		
	private String name;
	private String formType;
	
	private String receiptLineNumber;
	private String loanMiddleName;
	private String loanSuffix;
	private String loanFirstName;
	private String nameofPersonorOrganization;
	private String loanOrganizationName;
	private String loanPrefix;
	private String loanLastName;
	private String election;
	private String street1;
	private String street2;
	private String electionDescription;
	private String city;
	private String state;
	private String zip;
	private String origAmtOfLoan;
	private String paymentToDate;
	private String loanBalance;
	private String memoTextDescription;
	private String dateIncurred;
	private String dueDateTerms;
	private String pctRateTerms;
	private String securedYesno;
	
	private String indFirstName_1;
	private String nameOfPersonOrOrganization_1;
	private String indLastName_1;
	private String indSuffix_1;
	private String indPrefix_1;
	private String indMiddleName_1;
	private String indEmployer_1;
	private String street1_1;
	private String street2_1;
	private String indOccupation_1;
	private String city_1;
	private String state_1;
	private String zip_1;
	private String amountGuaranteedBalance_1;
	
	private String indMiddleName_2;
	private String nameOfPersonOrOrganization_2;
	private String indLastName_2;
	private String indFirstName_2;
	private String indPrefix_2;
	private String indSuffix_2;
	private String indEmployer_2;
	private String street1_2;
	private String street2_2;
	private String indOccupation_2;
	private String city_2;
	private String state_2;
	private String zip_2;
	private String amountGuaranteedBalance_2;
	
	private String indMiddleName_3;
	private String indFirstName_3;
	private String indPrefix_3;
	private String indSuffix_3;
	private String nameOfPersonOrOrganization_3;
	private String indLastName_3;
	private String indEmployer_3;
	private String street1_3;
	private String street2_3;
	private String indOccupation_3;
	private String city_3;
	private String state_3;
	private String zip_3;
	private String amountGuaranteedBalance_3;
	
	private String indMiddleName_4;
	private String indFirstName_4;
	private String indSuffix_4;
	private String indPrefix_4;
	private String nameOfPersonOrOrganization_4;
	private String indLastName_4;
	private String indEmployer_4;
	private String street2_4;
	private String street1_4;
	private String indOccupation_4;
	private String city_4;
	private String state_4;
	private String zip_4;
	private String amountGuaranteedBalance_4;
	
	
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
	public String getReceiptLineNumber() {
		if(StringUtils.containsIgnoreCase(receiptLineNumber, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(receiptLineNumber, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return receiptLineNumber;
	}
	public void setReceiptLineNumber(String receiptLineNumber) {
		this.receiptLineNumber = receiptLineNumber;
	}
	public String getLoanMiddleName() {
		if(StringUtils.containsIgnoreCase(loanMiddleName, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(loanMiddleName, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return loanMiddleName;
	}
	public void setLoanMiddleName(String loanMiddleName) {
		this.loanMiddleName = loanMiddleName;
	}
	public String getLoanSuffix() {
		if(StringUtils.containsIgnoreCase(loanSuffix, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(loanSuffix, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return loanSuffix;
	}
	public void setLoanSuffix(String loanSuffix) {
		this.loanSuffix = loanSuffix;
	}
	public String getLoanFirstName() {
		if(StringUtils.containsIgnoreCase(loanFirstName, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(loanFirstName, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return loanFirstName;
	}
	public void setLoanFirstName(String loanFirstName) {
		this.loanFirstName = loanFirstName;
	}
	public String getNameofPersonorOrganization() {
		if(StringUtils.containsIgnoreCase(nameofPersonorOrganization, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(nameofPersonorOrganization, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return nameofPersonorOrganization;
	}
	public void setNameofPersonorOrganization(String nameofPersonorOrganization) {
		this.nameofPersonorOrganization = nameofPersonorOrganization;
	}
	public String getLoanOrganizationName() {
		if(StringUtils.containsIgnoreCase(loanOrganizationName, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(loanOrganizationName, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return loanOrganizationName;
	}
	public void setLoanOrganizationName(String loanOrganizationName) {
		this.loanOrganizationName = loanOrganizationName;
	}
	public String getLoanPrefix() {
		if(StringUtils.containsIgnoreCase(loanPrefix, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(loanPrefix, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return loanPrefix;
	}
	public void setLoanPrefix(String loanPrefix) {
		this.loanPrefix = loanPrefix;
	}
	public String getLoanLastName() {
		if(StringUtils.containsIgnoreCase(loanLastName, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(loanLastName, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return loanLastName;
	}
	public void setLoanLastName(String loanLastName) {
		this.loanLastName = loanLastName;
	}
	public String getElection() {
		if(StringUtils.containsIgnoreCase(election, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(election, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return election;
	}
	public void setElection(String election) {
		this.election = election;
	}
	public String getStreet1() {
		if(StringUtils.containsIgnoreCase(street1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		if(StringUtils.containsIgnoreCase(street2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getElectionDescription() {
		if(StringUtils.containsIgnoreCase(electionDescription, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(electionDescription, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return electionDescription;
	}
	public void setElectionDescription(String electionDescription) {
		this.electionDescription = electionDescription;
	}
	public String getCity() {
		if(StringUtils.containsIgnoreCase(city, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		if(StringUtils.containsIgnoreCase(state, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		if(StringUtils.containsIgnoreCase(zip, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getOrigAmtOfLoan() {
		if(StringUtils.containsIgnoreCase(origAmtOfLoan, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(origAmtOfLoan, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return origAmtOfLoan;
	}
	public void setOrigAmtOfLoan(String origAmtOfLoan) {
		this.origAmtOfLoan = origAmtOfLoan;
	}
	public String getPaymentToDate() {
		if(StringUtils.containsIgnoreCase(paymentToDate, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(paymentToDate, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return paymentToDate;
	}
	public void setPaymentToDate(String paymentToDate) {
		this.paymentToDate = paymentToDate;
	}
	public String getLoanBalance() {
		if(StringUtils.containsIgnoreCase(loanBalance, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(loanBalance, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return loanBalance;
	}
	public void setLoanBalance(String loanBalance) {
		this.loanBalance = loanBalance;
	}
	public String getMemoTextDescription() {
		if(StringUtils.containsIgnoreCase(memoTextDescription, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(memoTextDescription, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return memoTextDescription;
	}
	public void setMemoTextDescription(String memoTextDescription) {
		this.memoTextDescription = memoTextDescription;
	}
	public String getDateIncurred() {
		if(StringUtils.containsIgnoreCase(dateIncurred, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dateIncurred, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return dateIncurred;
	}
	public void setDateIncurred(String dateIncurred) {
		this.dateIncurred = dateIncurred;
	}
	public String getDueDateTerms() {
		if(StringUtils.containsIgnoreCase(dueDateTerms, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dueDateTerms, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return dueDateTerms;
	}
	public void setDueDateTerms(String dueDateTerms) {
		this.dueDateTerms = dueDateTerms;
	}
	public String getPctRateTerms() {
		if(StringUtils.containsIgnoreCase(pctRateTerms, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(pctRateTerms, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return pctRateTerms;
	}
	public void setPctRateTerms(String pctRateTerms) {
		this.pctRateTerms = pctRateTerms;
	}
	public String getSecuredYesno() {
		if(StringUtils.containsIgnoreCase(securedYesno, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(securedYesno, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return securedYesno;
	}
	public void setSecuredYesno(String securedYesno) {
		this.securedYesno = securedYesno;
	}
	public String getIndFirstName_1() {
		if(StringUtils.containsIgnoreCase(indFirstName_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indFirstName_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indFirstName_1;
	}
	public void setIndFirstName_1(String indFirstName_1) {
		this.indFirstName_1 = indFirstName_1;
	}
	public String getNameOfPersonOrOrganization_1() {
		if(StringUtils.containsIgnoreCase(nameOfPersonOrOrganization_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(nameOfPersonOrOrganization_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return nameOfPersonOrOrganization_1;
	}
	public void setNameOfPersonOrOrganization_1(String nameOfPersonOrOrganization_1) {
		this.nameOfPersonOrOrganization_1 = nameOfPersonOrOrganization_1;
	}
	public String getIndLastName_1() {
		if(StringUtils.containsIgnoreCase(indLastName_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indLastName_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indLastName_1;
	}
	public void setIndLastName_1(String indLastName_1) {
		this.indLastName_1 = indLastName_1;
	}
	public String getIndSuffix_1() {
		if(StringUtils.containsIgnoreCase(indSuffix_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indSuffix_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indSuffix_1;
	}
	public void setIndSuffix_1(String indSuffix_1) {
		this.indSuffix_1 = indSuffix_1;
	}
	public String getIndPrefix_1() {
		if(StringUtils.containsIgnoreCase(indPrefix_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indPrefix_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indPrefix_1;
	}
	public void setIndPrefix_1(String indPrefix_1) {
		this.indPrefix_1 = indPrefix_1;
	}
	public String getIndMiddleName_1() {
		if(StringUtils.containsIgnoreCase(indMiddleName_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indMiddleName_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indMiddleName_1;
	}
	public void setIndMiddleName_1(String indMiddleName_1) {
		this.indMiddleName_1 = indMiddleName_1;
	}
	public String getIndEmployer_1() {
		if(StringUtils.containsIgnoreCase(indEmployer_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indEmployer_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indEmployer_1;
	}
	public void setIndEmployer_1(String indEmployer_1) {
		this.indEmployer_1 = indEmployer_1;
	}
	public String getStreet1_1() {
		if(StringUtils.containsIgnoreCase(street1_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street1_1;
	}
	public void setStreet1_1(String street1_1) {
		this.street1_1 = street1_1;
	}
	public String getStreet2_1() {
		if(StringUtils.containsIgnoreCase(street2_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street2_1;
	}
	public void setStreet2_1(String street2_1) {
		this.street2_1 = street2_1;
	}
	public String getIndOccupation_1() {
		if(StringUtils.containsIgnoreCase(indOccupation_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indOccupation_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indOccupation_1;
	}
	public void setIndOccupation_1(String indOccupation_1) {
		this.indOccupation_1 = indOccupation_1;
	}
	public String getCity_1() {
		if(StringUtils.containsIgnoreCase(city_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return city_1;
	}
	public void setCity_1(String city_1) {
		this.city_1 = city_1;
	}
	public String getState_1() {
		if(StringUtils.containsIgnoreCase(state_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return state_1;
	}
	public void setState_1(String state_1) {
		this.state_1 = state_1;
	}
	public String getZip_1() {
		if(StringUtils.containsIgnoreCase(zip_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return zip_1;
	}
	public void setZip_1(String zip_1) {
		this.zip_1 = zip_1;
	}
	public String getAmountGuaranteedBalance_1() {
		if(StringUtils.containsIgnoreCase(amountGuaranteedBalance_1, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountGuaranteedBalance_1, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return amountGuaranteedBalance_1;
	}
	public void setAmountGuaranteedBalance_1(String amountGuaranteedBalance_1) {
		this.amountGuaranteedBalance_1 = amountGuaranteedBalance_1;
	}
	public String getIndMiddleName_2() {
		if(StringUtils.containsIgnoreCase(indMiddleName_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indMiddleName_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indMiddleName_2;
	}
	public void setIndMiddleName_2(String indMiddleName_2) {
		this.indMiddleName_2 = indMiddleName_2;
	}
	public String getNameOfPersonOrOrganization_2() {
		if(StringUtils.containsIgnoreCase(nameOfPersonOrOrganization_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(nameOfPersonOrOrganization_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return nameOfPersonOrOrganization_2;
	}
	public void setNameOfPersonOrOrganization_2(String nameOfPersonOrOrganization_2) {
		this.nameOfPersonOrOrganization_2 = nameOfPersonOrOrganization_2;
	}
	public String getIndLastName_2() {
		if(StringUtils.containsIgnoreCase(indLastName_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indLastName_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indLastName_2;
	}
	public void setIndLastName_2(String indLastName_2) {
		this.indLastName_2 = indLastName_2;
	}
	public String getIndFirstName_2() {
		if(StringUtils.containsIgnoreCase(indFirstName_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indFirstName_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indFirstName_2;
	}
	public void setIndFirstName_2(String indFirstName_2) {
		this.indFirstName_2 = indFirstName_2;
	}
	public String getIndPrefix_2() {
		if(StringUtils.containsIgnoreCase(indPrefix_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indPrefix_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indPrefix_2;
	}
	public void setIndPrefix_2(String indPrefix_2) {
		this.indPrefix_2 = indPrefix_2;
	}
	public String getIndSuffix_2() {
		if(StringUtils.containsIgnoreCase(indSuffix_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indSuffix_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indSuffix_2;
	}
	public void setIndSuffix_2(String indSuffix_2) {
		this.indSuffix_2 = indSuffix_2;
	}
	public String getIndEmployer_2() {
		if(StringUtils.containsIgnoreCase(indEmployer_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indEmployer_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indEmployer_2;
	}
	public void setIndEmployer_2(String indEmployer_2) {
		this.indEmployer_2 = indEmployer_2;
	}
	public String getStreet1_2() {
		if(StringUtils.containsIgnoreCase(street1_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street1_2;
	}
	public void setStreet1_2(String street1_2) {
		this.street1_2 = street1_2;
	}
	public String getStreet2_2() {
		if(StringUtils.containsIgnoreCase(street2_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street2_2;
	}
	public void setStreet2_2(String street2_2) {
		this.street2_2 = street2_2;
	}
	public String getIndOccupation_2() {
		if(StringUtils.containsIgnoreCase(indOccupation_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indOccupation_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indOccupation_2;
	}
	public void setIndOccupation_2(String indOccupation_2) {
		this.indOccupation_2 = indOccupation_2;
	}
	public String getCity_2() {
		if(StringUtils.containsIgnoreCase(city_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return city_2;
	}
	public void setCity_2(String city_2) {
		this.city_2 = city_2;
	}
	public String getState_2() {
		if(StringUtils.containsIgnoreCase(state_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return state_2;
	}
	public void setState_2(String state_2) {
		this.state_2 = state_2;
	}
	public String getZip_2() {
		if(StringUtils.containsIgnoreCase(zip_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return zip_2;
	}
	public void setZip_2(String zip_2) {
		this.zip_2 = zip_2;
	}
	public String getAmountGuaranteedBalance_2() {
		if(StringUtils.containsIgnoreCase(amountGuaranteedBalance_2, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountGuaranteedBalance_2, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return amountGuaranteedBalance_2;
	}
	public void setAmountGuaranteedBalance_2(String amountGuaranteedBalance_2) {
		this.amountGuaranteedBalance_2 = amountGuaranteedBalance_2;
	}
	public String getIndMiddleName_3() {
		if(StringUtils.containsIgnoreCase(indMiddleName_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indMiddleName_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indMiddleName_3;
	}
	public void setIndMiddleName_3(String indMiddleName_3) {
		this.indMiddleName_3 = indMiddleName_3;
	}
	public String getIndFirstName_3() {
		if(StringUtils.containsIgnoreCase(indFirstName_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indFirstName_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indFirstName_3;
	}
	public void setIndFirstName_3(String indFirstName_3) {
		this.indFirstName_3 = indFirstName_3;
	}
	public String getIndPrefix_3() {
		if(StringUtils.containsIgnoreCase(indPrefix_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indPrefix_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indPrefix_3;
	}
	public void setIndPrefix_3(String indPrefix_3) {
		this.indPrefix_3 = indPrefix_3;
	}
	public String getIndSuffix_3() {
		if(StringUtils.containsIgnoreCase(indSuffix_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indSuffix_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indSuffix_3;
	}
	public void setIndSuffix_3(String indSuffix_3) {
		this.indSuffix_3 = indSuffix_3;
	}
	public String getNameOfPersonOrOrganization_3() {
		if(StringUtils.containsIgnoreCase(nameOfPersonOrOrganization_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(nameOfPersonOrOrganization_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return nameOfPersonOrOrganization_3;
	}
	public void setNameOfPersonOrOrganization_3(String nameOfPersonOrOrganization_3) {
		this.nameOfPersonOrOrganization_3 = nameOfPersonOrOrganization_3;
	}
	public String getIndLastName_3() {
		if(StringUtils.containsIgnoreCase(indLastName_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indLastName_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indLastName_3;
	}
	public void setIndLastName_3(String indLastName_3) {
		this.indLastName_3 = indLastName_3;
	}
	public String getIndEmployer_3() {
		if(StringUtils.containsIgnoreCase(indEmployer_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indEmployer_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indEmployer_3;
	}
	public void setIndEmployer_3(String indEmployer_3) {
		this.indEmployer_3 = indEmployer_3;
	}
	public String getStreet1_3() {
		if(StringUtils.containsIgnoreCase(street1_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street1_3;
	}
	public void setStreet1_3(String street1_3) {
		this.street1_3 = street1_3;
	}
	public String getStreet2_3() {
		if(StringUtils.containsIgnoreCase(street2_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street2_3;
	}
	public void setStreet2_3(String street2_3) {
		this.street2_3 = street2_3;
	}
	public String getIndOccupation_3() {
		if(StringUtils.containsIgnoreCase(indOccupation_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indOccupation_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indOccupation_3;
	}
	public void setIndOccupation_3(String indOccupation_3) {
		this.indOccupation_3 = indOccupation_3;
	}
	public String getCity_3() {
		if(StringUtils.containsIgnoreCase(city_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return city_3;
	}
	public void setCity_3(String city_3) {
		this.city_3 = city_3;
	}
	public String getState_3() {
		if(StringUtils.containsIgnoreCase(state_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return state_3;
	}
	public void setState_3(String state_3) {
		this.state_3 = state_3;
	}
	public String getZip_3() {
		if(StringUtils.containsIgnoreCase(zip_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return zip_3;
	}
	public void setZip_3(String zip_3) {
		this.zip_3 = zip_3;
	}
	public String getAmountGuaranteedBalance_3() {
		if(StringUtils.containsIgnoreCase(amountGuaranteedBalance_3, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountGuaranteedBalance_3, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return amountGuaranteedBalance_3;
	}
	public void setAmountGuaranteedBalance_3(String amountGuaranteedBalance_3) {
		this.amountGuaranteedBalance_3 = amountGuaranteedBalance_3;
	}
	public String getIndMiddleName_4() {
		if(StringUtils.containsIgnoreCase(indMiddleName_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indMiddleName_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indMiddleName_4;
	}
	public void setIndMiddleName_4(String indMiddleName_4) {
		this.indMiddleName_4 = indMiddleName_4;
	}
	public String getIndFirstName_4() {
		if(StringUtils.containsIgnoreCase(indFirstName_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indFirstName_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indFirstName_4;
	}
	public void setIndFirstName_4(String indFirstName_4) {
		this.indFirstName_4 = indFirstName_4;
	}
	public String getIndSuffix_4() {
		if(StringUtils.containsIgnoreCase(indSuffix_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indSuffix_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indSuffix_4;
	}
	public void setIndSuffix_4(String indSuffix_4) {
		this.indSuffix_4 = indSuffix_4;
	}
	public String getIndPrefix_4() {
		if(StringUtils.containsIgnoreCase(indPrefix_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indPrefix_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indPrefix_4;
	}
	public void setIndPrefix_4(String indPrefix_4) {
		this.indPrefix_4 = indPrefix_4;
	}
	public String getNameOfPersonOrOrganization_4() {
		if(StringUtils.containsIgnoreCase(nameOfPersonOrOrganization_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(nameOfPersonOrOrganization_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return nameOfPersonOrOrganization_4;
	}
	public void setNameOfPersonOrOrganization_4(String nameOfPersonOrOrganization_4) {
		this.nameOfPersonOrOrganization_4 = nameOfPersonOrOrganization_4;
	}
	public String getIndLastName_4() {
		if(StringUtils.containsIgnoreCase(indLastName_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indLastName_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indLastName_4;
	}
	public void setIndLastName_4(String indLastName_4) {
		this.indLastName_4 = indLastName_4;
	}
	public String getIndEmployer_4() {
		if(StringUtils.containsIgnoreCase(indEmployer_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indEmployer_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indEmployer_4;
	}
	public void setIndEmployer_4(String indEmployer_4) {
		this.indEmployer_4 = indEmployer_4;
	}
	public String getStreet2_4() {
		if(StringUtils.containsIgnoreCase(street2_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street2_4;
	}
	public void setStreet2_4(String street2_4) {
		this.street2_4 = street2_4;
	}
	public String getStreet1_4() {
		if(StringUtils.containsIgnoreCase(street1_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street1_4;
	}
	public void setStreet1_4(String street1_4) {
		this.street1_4 = street1_4;
	}
	public String getIndOccupation_4() {
		if(StringUtils.containsIgnoreCase(indOccupation_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(indOccupation_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return indOccupation_4;
	}
	public void setIndOccupation_4(String indOccupation_4) {
		this.indOccupation_4 = indOccupation_4;
	}
	public String getCity_4() {
		if(StringUtils.containsIgnoreCase(city_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return city_4;
	}
	public void setCity_4(String city_4) {
		this.city_4 = city_4;
	}
	public String getState_4() {
		if(StringUtils.containsIgnoreCase(state_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return state_4;
	}
	public void setState_4(String state_4) {
		this.state_4 = state_4;
	}
	public String getZip_4() {
		if(StringUtils.containsIgnoreCase(zip_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return zip_4;
	}
	public void setZip_4(String zip_4) {
		this.zip_4 = zip_4;
	}
	public String getAmountGuaranteedBalance_4() {
		if(StringUtils.containsIgnoreCase(amountGuaranteedBalance_4, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amountGuaranteedBalance_4, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return amountGuaranteedBalance_4;
	}
	public void setAmountGuaranteedBalance_4(String amountGuaranteedBalance_4) {
		this.amountGuaranteedBalance_4 = amountGuaranteedBalance_4;
	}
	
}
