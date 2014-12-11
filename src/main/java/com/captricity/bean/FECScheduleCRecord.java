package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;
import com.captricity.constant.FECFileConstant;

public class FECScheduleCRecord {
	
	public static final String RECORD_NAME = "SC";
	
	private String formType;
	private String fecCommitteeId;
	private String receiptLineNumber;
	private String loanOrganizationName;
	private String loanLastName;
	private String loanFirstName;
	private String loanMiddleName;
	private String loanPrefix;
	private String loanSuffix;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private String election;
	private String electionDescription;
	private String origAmtOfLoan;
	private String paymentToDate;
	private String loanBalance;
	private String dateIncurred;
	private String dueDateTerms;
	private String pctRateTerms;
	private String securedYesno;
	private String memoTextDescription;
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
	public String getReceiptLineNumber() {
		if(StringUtils.isBlank(receiptLineNumber)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(receiptLineNumber),8) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setReceiptLineNumber(String receiptLineNumber) {
		this.receiptLineNumber = receiptLineNumber;
	}
	public String getLoanOrganizationName() {
		if(StringUtils.isBlank(loanOrganizationName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(loanOrganizationName),200) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setLoanOrganizationName(String loanOrganizationName) {
		this.loanOrganizationName = loanOrganizationName;
	}
	public String getLoanLastName() {
		if(StringUtils.isBlank(loanLastName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(loanLastName),30) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setLoanLastName(String loanLastName) {
		this.loanLastName = loanLastName;
	}
	public String getLoanFirstName() {
		if(StringUtils.isBlank(loanFirstName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(loanFirstName),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setLoanFirstName(String loanFirstName) {
		this.loanFirstName = loanFirstName;
	}
	public String getLoanMiddleName() {
		if(StringUtils.isBlank(loanMiddleName)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(loanMiddleName),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setLoanMiddleName(String loanMiddleName) {
		this.loanMiddleName = loanMiddleName;
	}
	public String getLoanPrefix() {
		if(StringUtils.isBlank(loanPrefix)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(loanPrefix),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setLoanPrefix(String loanPrefix) {
		this.loanPrefix = loanPrefix;
	}
	public String getLoanSuffix() {
		if(StringUtils.isBlank(loanSuffix)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(loanSuffix),10) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setLoanSuffix(String loanSuffix) {
		this.loanSuffix = loanSuffix;
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
	public String getElection() {
		if(StringUtils.isBlank(election)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(election),5) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setElection(String election) {
		this.election = election;
	}
	public String getElectionDescription() {
		if(StringUtils.isBlank(electionDescription)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(electionDescription),20) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setElectionDescription(String electionDescription) {
		this.electionDescription = electionDescription;
	}
	public String getOrigAmtOfLoan() {
		if(StringUtils.isBlank(origAmtOfLoan)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(origAmtOfLoan, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setOrigAmtOfLoan(String origAmtOfLoan) {
		this.origAmtOfLoan = origAmtOfLoan;
	}
	public String getPaymentToDate() {
		if(StringUtils.isBlank(paymentToDate)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(paymentToDate, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setPaymentToDate(String paymentToDate) {
		this.paymentToDate = paymentToDate;
	}
	public String getLoanBalance() {
		if(StringUtils.isBlank(loanBalance)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(loanBalance, FECFileConstant.AMOUNT_LENGTH) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setLoanBalance(String loanBalance) {
		this.loanBalance = loanBalance;
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
	public String getDueDateTerms() {
		if(StringUtils.isBlank(dueDateTerms)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(dueDateTerms),15) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setDueDateTerms(String dueDateTerms) {
		this.dueDateTerms = dueDateTerms;
	}
	public String getPctRateTerms() {
		if(StringUtils.isBlank(pctRateTerms)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(pctRateTerms),15) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setPctRateTerms(String pctRateTerms) {
		this.pctRateTerms = pctRateTerms;
	}
	public String getSecuredYesno() {
		if(StringUtils.isBlank(securedYesno)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(securedYesno),1) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setSecuredYesno(String securedYesno) {
		this.securedYesno = securedYesno;
	}
	public String getMemoTextDescription() {
		if(StringUtils.isBlank(memoTextDescription)){
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(memoTextDescription),100) + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setMemoTextDescription(String memoTextDescription) {
		this.memoTextDescription = memoTextDescription;
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
