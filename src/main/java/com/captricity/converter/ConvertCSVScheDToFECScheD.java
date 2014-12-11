package com.captricity.converter;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

import com.captricity.bean.CSVScheduleDRecord;
import com.captricity.bean.FECScheduleDRecord;
import com.captricity.constant.FECFileConstant;
import com.captricity.constant.IdentifyNameConstant;
import com.captricity.utils.FECConverterUtil;

public class ConvertCSVScheDToFECScheD {
	
	public static final  String[] columns = new String[] {	"name",
		"formType",
		"debtLastName_A",
		"debtPrefix_A",
		"debtMiddleName_A",
		"personOrOrganization_A",
		"debtName_A",
		"debtSuffix_A",
		"debtFirstName_A",
		"street1_A",
		"street2_A",
		"streetFull_A",
		"naturePurposeDebtDescription_A",
		"city_A",
		"state_A",
		"zip_A",
		"beginningBalance_A",
		"incurredThisPeriod_A",
		"paymentThisPeriod_A",
		"balanceAtClose_A",
		"debtName_B",
		"debtPrefix_B",
		"debtLastName_B",
		"debtMiddleName_B",
		"personOrOrganization_B",
		"debtFirstName_B",
		"debtSuffix_B",
		"streetFull_B",
		"street1_B",
		"street2_B",
		"naturePurposeDebtDescription_B",
		"city_B",
		"state_B",
		"zip_B",
		"beginningBalance_B", 
		"incurredThisPeriod_B",
		"paymentThisPeriod_B",
		"balanceAtClose_B",
		"debtName_C",
		"debtSuffix_C",
		"debtMiddleName_C",
		"debtPrefix_C",
		"personOrOrganization_C",	
		"debtFirstName_C",
		"debtLastName_C",
		"street2_C",
		"streetFull_C",
		"street1_C",
		"naturePurposeDebtDescription_C",
		"city_C",
		"state_C",
		"zip_C",
		"beginningBalance_C",
		"incurredThisPeriod_C",
		"paymentThisPeriod_C",
		"balanceAtClose_C"};

	public static List<FECScheduleDRecord> convertCSVScheDToFECScheD(String fileName){
		
		List<CSVScheduleDRecord> listCSVScheDRecord = new ArrayList<CSVScheduleDRecord>();
		
		try {
			
			 CSVReader reader = new CSVReader(new FileReader(fileName), ',', '\"', 1);
			 ColumnPositionMappingStrategy<CSVScheduleDRecord> mappingStrategy = new ColumnPositionMappingStrategy<CSVScheduleDRecord>();
			 mappingStrategy.setType(CSVScheduleDRecord.class);
			
		     mappingStrategy.setColumnMapping(columns);
		     
		     CsvToBean<CSVScheduleDRecord> csv = new CsvToBean<CSVScheduleDRecord>();
 	         listCSVScheDRecord = csv.parse(mappingStrategy, reader);

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return convertCSVScheduleDToFECScheduleD(listCSVScheDRecord);
	}
	
	private static List<FECScheduleDRecord> convertCSVScheduleDToFECScheduleD(List<CSVScheduleDRecord> listCSVScheDRecord) {
		
		List<FECScheduleDRecord> listFECScheDRecord = new ArrayList<FECScheduleDRecord>();
		
		for(CSVScheduleDRecord csvScheduleDRecord : listCSVScheDRecord){
			
			FECScheduleDRecord fecScheduleDRecord_A = getFECScheduleDRecord_A(csvScheduleDRecord);
			if(fecScheduleDRecord_A != null){
				listFECScheDRecord.add(fecScheduleDRecord_A);
			}
			
			FECScheduleDRecord fecScheduleDRecord_B = getFECScheduleDRecord_B(csvScheduleDRecord);
			if(fecScheduleDRecord_B != null){
				listFECScheDRecord.add(fecScheduleDRecord_B);
			}

			FECScheduleDRecord fecScheduleDRecord_C = getFECScheduleDRecord_C(csvScheduleDRecord);
			if(fecScheduleDRecord_C != null){
				listFECScheDRecord.add(fecScheduleDRecord_C);
			}

		}
		return listFECScheDRecord;		
	}

	private static FECScheduleDRecord getFECScheduleDRecord_A(CSVScheduleDRecord csvScheduleDRecord) {
			
			FECScheduleDRecord fecScheduleDRecord_A = new FECScheduleDRecord();
			
			if(StringUtils.isBlank(csvScheduleDRecord.getFormType()) ||
					StringUtils.isBlank(csvScheduleDRecord.getPersonOrOrganization_A())){
				return null;
			}
			
			fecScheduleDRecord_A.setFormType(FECFileConstant.SCHEDULE_D_PREFIX + csvScheduleDRecord.getFormType());
			
			//TODO:  Need to get from summary page
			fecScheduleDRecord_A.setFilterFECCommitteeId("C00091892");
			
			if(!StringUtils.isBlank(csvScheduleDRecord.getPersonOrOrganization_A())){
				if(csvScheduleDRecord.getPersonOrOrganization_A().equals(IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
					fecScheduleDRecord_A.setDebtName(csvScheduleDRecord.getDebtName_A());
				}else{
					
					String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleDRecord.getDebtName_A());
					
					fecScheduleDRecord_A.setDebtPrefix(splitedFullName[0]);
					fecScheduleDRecord_A.setDebtFirstName(splitedFullName[1]);
					fecScheduleDRecord_A.setDebtMiddleName(splitedFullName[2]);
					fecScheduleDRecord_A.setDebtLastName(splitedFullName[3]);
					fecScheduleDRecord_A.setDebtSuffix(splitedFullName[4]);
				}
			}
			
			fecScheduleDRecord_A.setStreet1(csvScheduleDRecord.getStreet1_A().replace(csvScheduleDRecord.getStreet2_A(), ""));
			fecScheduleDRecord_A.setStreet2(csvScheduleDRecord.getStreet2_A());
			fecScheduleDRecord_A.setCity(csvScheduleDRecord.getCity_A());
			fecScheduleDRecord_A.setState(csvScheduleDRecord.getState_A());
			fecScheduleDRecord_A.setZip(csvScheduleDRecord.getZip_A());
			fecScheduleDRecord_A.setNaturePurposeDebtDescription(csvScheduleDRecord.getNaturePurposeDebtDescription_A());
			fecScheduleDRecord_A.setBeginningBalance(csvScheduleDRecord.getBeginningBalance_A());
			fecScheduleDRecord_A.setIncurredThisPeriod(csvScheduleDRecord.getIncurredThisPeriod_A());
			fecScheduleDRecord_A.setPaymentThisPeriod(csvScheduleDRecord.getPaymentThisPeriod_A());
			fecScheduleDRecord_A.setBalanceAtClose(csvScheduleDRecord.getBalanceAtClose_A());
			
			Pattern pattern = Pattern.compile("\\_(.*?)\\-");
			Matcher match = pattern.matcher(csvScheduleDRecord.getName());
			if (match.find()) {
				fecScheduleDRecord_A.setImageNumber(match.group(1));
			}
			
			return fecScheduleDRecord_A;
	}
	
	private static FECScheduleDRecord getFECScheduleDRecord_B(CSVScheduleDRecord csvScheduleDRecord) {
			
			FECScheduleDRecord fecScheduleDRecord_B = new FECScheduleDRecord();
			
			if(StringUtils.isBlank(csvScheduleDRecord.getFormType()) ||
					StringUtils.isBlank(csvScheduleDRecord.getPersonOrOrganization_B())){
				return null;
			}
			
			fecScheduleDRecord_B.setFormType(FECFileConstant.SCHEDULE_D_PREFIX + csvScheduleDRecord.getFormType());
			//TODO: Need to get from summary page
			fecScheduleDRecord_B.setFilterFECCommitteeId("C00091892");
			
			if(!StringUtils.isBlank(csvScheduleDRecord.getPersonOrOrganization_B())){
				if(csvScheduleDRecord.getPersonOrOrganization_B().equals(IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
					fecScheduleDRecord_B.setDebtName(csvScheduleDRecord.getDebtName_B());
				}else{
					
					String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleDRecord.getDebtName_B());
					
					fecScheduleDRecord_B.setDebtPrefix(splitedFullName[0]);
					fecScheduleDRecord_B.setDebtFirstName(splitedFullName[1]);
					fecScheduleDRecord_B.setDebtMiddleName(splitedFullName[2]);
					fecScheduleDRecord_B.setDebtLastName(splitedFullName[3]);
					fecScheduleDRecord_B.setDebtSuffix(splitedFullName[4]);
				}
			}
			
			fecScheduleDRecord_B.setStreet1(csvScheduleDRecord.getStreet1_B().replace(csvScheduleDRecord.getStreet2_B(), ""));
			fecScheduleDRecord_B.setStreet2(csvScheduleDRecord.getStreet2_B());
			fecScheduleDRecord_B.setCity(csvScheduleDRecord.getCity_B());
			fecScheduleDRecord_B.setState(csvScheduleDRecord.getState_B());
			fecScheduleDRecord_B.setZip(csvScheduleDRecord.getZip_B());
			fecScheduleDRecord_B.setNaturePurposeDebtDescription(csvScheduleDRecord.getNaturePurposeDebtDescription_B());
			fecScheduleDRecord_B.setBeginningBalance(csvScheduleDRecord.getBeginningBalance_B());
			fecScheduleDRecord_B.setIncurredThisPeriod(csvScheduleDRecord.getIncurredThisPeriod_B());
			fecScheduleDRecord_B.setPaymentThisPeriod(csvScheduleDRecord.getPaymentThisPeriod_B());
			fecScheduleDRecord_B.setBalanceAtClose(csvScheduleDRecord.getBalanceAtClose_B());
			
			Pattern pattern = Pattern.compile("\\_(.*?)\\-");
			Matcher match = pattern.matcher(csvScheduleDRecord.getName());
			if (match.find()) {
				fecScheduleDRecord_B.setImageNumber(match.group(1));
			}
			
			return fecScheduleDRecord_B;
	}
	
	private static FECScheduleDRecord getFECScheduleDRecord_C(CSVScheduleDRecord csvScheduleDRecord) {
		
			FECScheduleDRecord fecScheduleDRecord_C = new FECScheduleDRecord();
			
			if(StringUtils.isBlank(csvScheduleDRecord.getFormType()) ||
					StringUtils.isBlank(csvScheduleDRecord.getPersonOrOrganization_C())){
				return null;
			}

		
			fecScheduleDRecord_C.setFormType(FECFileConstant.SCHEDULE_D_PREFIX + csvScheduleDRecord.getFormType());
			// TODO: Need to get from summary page
			fecScheduleDRecord_C.setFilterFECCommitteeId("C00091892"); 
			
			if(!StringUtils.isBlank(csvScheduleDRecord.getPersonOrOrganization_C())){
				if(csvScheduleDRecord.getPersonOrOrganization_C().equals(IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
					fecScheduleDRecord_C.setDebtName(csvScheduleDRecord.getDebtName_C());
				}else{
					
					String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleDRecord.getDebtName_C());
					
					fecScheduleDRecord_C.setDebtPrefix(splitedFullName[0]);
					fecScheduleDRecord_C.setDebtFirstName(splitedFullName[1]);
					fecScheduleDRecord_C.setDebtMiddleName(splitedFullName[2]);
					fecScheduleDRecord_C.setDebtLastName(splitedFullName[3]);
					fecScheduleDRecord_C.setDebtSuffix(splitedFullName[4]);
				}
			}
			
			fecScheduleDRecord_C.setStreet1(csvScheduleDRecord.getStreet1_C().replace(csvScheduleDRecord.getStreet2_C(), ""));
			fecScheduleDRecord_C.setStreet2(csvScheduleDRecord.getStreet2_C());
			fecScheduleDRecord_C.setCity(csvScheduleDRecord.getCity_C());
			fecScheduleDRecord_C.setState(csvScheduleDRecord.getState_C());
			fecScheduleDRecord_C.setZip(csvScheduleDRecord.getZip_C());
			fecScheduleDRecord_C.setNaturePurposeDebtDescription(csvScheduleDRecord.getNaturePurposeDebtDescription_C());
			fecScheduleDRecord_C.setBeginningBalance(csvScheduleDRecord.getBeginningBalance_C());
			fecScheduleDRecord_C.setIncurredThisPeriod(csvScheduleDRecord.getIncurredThisPeriod_C());
			fecScheduleDRecord_C.setPaymentThisPeriod(csvScheduleDRecord.getPaymentThisPeriod_C());
			fecScheduleDRecord_C.setBalanceAtClose(csvScheduleDRecord.getBalanceAtClose_C());

			Pattern pattern = Pattern.compile("\\_(.*?)\\-");
			Matcher match = pattern.matcher(csvScheduleDRecord.getName());
			if (match.find()) {
				fecScheduleDRecord_C.setImageNumber(match.group(1));
			}
			
			return fecScheduleDRecord_C;
	}
}
