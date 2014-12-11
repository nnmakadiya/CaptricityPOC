package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.FECFileConstant;

public class FECSummaryRecord {

	public static final String RECORD_NAME = "SP";

	private String formType;
	private String filterFecCommitteeId;
	private String committeeName;
	private String changeOfAddress;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private String electionState;
	private String electionDistrict;
	private String reportCode;
	private String dateOfElection;
	private String stateOfElection;
	private String coverageFromDate;
	private String coverageThroughDate;
	private String treasLastName;
	private String treasFirstName;
	private String treasMiddleName;
	private String treasPrefix;
	private String treasSuffix;
	private String treasDate;
	private String totalContributionsNoLoans_A;
	private String totalContributionRefunds_A;
	private String netContributions_A;
	private String totalOperatingExpenditures_A;
	private String totalOffsetToOperatingExpenditures_A;
	private String netOperatingExpenditures_A;
	private String cashOnHandAtClose;
	private String debtsTo;
	private String debtsBy;
	private String individualsItemized_A;
	private String individualsUnitemized_A;
	private String individualContributionTotal_A;
	private String politicalPartyCommittees_A;
	private String otherPoliticalCommittees_A;
	private String theCandidate_A;
	private String totalContributions_A;
	private String transfersFromOtherAuthorizedCmtes_A;
	private String loansMadeOrGuarantyByTheCandidate_A;
	private String allOtherLoans_A;
	private String totalLoans_A;
	private String offsetsToOperatingExpenditures_A;
	private String otherReceipts_A;
	private String totalReceipts_A;
	private String operatingExpenditures_A;
	private String transfersToOtherAuthorizedCommittees_A;
	private String ofLoansMade_A; // Loan Repayment By Candidate(B)
	private String loanRepayments_A;
	private String totalLoanRepayments_A;
	private String refundIndividuals_A;
	private String refundPolitical_A;
	private String refundOther_A;
	private String totalContributionRefunds20d_A;
	private String otherDisbursements_A;
	private String totalDisbursements_A;
	private String totalContributionsNoLoans_B;
	private String totalContributionRefunds_B;
	private String netContributions_B;
	private String totalOperatingExpenditures_B;
	private String totalOffsetToOperatingExpenditures_B;
	private String netOperatingExpenditures_B;
	private String individualsItemized_B;
	private String individualsUnitemized_B;
	private String individualContributionTotal_B;
	private String politicalPartyCommittees_B;
	private String otherPoliticalCommittees_B;
	private String theCandidate_B;
	private String totalContributions_B;
	private String transfersFromOtherAuthorizedCmtes_B;
	private String loansMadeOrGuarantyByTheCandidate_B;
	private String allOtherLoans_B;
	private String totalLoans_B;
	private String offsetsToOperatingExpenditures_B;
	private String otherReceipts_B;
	private String totalReceipts_B;
	private String operatingExpenditures_B;
	private String transfersToOtherAuthorizedCommittees_B;
	private String loanRepaymentByCandidate_B; // ofLoansMade_A
	private String loanRepayments_B;
	private String totalLoanRepayments_B;
	private String refundIndividuals_B;
	private String refundPolitical_B;
	private String refundOther_B;
	private String totalContributionRefunds20d_B;
	private String otherDisbursements_B;
	private String totalDisbursements_B;
	private String cashBeginningReportingPeriod;
	private String totalReceiptsThisPeriod;
	private String subTotal;
	private String totalDisbursementsThisPeriod;
	private String cashOnHandAtClosePeriod;
	private String beginningImageNumber;

	public void setFormType(String formType) {
		this.formType = formType;
	}

	public String getFormType() {
		if (StringUtils.isBlank(formType)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(formType), 4)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public String getFilterFecCommitteeId() {
		if (StringUtils.isBlank(filterFecCommitteeId)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(filterFecCommitteeId),9)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setFilterFecCommitteeId(String filterFecCommitteeId) {
		this.filterFecCommitteeId = filterFecCommitteeId;
	}

	public String getCommitteeName() {
		if (StringUtils.isBlank(committeeName)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(committeeName),200)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCommitteeName(String committeeName) {
		this.committeeName = committeeName;
	}

	public String getChangeOfAddress() {
		if (StringUtils.isBlank(changeOfAddress)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(changeOfAddress),1)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setChangeOfAddress(String changeOfAddress) {
		this.changeOfAddress = changeOfAddress;
	}

	public String getStreet1() {
		if (StringUtils.isBlank(street1)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(street1),34)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		if (StringUtils.isBlank(street2)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(street2),34)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		if (StringUtils.isBlank(city)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(city),30)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		if (StringUtils.isBlank(state)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(state),2)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		if (StringUtils.isBlank(zip)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(zip),9)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getElectionState() {
		if (StringUtils.isBlank(electionState)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(electionState),2)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setElectionState(String electionState) {
		this.electionState = electionState;
	}

	public String getElectionDistrict() {
		if (StringUtils.isBlank(electionDistrict)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(electionDistrict),2)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setElectionDistrict(String electionDistrict) {
		this.electionDistrict = electionDistrict;
	}

	public String getReportCode() {
		if (StringUtils.isBlank(reportCode)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(reportCode),3)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setReportCode(String reportCode) {
		this.reportCode = reportCode;
	}

	public String getDateOfElection() {
		if (StringUtils.isBlank(dateOfElection)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(dateOfElection),8)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDateOfElection(String dateOfElection) {
		this.dateOfElection = dateOfElection;
	}

	public String getStateOfElection() {
		if (StringUtils.isBlank(stateOfElection)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(stateOfElection),2)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setStateOfElection(String stateOfElection) {
		this.stateOfElection = stateOfElection;
	}

	public String getCoverageFromDate() {
		if (StringUtils.isBlank(coverageFromDate)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(coverageFromDate),8)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCoverageFromDate(String coverageFromDate) {
		this.coverageFromDate = coverageFromDate;
	}

	public String getCoverageThroughDate() {
		if (StringUtils.isBlank(coverageThroughDate)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(coverageThroughDate),8)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCoverageThroughDate(String coverageThroughDate) {
		this.coverageThroughDate = coverageThroughDate;
	}

	public String getTreasLastName() {
		if (StringUtils.isBlank(treasLastName)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasLastName),30)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasLastName(String treasLastName) {
		this.treasLastName = treasLastName;
	}

	public String getTreasFirstName() {
		if (StringUtils.isBlank(treasFirstName)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasFirstName),20)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasFirstName(String treasFirstName) {
		this.treasFirstName = treasFirstName;
	}

	public String getTreasMiddleName() {
		if (StringUtils.isBlank(treasMiddleName)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasMiddleName),20)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasMiddleName(String treasMiddleName) {
		this.treasMiddleName = treasMiddleName;
	}

	public String getTreasPrefix() {
		if (StringUtils.isBlank(treasPrefix)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasPrefix),10)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasPrefix(String treasPrefix) {
		this.treasPrefix = treasPrefix;
	}

	public String getTreasSuffix() {
		if (StringUtils.isBlank(treasSuffix)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasSuffix),10)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasSuffix(String treasSuffix) {
		this.treasSuffix = treasSuffix;
	}

	public String getTreasDate() {
		if (StringUtils.isBlank(treasDate)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.left(StringUtils.upperCase(treasDate),8)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTreasDate(String treasDate) {
		this.treasDate = treasDate;
	}

	public String getTotalContributionsNoLoans_A() {
		if (StringUtils.isBlank(totalContributionsNoLoans_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalContributionsNoLoans_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalContributionsNoLoans_A(
			String totalContributionsNoLoans_A) {
		this.totalContributionsNoLoans_A = totalContributionsNoLoans_A;
	}

	public String getTotalContributionRefunds_A() {
		if (StringUtils.isBlank(totalContributionRefunds_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalContributionRefunds_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalContributionRefunds_A(String totalContributionRefunds_A) {
		this.totalContributionRefunds_A = totalContributionRefunds_A;
	}

	public String getNetContributions_A() {
		if (StringUtils.isBlank(netContributions_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(netContributions_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setNetContributions_A(String netContributions_A) {
		this.netContributions_A = netContributions_A;
	}

	public String getTotalOperatingExpenditures_A() {
		if (StringUtils.isBlank(totalOperatingExpenditures_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalOperatingExpenditures_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalOperatingExpenditures_A(
			String totalOperatingExpenditures_A) {
		this.totalOperatingExpenditures_A = totalOperatingExpenditures_A;
	}

	public String getTotalOffsetToOperatingExpenditures_A() {
		if (StringUtils.isBlank(totalOffsetToOperatingExpenditures_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalOffsetToOperatingExpenditures_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalOffsetToOperatingExpenditures_A(
			String totalOffsetToOperatingExpenditures_A) {
		this.totalOffsetToOperatingExpenditures_A = totalOffsetToOperatingExpenditures_A;
	}

	public String getNetOperatingExpenditures_A() {
		if (StringUtils.isBlank(netOperatingExpenditures_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(netOperatingExpenditures_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setNetOperatingExpenditures_A(String netOperatingExpenditures_A) {
		this.netOperatingExpenditures_A = netOperatingExpenditures_A;
	}

	public String getCashOnHandAtClose() {
		if (StringUtils.isBlank(cashOnHandAtClose)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(cashOnHandAtClose,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCashOnHandAtClose(String cashOnHandAtClose) {
		this.cashOnHandAtClose = cashOnHandAtClose;
	}

	public String getDebtsTo() {
		if (StringUtils.isBlank(debtsTo)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(debtsTo, FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDebtsTo(String debtsTo) {
		this.debtsTo = debtsTo;
	}

	public String getDebtsBy() {
		if (StringUtils.isBlank(debtsBy)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(debtsBy, FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setDebtsBy(String debtsBy) {
		this.debtsBy = debtsBy;
	}

	public String getIndividualsItemized_A() {
		if (StringUtils.isBlank(individualsItemized_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(individualsItemized_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setIndividualsItemized_A(String individualsItemized_A) {
		this.individualsItemized_A = individualsItemized_A;
	}

	public String getIndividualsUnitemized_A() {
		if (StringUtils.isBlank(individualsUnitemized_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(individualsUnitemized_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setIndividualsUnitemized_A(String individualsUnitemized_A) {
		this.individualsUnitemized_A = individualsUnitemized_A;
	}

	public String getIndividualContributionTotal_A() {
		if (StringUtils.isBlank(individualContributionTotal_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(individualContributionTotal_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setIndividualContributionTotal_A(
			String individualContributionTotal_A) {
		this.individualContributionTotal_A = individualContributionTotal_A;
	}

	public String getPoliticalPartyCommittees_A() {
		if (StringUtils.isBlank(politicalPartyCommittees_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(politicalPartyCommittees_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setPoliticalPartyCommittees_A(String politicalPartyCommittees_A) {
		this.politicalPartyCommittees_A = politicalPartyCommittees_A;
	}

	public String getOtherPoliticalCommittees_A() {
		if (StringUtils.isBlank(otherPoliticalCommittees_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(otherPoliticalCommittees_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOtherPoliticalCommittees_A(String otherPoliticalCommittees_A) {
		this.otherPoliticalCommittees_A = otherPoliticalCommittees_A;
	}

	public String getTheCandidate_A() {
		if (StringUtils.isBlank(theCandidate_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(theCandidate_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTheCandidate_A(String theCandidate_A) {
		this.theCandidate_A = theCandidate_A;
	}

	public String getTotalContributions_A() {
		if (StringUtils.isBlank(totalContributions_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalContributions_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalContributions_A(String totalContributions_A) {
		this.totalContributions_A = totalContributions_A;
	}

	public String getTransfersFromOtherAuthorizedCmtes_A() {
		if (StringUtils.isBlank(transfersFromOtherAuthorizedCmtes_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(transfersFromOtherAuthorizedCmtes_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTransfersFromOtherAuthorizedCmtes_A(
			String transfersFromOtherAuthorizedCmtes_A) {
		this.transfersFromOtherAuthorizedCmtes_A = transfersFromOtherAuthorizedCmtes_A;
	}

	public String getLoansMadeOrGuarantyByTheCandidate_A() {
		if (StringUtils.isBlank(loansMadeOrGuarantyByTheCandidate_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(loansMadeOrGuarantyByTheCandidate_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setLoansMadeOrGuarantyByTheCandidate_A(
			String loansMadeOrGuarantyByTheCandidate_A) {
		this.loansMadeOrGuarantyByTheCandidate_A = loansMadeOrGuarantyByTheCandidate_A;
	}

	public String getAllOtherLoans_A() {
		if (StringUtils.isBlank(allOtherLoans_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(allOtherLoans_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAllOtherLoans_A(String allOtherLoans_A) {
		this.allOtherLoans_A = allOtherLoans_A;
	}

	public String getTotalLoans_A() {
		if (StringUtils.isBlank(totalLoans_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalLoans_A, FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalLoans_A(String totalLoans_A) {
		this.totalLoans_A = totalLoans_A;
	}

	public String getOffsetsToOperatingExpenditures_A() {
		if (StringUtils.isBlank(offsetsToOperatingExpenditures_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(offsetsToOperatingExpenditures_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOffsetsToOperatingExpenditures_A(
			String offsetsToOperatingExpenditures_A) {
		this.offsetsToOperatingExpenditures_A = offsetsToOperatingExpenditures_A;
	}

	public String getOtherReceipts_A() {
		if (StringUtils.isBlank(otherReceipts_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(otherReceipts_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOtherReceipts_A(String otherReceipts_A) {
		this.otherReceipts_A = otherReceipts_A;
	}

	public String getTotalReceipts_A() {
		if (StringUtils.isBlank(totalReceipts_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalReceipts_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalReceipts_A(String totalReceipts_A) {
		this.totalReceipts_A = totalReceipts_A;
	}

	public String getOperatingExpenditures_A() {
		if (StringUtils.isBlank(operatingExpenditures_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(operatingExpenditures_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOperatingExpenditures_A(String operatingExpenditures_A) {
		this.operatingExpenditures_A = operatingExpenditures_A;
	}

	public String getTransfersToOtherAuthorizedCommittees_A() {
		if (StringUtils.isBlank(transfersToOtherAuthorizedCommittees_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(transfersToOtherAuthorizedCommittees_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTransfersToOtherAuthorizedCommittees_A(
			String transfersToOtherAuthorizedCommittees_A) {
		this.transfersToOtherAuthorizedCommittees_A = transfersToOtherAuthorizedCommittees_A;
	}

	public String getOfLoansMade_A() {
		if (StringUtils.isBlank(ofLoansMade_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils
				.leftPad(ofLoansMade_A, FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOfLoansMade_A(String ofLoansMade_A) {
		this.ofLoansMade_A = ofLoansMade_A;
	}

	public String getLoanRepayments_A() {
		if (StringUtils.isBlank(loanRepayments_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(loanRepayments_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setLoanRepayments_A(String loanRepayments_A) {
		this.loanRepayments_A = loanRepayments_A;
	}

	public String getTotalLoanRepayments_A() {
		if (StringUtils.isBlank(totalLoanRepayments_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalLoanRepayments_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalLoanRepayments_A(String totalLoanRepayments_A) {
		this.totalLoanRepayments_A = totalLoanRepayments_A;
	}

	public String getRefundIndividuals_A() {
		if (StringUtils.isBlank(refundIndividuals_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(refundIndividuals_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setRefundIndividuals_A(String refundIndividuals_A) {
		this.refundIndividuals_A = refundIndividuals_A;
	}

	public String getRefundPolitical_A() {
		if (StringUtils.isBlank(refundPolitical_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(refundPolitical_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setRefundPolitical_A(String refundPolitical_A) {
		this.refundPolitical_A = refundPolitical_A;
	}

	public String getRefundOther_A() {
		if (StringUtils.isBlank(refundOther_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils
				.leftPad(refundOther_A, FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setRefundOther_A(String refundOther_A) {
		this.refundOther_A = refundOther_A;
	}

	public String getTotalContributionRefunds20d_A() {
		if (StringUtils.isBlank(totalContributionRefunds20d_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalContributionRefunds20d_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalContributionRefunds20d_A(
			String totalContributionRefunds20d_A) {
		this.totalContributionRefunds20d_A = totalContributionRefunds20d_A;
	}

	public String getOtherDisbursements_A() {
		if (StringUtils.isBlank(otherDisbursements_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(otherDisbursements_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOtherDisbursements_A(String otherDisbursements_A) {
		this.otherDisbursements_A = otherDisbursements_A;
	}

	public String getTotalDisbursements_A() {
		if (StringUtils.isBlank(totalDisbursements_A)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalDisbursements_A,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalDisbursements_A(String totalDisbursements_A) {
		this.totalDisbursements_A = totalDisbursements_A;
	}

	public String getTotalContributionsNoLoans_B() {
		if (StringUtils.isBlank(totalContributionsNoLoans_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalContributionsNoLoans_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalContributionsNoLoans_B(
			String totalContributionsNoLoans_B) {
		this.totalContributionsNoLoans_B = totalContributionsNoLoans_B;
	}

	public String getTotalContributionRefunds_B() {
		if (StringUtils.isBlank(totalContributionRefunds_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalContributionRefunds_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalContributionRefunds_B(String totalContributionRefunds_B) {
		this.totalContributionRefunds_B = totalContributionRefunds_B;
	}

	public String getNetContributions_B() {
		if (StringUtils.isBlank(netContributions_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(netContributions_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setNetContributions_B(String netContributions_B) {
		this.netContributions_B = netContributions_B;
	}

	public String getTotalOperatingExpenditures_B() {
		if (StringUtils.isBlank(totalOperatingExpenditures_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalOperatingExpenditures_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalOperatingExpenditures_B(
			String totalOperatingExpenditures_B) {
		this.totalOperatingExpenditures_B = totalOperatingExpenditures_B;
	}

	public String getTotalOffsetToOperatingExpenditures_B() {
		if (StringUtils.isBlank(totalOffsetToOperatingExpenditures_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalOffsetToOperatingExpenditures_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalOffsetToOperatingExpenditures_B(
			String totalOffsetToOperatingExpenditures_B) {
		this.totalOffsetToOperatingExpenditures_B = totalOffsetToOperatingExpenditures_B;
	}

	public String getNetOperatingExpenditures_B() {
		if (StringUtils.isBlank(netOperatingExpenditures_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(netOperatingExpenditures_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setNetOperatingExpenditures_B(String netOperatingExpenditures_B) {
		this.netOperatingExpenditures_B = netOperatingExpenditures_B;
	}

	public String getIndividualsItemized_B() {
		if (StringUtils.isBlank(individualsItemized_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(individualsItemized_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setIndividualsItemized_B(String individualsItemized_B) {
		this.individualsItemized_B = individualsItemized_B;
	}

	public String getIndividualsUnitemized_B() {
		if (StringUtils.isBlank(individualsUnitemized_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(individualsUnitemized_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setIndividualsUnitemized_B(String individualsUnitemized_B) {
		this.individualsUnitemized_B = individualsUnitemized_B;
	}

	public String getIndividualContributionTotal_B() {
		if (StringUtils.isBlank(individualContributionTotal_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(individualContributionTotal_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setIndividualContributionTotal_B(
			String individualContributionTotal_B) {
		this.individualContributionTotal_B = individualContributionTotal_B;
	}

	public String getPoliticalPartyCommittees_B() {
		if (StringUtils.isBlank(politicalPartyCommittees_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(politicalPartyCommittees_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setPoliticalPartyCommittees_B(String politicalPartyCommittees_B) {
		this.politicalPartyCommittees_B = politicalPartyCommittees_B;
	}

	public String getOtherPoliticalCommittees_B() {
		if (StringUtils.isBlank(otherPoliticalCommittees_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(otherPoliticalCommittees_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOtherPoliticalCommittees_B(String otherPoliticalCommittees_B) {
		this.otherPoliticalCommittees_B = otherPoliticalCommittees_B;
	}

	public String getTheCandidate_B() {
		if (StringUtils.isBlank(theCandidate_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(theCandidate_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTheCandidate_B(String theCandidate_B) {
		this.theCandidate_B = theCandidate_B;
	}

	public String getTotalContributions_B() {
		if (StringUtils.isBlank(totalContributions_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalContributions_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalContributions_B(String totalContributions_B) {
		this.totalContributions_B = totalContributions_B;
	}

	public String getTransfersFromOtherAuthorizedCmtes_B() {
		if (StringUtils.isBlank(transfersFromOtherAuthorizedCmtes_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(transfersFromOtherAuthorizedCmtes_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTransfersFromOtherAuthorizedCmtes_B(
			String transfersFromOtherAuthorizedCmtes_B) {
		this.transfersFromOtherAuthorizedCmtes_B = transfersFromOtherAuthorizedCmtes_B;
	}

	public String getLoansMadeOrGuarantyByTheCandidate_B() {
		if (StringUtils.isBlank(loansMadeOrGuarantyByTheCandidate_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(loansMadeOrGuarantyByTheCandidate_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setLoansMadeOrGuarantyByTheCandidate_B(
			String loansMadeOrGuarantyByTheCandidate_B) {
		this.loansMadeOrGuarantyByTheCandidate_B = loansMadeOrGuarantyByTheCandidate_B;
	}

	public String getAllOtherLoans_B() {
		if (StringUtils.isBlank(allOtherLoans_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(allOtherLoans_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setAllOtherLoans_B(String allOtherLoans_B) {
		this.allOtherLoans_B = allOtherLoans_B;
	}

	public String getTotalLoans_B() {
		if (StringUtils.isBlank(totalLoans_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalLoans_B, FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalLoans_B(String totalLoans_B) {
		this.totalLoans_B = totalLoans_B;
	}

	public String getOffsetsToOperatingExpenditures_B() {
		if (StringUtils.isBlank(offsetsToOperatingExpenditures_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(offsetsToOperatingExpenditures_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOffsetsToOperatingExpenditures_B(
			String offsetsToOperatingExpenditures_B) {
		this.offsetsToOperatingExpenditures_B = offsetsToOperatingExpenditures_B;
	}

	public String getOtherReceipts_B() {
		if (StringUtils.isBlank(otherReceipts_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(otherReceipts_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOtherReceipts_B(String otherReceipts_B) {
		this.otherReceipts_B = otherReceipts_B;
	}

	public String getTotalReceipts_B() {
		if (StringUtils.isBlank(totalReceipts_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalReceipts_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalReceipts_B(String totalReceipts_B) {
		this.totalReceipts_B = totalReceipts_B;
	}

	public String getOperatingExpenditures_B() {
		if (StringUtils.isBlank(operatingExpenditures_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(operatingExpenditures_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOperatingExpenditures_B(String operatingExpenditures_B) {
		this.operatingExpenditures_B = operatingExpenditures_B;
	}

	public String getTransfersToOtherAuthorizedCommittees_B() {
		if (StringUtils.isBlank(transfersToOtherAuthorizedCommittees_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(transfersToOtherAuthorizedCommittees_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTransfersToOtherAuthorizedCommittees_B(
			String transfersToOtherAuthorizedCommittees_B) {
		this.transfersToOtherAuthorizedCommittees_B = transfersToOtherAuthorizedCommittees_B;
	}

	public String getLoanRepaymentByCandidate_B() {
		if (StringUtils.isBlank(loanRepaymentByCandidate_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(loanRepaymentByCandidate_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setLoanRepaymentByCandidate_B(String loanRepaymentByCandidate_B) {
		this.loanRepaymentByCandidate_B = loanRepaymentByCandidate_B;
	}

	public String getLoanRepayments_B() {
		if (StringUtils.isBlank(loanRepayments_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(loanRepayments_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setLoanRepayments_B(String loanRepayments_B) {
		this.loanRepayments_B = loanRepayments_B;
	}

	public String getTotalLoanRepayments_B() {
		if (StringUtils.isBlank(totalLoanRepayments_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalLoanRepayments_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalLoanRepayments_B(String totalLoanRepayments_B) {
		this.totalLoanRepayments_B = totalLoanRepayments_B;
	}

	public String getRefundIndividuals_B() {
		if (StringUtils.isBlank(refundIndividuals_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(refundIndividuals_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setRefundIndividuals_B(String refundIndividuals_B) {
		this.refundIndividuals_B = refundIndividuals_B;
	}

	public String getRefundPolitical_B() {
		if (StringUtils.isBlank(refundPolitical_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(refundPolitical_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setRefundPolitical_B(String refundPolitical_B) {
		this.refundPolitical_B = refundPolitical_B;
	}

	public String getRefundOther_B() {
		if (StringUtils.isBlank(refundOther_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils
				.leftPad(refundOther_B, FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setRefundOther_B(String refundOther_B) {
		this.refundOther_B = refundOther_B;
	}

	public String getTotalContributionRefunds20d_B() {
		if (StringUtils.isBlank(totalContributionRefunds20d_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalContributionRefunds20d_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalContributionRefunds20d_B(
			String totalContributionRefunds20d_B) {
		this.totalContributionRefunds20d_B = totalContributionRefunds20d_B;
	}

	public String getOtherDisbursements_B() {
		if (StringUtils.isBlank(otherDisbursements_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(otherDisbursements_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setOtherDisbursements_B(String otherDisbursements_B) {
		this.otherDisbursements_B = otherDisbursements_B;
	}

	public String getTotalDisbursements_B() {
		if (StringUtils.isBlank(totalDisbursements_B)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalDisbursements_B,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalDisbursements_B(String totalDisbursements_B) {
		this.totalDisbursements_B = totalDisbursements_B;
	}

	public String getCashBeginningReportingPeriod() {
		if (StringUtils.isBlank(cashBeginningReportingPeriod)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(cashBeginningReportingPeriod,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCashBeginningReportingPeriod(
			String cashBeginningReportingPeriod) {
		this.cashBeginningReportingPeriod = cashBeginningReportingPeriod;
	}

	public String getTotalReceiptsThisPeriod() {
		if (StringUtils.isBlank(totalReceiptsThisPeriod)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalReceiptsThisPeriod,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalReceiptsThisPeriod(String totalReceiptsThisPeriod) {
		this.totalReceiptsThisPeriod = totalReceiptsThisPeriod;
	}

	public String getSubTotal() {
		if (StringUtils.isBlank(subTotal)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(subTotal, FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}

	public String getTotalDisbursementsThisPeriod() {
		if (StringUtils.isBlank(totalDisbursementsThisPeriod)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(totalDisbursementsThisPeriod,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setTotalDisbursementsThisPeriod(
			String totalDisbursementsThisPeriod) {
		this.totalDisbursementsThisPeriod = totalDisbursementsThisPeriod;
	}

	public String getCashOnHandAtClosePeriod() {
		if (StringUtils.isBlank(cashOnHandAtClosePeriod)) {
			return "" + (char) FECFileConstant.COLUMN_SEPARATOR;
		}
		return StringUtils.leftPad(cashOnHandAtClosePeriod,
				FECFileConstant.AMOUNT_LENGTH)
				+ (char) FECFileConstant.COLUMN_SEPARATOR;
	}

	public void setCashOnHandAtClosePeriod(String cashOnHandAtClosePeriod) {
		this.cashOnHandAtClosePeriod = cashOnHandAtClosePeriod;
	}

	public String getBeginningImageNumber() {
		if (StringUtils.isBlank(beginningImageNumber)) {
			return "";
		}
		return StringUtils.left(StringUtils.upperCase(beginningImageNumber),11);
	}

	public void setBeginningImageNumber(String beginningImageNumber) {
		this.beginningImageNumber = beginningImageNumber;
	}
}
