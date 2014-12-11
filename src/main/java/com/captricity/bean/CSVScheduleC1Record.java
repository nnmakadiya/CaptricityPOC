package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.CSVFileConstant;

public class CSVScheduleC1Record {
		
	private String name;
	private String formType;
	private String fecCommitteeId;
	private String nameLender;
	private String amtOfLoan;
	private String loanInterestRatePercent;
	private String street1;
	private String streetFull;
	private String street2;
	private String dateIncurred;
	private String city;
	private String state;
	private String zip;
	private String dateDue;
	
	private String yesNo_A;
	private String dateOfOriginalLoan_A;
	
	private String creditAmountThisDraw_B;
	private String totalBalance_B;
	
	private String yesNo_C;
	
	private String collateralValueAmount_D;
	private String yesNoCollateral_D;
	private String description_D;
	private String yesNoPerfectedInterest_D;
	
	private String description_E;
	private String yesNo_E;
	private String estimatedValue_E;
	private String accountName_E;
	private String street1_E;
	private String streetFull_E;
	private String street2_E;
	private String date_E;
	private String state_E;
	private String city_E;
	private String zip_E;
	
	private String description_F;
	
	private String treasPrefix_G;
	private String treasSuffix_G;
	private String treasLastName_G;
	private String treasMiddleName_G;
	private String treasFirstName_G;
	private String tresFullName_G;
	private String treasDate_G;
	
	private String authMiddleName;
	private String authFullName;
	private String authLastName;
	private String authPrefix;
	private String authFirstName;
	private String authSuffix;
	private String authTitle;
	private String authDate;
	
	
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
	public String getFecCommitteeId() {
		if(StringUtils.containsIgnoreCase(fecCommitteeId, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(fecCommitteeId, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return fecCommitteeId;
	}
	public void setFecCommitteeId(String fecCommitteeId) {
		this.fecCommitteeId = fecCommitteeId;
	}
	public String getNameLender() {
		if(StringUtils.containsIgnoreCase(nameLender, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(nameLender, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return nameLender;
	}
	public void setNameLender(String nameLender) {
		this.nameLender = nameLender;
	}
	public String getAmtOfLoan() {
		if(StringUtils.containsIgnoreCase(amtOfLoan, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(amtOfLoan, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return amtOfLoan;
	}
	public void setAmtOfLoan(String amtOfLoan) {
		this.amtOfLoan = amtOfLoan;
	}
	public String getLoanInterestRatePercent() {
		if(StringUtils.containsIgnoreCase(loanInterestRatePercent, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(loanInterestRatePercent, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return loanInterestRatePercent;
	}
	public void setLoanInterestRatePercent(String loanInterestRatePercent) {
		this.loanInterestRatePercent = loanInterestRatePercent;
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
	public String getDateDue() {
		if(StringUtils.containsIgnoreCase(dateDue, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dateDue, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return dateDue;
	}
	public void setDateDue(String dateDue) {
		this.dateDue = dateDue;
	}
	public String getYesNo_A() {
		if(StringUtils.containsIgnoreCase(yesNo_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(yesNo_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return yesNo_A;
	}
	public void setYesNo_A(String yesNo_A) {
		this.yesNo_A = yesNo_A;
	}
	public String getDateOfOriginalLoan_A() {
		if(StringUtils.containsIgnoreCase(dateOfOriginalLoan_A, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(dateOfOriginalLoan_A, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return dateOfOriginalLoan_A;
	}
	public void setDateOfOriginalLoan_A(String dateOfOriginalLoan_A) {
		this.dateOfOriginalLoan_A = dateOfOriginalLoan_A;
	}
	public String getCreditAmountThisDraw_B() {
		if(StringUtils.containsIgnoreCase(creditAmountThisDraw_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(creditAmountThisDraw_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return creditAmountThisDraw_B;
	}
	public void setCreditAmountThisDraw_B(String creditAmountThisDraw_B) {
		this.creditAmountThisDraw_B = creditAmountThisDraw_B;
	}
	public String getTotalBalance_B() {
		if(StringUtils.containsIgnoreCase(totalBalance_B, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(totalBalance_B, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return totalBalance_B;
	}
	public void setTotalBalance_B(String totalBalance_B) {
		this.totalBalance_B = totalBalance_B;
	}
	public String getYesNo_C() {
		if(StringUtils.containsIgnoreCase(yesNo_C, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(yesNo_C, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return yesNo_C;
	}
	public void setYesNo_C(String yesNo_C) {
		this.yesNo_C = yesNo_C;
	}
	public String getCollateralValueAmount_D() {
		if(StringUtils.containsIgnoreCase(collateralValueAmount_D, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(collateralValueAmount_D, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return collateralValueAmount_D;
	}
	public void setCollateralValueAmount_D(String collateralValueAmount_D) {
		this.collateralValueAmount_D = collateralValueAmount_D;
	}
	public String getYesNoCollateral_D() {
		if(StringUtils.containsIgnoreCase(yesNoCollateral_D, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(yesNoCollateral_D, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return yesNoCollateral_D;
	}
	public void setYesNoCollateral_D(String yesNoCollateral_D) {
		this.yesNoCollateral_D = yesNoCollateral_D;
	}
	public String getDescription_D() {
		if(StringUtils.containsIgnoreCase(description_D, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(description_D, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return description_D;
	}
	public void setDescription_D(String description_D) {
		this.description_D = description_D;
	}
	public String getYesNoPerfectedInterest_D() {
		if(StringUtils.containsIgnoreCase(yesNoPerfectedInterest_D, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(yesNoPerfectedInterest_D, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return yesNoPerfectedInterest_D;
	}
	public void setYesNoPerfectedInterest_D(String yesNoPerfectedInterest_D) {
		this.yesNoPerfectedInterest_D = yesNoPerfectedInterest_D;
	}
	public String getDescription_E() {
		if(StringUtils.containsIgnoreCase(description_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(description_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return description_E;
	}
	public void setDescription_E(String description_E) {
		this.description_E = description_E;
	}
	public String getYesNo_E() {
		if(StringUtils.containsIgnoreCase(yesNo_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(yesNo_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return yesNo_E;
	}
	public void setYesNo_E(String yesNo_E) {
		this.yesNo_E = yesNo_E;
	}
	public String getEstimatedValue_E() {
		if(StringUtils.containsIgnoreCase(estimatedValue_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(estimatedValue_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return estimatedValue_E;
	}
	public void setEstimatedValue_E(String estimatedValue_E) {
		this.estimatedValue_E = estimatedValue_E;
	}
	public String getAccountName_E() {
		if(StringUtils.containsIgnoreCase(accountName_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(accountName_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return accountName_E;
	}
	public void setAccountName_E(String accountName_E) {
		this.accountName_E = accountName_E;
	}
	public String getStreet1_E() {
		if(StringUtils.containsIgnoreCase(street1_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street1_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street1_E;
	}
	public void setStreet1_E(String street1_E) {
		this.street1_E = street1_E;
	}
	public String getDate_E() {
		if(StringUtils.containsIgnoreCase(date_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(date_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return date_E;
	}
	public void setDate_E(String date_E) {
		this.date_E = date_E;
	}
	public String getStreet2_E() {
		if(StringUtils.containsIgnoreCase(street2_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(street2_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return street2_E;
	}
	public void setStreet2_E(String street2_E) {
		this.street2_E = street2_E;
	}
	public String getCity_E() {
		if(StringUtils.containsIgnoreCase(city_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(city_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return city_E;
	}
	public void setCity_E(String city_E) {
		this.city_E = city_E;
	}
	public String getState_E() {
		if(StringUtils.containsIgnoreCase(state_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(state_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return state_E;
	}
	public void setState_E(String state_E) {
		this.state_E = state_E;
	}
	public String getZip_E() {
		if(StringUtils.containsIgnoreCase(zip_E, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(zip_E, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return zip_E;
	}
	public void setZip_E(String zip_E) {
		this.zip_E = zip_E;
	}
	public String getDescription_F() {
		if(StringUtils.containsIgnoreCase(description_F, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(description_F, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return description_F;
	}
	public void setDescription_F(String description_F) {
		this.description_F = description_F;
	}
	public String getTresFullName_G() {
		if(StringUtils.containsIgnoreCase(tresFullName_G, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(tresFullName_G, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return tresFullName_G;
	}
	public void setTresFullName_G(String tresFullName_G) {
		this.tresFullName_G = tresFullName_G;
	}
	public String getTreasSuffix_G() {
		if(StringUtils.containsIgnoreCase(treasSuffix_G, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(treasSuffix_G, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return treasSuffix_G;
	}
	public void setTreasSuffix_G(String treasSuffix_G) {
		this.treasSuffix_G = treasSuffix_G;
	}
	public String getTreasMiddleName_G() {
		if(StringUtils.containsIgnoreCase(treasMiddleName_G, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(treasMiddleName_G, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return treasMiddleName_G;
	}
	public void setTreasMiddleName_G(String treasMiddleName_G) {
		this.treasMiddleName_G = treasMiddleName_G;
	}
	public String getTreasLastName_G() {
		if(StringUtils.containsIgnoreCase(treasLastName_G, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(treasLastName_G, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return treasLastName_G;
	}
	public void setTreasLastName_G(String treasLastName_G) {
		this.treasLastName_G = treasLastName_G;
	}
	public String getTreasPrefix_G() {
		if(StringUtils.containsIgnoreCase(treasPrefix_G, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(treasPrefix_G, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return treasPrefix_G;
	}
	public void setTreasPrefix_G(String treasPrefix_G) {
		this.treasPrefix_G = treasPrefix_G;
	}
	public String getTreasFirstName_G() {
		if(StringUtils.containsIgnoreCase(treasFirstName_G, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(treasFirstName_G, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return treasFirstName_G;
	}
	public void setTreasFirstName_G(String treasFirstName_G) {
		this.treasFirstName_G = treasFirstName_G;
	}
	public String getTreasDate_G() {
		if(StringUtils.containsIgnoreCase(treasDate_G, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(treasDate_G, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return treasDate_G;
	}
	public void setTreasDate_G(String treasDate_G) {
		this.treasDate_G = treasDate_G;
	}
	public String getAuthFullName() {
		if(StringUtils.containsIgnoreCase(authFullName, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(authFullName, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return authFullName;
	}
	public void setAuthFullName(String authFullName) {
		this.authFullName = authFullName;
	}
	public String getAuthFirstName() {
		if(StringUtils.containsIgnoreCase(authFirstName, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(authFirstName, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return authFirstName;
	}
	public void setAuthFirstName(String authFirstName) {
		this.authFirstName = authFirstName;
	}
	public String getAuthMiddleName() {
		if(StringUtils.containsIgnoreCase(authMiddleName, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(authMiddleName, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return authMiddleName;
	}
	public void setAuthMiddleName(String authMiddleName) {
		this.authMiddleName = authMiddleName;
	}
	public String getAuthPrefix() {
		if(StringUtils.containsIgnoreCase(authPrefix, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(authPrefix, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return authPrefix;
	}
	public void setAuthPrefix(String authPrefix) {
		this.authPrefix = authPrefix;
	}
	public String getAuthLastName() {
		if(StringUtils.containsIgnoreCase(authLastName, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(authLastName, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return authLastName;
	}
	public void setAuthLastName(String authLastName) {
		this.authLastName = authLastName;
	}
	public String getAuthSuffix() {
		if(StringUtils.containsIgnoreCase(authSuffix, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(authSuffix, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return authSuffix;
	}
	public void setAuthSuffix(String authSuffix) {
		this.authSuffix = authSuffix;
	}
	public String getAuthTitle() {
		if(StringUtils.containsIgnoreCase(authTitle, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(authTitle, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return authTitle;
	}
	public void setAuthTitle(String authTitle) {
		this.authTitle = authTitle;
	}
	public String getAuthDate() {
		if(StringUtils.containsIgnoreCase(authDate, CSVFileConstant.BLANK) ||
				StringUtils.containsIgnoreCase(authDate, CSVFileConstant.IMPOSSIBLE)){
			return "";
		}
		return authDate;
	}
	public void setAuthDate(String authDate) {
		this.authDate = authDate;
	}
	public String getStreetFull() {
		if (StringUtils.containsIgnoreCase(streetFull, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(streetFull,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return streetFull;
	}
	public void setStreetFull(String streetFull) {
		this.streetFull = streetFull;
	}
	public String getStreetFull_E() {
		if (StringUtils.containsIgnoreCase(streetFull_E, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(streetFull_E,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return streetFull_E;
	}
	public void setStreetFull_E(String streetFull_E) {
		this.streetFull_E = streetFull_E;
	}
	
}
