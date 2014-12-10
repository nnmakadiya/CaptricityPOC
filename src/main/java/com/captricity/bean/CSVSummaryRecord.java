package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.CSVFileConstant;

public class CSVSummaryRecord {
   
    private String name;
	private String committeeName;
	private String street1;
	private String street2;
	private String changeOfAddress;
	private String city;
	private String state;
	private String zip;
	private String filerFecCommitteeId;
	private String formType;
	private String electionState;
	private String electionDistrict;
	private String reportCode_A;
	private String reportCode_B;
	private String dateOfElection_B;
	private String stateOfElection_B;
	private String reportCode_C;
	private String formType_TER;
	private String dateOfElection_C;
	private String stateOfElection_C;
	private String coverageFromDate;
	private String coverageThroughDate;
	private String treasMiddleName;
	private String treasPrefix;
	private String treasFirstName;
	private String treasFullName;
	private String treasSuffix;
	private String treasLastName;
	private String treasDate;
	private String totalContributionsNoLoan_A;
	private String totalContributionsNoLoan_B;
	private String totalContributionsRefund_A;
	private String totalContributionsRefund_B;
	private String netContributions_A;
	private String netContributions_B;
	private String totalOperatingExpenditure_A;
	private String totalOperatingExpenditure_B;
	private String totalOffsetOperatingExpenditure_A;
	private String totalOffsetOperatingExpenditure_B;
	private String netOperatingExpenditure_A;
	private String netOperatingExpenditure_B;
	private String cashOnHandAtClose;
	private String debtsTo;
	private String debstBy;
	private String individualsItemized_A;
	private String individualsItemized_B;
    private String individualsUnItemized_A;
	private String individualsUnItemized_B;
	private String individualsContributionTotal_A;
	private String individualsContributionTotal_B;
	private String politicalPartyCommittee_A;
	private String politicalPartyCommittee_B;
	private String otherPoliticalCommittee_A;
	private String otherPoliticalCommittee_B;
	private String theCandidate_A;
	private String theCandidate_B;
    private String totalContributions_A;
	private String totalContributions_B;				
	private String transferFromOtherAuthorizedCmtes_A;
	private String transferFromOtherAuthorizedCmtes_B;
	private String loansMadeCandidate_A;
	private String loansMadeCandidate_B;
	private String allOtherLoans_A;
	private String allOtherLoans_B;
	private String totalLoans_A;
	private String totalLoans_B;
	private String offsetToOperatingExpenditure_A;
	private String offsetToOperatingExpenditure_B;
	private String otherReceipts_A;
	private String otherReceipts_B;
	private String totalReceipts_A;
	private String totalReceipts_B;
	private String operatingExpenditure_A;
	private String operatingExpenditure_B;
	private String transferToOtherAuthorizedCommittee_A;
	private String transferToOtherAuthorizedCommittee_B;
	private String ofLoansMadeCan_A;
	private String ofLoansMadeCan_B;
	private String loanRepaymentsAllOtherLoans_A;
	private String loanRepaymentsAllOtherLoans_B;
	private String totalLoanRepayments_A;
	private String totalLoanRepayments_B;
	private String refundIndividualsOtherThenPolCmtes_A;
	private String refundIndividualsOtherThenPolCmtes_B;
	private String refundPoliticalPartyCommittee_A;
	private String refundPoliticalPartyCommittee_B;
	private String refundOtherPoliticalPartyCommittee_A;
	private String refundOtherPoliticalPartyCommittee_B;
	private String totalContributionsRefund20d_A;
	private String totalContributionsRefund20d_B;
	private String otherDisbursments_A;
	private String otherDisbursments_B;
	private String totalDisbursments_A;
	private String totalDisbursments_B;
	private String cashBeginingReportingPeriod;
	private String totalReceiptsThisPeriod;
	private String subTotal;
	private String totalDisbursmentsThisPeriod;
	private String cashOnHandClosePeriod;
	
	public String getName() {
		if (StringUtils.containsIgnoreCase(name, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(name, CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCommitteeName() {
		if (StringUtils.containsIgnoreCase(committeeName, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(committeeName,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return committeeName;
	}
	public void setCommitteeName(String committeeName) {
		this.committeeName = committeeName;
	}
	public String getStreet1() {
		if (StringUtils.containsIgnoreCase(street1, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(street1,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		if (StringUtils.containsIgnoreCase(street2, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(street2,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getChangeOfAddress() {
		if (StringUtils.containsIgnoreCase(changeOfAddress, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(changeOfAddress,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return changeOfAddress;
	}
	public void setChangeOfAddress(String changeOfAddress) {
		this.changeOfAddress = changeOfAddress;
	}
	public String getCity() {
		if (StringUtils.containsIgnoreCase(city, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(city, CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		if (StringUtils.containsIgnoreCase(state, CSVFileConstant.BLANK)
				|| StringUtils
						.containsIgnoreCase(state, CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		if (StringUtils.containsIgnoreCase(zip, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(zip, CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getFilerFecCommitteeId() {
		if (StringUtils.containsIgnoreCase(filerFecCommitteeId,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(filerFecCommitteeId,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return filerFecCommitteeId;
	}
	public void setFilerFecCommitteeId(String filerFecCommitteeId) {
		this.filerFecCommitteeId = filerFecCommitteeId;
	}
	public String getFormType() {
		if (StringUtils.containsIgnoreCase(formType, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(formType,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return formType;
	}
	public void setFormType(String formType) {
		this.formType = formType;
	}
	public String getElectionState() {
		if (StringUtils.containsIgnoreCase(electionState, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(electionState,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return electionState;
	}
	public void setElectionState(String electionState) {
		this.electionState = electionState;
	}
	public String getElectionDistrict() {
		if (StringUtils.containsIgnoreCase(electionDistrict, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(electionDistrict,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return electionDistrict;
	}
	public void setElectionDistrict(String electionDistrict) {
		this.electionDistrict = electionDistrict;
	}
	public String getReportCode_A() {
		if (StringUtils.containsIgnoreCase(reportCode_A, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(reportCode_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return reportCode_A;
	}
	public void setReportCode_A(String reportCode_A) {
		this.reportCode_A = reportCode_A;
	}
	public String getReportCode_B() {
		if (StringUtils.containsIgnoreCase(reportCode_B, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(reportCode_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return reportCode_B;
	}
	public void setReportCode_B(String reportCode_B) {
		this.reportCode_B = reportCode_B;
	}
	public String getDateOfElection_B() {
		if (StringUtils.containsIgnoreCase(dateOfElection_B, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(dateOfElection_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return dateOfElection_B;
	}
	public void setDateOfElection_B(String dateOfElection_B) {
		this.dateOfElection_B = dateOfElection_B;
	}
	public String getStateOfElection_B() {
		if (StringUtils
				.containsIgnoreCase(stateOfElection_B, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(stateOfElection_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return stateOfElection_B;
	}
	public void setStateOfElection_B(String stateOfElection_B) {
		this.stateOfElection_B = stateOfElection_B;
	}
	public String getReportCode_C() {
		if (StringUtils.containsIgnoreCase(reportCode_C, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(reportCode_C,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return reportCode_C;
	}
	public void setReportCode_C(String reportCode_C) {
		this.reportCode_C = reportCode_C;
	}
	public String getFormType_TER() {
		if (StringUtils.containsIgnoreCase(formType_TER, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(formType_TER,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return formType_TER;
	}
	public void setFormType_TER(String formType_TER) {
		this.formType_TER = formType_TER;
	}
	public String getDateOfElection_C() {
		if (StringUtils.containsIgnoreCase(dateOfElection_C, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(dateOfElection_C,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return dateOfElection_C;
	}
	public void setDateOfElection_C(String dateOfElection_C) {
		this.dateOfElection_C = dateOfElection_C;
	}
	public String getStateOfElection_C() {
		if (StringUtils
				.containsIgnoreCase(stateOfElection_C, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(stateOfElection_C,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return stateOfElection_C;
	}
	public void setStateOfElection_C(String stateOfElection_C) {
		this.stateOfElection_C = stateOfElection_C;
	}
	public String getCoverageFromDate() {
		if (StringUtils.containsIgnoreCase(coverageFromDate, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(coverageFromDate,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return coverageFromDate;
	}
	public void setCoverageFromDate(String coverageFromDate) {
		this.coverageFromDate = coverageFromDate;
	}
	public String getCoverageThroughDate() {
		if (StringUtils.containsIgnoreCase(coverageThroughDate,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(coverageThroughDate,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return coverageThroughDate;
	}
	public void setCoverageThroughDate(String coverageThroughDate) {
		this.coverageThroughDate = coverageThroughDate;
	}
	public String getTreasMiddleName() {
		if (StringUtils.containsIgnoreCase(treasMiddleName, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(treasMiddleName,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return treasMiddleName;
	}
	public void setTreasMiddleName(String treasMiddleName) {
		this.treasMiddleName = treasMiddleName;
	}
	public String getTreasPrefix() {
		if (StringUtils.containsIgnoreCase(treasPrefix, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(treasPrefix,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return treasPrefix;
	}
	public void setTreasPrefix(String treasPrefix) {
		this.treasPrefix = treasPrefix;
	}
	public String getTreasFirstName() {
		if (StringUtils.containsIgnoreCase(treasFirstName, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(treasFirstName,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return treasFirstName;
	}
	public void setTreasFirstName(String treasFirstName) {
		this.treasFirstName = treasFirstName;
	}
	public String getTreasFullName() {
		if (StringUtils.containsIgnoreCase(treasFullName, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(treasFullName,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return treasFullName;
	}
	public void setTreasFullName(String treasFullName) {
		this.treasFullName = treasFullName;
	}
	public String getTreasSuffix() {
		if (StringUtils.containsIgnoreCase(treasSuffix, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(treasSuffix,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return treasSuffix;
	}
	public void setTreasSuffix(String treasSuffix) {
		this.treasSuffix = treasSuffix;
	}
	public String getTreasLastName() {
		if (StringUtils.containsIgnoreCase(treasLastName, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(treasLastName,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return treasLastName;
	}
	public void setTreasLastName(String treasLastName) {
		this.treasLastName = treasLastName;
	}
	public String getTreasDate() {
		if (StringUtils.containsIgnoreCase(treasDate, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(treasDate,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return treasDate;
	}
	public void setTreasDate(String treasDate) {
		this.treasDate = treasDate;
	}
	public String getTotalContributionsNoLoan_A() {
		if (StringUtils.containsIgnoreCase(totalContributionsNoLoan_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalContributionsNoLoan_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalContributionsNoLoan_A;
	}
	public void setTotalContributionsNoLoan_A(String totalContributionsNoLoan_A) {
		this.totalContributionsNoLoan_A = totalContributionsNoLoan_A;
	}
	public String getTotalContributionsNoLoan_B() {
		if (StringUtils.containsIgnoreCase(totalContributionsNoLoan_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalContributionsNoLoan_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalContributionsNoLoan_B;
	}
	public void setTotalContributionsNoLoan_B(String totalContributionsNoLoan_B) {
		this.totalContributionsNoLoan_B = totalContributionsNoLoan_B;
	}
	public String getTotalContributionsRefund_A() {
		if (StringUtils.containsIgnoreCase(totalContributionsRefund_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalContributionsRefund_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalContributionsRefund_A;
	}
	public void setTotalContributionsRefund_A(String totalContributionsRefund_A) {
		this.totalContributionsRefund_A = totalContributionsRefund_A;
	}
	public String getTotalContributionsRefund_B() {
		if (StringUtils.containsIgnoreCase(totalContributionsRefund_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalContributionsRefund_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalContributionsRefund_B;
	}
	public void setTotalContributionsRefund_B(String totalContributionsRefund_B) {
		this.totalContributionsRefund_B = totalContributionsRefund_B;
	}
	public String getNetContributions_A() {
		if (StringUtils.containsIgnoreCase(netContributions_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(netContributions_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return netContributions_A;
	}
	public void setNetContributions_A(String netContributions_A) {
		this.netContributions_A = netContributions_A;
	}
	public String getNetContributions_B() {
		if (StringUtils.containsIgnoreCase(netContributions_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(netContributions_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return netContributions_B;
	}
	public void setNetContributions_B(String netContributions_B) {
		this.netContributions_B = netContributions_B;
	}
	public String getTotalOperatingExpenditure_A() {
		if (StringUtils.containsIgnoreCase(totalOperatingExpenditure_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalOperatingExpenditure_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalOperatingExpenditure_A;
	}
	public void setTotalOperatingExpenditure_A(String totalOperatingExpenditure_A) {
		this.totalOperatingExpenditure_A = totalOperatingExpenditure_A;
	}
	public String getTotalOperatingExpenditure_B() {
		if (StringUtils.containsIgnoreCase(totalOperatingExpenditure_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalOperatingExpenditure_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalOperatingExpenditure_B;
	}
	public void setTotalOperatingExpenditure_B(String totalOperatingExpenditure_B) {
		this.totalOperatingExpenditure_B = totalOperatingExpenditure_B;
	}
	public String getTotalOffsetOperatingExpenditure_A() {
		if (StringUtils.containsIgnoreCase(totalOffsetOperatingExpenditure_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						totalOffsetOperatingExpenditure_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalOffsetOperatingExpenditure_A;
	}
	public void setTotalOffsetOperatingExpenditure_A(
			String totalOffsetOperatingExpenditure_A) {
		this.totalOffsetOperatingExpenditure_A = totalOffsetOperatingExpenditure_A;
	}
	public String getTotalOffsetOperatingExpenditure_B() {
		if (StringUtils.containsIgnoreCase(totalOffsetOperatingExpenditure_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						totalOffsetOperatingExpenditure_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalOffsetOperatingExpenditure_B;
	}
	public void setTotalOffsetOperatingExpenditure_B(
			String totalOffsetOperatingExpenditure_B) {
		this.totalOffsetOperatingExpenditure_B = totalOffsetOperatingExpenditure_B;
	}
	public String getNetOperatingExpenditure_A() {
		if (StringUtils.containsIgnoreCase(netOperatingExpenditure_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(netOperatingExpenditure_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return netOperatingExpenditure_A;
	}
	public void setNetOperatingExpenditure_A(String netOperatingExpenditure_A) {
		this.netOperatingExpenditure_A = netOperatingExpenditure_A;
	}
	public String getNetOperatingExpenditure_B() {
		if (StringUtils.containsIgnoreCase(netOperatingExpenditure_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(netOperatingExpenditure_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return netOperatingExpenditure_B;
	}
	public void setNetOperatingExpenditure_B(String netOperatingExpenditure_B) {
		this.netOperatingExpenditure_B = netOperatingExpenditure_B;
	}
	public String getCashOnHandAtClose() {
		if (StringUtils
				.containsIgnoreCase(cashOnHandAtClose, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(cashOnHandAtClose,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return cashOnHandAtClose;
	}
	public void setCashOnHandAtClose(String cashOnHandAtClose) {
		this.cashOnHandAtClose = cashOnHandAtClose;
	}
	public String getDebtsTo() {
		if (StringUtils.containsIgnoreCase(debtsTo, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(debtsTo,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return debtsTo;
	}
	public void setDebtsTo(String debtsTo) {
		this.debtsTo = debtsTo;
	}
	public String getDebstBy() {
		if (StringUtils.containsIgnoreCase(debstBy, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(debstBy,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return debstBy;
	}
	public void setDebstBy(String debstBy) {
		this.debstBy = debstBy;
	}
	public String getIndividualsItemized_A() {
		if (StringUtils.containsIgnoreCase(individualsItemized_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(individualsItemized_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return individualsItemized_A;
	}
	public void setIndividualsItemized_A(String individualsItemized_A) {
		this.individualsItemized_A = individualsItemized_A;
	}
	public String getIndividualsItemized_B() {
		if (StringUtils.containsIgnoreCase(individualsItemized_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(individualsItemized_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return individualsItemized_B;
	}
	public void setIndividualsItemized_B(String individualsItemized_B) {
		this.individualsItemized_B = individualsItemized_B;
	}
	public String getIndividualsUnItemized_A() {
		if (StringUtils.containsIgnoreCase(individualsUnItemized_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(individualsUnItemized_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return individualsUnItemized_A;
	}
	public void setIndividualsUnItemized_A(String individualsUnItemized_A) {
		this.individualsUnItemized_A = individualsUnItemized_A;
	}
	public String getIndividualsUnItemized_B() {
		if (StringUtils.containsIgnoreCase(individualsUnItemized_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(individualsUnItemized_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return individualsUnItemized_B;
	}
	public void setIndividualsUnItemized_B(String individualsUnItemized_B) {
		this.individualsUnItemized_B = individualsUnItemized_B;
	}
	public String getIndividualsContributionTotal_A() {
		if (StringUtils.containsIgnoreCase(individualsContributionTotal_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(individualsContributionTotal_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return individualsContributionTotal_A;
	}
	public void setIndividualsContributionTotal_A(
			String individualsContributionTotal_A) {
		this.individualsContributionTotal_A = individualsContributionTotal_A;
	}
	public String getIndividualsContributionTotal_B() {
		if (StringUtils.containsIgnoreCase(individualsContributionTotal_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(individualsContributionTotal_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return individualsContributionTotal_B;
	}
	public void setIndividualsContributionTotal_B(
			String individualsContributionTotal_B) {
		this.individualsContributionTotal_B = individualsContributionTotal_B;
	}
	public String getPoliticalPartyCommittee_A() {
		if (StringUtils.containsIgnoreCase(politicalPartyCommittee_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(politicalPartyCommittee_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return politicalPartyCommittee_A;
	}
	public void setPoliticalPartyCommittee_A(String politicalPartyCommittee_A) {
		this.politicalPartyCommittee_A = politicalPartyCommittee_A;
	}
	public String getPoliticalPartyCommittee_B() {
		if (StringUtils.containsIgnoreCase(politicalPartyCommittee_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(politicalPartyCommittee_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return politicalPartyCommittee_B;
	}
	public void setPoliticalPartyCommittee_B(String politicalPartyCommittee_B) {
		this.politicalPartyCommittee_B = politicalPartyCommittee_B;
	}
	public String getOtherPoliticalCommittee_A() {
		if (StringUtils.containsIgnoreCase(otherPoliticalCommittee_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(otherPoliticalCommittee_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return otherPoliticalCommittee_A;
	}
	public void setOtherPoliticalCommittee_A(String otherPoliticalCommittee_A) {
		this.otherPoliticalCommittee_A = otherPoliticalCommittee_A;
	}
	public String getOtherPoliticalCommittee_B() {
		if (StringUtils.containsIgnoreCase(otherPoliticalCommittee_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(otherPoliticalCommittee_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return otherPoliticalCommittee_B;
	}
	public void setOtherPoliticalCommittee_B(String otherPoliticalCommittee_B) {
		this.otherPoliticalCommittee_B = otherPoliticalCommittee_B;
	}
	public String getTheCandidate_A() {
		if (StringUtils.containsIgnoreCase(theCandidate_A, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(theCandidate_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return theCandidate_A;
	}
	public void setTheCandidate_A(String theCandidate_A) {
		this.theCandidate_A = theCandidate_A;
	}
	public String getTheCandidate_B() {
		if (StringUtils.containsIgnoreCase(theCandidate_B, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(theCandidate_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return theCandidate_B;
	}
	public void setTheCandidate_B(String theCandidate_B) {
		this.theCandidate_B = theCandidate_B;
	}
	public String getTotalContributions_A() {
		if (StringUtils.containsIgnoreCase(totalContributions_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalContributions_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalContributions_A;
	}
	public void setTotalContributions_A(String totalContributions_A) {
		this.totalContributions_A = totalContributions_A;
	}
	public String getTotalContributions_B() {
		if (StringUtils.containsIgnoreCase(totalContributions_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalContributions_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalContributions_B;
	}
	public void setTotalContributions_B(String totalContributions_B) {
		this.totalContributions_B = totalContributions_B;
	}
	public String getTransferFromOtherAuthorizedCmtes_A() {
		if (StringUtils.containsIgnoreCase(transferFromOtherAuthorizedCmtes_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						transferFromOtherAuthorizedCmtes_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return transferFromOtherAuthorizedCmtes_A;
	}
	public void setTransferFromOtherAuthorizedCmtes_A(
			String transferFromOtherAuthorizedCmtes_A) {
		this.transferFromOtherAuthorizedCmtes_A = transferFromOtherAuthorizedCmtes_A;
	}
	public String getTransferFromOtherAuthorizedCmtes_B() {
		if (StringUtils.containsIgnoreCase(transferFromOtherAuthorizedCmtes_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						transferFromOtherAuthorizedCmtes_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return transferFromOtherAuthorizedCmtes_B;
	}
	public void setTransferFromOtherAuthorizedCmtes_B(
			String transferFromOtherAuthorizedCmtes_B) {
		this.transferFromOtherAuthorizedCmtes_B = transferFromOtherAuthorizedCmtes_B;
	}
	public String getLoansMadeCandidate_A() {
		if (StringUtils.containsIgnoreCase(loansMadeCandidate_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(loansMadeCandidate_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return loansMadeCandidate_A;
	}
	public void setLoansMadeCandidate_A(String loansMadeCandidate_A) {
		this.loansMadeCandidate_A = loansMadeCandidate_A;
	}
	public String getLoansMadeCandidate_B() {
		if (StringUtils.containsIgnoreCase(loansMadeCandidate_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(loansMadeCandidate_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return loansMadeCandidate_B;
	}
	public void setLoansMadeCandidate_B(String loansMadeCandidate_B) {
		this.loansMadeCandidate_B = loansMadeCandidate_B;
	}
	public String getAllOtherLoans_A() {
		if (StringUtils.containsIgnoreCase(allOtherLoans_A, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(allOtherLoans_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return allOtherLoans_A;
	}
	public void setAllOtherLoans_A(String allOtherLoans_A) {
		this.allOtherLoans_A = allOtherLoans_A;
	}
	public String getAllOtherLoans_B() {
		if (StringUtils.containsIgnoreCase(allOtherLoans_B, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(allOtherLoans_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return allOtherLoans_B;
	}
	public void setAllOtherLoans_B(String allOtherLoans_B) {
		this.allOtherLoans_B = allOtherLoans_B;
	}
	public String getTotalLoans_A() {
		if (StringUtils.containsIgnoreCase(totalLoans_A, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalLoans_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalLoans_A;
	}
	public void setTotalLoans_A(String totalLoans_A) {
		this.totalLoans_A = totalLoans_A;
	}
	public String getTotalLoans_B() {
		if (StringUtils.containsIgnoreCase(totalLoans_B, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalLoans_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalLoans_B;
	}
	public void setTotalLoans_B(String totalLoans_B) {
		this.totalLoans_B = totalLoans_B;
	}
	public String getOffsetToOperatingExpenditure_A() {
		if (StringUtils.containsIgnoreCase(offsetToOperatingExpenditure_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(offsetToOperatingExpenditure_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return offsetToOperatingExpenditure_A;
	}
	public void setOffsetToOperatingExpenditure_A(
			String offsetToOperatingExpenditure_A) {
		this.offsetToOperatingExpenditure_A = offsetToOperatingExpenditure_A;
	}
	public String getOffsetToOperatingExpenditure_B() {
		if (StringUtils.containsIgnoreCase(offsetToOperatingExpenditure_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(offsetToOperatingExpenditure_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return offsetToOperatingExpenditure_B;
	}
	public void setOffsetToOperatingExpenditure_B(
			String offsetToOperatingExpenditure_B) {
		this.offsetToOperatingExpenditure_B = offsetToOperatingExpenditure_B;
	}
	public String getOtherReceipts_A() {
		if (StringUtils.containsIgnoreCase(otherReceipts_A, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(otherReceipts_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return otherReceipts_A;
	}
	public void setOtherReceipts_A(String otherReceipts_A) {
		this.otherReceipts_A = otherReceipts_A;
	}
	public String getOtherReceipts_B() {
		if (StringUtils.containsIgnoreCase(otherReceipts_B, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(otherReceipts_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return otherReceipts_B;
	}
	public void setOtherReceipts_B(String otherReceipts_B) {
		this.otherReceipts_B = otherReceipts_B;
	}
	public String getTotalReceipts_A() {
		if (StringUtils.containsIgnoreCase(totalReceipts_A, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalReceipts_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalReceipts_A;
	}
	public void setTotalReceipts_A(String totalReceipts_A) {
		this.totalReceipts_A = totalReceipts_A;
	}
	public String getTotalReceipts_B() {
		if (StringUtils.containsIgnoreCase(totalReceipts_B, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalReceipts_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalReceipts_B;
	}
	public void setTotalReceipts_B(String totalReceipts_B) {
		this.totalReceipts_B = totalReceipts_B;
	}
	public String getOperatingExpenditure_A() {
		if (StringUtils.containsIgnoreCase(operatingExpenditure_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(operatingExpenditure_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return operatingExpenditure_A;
	}
	public void setOperatingExpenditure_A(String operatingExpenditure_A) {
		this.operatingExpenditure_A = operatingExpenditure_A;
	}
	public String getOperatingExpenditure_B() {
		if (StringUtils.containsIgnoreCase(operatingExpenditure_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(operatingExpenditure_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return operatingExpenditure_B;
	}
	public void setOperatingExpenditure_B(String operatingExpenditure_B) {
		this.operatingExpenditure_B = operatingExpenditure_B;
	}
	public String getTransferToOtherAuthorizedCommittee_A() {
		if (StringUtils.containsIgnoreCase(transferToOtherAuthorizedCommittee_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						transferToOtherAuthorizedCommittee_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return transferToOtherAuthorizedCommittee_A;
	}
	public void setTransferToOtherAuthorizedCommittee_A(
			String transferToOtherAuthorizedCommittee_A) {
		this.transferToOtherAuthorizedCommittee_A = transferToOtherAuthorizedCommittee_A;
	}
	public String getTransferToOtherAuthorizedCommittee_B() {
		if (StringUtils.containsIgnoreCase(transferToOtherAuthorizedCommittee_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						transferToOtherAuthorizedCommittee_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return transferToOtherAuthorizedCommittee_B;
	}
	public void setTransferToOtherAuthorizedCommittee_B(
			String transferToOtherAuthorizedCommittee_B) {
		this.transferToOtherAuthorizedCommittee_B = transferToOtherAuthorizedCommittee_B;
	}
	public String getOfLoansMadeCan_A() {
		if (StringUtils.containsIgnoreCase(ofLoansMadeCan_A, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(ofLoansMadeCan_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return ofLoansMadeCan_A;
	}
	public void setOfLoansMadeCan_A(String ofLoansMadeCan_A) {
		this.ofLoansMadeCan_A = ofLoansMadeCan_A;
	}
	public String getOfLoansMadeCan_B() {
		if (StringUtils.containsIgnoreCase(ofLoansMadeCan_B, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(ofLoansMadeCan_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return ofLoansMadeCan_B;
	}
	public void setOfLoansMadeCan_B(String ofLoansMadeCan_B) {
		this.ofLoansMadeCan_B = ofLoansMadeCan_B;
	}
	public String getLoanRepaymentsAllOtherLoans_A() {
		if (StringUtils.containsIgnoreCase(loanRepaymentsAllOtherLoans_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(loanRepaymentsAllOtherLoans_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return loanRepaymentsAllOtherLoans_A;
	}
	public void setLoanRepaymentsAllOtherLoans_A(
			String loanRepaymentsAllOtherLoans_A) {
		this.loanRepaymentsAllOtherLoans_A = loanRepaymentsAllOtherLoans_A;
	}
	public String getLoanRepaymentsAllOtherLoans_B() {
		if (StringUtils.containsIgnoreCase(loanRepaymentsAllOtherLoans_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(loanRepaymentsAllOtherLoans_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return loanRepaymentsAllOtherLoans_B;
	}
	public void setLoanRepaymentsAllOtherLoans_B(
			String loanRepaymentsAllOtherLoans_B) {
		this.loanRepaymentsAllOtherLoans_B = loanRepaymentsAllOtherLoans_B;
	}
	public String getTotalLoanRepayments_A() {
		if (StringUtils.containsIgnoreCase(totalLoanRepayments_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalLoanRepayments_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalLoanRepayments_A;
	}
	public void setTotalLoanRepayments_A(String totalLoanRepayments_A) {
		this.totalLoanRepayments_A = totalLoanRepayments_A;
	}
	public String getTotalLoanRepayments_B() {
		if (StringUtils.containsIgnoreCase(totalLoanRepayments_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalLoanRepayments_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalLoanRepayments_B;
	}
	public void setTotalLoanRepayments_B(String totalLoanRepayments_B) {
		this.totalLoanRepayments_B = totalLoanRepayments_B;
	}
	public String getRefundIndividualsOtherThenPolCmtes_A() {
		if (StringUtils.containsIgnoreCase(refundIndividualsOtherThenPolCmtes_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						refundIndividualsOtherThenPolCmtes_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return refundIndividualsOtherThenPolCmtes_A;
	}
	public void setRefundIndividualsOtherThenPolCmtes_A(
			String refundIndividualsOtherThenPolCmtes_A) {
		this.refundIndividualsOtherThenPolCmtes_A = refundIndividualsOtherThenPolCmtes_A;
	}
	public String getRefundIndividualsOtherThenPolCmtes_B() {
		if (StringUtils.containsIgnoreCase(refundIndividualsOtherThenPolCmtes_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						refundIndividualsOtherThenPolCmtes_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return refundIndividualsOtherThenPolCmtes_B;
	}
	public void setRefundIndividualsOtherThenPolCmtes_B(
			String refundIndividualsOtherThenPolCmtes_B) {
		this.refundIndividualsOtherThenPolCmtes_B = refundIndividualsOtherThenPolCmtes_B;
	}
	public String getRefundPoliticalPartyCommittee_A() {
		if (StringUtils.containsIgnoreCase(refundPoliticalPartyCommittee_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(refundPoliticalPartyCommittee_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return refundPoliticalPartyCommittee_A;
	}
	public void setRefundPoliticalPartyCommittee_A(
			String refundPoliticalPartyCommittee_A) {
		this.refundPoliticalPartyCommittee_A = refundPoliticalPartyCommittee_A;
	}
	public String getRefundPoliticalPartyCommittee_B() {
		if (StringUtils.containsIgnoreCase(refundPoliticalPartyCommittee_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(refundPoliticalPartyCommittee_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return refundPoliticalPartyCommittee_B;
	}
	public void setRefundPoliticalPartyCommittee_B(
			String refundPoliticalPartyCommittee_B) {
		this.refundPoliticalPartyCommittee_B = refundPoliticalPartyCommittee_B;
	}
	public String getRefundOtherPoliticalPartyCommittee_A() {
		if (StringUtils.containsIgnoreCase(refundOtherPoliticalPartyCommittee_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						refundOtherPoliticalPartyCommittee_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return refundOtherPoliticalPartyCommittee_A;
	}
	public void setRefundOtherPoliticalPartyCommittee_A(
			String refundOtherPoliticalPartyCommittee_A) {
		this.refundOtherPoliticalPartyCommittee_A = refundOtherPoliticalPartyCommittee_A;
	}
	public String getRefundOtherPoliticalPartyCommittee_B() {
		if (StringUtils.containsIgnoreCase(refundOtherPoliticalPartyCommittee_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(
						refundOtherPoliticalPartyCommittee_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return refundOtherPoliticalPartyCommittee_B;
	}
	public void setRefundOtherPoliticalPartyCommittee_B(
			String refundOtherPoliticalPartyCommittee_B) {
		this.refundOtherPoliticalPartyCommittee_B = refundOtherPoliticalPartyCommittee_B;
	}
	public String getTotalContributionsRefund20d_A() {
		if (StringUtils.containsIgnoreCase(totalContributionsRefund20d_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalContributionsRefund20d_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalContributionsRefund20d_A;
	}
	public void setTotalContributionsRefund20d_A(
			String totalContributionsRefund20d_A) {
		this.totalContributionsRefund20d_A = totalContributionsRefund20d_A;
	}
	public String getTotalContributionsRefund20d_B() {
		if (StringUtils.containsIgnoreCase(totalContributionsRefund20d_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalContributionsRefund20d_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalContributionsRefund20d_B;
	}
	public void setTotalContributionsRefund20d_B(
			String totalContributionsRefund20d_B) {
		this.totalContributionsRefund20d_B = totalContributionsRefund20d_B;
	}
	public String getOtherDisbursments_A() {
		if (StringUtils.containsIgnoreCase(otherDisbursments_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(otherDisbursments_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return otherDisbursments_A;
	}
	public void setOtherDisbursments_A(String otherDisbursments_A) {
		this.otherDisbursments_A = otherDisbursments_A;
	}
	public String getOtherDisbursments_B() {
		if (StringUtils.containsIgnoreCase(otherDisbursments_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(otherDisbursments_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return otherDisbursments_B;
	}
	public void setOtherDisbursments_B(String otherDisbursments_B) {
		this.otherDisbursments_B = otherDisbursments_B;
	}
	public String getTotalDisbursments_A() {
		if (StringUtils.containsIgnoreCase(totalDisbursments_A,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalDisbursments_A,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalDisbursments_A;
	}
	public void setTotalDisbursments_A(String totalDisbursments_A) {
		this.totalDisbursments_A = totalDisbursments_A;
	}
	public String getTotalDisbursments_B() {
		if (StringUtils.containsIgnoreCase(totalDisbursments_B,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalDisbursments_B,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalDisbursments_B;
	}
	public void setTotalDisbursments_B(String totalDisbursments_B) {
		this.totalDisbursments_B = totalDisbursments_B;
	}
	public String getCashBeginingReportingPeriod() {
		if (StringUtils.containsIgnoreCase(cashBeginingReportingPeriod,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(cashBeginingReportingPeriod,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return cashBeginingReportingPeriod;
	}
	public void setCashBeginingReportingPeriod(String cashBeginingReportingPeriod) {
		this.cashBeginingReportingPeriod = cashBeginingReportingPeriod;
	}
	public String getTotalReceiptsThisPeriod() {
		if (StringUtils.containsIgnoreCase(totalReceiptsThisPeriod,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalReceiptsThisPeriod,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalReceiptsThisPeriod;
	}
	public void setTotalReceiptsThisPeriod(String totalReceiptsThisPeriod) {
		this.totalReceiptsThisPeriod = totalReceiptsThisPeriod;
	}
	public String getSubTotal() {
		if (StringUtils.containsIgnoreCase(subTotal, CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(subTotal,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return subTotal;
	}
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}
	public String getTotalDisbursmentsThisPeriod() {
		if (StringUtils.containsIgnoreCase(totalDisbursmentsThisPeriod,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(totalDisbursmentsThisPeriod,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return totalDisbursmentsThisPeriod;
	}
	public void setTotalDisbursmentsThisPeriod(String totalDisbursmentsThisPeriod) {
		this.totalDisbursmentsThisPeriod = totalDisbursmentsThisPeriod;
	}
	public String getCashOnHandClosePeriod() {
		if (StringUtils.containsIgnoreCase(cashOnHandClosePeriod,
				CSVFileConstant.BLANK)
				|| StringUtils.containsIgnoreCase(cashOnHandClosePeriod,
						CSVFileConstant.IMPOSSIBLE)) {
			return "";
		}
		return cashOnHandClosePeriod;
	}
	public void setCashOnHandClosePeriod(String cashOnHandClosePeriod) {
		this.cashOnHandClosePeriod = cashOnHandClosePeriod;
	}
	

}
