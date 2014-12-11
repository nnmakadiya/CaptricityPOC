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

import com.captricity.bean.CSVScheduleCRecord;
import com.captricity.bean.FECScheduleCRecord;
import com.captricity.constant.FECFileConstant;
import com.captricity.constant.IdentifyNameConstant;
import com.captricity.constant.ItemElectConstant;
import com.captricity.utils.FECConverterUtil;

public class ConvertCSVScheCToFECScheC {

	public static final String columns[] = new String[] {"name",
		"receiptLineNumber",
		"loanPrefix",
		"loanFirstName",
		"loanLastName",
		"nameofPersonorOrganization",
		"loanMiddleName",
		"loanOrganizationName",
		"loanSuffix",
		"itemElectYear",
		"election",
		"streetFull",
		"street1",
		"street2",
		"electionDescription",
		"city",
		"state",
		"zip",
		"origAmtOfLoan",
		"paymentToDate",
		"loanBalance",
		"memoTextDescription",
		"dateIncurred",
		"dueDateTerms",
		"pctRateTerms",
		"securedYesno",
		"indLastName_1",
		"indSuffix_1",
		"indFirstName_1",
		"indMiddleName_1",
		"nameOfPersonOrOrganization_1",
		"indPrefix_1",
		"indEmployer_1",
		"street1_1",
		"streetFull_1",
		"street2_1",
		"indOccupation_1",
		"city_1",
		"state_1",
		"zip_1",
		"amountGuaranteedBalance_1",
		"indPrefix_2",
		"nameOfPersonOrOrganization_2",
		"indMiddleName_2",
		"indFirstName_2",
		"indLastName_2",
		"indEmployer_2",
		"street2_2",
		"street1_2",
		"streetFull_2",
		"indOccupation_2",
		"city_2",
		"state_2",
		"zip_2",
		"amountGuaranteedBalance_2",
		"indFirstName_3",
		"indSuffix_3",
		"indMiddleName_3",
		"indLastName_3",
		"indSuffix_2",
		"indPrefix_3",
		"nameOfPersonOrOrganization_3",
		"indEmployer_3",
		"streetFull_3",
		"street1_3",
		"street2_3",
		"indOccupation_3",
		"city_3",
		"state_3",
		"zip_3",
		"amountGuaranteedBalance_3",
		"indMiddleName_4",
		"indPrefix_4",
		"indSuffix_4",
		"nameOfPersonOrOrganization_4",
		"indFirstName_4",
		"indLastName_4",
		"indEmployer_4",
		"street2_4",
		"streetFull_4",
		"street1_4",
		"indOccupation_4",
		"city_4",
		"state_4",
		"zip_4",
		"amountGuaranteedBalance_4"};

	private static final FastDateFormat FEC_DATE_RECEIVED = FastDateFormat
			.getInstance("yyyyMMdd");
	private static final FastDateFormat CSV_DATE_RECEIVED = FastDateFormat
			.getInstance("MMddyyyy");

	public static List<FECScheduleCRecord> convertCSVScheCToFECScheC(
			String fileName) {

		List<CSVScheduleCRecord> listCSVScheCRecord = new ArrayList<CSVScheduleCRecord>();

		try {
			CSVReader reader = new CSVReader(new FileReader(fileName), ',', '\"', 1);
			ColumnPositionMappingStrategy<CSVScheduleCRecord> mappingStrategy = new ColumnPositionMappingStrategy<CSVScheduleCRecord>();
			mappingStrategy.setType(CSVScheduleCRecord.class);
			mappingStrategy.setColumnMapping(columns);
			CsvToBean<CSVScheduleCRecord> csv = new CsvToBean<CSVScheduleCRecord>();
			listCSVScheCRecord = csv.parse(mappingStrategy, reader);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return convertCSVScheduleCToFECScheduleC(listCSVScheCRecord);
	}

	private static List<FECScheduleCRecord> convertCSVScheduleCToFECScheduleC(
			List<CSVScheduleCRecord> listCSVScheCRecord) {

		List<FECScheduleCRecord> listFECScheCRecord = new ArrayList<FECScheduleCRecord>();

		for (CSVScheduleCRecord csvScheduleCRecord : listCSVScheCRecord) {

			FECScheduleCRecord fecScheduleCRecord = getFECScheduleCRecord(csvScheduleCRecord);
			listFECScheCRecord.add(fecScheduleCRecord);

		}
		return listFECScheCRecord;
	}

	private static FECScheduleCRecord getFECScheduleCRecord(
			CSVScheduleCRecord csvScheduleCRecord) {

		FECScheduleCRecord fecScheduleCRecord = new FECScheduleCRecord();

		fecScheduleCRecord.setFormType(FECFileConstant.SCHEDULE_C_PREFIX);
		
		//TODO: Need to get from summary page
		fecScheduleCRecord.setFecCommitteeId("C00091892");

		if(!StringUtils.isBlank(csvScheduleCRecord.getNameofPersonorOrganization())){
			if (csvScheduleCRecord.getNameofPersonorOrganization().equals(
					IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())) {
				fecScheduleCRecord.setLoanOrganizationName(csvScheduleCRecord
						.getLoanOrganizationName());
			} else {
				String splitedFullName[] = FECConverterUtil
						.splitFullName(csvScheduleCRecord.getLoanOrganizationName());
	
				fecScheduleCRecord.setLoanPrefix(splitedFullName[0]);
				fecScheduleCRecord.setLoanFirstName(splitedFullName[1]);
				fecScheduleCRecord.setLoanMiddleName(splitedFullName[2]);
				fecScheduleCRecord.setLoanLastName(splitedFullName[3]);
				fecScheduleCRecord.setLoanSuffix(splitedFullName[4]);
			}
		}

		fecScheduleCRecord.setReceiptLineNumber(csvScheduleCRecord
				.getReceiptLineNumber());
		fecScheduleCRecord.setStreet1(csvScheduleCRecord.getStreet1().replace(
				csvScheduleCRecord.getStreet2(), ""));
		fecScheduleCRecord.setStreet2(csvScheduleCRecord.getStreet2());
		fecScheduleCRecord.setCity(csvScheduleCRecord.getCity());
		fecScheduleCRecord.setState(csvScheduleCRecord.getState());
		fecScheduleCRecord.setZip(csvScheduleCRecord.getZip());
		
		for(ItemElectConstant iec : ItemElectConstant.values()){
			if (StringUtils.containsIgnoreCase(
					csvScheduleCRecord.getElection(),
					iec.getDescription())) {
				fecScheduleCRecord.setElection(iec.getCode());
				if(iec.getCode().equals(ItemElectConstant.OTHER.getCode())){
					fecScheduleCRecord.setElectionDescription(csvScheduleCRecord.getElectionDescription());
				}else{
					fecScheduleCRecord.setElectionDescription(csvScheduleCRecord.getItemElectYear());
				}
				break;
			}
		}

		
		fecScheduleCRecord.setOrigAmtOfLoan(csvScheduleCRecord
				.getOrigAmtOfLoan());
		fecScheduleCRecord.setPaymentToDate(csvScheduleCRecord
				.getPaymentToDate());
		fecScheduleCRecord.setLoanBalance(csvScheduleCRecord.getLoanBalance());

		if (!StringUtils.isBlank(csvScheduleCRecord.getDateIncurred())) {
			try {
				fecScheduleCRecord.setDateIncurred(FEC_DATE_RECEIVED
						.format(CSV_DATE_RECEIVED.parse(csvScheduleCRecord
								.getDateIncurred())));
			} catch (ParseException e) {
				fecScheduleCRecord.setDateIncurred(csvScheduleCRecord
						.getDateIncurred());
			}
		}

		fecScheduleCRecord.setDueDateTerms(csvScheduleCRecord.getDueDateTerms());

		fecScheduleCRecord
				.setPctRateTerms(csvScheduleCRecord.getPctRateTerms());
		fecScheduleCRecord
				.setSecuredYesno(csvScheduleCRecord.getSecuredYesno());
		fecScheduleCRecord.setMemoTextDescription(csvScheduleCRecord
				.getMemoTextDescription());
		
		Pattern pattern = Pattern.compile("\\_(.*?)\\-");
		Matcher match = pattern.matcher(csvScheduleCRecord.getName());
		if (match.find()) {
			fecScheduleCRecord.setImageNumber(match.group(1));
		}

		return fecScheduleCRecord;
	}

}
