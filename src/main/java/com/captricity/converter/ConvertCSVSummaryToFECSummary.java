package com.captricity.converter;

import java.io.FileReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

import com.captricity.bean.CSVSummaryRecord;
import com.captricity.bean.FECSummaryRecord;
import com.captricity.constant.FECFileConstant;
import com.captricity.utils.FECConverterUtil;

public class ConvertCSVSummaryToFECSummary {

	private static final FastDateFormat FEC_DATE_RECEIVED = FastDateFormat
			.getInstance("yyyyMMdd");
	private static final FastDateFormat CSV_DATE_RECEIVED = FastDateFormat
			.getInstance("MMddyyyy");
	
	public static final  String[] columns = new String[] {"name",
		"committeeName",
		"street1",
		"street2",
		"changeOfAddress",
		"city",
		"state",
		"zip",
		"filerFecCommitteeId",
		"formType",
		"electionState",
		"electionDistrict",
		"reportCode_A",
		"reportCode_B",
		"dateOfElection_B",
		"stateOfElection_B",
		"reportCode_C",
		"formType_TER",
		"dateOfElection_C",
		"stateOfElection_C",
		"coverageFromDate",
		"coverageThroughDate",
		"treasMiddleName",
		"treasPrefix",
		"treasFirstName",
		"treasFullName",
		"treasSuffix",
		"treasLastName",
		"treasDate",
		"totalContributionsNoLoan_A",
		"totalContributionsNoLoan_B",
		"totalContributionsRefund_A",
		"totalContributionsRefund_B",
		"netContributions_A",
		"netContributions_B",
		"totalOperatingExpenditure_A",
		"totalOperatingExpenditure_B",
		"totalOffsetOperatingExpenditure_A",
		"totalOffsetOperatingExpenditure_B",
		"netOperatingExpenditure_A",
		"netOperatingExpenditure_B",
		"cashOnHandAtClose",
		"debtsTo",
		"debstBy",
		"individualsItemized_A",
		"individualsItemized_B",
	    "individualsUnItemized_A",
		"individualsUnItemized_B",
		"individualsContributionTotal_A",
		"individualsContributionTotal_B",
		"politicalPartyCommittee_A",
		"politicalPartyCommittee_B",
		"otherPoliticalCommittee_A",
		"otherPoliticalCommittee_B",
		"theCandidate_A",
		"theCandidate_B",
	    "totalContributions_A",
		"totalContributions_B",				
		"transferFromOtherAuthorizedCmtes_A",
		"transferFromOtherAuthorizedCmtes_B",
		"loansMadeCandidate_A",
		"loansMadeCandidate_B",
		"allOtherLoans_A",
		"allOtherLoans_B",
		"totalLoans_A",
		"totalLoans_B",
		"offsetToOperatingExpenditure_A",
		"offsetToOperatingExpenditure_B",
		"otherReceipts_A",
		"otherReceipts_B",
		"totalReceipts_A",
		"totalReceipts_B",
		"operatingExpenditure_A",
		"operatingExpenditure_B",
		"transferToOtherAuthorizedCommittee_A",
		"transferToOtherAuthorizedCommittee_B",
		"ofLoansMadeCan_A",
		"ofLoansMadeCan_B",
		"loanRepaymentsAllOtherLoans_A",
		"loanRepaymentsAllOtherLoans_B",
		"totalLoanRepayments_A",
		"totalLoanRepayments_B",
		"refundIndividualsOtherThenPolCmtes_A",
		"refundIndividualsOtherThenPolCmtes_B",
		"refundPoliticalPartyCommittee_A",
		"refundPoliticalPartyCommittee_B",
		"refundOtherPoliticalPartyCommittee_A",
		"refundOtherPoliticalPartyCommittee_B",
		"totalContributionsRefund20d_A",
		"totalContributionsRefund20d_B",
		"otherDisbursments_A",
		"otherDisbursments_B",
		"totalDisbursments_A",
		"totalDisbursments_B",
		"cashBeginingReportingPeriod",
		"totalReceiptsThisPeriod",
		"subTotal",
		"totalDisbursmentsThisPeriod",
		"cashOnHandClosePeriod"};

	public static List<FECSummaryRecord> convertCSVSheduleToFECShedule(
			String fileName) {

		List<CSVSummaryRecord> listCSVSummaryRecord = new ArrayList<CSVSummaryRecord>();

		try {

			CSVReader reader = new CSVReader(new FileReader(fileName), ',',
					'\"', 1);
			ColumnPositionMappingStrategy<CSVSummaryRecord> mappingStrategy = new ColumnPositionMappingStrategy<CSVSummaryRecord>();
			mappingStrategy.setType(CSVSummaryRecord.class);

			mappingStrategy.setColumnMapping(columns);

			CsvToBean<CSVSummaryRecord> csv = new CsvToBean<CSVSummaryRecord>();
			listCSVSummaryRecord = csv.parse(mappingStrategy, reader);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return convertCSVSummaryToFECSummary(listCSVSummaryRecord);
	}

	private static List<FECSummaryRecord> convertCSVSummaryToFECSummary(
			List<CSVSummaryRecord> listCSVSummaryRecord) {
		
		List<FECSummaryRecord> listFecSummaryRecords = new ArrayList<FECSummaryRecord>();
		
		for(CSVSummaryRecord csvSummaryRecord : listCSVSummaryRecord){

			FECSummaryRecord fecSummaryRecord = new FECSummaryRecord();
			
			boolean isFormTypeFound = false;
			
			for(FECFileConstant.TypeOfReportConstant typeOfReportConstant: FECFileConstant.TypeOfReportConstant.values()){
				if(StringUtils.equals(typeOfReportConstant.getDescription(), csvSummaryRecord.getFormType())){
					fecSummaryRecord.setFormType((FECFileConstant.SUMMARY_PREFIX + typeOfReportConstant.getCode()));
					isFormTypeFound = true;
					break;
				}
			}
			
			if(!isFormTypeFound){
				fecSummaryRecord
						.setFormType((FECFileConstant.SUMMARY_PREFIX + FECFileConstant.TypeOfReportConstant.TERMINATION
								.getCode()));
			}
			
	
			fecSummaryRecord.setFilterFecCommitteeId(csvSummaryRecord
					.getFilerFecCommitteeId());
	
			fecSummaryRecord.setCommitteeName(csvSummaryRecord.getCommitteeName());
	
			
			if(StringUtils.equals(FECFileConstant.YesNoConstant.YES.getDescription(), csvSummaryRecord.getChangeOfAddress())){
					fecSummaryRecord.setChangeOfAddress(FECFileConstant.SUMMARY_PAGE_CHANGE_OF_ADDRESS);
			}
			
	
			fecSummaryRecord.setStreet1(csvSummaryRecord.getStreet1());
			fecSummaryRecord.setStreet2(csvSummaryRecord.getStreet2());
	
			fecSummaryRecord.setCity(csvSummaryRecord.getCity());
			fecSummaryRecord.setState(csvSummaryRecord.getState());
			fecSummaryRecord.setZip(csvSummaryRecord.getZip());
	
			fecSummaryRecord.setElectionState(csvSummaryRecord.getElectionState());
			fecSummaryRecord.setElectionDistrict(csvSummaryRecord
					.getElectionDistrict());
	
			if (!StringUtils.isBlank(csvSummaryRecord.getReportCode_A())) {
	
				fecSummaryRecord.setReportCode(getPatternMatcher(csvSummaryRecord
						.getReportCode_A()));
	
			}
	
			if (!StringUtils.isBlank(csvSummaryRecord.getReportCode_B())) {
	
				fecSummaryRecord.setReportCode(getPatternMatcher(csvSummaryRecord
						.getReportCode_B()));
	
				if (!StringUtils.isBlank(csvSummaryRecord.getDateOfElection_B())) {
					try {
						fecSummaryRecord.setDateOfElection((FEC_DATE_RECEIVED
								.format(CSV_DATE_RECEIVED.parse(csvSummaryRecord
										.getDateOfElection_B()))));
					} catch (ParseException e) {
						fecSummaryRecord.setDateOfElection(csvSummaryRecord
								.getDateOfElection_B());
					}
				}
	
				fecSummaryRecord.setStateOfElection(csvSummaryRecord
						.getStateOfElection_B());
			}
	
			if (!StringUtils.isBlank(csvSummaryRecord.getReportCode_C())) {
	
				fecSummaryRecord.setReportCode(getPatternMatcher(csvSummaryRecord
						.getReportCode_C()));
	
				if (!StringUtils.isBlank(csvSummaryRecord.getDateOfElection_C())) {
					try {
						fecSummaryRecord.setDateOfElection((FEC_DATE_RECEIVED
								.format(CSV_DATE_RECEIVED.parse(csvSummaryRecord
										.getDateOfElection_C()))));
					} catch (ParseException e) {
						fecSummaryRecord.setDateOfElection(csvSummaryRecord
								.getDateOfElection_C());
					}
				}
	
				fecSummaryRecord.setStateOfElection(csvSummaryRecord
						.getStateOfElection_C());
			}
	
			if (!StringUtils.isBlank(csvSummaryRecord.getCoverageFromDate())) {
				try {
					fecSummaryRecord.setCoverageFromDate(((FEC_DATE_RECEIVED
							.format(CSV_DATE_RECEIVED.parse(csvSummaryRecord
									.getCoverageFromDate())))));
				} catch (ParseException e) {
					fecSummaryRecord.setCoverageFromDate(csvSummaryRecord
							.getCoverageFromDate());
				}
			}
			if (!StringUtils.isBlank(csvSummaryRecord.getCoverageThroughDate())) {
				try {
					fecSummaryRecord.setCoverageThroughDate((((FEC_DATE_RECEIVED
							.format(CSV_DATE_RECEIVED.parse(csvSummaryRecord
									.getCoverageThroughDate()))))));
				} catch (ParseException e) {
					fecSummaryRecord.setCoverageThroughDate(csvSummaryRecord
							.getCoverageThroughDate());
				}
			}
	
			String splitedFullName[] = FECConverterUtil
					.splitFullName(csvSummaryRecord.getTreasFullName());
	
			fecSummaryRecord.setTreasPrefix(splitedFullName[0]);
			fecSummaryRecord.setTreasFirstName(splitedFullName[1]);
			fecSummaryRecord.setTreasMiddleName(splitedFullName[2]);
			fecSummaryRecord.setTreasLastName(splitedFullName[3]);
			fecSummaryRecord.setTreasSuffix(splitedFullName[4]);
	
			if (!StringUtils.isBlank(csvSummaryRecord.getTreasDate())) {
				try {
					fecSummaryRecord.setTreasDate((FEC_DATE_RECEIVED
							.format(CSV_DATE_RECEIVED.parse(csvSummaryRecord
									.getTreasDate()))));
				} catch (ParseException e) {
					fecSummaryRecord.setTreasDate(csvSummaryRecord.getTreasDate());
				}
			}
	
			fecSummaryRecord.setTotalContributionsNoLoans_A(csvSummaryRecord
					.getTotalContributionsNoLoan_A());
			fecSummaryRecord.setTotalContributionsNoLoans_B(csvSummaryRecord
					.getTotalContributionsNoLoan_B());
	
			fecSummaryRecord.setTotalContributionRefunds_A(csvSummaryRecord
					.getTotalContributionsRefund_A());
			fecSummaryRecord.setTotalContributionRefunds_B(csvSummaryRecord
					.getTotalContributionsRefund_B());
	
			fecSummaryRecord.setNetContributions_A(csvSummaryRecord
					.getNetContributions_A());
			fecSummaryRecord.setNetContributions_B(csvSummaryRecord
					.getNetContributions_B());
	
			fecSummaryRecord.setTotalOperatingExpenditures_A(csvSummaryRecord
					.getTotalOperatingExpenditure_A());
			fecSummaryRecord.setTotalOperatingExpenditures_B(csvSummaryRecord
					.getTotalOperatingExpenditure_B());
	
			fecSummaryRecord
					.setTotalOffsetToOperatingExpenditures_A(csvSummaryRecord
							.getTotalOffsetOperatingExpenditure_A());
			fecSummaryRecord
					.setTotalOffsetToOperatingExpenditures_B(csvSummaryRecord
							.getTotalOffsetOperatingExpenditure_B());
	
			fecSummaryRecord.setNetOperatingExpenditures_A(csvSummaryRecord
					.getNetOperatingExpenditure_A());
			fecSummaryRecord.setNetOperatingExpenditures_B(csvSummaryRecord
					.getNetOperatingExpenditure_B());
	
			fecSummaryRecord.setCashOnHandAtClose(csvSummaryRecord
					.getCashOnHandAtClose());
			fecSummaryRecord.setDebtsTo(csvSummaryRecord.getDebtsTo());
			fecSummaryRecord.setDebtsBy(csvSummaryRecord.getDebstBy());
	
			fecSummaryRecord.setIndividualsItemized_A(csvSummaryRecord
					.getIndividualsItemized_A());
			fecSummaryRecord.setIndividualsItemized_B(csvSummaryRecord
					.getIndividualsItemized_B());
	
			fecSummaryRecord.setIndividualsUnitemized_A(csvSummaryRecord
					.getIndividualsUnItemized_A());
			fecSummaryRecord.setIndividualsUnitemized_B(csvSummaryRecord
					.getIndividualsUnItemized_B());
	
			fecSummaryRecord.setIndividualContributionTotal_A(csvSummaryRecord.getIndividualsContributionTotal_A());
			fecSummaryRecord.setIndividualContributionTotal_B(csvSummaryRecord.getIndividualsContributionTotal_B());
	
			fecSummaryRecord.setPoliticalPartyCommittees_A(csvSummaryRecord
					.getPoliticalPartyCommittee_A());
			fecSummaryRecord.setPoliticalPartyCommittees_B(csvSummaryRecord
					.getPoliticalPartyCommittee_B());
	
			fecSummaryRecord.setOtherPoliticalCommittees_A(csvSummaryRecord
					.getOtherPoliticalCommittee_A());
			fecSummaryRecord.setOtherPoliticalCommittees_B(csvSummaryRecord
					.getOtherPoliticalCommittee_B());
	
			fecSummaryRecord
					.setTheCandidate_A(csvSummaryRecord.getTheCandidate_A());
			fecSummaryRecord
					.setTheCandidate_B(csvSummaryRecord.getTheCandidate_B());
	
			fecSummaryRecord.setTotalContributions_A(csvSummaryRecord
					.getTotalContributions_A());
			fecSummaryRecord.setTotalContributions_B(csvSummaryRecord
					.getTotalContributions_B());
	
			fecSummaryRecord
					.setTransfersFromOtherAuthorizedCmtes_A(csvSummaryRecord
							.getTransferFromOtherAuthorizedCmtes_A());
			fecSummaryRecord
					.setTransfersFromOtherAuthorizedCmtes_B(csvSummaryRecord
							.getTransferFromOtherAuthorizedCmtes_B());
	
			fecSummaryRecord
					.setLoansMadeOrGuarantyByTheCandidate_A(csvSummaryRecord
							.getLoansMadeCandidate_A());
			fecSummaryRecord
					.setLoansMadeOrGuarantyByTheCandidate_B(csvSummaryRecord
							.getLoansMadeCandidate_B());
	
			fecSummaryRecord.setAllOtherLoans_A(csvSummaryRecord
					.getAllOtherLoans_A());
			fecSummaryRecord.setAllOtherLoans_B(csvSummaryRecord
					.getAllOtherLoans_B());
	
			fecSummaryRecord.setTotalLoans_A(csvSummaryRecord.getTotalLoans_A());
			fecSummaryRecord.setTotalLoans_B(csvSummaryRecord.getTotalLoans_B());
	
			fecSummaryRecord.setOffsetsToOperatingExpenditures_A(csvSummaryRecord
					.getOffsetToOperatingExpenditure_A());
			fecSummaryRecord.setOffsetsToOperatingExpenditures_B(csvSummaryRecord
					.getOffsetToOperatingExpenditure_B());
	
			fecSummaryRecord.setOtherReceipts_A(csvSummaryRecord
					.getOtherReceipts_A());
			fecSummaryRecord.setOtherReceipts_B(csvSummaryRecord
					.getOtherReceipts_B());
	
			fecSummaryRecord.setTotalReceipts_A(csvSummaryRecord
					.getTotalReceipts_A());
			fecSummaryRecord.setTotalReceipts_B(csvSummaryRecord
					.getTotalReceipts_B());
	
			fecSummaryRecord.setOperatingExpenditures_A(csvSummaryRecord
					.getOperatingExpenditure_A());
			fecSummaryRecord.setOperatingExpenditures_B(csvSummaryRecord
					.getOperatingExpenditure_B());
	
			fecSummaryRecord
					.setTransfersToOtherAuthorizedCommittees_A(csvSummaryRecord
							.getTransferToOtherAuthorizedCommittee_A());
			fecSummaryRecord
					.setTransfersToOtherAuthorizedCommittees_B(csvSummaryRecord
							.getTransferToOtherAuthorizedCommittee_B());
	
			fecSummaryRecord.setOfLoansMade_A(csvSummaryRecord.getOfLoansMadeCan_A());
			fecSummaryRecord.setLoanRepaymentByCandidate_B(csvSummaryRecord
					.getOfLoansMadeCan_B());
	
			fecSummaryRecord.setLoanRepayments_A(csvSummaryRecord
					.getLoanRepaymentsAllOtherLoans_A());
			fecSummaryRecord.setLoanRepayments_B(csvSummaryRecord
					.getLoanRepaymentsAllOtherLoans_B());
	
			fecSummaryRecord.setTotalLoanRepayments_A(csvSummaryRecord
					.getTotalLoanRepayments_A());
			fecSummaryRecord.setTotalLoanRepayments_B(csvSummaryRecord
					.getTotalLoanRepayments_B());
	
			fecSummaryRecord.setRefundIndividuals_A(csvSummaryRecord
					.getRefundIndividualsOtherThenPolCmtes_A());
			fecSummaryRecord.setRefundIndividuals_B(csvSummaryRecord
					.getRefundIndividualsOtherThenPolCmtes_B());
	
			fecSummaryRecord.setRefundPolitical_A(csvSummaryRecord
					.getRefundPoliticalPartyCommittee_A());
			fecSummaryRecord.setRefundPolitical_B(csvSummaryRecord
					.getRefundPoliticalPartyCommittee_B());
	
			fecSummaryRecord.setRefundOther_A(csvSummaryRecord
					.getRefundOtherPoliticalPartyCommittee_A());
			fecSummaryRecord.setRefundOther_B(csvSummaryRecord
					.getRefundOtherPoliticalPartyCommittee_B());
	
			fecSummaryRecord.setTotalContributionRefunds_A(csvSummaryRecord
					.getTotalContributionsRefund_A());
			fecSummaryRecord.setTotalContributionRefunds_B(csvSummaryRecord
					.getTotalContributionsRefund_B());
	
			fecSummaryRecord.setOtherDisbursements_A(csvSummaryRecord
					.getOtherDisbursments_A());
			fecSummaryRecord.setOtherDisbursements_B(csvSummaryRecord
					.getOtherDisbursments_B());
	
			fecSummaryRecord.setTotalDisbursements_A(csvSummaryRecord
					.getTotalDisbursments_A());
			fecSummaryRecord.setTotalDisbursements_B(csvSummaryRecord
					.getTotalDisbursments_B());
	
			fecSummaryRecord.setCashBeginningReportingPeriod(csvSummaryRecord
					.getCashBeginingReportingPeriod());
			fecSummaryRecord.setTotalReceiptsThisPeriod(csvSummaryRecord
					.getTotalReceiptsThisPeriod());
			fecSummaryRecord.setSubTotal(csvSummaryRecord.getSubTotal());
			fecSummaryRecord.setTotalDisbursementsThisPeriod(csvSummaryRecord
					.getTotalDisbursmentsThisPeriod());
			fecSummaryRecord.setCashOnHandAtClosePeriod(csvSummaryRecord
					.getCashOnHandClosePeriod());
			
			fecSummaryRecord.setBeginningImageNumber("14020412651"); // TODO: Need to get from file name
	
			listFecSummaryRecords.add(fecSummaryRecord);
		}
		
		return listFecSummaryRecords;

	}

	public static String getPatternMatcher(String reportCode) {
		Pattern pattern = Pattern.compile("\\((.*?.)\\)");
		Matcher match = pattern.matcher(reportCode);
		if (match.find()) {
			return match.group(1);
		} else {
			return "";
		}
	}

}
