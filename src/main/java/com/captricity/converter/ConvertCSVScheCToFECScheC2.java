package com.captricity.converter;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

import com.captricity.bean.CSVScheduleCRecord;
import com.captricity.bean.FECScheduleC2Record;
import com.captricity.constant.FECFileConstant;

public class ConvertCSVScheCToFECScheC2 {
	
	//TODO: Full name is missing

	public static final String[] columns = new String[] { "name",
			"receiptLineNumber", "loanMiddleName", "loanSuffix",
			"loanFirstName", "nameofPersonorOrganization",
			"loanOrganizationName", "loanPrefix", "loanLastName", "election",
			"street1", "street2", "electionDescription", "city", "state",
			"zip", "origAmtOfLoan", "paymentToDate", "loanBalance",
			"memoTextDescription", "dateIncurred", "dueDateTerms",
			"pctRateTerms", "securedYesno", "indFirstName_1",
			"nameOfPersonOrOrganization_1", "indLastName_1", "indSuffix_1",
			"indPrefix_1", "indMiddleName_1", "indEmployer_1", "street1_1",
			"street2_1", "indOccupation_1", "city_1", "state_1", "zip_1",
			"amountGuaranteedBalance_1", "indMiddleName_2",
			"nameOfPersonOrOrganization_2", "indLastName_2", "indFirstName_2",
			"indPrefix_2", "indSuffix_2", "indEmployer_2", "street1_2",
			"street2_2", "indOccupation_2", "city_2", "state_2", "zip_2",
			"amountGuaranteedBalance_2", "indMiddleName_3", "indFirstName_3",
			"indPrefix_3", "indSuffix_3", "nameOfPersonOrOrganization_3",
			"indLastName_3", "indEmployer_3", "street1_3", "street2_3",
			"indOccupation_3", "city_3", "state_3", "zip_3",
			"amountGuaranteedBalance_3", "indMiddleName_4", "indFirstName_4",
			"indSuffix_4", "indPrefix_4", "nameOfPersonOrOrganization_4",
			"indLastName_4", "indEmployer_4", "street2_4", "street1_4",
			"indOccupation_4", "city_4", "state_4", "zip_4",
			"amountGuaranteedBalance_4" };

	public static List<FECScheduleC2Record> convertCSVScheCToFECScheC2(
			String fileName) {

		List<CSVScheduleCRecord> listCSVScheCRecord = new ArrayList<CSVScheduleCRecord>();

		try {
			CSVReader reader = new CSVReader(new FileReader(fileName), ',','\"', 1);
			ColumnPositionMappingStrategy<CSVScheduleCRecord> mappingStrategy = new ColumnPositionMappingStrategy<CSVScheduleCRecord>();
			mappingStrategy.setType(CSVScheduleCRecord.class);
			mappingStrategy.setColumnMapping(columns);
			CsvToBean<CSVScheduleCRecord> csv = new CsvToBean<CSVScheduleCRecord>();
			listCSVScheCRecord = csv.parse(mappingStrategy, reader);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return convertCSVScheduleCToFECScheduleC2(listCSVScheCRecord);
	}

	private static List<FECScheduleC2Record> convertCSVScheduleCToFECScheduleC2(
			List<CSVScheduleCRecord> listCSVScheCRecord) {

		List<FECScheduleC2Record> listFECScheC2Record = new ArrayList<FECScheduleC2Record>();

		for (CSVScheduleCRecord csvScheduleCRecord : listCSVScheCRecord) {

			FECScheduleC2Record fecScheduleC2Record_1 = getFECScheduleC2Record_1(csvScheduleCRecord);
			if(fecScheduleC2Record_1 != null)
				listFECScheC2Record.add(fecScheduleC2Record_1);

			FECScheduleC2Record fecScheduleC2Record_2 = getFECScheduleC2Record_2(csvScheduleCRecord);
			if(fecScheduleC2Record_2 != null)
				listFECScheC2Record.add(fecScheduleC2Record_2);
			

			FECScheduleC2Record fecScheduleC2Record_3 = getFECScheduleC2Record_3(csvScheduleCRecord);
			if(fecScheduleC2Record_3 != null)
				listFECScheC2Record.add(fecScheduleC2Record_3);

			
			FECScheduleC2Record fecScheduleC2Record_4 = getFECScheduleC2Record_4(csvScheduleCRecord);
			if(fecScheduleC2Record_4 != null)
				listFECScheC2Record.add(fecScheduleC2Record_4);

		}
		return listFECScheC2Record;
	}

	private static FECScheduleC2Record getFECScheduleC2Record_1(
			CSVScheduleCRecord csvScheduleCRecord) {
		
		if(StringUtils.isBlank(csvScheduleCRecord.getNameOfPersonOrOrganization_1())){
			return null;
		}

		FECScheduleC2Record fecScheduleC2Record_1 = new FECScheduleC2Record();

		fecScheduleC2Record_1.setFormType(FECFileConstant.SCHEDULE_C2_PREFIX);
		
		//TODO: Need to get from summary page
		fecScheduleC2Record_1.setFecCommitteeId("C00091892");
		
		fecScheduleC2Record_1.setIndLastName(csvScheduleCRecord.getIndLastName_1());
		fecScheduleC2Record_1.setIndFirstName(csvScheduleCRecord.getIndFirstName_1());
		fecScheduleC2Record_1.setIndMiddleName(csvScheduleCRecord.getIndMiddleName_1());
		fecScheduleC2Record_1.setIndPrefix(csvScheduleCRecord.getIndPrefix_1());
		fecScheduleC2Record_1.setIndSuffix(csvScheduleCRecord.getIndSuffix_1());
		
		fecScheduleC2Record_1.setStreet1(csvScheduleCRecord.getStreet1_1().replace(csvScheduleCRecord.getStreet2_1(), ""));
		fecScheduleC2Record_1.setStreet2(csvScheduleCRecord.getStreet2_1());
		
		fecScheduleC2Record_1.setCity(csvScheduleCRecord.getCity_1());
		fecScheduleC2Record_1.setState(csvScheduleCRecord.getState_1());
		fecScheduleC2Record_1.setZip(csvScheduleCRecord.getZip_1());
		
		fecScheduleC2Record_1.setIndEmployer(csvScheduleCRecord.getIndEmployer_1());
		fecScheduleC2Record_1.setIndOccupation(csvScheduleCRecord.getIndOccupation_1());
		fecScheduleC2Record_1.setAmountGuaranteedBalance(csvScheduleCRecord.getAmountGuaranteedBalance_1());
		
		
		fecScheduleC2Record_1.setImageNumber("14020412871");//TODO: Need to get from file name

		return fecScheduleC2Record_1;
	}

	private static FECScheduleC2Record getFECScheduleC2Record_2(
			CSVScheduleCRecord csvScheduleCRecord) {
		
		if(StringUtils.isBlank(csvScheduleCRecord.getNameOfPersonOrOrganization_2())){
			return null;
		}


		FECScheduleC2Record fecScheduleC2Record_2 = new FECScheduleC2Record();

		fecScheduleC2Record_2.setFormType(FECFileConstant.SCHEDULE_C2_PREFIX);
		
		//TODO: Need to get from summary page
		fecScheduleC2Record_2.setFecCommitteeId("C00091892");
		
		fecScheduleC2Record_2.setIndLastName(csvScheduleCRecord.getIndLastName_2());
		fecScheduleC2Record_2.setIndFirstName(csvScheduleCRecord.getIndFirstName_2());
		fecScheduleC2Record_2.setIndMiddleName(csvScheduleCRecord.getIndMiddleName_2());
		fecScheduleC2Record_2.setIndPrefix(csvScheduleCRecord.getIndPrefix_2());
		fecScheduleC2Record_2.setIndSuffix(csvScheduleCRecord.getIndSuffix_2());
		
		fecScheduleC2Record_2.setStreet1(csvScheduleCRecord.getStreet1_2().replace(csvScheduleCRecord.getStreet2_2(), ""));
		fecScheduleC2Record_2.setStreet2(csvScheduleCRecord.getStreet2_2());
		
		fecScheduleC2Record_2.setCity(csvScheduleCRecord.getCity_2());
		fecScheduleC2Record_2.setState(csvScheduleCRecord.getState_2());
		fecScheduleC2Record_2.setZip(csvScheduleCRecord.getZip_2());
		
		fecScheduleC2Record_2.setIndEmployer(csvScheduleCRecord.getIndEmployer_2());
		fecScheduleC2Record_2.setIndOccupation(csvScheduleCRecord.getIndOccupation_2());
		fecScheduleC2Record_2.setAmountGuaranteedBalance(csvScheduleCRecord.getAmountGuaranteedBalance_2());
		
		
		fecScheduleC2Record_2.setImageNumber("14020412871");//TODO: Need to get from file name

		return fecScheduleC2Record_2;
	}

	private static FECScheduleC2Record getFECScheduleC2Record_3(
			CSVScheduleCRecord csvScheduleCRecord) {
		
		if(StringUtils.isBlank(csvScheduleCRecord.getNameOfPersonOrOrganization_3())){
			return null;
		}


		FECScheduleC2Record fecScheduleC2Record_3 = new FECScheduleC2Record();

		fecScheduleC2Record_3.setFormType(FECFileConstant.SCHEDULE_C2_PREFIX);
		
		//TODO: Need to get from summary page
		fecScheduleC2Record_3.setFecCommitteeId("C00091892");
		
		fecScheduleC2Record_3.setIndLastName(csvScheduleCRecord.getIndLastName_3());
		fecScheduleC2Record_3.setIndFirstName(csvScheduleCRecord.getIndFirstName_3());
		fecScheduleC2Record_3.setIndMiddleName(csvScheduleCRecord.getIndMiddleName_3());
		fecScheduleC2Record_3.setIndPrefix(csvScheduleCRecord.getIndPrefix_3());
		fecScheduleC2Record_3.setIndSuffix(csvScheduleCRecord.getIndSuffix_3());
		
		fecScheduleC2Record_3.setStreet1(csvScheduleCRecord.getStreet1_3().replace(csvScheduleCRecord.getStreet2_3(), ""));
		fecScheduleC2Record_3.setStreet2(csvScheduleCRecord.getStreet2_3());
		
		fecScheduleC2Record_3.setCity(csvScheduleCRecord.getCity_3());
		fecScheduleC2Record_3.setState(csvScheduleCRecord.getState_3());
		fecScheduleC2Record_3.setZip(csvScheduleCRecord.getZip_3());
		
		fecScheduleC2Record_3.setIndEmployer(csvScheduleCRecord.getIndEmployer_3());
		fecScheduleC2Record_3.setIndOccupation(csvScheduleCRecord.getIndOccupation_3());
		fecScheduleC2Record_3.setAmountGuaranteedBalance(csvScheduleCRecord.getAmountGuaranteedBalance_3());
		
		
		fecScheduleC2Record_3.setImageNumber("14020412871");//TODO: Need to get from file name

		return fecScheduleC2Record_3;
	}

	private static FECScheduleC2Record getFECScheduleC2Record_4(
			CSVScheduleCRecord csvScheduleCRecord) {
		
		if(StringUtils.isBlank(csvScheduleCRecord.getNameOfPersonOrOrganization_4())){
			return null;
		}


		FECScheduleC2Record fecScheduleC2Record_4 = new FECScheduleC2Record();

		fecScheduleC2Record_4.setFormType(FECFileConstant.SCHEDULE_C2_PREFIX);
		//TODO: Need to get from summary page
		fecScheduleC2Record_4.setFecCommitteeId("C00091892");
		fecScheduleC2Record_4.setIndLastName(csvScheduleCRecord
				.getIndLastName_4());
		fecScheduleC2Record_4.setIndFirstName(csvScheduleCRecord
				.getIndFirstName_4());
		fecScheduleC2Record_4.setIndMiddleName(csvScheduleCRecord
				.getIndMiddleName_4());
		fecScheduleC2Record_4.setIndPrefix(csvScheduleCRecord.getIndPrefix_4());
		fecScheduleC2Record_4.setIndSuffix(csvScheduleCRecord.getIndSuffix_4());
		fecScheduleC2Record_4.setStreet1(csvScheduleCRecord.getStreet1_4()
				.replace(csvScheduleCRecord.getStreet2_4(), ""));
		fecScheduleC2Record_4.setStreet2(csvScheduleCRecord.getStreet2_4());
		fecScheduleC2Record_4.setCity(csvScheduleCRecord.getCity_4());
		fecScheduleC2Record_4.setState(csvScheduleCRecord.getState_4());
		fecScheduleC2Record_4.setZip(csvScheduleCRecord.getZip_4());
		fecScheduleC2Record_4.setIndEmployer(csvScheduleCRecord
				.getIndEmployer_4());
		fecScheduleC2Record_4.setIndOccupation(csvScheduleCRecord
				.getIndOccupation_4());
		fecScheduleC2Record_4.setAmountGuaranteedBalance(csvScheduleCRecord
				.getAmountGuaranteedBalance_4());
		fecScheduleC2Record_4.setImageNumber("14020412871");//TODO: Need to get from file name

		return fecScheduleC2Record_4;
	}
}
