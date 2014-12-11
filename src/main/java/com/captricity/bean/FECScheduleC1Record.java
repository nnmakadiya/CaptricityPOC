package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.FECFileConstant;


public class FECScheduleC1Record {
	
	public static final String RECORD_NAME = "SC1";
	
	private String formType;
	private String fecCommitteeId;
	private String nameLender;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private String amtOfLoan;
	private String loanInterestRatePercent;
	private String dateIncurred;
	private String dateDue;
	
	private String yesNo_A;
	private String dateOfOriginalLoan_A;
	
	private String creditAmountThisDraw_B;
	private String totalBalance_B;
	
	private String yesNo_C;
	
	private String yesNoCollateral_D;
	private String description_D;
	private String collateralValueAmount_D;
	private String yesNoPerfectedInterest_D;
	
	private String yesNo_E;
	private String description_E;
	private String estimatedValue_E;
	private String date_E;
	private String accountName_E;
	private String street1_E;
	private String street2_E;
	private String city_E;
	private String state_E;
	private String zip_E;
	
	private String description_F;
	
	private String treasLastName_G;
	private String treasFirstName_G;
	private String treasMiddleName_G;
	private String treasPrefix_G;
	private String treasSuffix_G;
	private String treasDate_G;
	
	private String authLastName;
	private String authFirstName;
	private String authMiddleName;
	private String authPrefix;
	private String authSuffix;
	private String authTitle;
	private String authDate;
	
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

	public String getNameLender() {
		if(StringUtils.isBlank(nameLender)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(nameLender),200) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setNameLender(String nameLender) {
		this.nameLender = nameLender;
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

	public String getAmtOfLoan() {
		if(StringUtils.isBlank(amtOfLoan)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(amtOfLoan, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAmtOfLoan(String amtOfLoan) {
		this.amtOfLoan = amtOfLoan;
	}

	public String getLoanInterestRatePercent() {
		if(StringUtils.isBlank(loanInterestRatePercent)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(loanInterestRatePercent),15) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setLoanInterestRatePercent(String loanInterestRatePercent) {
		this.loanInterestRatePercent = loanInterestRatePercent;
	}

	public String getDateIncurred() {
		if(StringUtils.isBlank(dateIncurred)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(dateIncurred),8) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDateIncurred(String dateIncurred) {
		this.dateIncurred = dateIncurred;
	}

	public String getDateDue() {
		if(StringUtils.isBlank(dateDue)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(dateDue),15) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDateDue(String dateDue) {
		this.dateDue = dateDue;
	}

	public String getYesNo_A() {
		if(StringUtils.isBlank(yesNo_A)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(yesNo_A),1) + (char)FECFileConstant.COLUMN_SEPARATOR;	
	}

	public void setYesNo_A(String yesNo_A) {
		this.yesNo_A = yesNo_A;
	}

	public String getDateOfOriginalLoan_A() {
		if(StringUtils.isBlank(dateOfOriginalLoan_A)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(dateOfOriginalLoan_A),8) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDateOfOriginalLoan_A(String dateOfOriginalLoan_A) {
		this.dateOfOriginalLoan_A = dateOfOriginalLoan_A;
	}

	public String getCreditAmountThisDraw_B() {
		if(StringUtils.isBlank(creditAmountThisDraw_B)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(creditAmountThisDraw_B, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCreditAmountThisDraw_B(String creditAmountThisDraw_B) {
		this.creditAmountThisDraw_B = creditAmountThisDraw_B;
	}

	public String getTotalBalance_B() {
		if(StringUtils.isBlank(totalBalance_B)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalBalance_B, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalBalance_B(String totalBalance_B) {
		this.totalBalance_B = totalBalance_B;
	}

	public String getYesNo_C() {
		if(StringUtils.isBlank(yesNo_C)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(yesNo_C),1) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setYesNo_C(String yesNo_C) {
		this.yesNo_C = yesNo_C;
	}

	public String getYesNoCollateral_D() {
		if(StringUtils.isBlank(yesNoCollateral_D)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(yesNoCollateral_D),1) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setYesNoCollateral_D(String yesNoCollateral_D) {
		this.yesNoCollateral_D = yesNoCollateral_D;
	}

	public String getDescription_D() {
		if(StringUtils.isBlank(description_D)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(description_D),100) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDescription_D(String description_D) {
		this.description_D = description_D;
	}

	public String getCollateralValueAmount_D() {
		if(StringUtils.isBlank(collateralValueAmount_D)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(collateralValueAmount_D, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCollateralValueAmount_D(String collateralValueAmount_D) {
		this.collateralValueAmount_D = collateralValueAmount_D;
	}

	public String getYesNoPerfectedInterest_D() {
		if(StringUtils.isBlank(yesNoPerfectedInterest_D)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(yesNoPerfectedInterest_D),1) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setYesNoPerfectedInterest_D(String yesNoPerfectedInterest_D) {
		this.yesNoPerfectedInterest_D = yesNoPerfectedInterest_D;
	}

	public String getYesNo_E() {
		if(StringUtils.isBlank(yesNo_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(yesNo_E),1) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setYesNo_E(String yesNo_E) {
		this.yesNo_E = yesNo_E;
	}

	public String getDescription_E() {
		if(StringUtils.isBlank(description_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(description_E),100) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDescription_E(String description_E) {
		this.description_E = description_E;
	}

	public String getEstimatedValue_E() {
		if(StringUtils.isBlank(estimatedValue_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(estimatedValue_E, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setEstimatedValue_E(String estimatedValue_E) {
		this.estimatedValue_E = estimatedValue_E;
	}

	public String getDate_E() {
		if(StringUtils.isBlank(date_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(date_E),8) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDate_E(String date_E) {
		this.date_E = date_E;
	}

	public String getAccountName_E() {
		if(StringUtils.isBlank(accountName_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(accountName_E),200) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAccountName_E(String accountName_E) {
		this.accountName_E = accountName_E;
	}

	public String getStreet1_E() {
		if(StringUtils.isBlank(street1_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(street1_E),34) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setStreet1_E(String street1_E) {
		this.street1_E = street1_E;
	}

	public String getStreet2_E() {
		if(StringUtils.isBlank(street2_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(street2_E),34) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setStreet2_E(String street2_E) {
		this.street2_E = street2_E;
	}

	public String getCity_E() {
		if(StringUtils.isBlank(city_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(city_E),30) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCity_E(String city_E) {
		this.city_E = city_E;
	}

	public String getState_E() {
		if(StringUtils.isBlank(state_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(state_E),2) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setState_E(String state_E) {
		this.state_E = state_E;
	}

	public String getZip_E() {
		if(StringUtils.isBlank(zip_E)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(zip_E),9) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setZip_E(String zip_E) {
		this.zip_E = zip_E;
	}

	public String getDescription_F() {
		if(StringUtils.isBlank(description_F)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(description_F),100) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDescription_F(String description_F) {
		this.description_F = description_F;
	}

	public String getTreasLastName_G() {
		if(StringUtils.isBlank(treasLastName_G)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasLastName_G),30) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasLastName_G(String treasLastName_G) {
		this.treasLastName_G = treasLastName_G;
	}

	public String getTreasFirstName_G() {
		if(StringUtils.isBlank(treasFirstName_G)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasFirstName_G),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasFirstName_G(String treasFirstName_G) {
		this.treasFirstName_G = treasFirstName_G;
	}

	public String getTreasMiddleName_G() {
		if(StringUtils.isBlank(treasMiddleName_G)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasMiddleName_G),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasMiddleName_G(String treasMiddleName_G) {
		this.treasMiddleName_G = treasMiddleName_G;
	}

	public String getTreasPrefix_G() {
		if(StringUtils.isBlank(treasPrefix_G)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasPrefix_G),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasPrefix_G(String treasPrefix_G) {
		this.treasPrefix_G = treasPrefix_G;
	}

	public String getTreasSuffix_G() {
		if(StringUtils.isBlank(treasSuffix_G)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasSuffix_G),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasSuffix_G(String treasSuffix_G) {
		this.treasSuffix_G = treasSuffix_G;
	}

	public String getTreasDate_G() {
		if(StringUtils.isBlank(treasDate_G)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasDate_G),8) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasDate_G(String treasDate_G) {
		this.treasDate_G = treasDate_G;
	}

	public String getAuthLastName() {
		if(StringUtils.isBlank(authLastName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(authLastName),30) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAuthLastName(String authLastName) {
		this.authLastName = authLastName;
	}

	public String getAuthFirstName() {
		if(StringUtils.isBlank(authFirstName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(authFirstName),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAuthFirstName(String authFirstName) {
		this.authFirstName = authFirstName;
	}

	public String getAuthMiddleName() {
		if(StringUtils.isBlank(authMiddleName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(authMiddleName),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAuthMiddleName(String authMiddleName) {
		this.authMiddleName = authMiddleName;
	}

	public String getAuthPrefix() {
		if(StringUtils.isBlank(authPrefix)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(authPrefix),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAuthPrefix(String authPrefix) {
		this.authPrefix = authPrefix;
	}

	public String getAuthSuffix() {
		if(StringUtils.isBlank(authSuffix)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(authSuffix),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAuthSuffix(String authSuffix) {
		this.authSuffix = authSuffix;
	}

	public String getAuthTitle() {
		if(StringUtils.isBlank(authTitle)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(authTitle),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAuthTitle(String authTitle) {
		this.authTitle = authTitle;
	}

	public String getAuthDate() {
		if(StringUtils.isBlank(authDate)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(authDate),8) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAuthDate(String authDate) {
		this.authDate = authDate;
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
