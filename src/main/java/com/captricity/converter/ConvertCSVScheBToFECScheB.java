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

import com.captricity.bean.CSVScheduleBRecord;
import com.captricity.bean.FECScheduleBRecord;
import com.captricity.constant.FECFileConstant;
import com.captricity.constant.IdentifyNameConstant;
import com.captricity.constant.ItemElectConstant;
import com.captricity.utils.FECConverterUtil;

public class ConvertCSVScheBToFECScheB {
	
	private static final FastDateFormat FEC_DATE_RECEIVED = FastDateFormat.getInstance("yyyyMMdd");
	private static final FastDateFormat CSV_DATE_RECEIVED = FastDateFormat.getInstance("MMddyyyy");
	
	public static final  String[] columns = new String[] {	"name",
		"formType",
		"recipientFirstName_A",
		"recipientLastName_A",
		"recipientMiddleName_A",
		"recipientPrefix_A",
		"recipientSuffix_A",
		"personOrOrganization_A",
		"recipientOrganizationName_A",
		"street1_A",
		"streetFull_A",
		"street2_A",
		"dateOfDisbursement_A",
		"city_A",
		"state_A",
		"zip_A",
		"purposeOfDisbursement_A",
		"amountOfDisbursement_A", 
		"categoryCode_A",
		"nameOfPersonOrCommitee_A",
		"canPrefix_A",
		"canMiddleName_A",
		"canLastName_A",
		"canFirstName_A",
		"canSuffix_A",
		"beneficiaryCommitteeName_A",	
		"canState_A",
		"canOffice_A",
		"itemElectYear_A",
		"canDist_A",
		"itemElectOther_A",
		"memoTextDescription_A",
		"itemElectCode_A",
		"recipientSuffix_B",
		"recipientLastName_B",
		"personOrOrganization_B",
		"recipientMiddleName_B",
		"recipientOrganizationName_B",
		"recipientFirstName_B",
		"recipientPrefix_B",
		"streetFull_B",
		"street2_B",
		"street1_B",
		"dateOfDisbursement_B",
		"city_B",
		"state_B",
		"zip_B",
		"purposeOfDisbursement_B",
		"amountOfDisbursement_B",
		"categoryCode_B",
		"canLastName_B",
		"beneficiaryCommitteeName_B",
		"nameOfPersonOrCommittee_B",
		"canFirstName_B",
		"canSuffix_B",
		"canPrefix_B",
		"canMiddleName_B",
		"canState_B",
		"canOffice_B",
		"itemElectOther_B",
		"itemElectYear_B",
		"memoTextDescription_B",
		"itemElectCode_B",
		"canDist_B",
		"recipientOrganizationName_C",
		"recipientFirstName_C",
		"personOrOrganization_C",
		"recipientSuffix_C",
		"recipientLastName_C",
		"recipientPrefix_C",
		"recipientMiddleName_C",
		"street2_C",
		"streetFull_C",
		"street1_C",
		"dateOfDisbursement_C",
		"city_C",
		"state_C",
		"zip_C",
		"purposeOfDisbursement_C",
		"amountOfDisbursement_C",
		"categoryCode_C",
		"canMiddleName_C",
		"canSuffix_C",
		"canFirstName_C",
		"nameOfPersonOrCommittee_C",
		"beneficiaryCommitteeName_C",
		"canLastName_C",
		"canPrefix_C",
		"memoTextDescription_C",
		"canState_C",
		"canOffice_C",
		"itemElectYear_C",
		"itemElectOther_C",
		"itemElectCode_C",
		"canDist_C"};
	
	public static List<FECScheduleBRecord> convertCSVScheBToFECScheB(String fileName){
		
		List<CSVScheduleBRecord> listCSVScheBRecord = new ArrayList<CSVScheduleBRecord>();
		
		try {
			 CSVReader reader = new CSVReader(new FileReader(fileName), ',', '\"', 1);
			 ColumnPositionMappingStrategy<CSVScheduleBRecord> mappingStrategy = new ColumnPositionMappingStrategy<CSVScheduleBRecord>();
			 mappingStrategy.setType(CSVScheduleBRecord.class);
			
		     mappingStrategy.setColumnMapping(columns);
		     
		     CsvToBean<CSVScheduleBRecord> csv = new CsvToBean<CSVScheduleBRecord>();
		     listCSVScheBRecord = csv.parse(mappingStrategy, reader);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return convertCSVScheduleBToFECScheduleB(listCSVScheBRecord);
	}
	
	private static List<FECScheduleBRecord> convertCSVScheduleBToFECScheduleB(List<CSVScheduleBRecord> listCSVScheBRecord) {
		
		List<FECScheduleBRecord> listFECScheBRecord = new ArrayList<FECScheduleBRecord>();
		
		for(CSVScheduleBRecord csvScheduleBRecord : listCSVScheBRecord){
			
			FECScheduleBRecord fecScheduleBRecord_A = getFECScheduleBRecord_A(csvScheduleBRecord);
			listFECScheBRecord.add(fecScheduleBRecord_A);
			
			FECScheduleBRecord fecScheduleBRecord_B = getFECScheduleBRecord_B(csvScheduleBRecord);
			listFECScheBRecord.add(fecScheduleBRecord_B);
			
			FECScheduleBRecord fecScheduleBRecord_C = getFECScheduleBRecord_C(csvScheduleBRecord);
			listFECScheBRecord.add(fecScheduleBRecord_C);
				
		}
		return listFECScheBRecord;		
	}

	private static FECScheduleBRecord getFECScheduleBRecord_A(CSVScheduleBRecord csvScheduleBRecord) {
			
			FECScheduleBRecord fecScheduleBRecord_A = new FECScheduleBRecord();
			
			fecScheduleBRecord_A.setFormType(FECFileConstant.SCHEDULE_B_PREFIX + csvScheduleBRecord.getFormType());
			
			//TODO: Get id from summary page
			fecScheduleBRecord_A.setFecCommitteeId("C00091892");
			
			if(!StringUtils.isBlank(csvScheduleBRecord.getPersonOrOrganization_A())){
				if(csvScheduleBRecord.getPersonOrOrganization_A().equals(IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
					fecScheduleBRecord_A.setRecipientOrganizationName(csvScheduleBRecord.getRecipientOrganizationName_A());
				}else{
					
					String splitedFullName[] = 	FECConverterUtil.splitFullName(csvScheduleBRecord.getRecipientOrganizationName_A());
						
					fecScheduleBRecord_A.setRecipientPrefix(splitedFullName[0]);
					fecScheduleBRecord_A.setRecipientFirstName(splitedFullName[1]);
					fecScheduleBRecord_A.setRecipientMiddleName(splitedFullName[2]);
					fecScheduleBRecord_A.setRecipientLastName(splitedFullName[3]);		
					fecScheduleBRecord_A.setRecipientSuffix(splitedFullName[4]);
				}
			}
			
			fecScheduleBRecord_A.setStreet1(csvScheduleBRecord.getStreet1_A().replace(csvScheduleBRecord.getStreet2_A(), ""));
			fecScheduleBRecord_A.setStreet2(csvScheduleBRecord.getStreet2_A());
			fecScheduleBRecord_A.setCity(csvScheduleBRecord.getCity_A());
			fecScheduleBRecord_A.setState(csvScheduleBRecord.getState_A());
			fecScheduleBRecord_A.setZip(csvScheduleBRecord.getZip_A());
			
			if(!StringUtils.isBlank(csvScheduleBRecord.getDateOfDisbursement_A())){
				try{
					fecScheduleBRecord_A.setDateOfDisbursement(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleBRecord.getDateOfDisbursement_A())));
				}
				catch (ParseException e){
					fecScheduleBRecord_A.setDateOfDisbursement(csvScheduleBRecord.getDateOfDisbursement_A());
				}
			}
			
			fecScheduleBRecord_A.setPurposeOfDisbursement(csvScheduleBRecord.getPurposeOfDisbursement_A());
			fecScheduleBRecord_A.setBeneficiaryCommitteeName(csvScheduleBRecord.getBeneficiaryCommitteeName_A());
			fecScheduleBRecord_A.setCanLastName(csvScheduleBRecord.getCanLastName_A());
			fecScheduleBRecord_A.setCanFirstName(csvScheduleBRecord.getCanFirstName_A());
			fecScheduleBRecord_A.setCanMiddleName(csvScheduleBRecord.getCanMiddleName_A());
			fecScheduleBRecord_A.setCanPrefix(csvScheduleBRecord.getCanPrefix_A());
			fecScheduleBRecord_A.setCanSuffix(csvScheduleBRecord.getCanSuffix_A());
			fecScheduleBRecord_A.setCategoryCode(csvScheduleBRecord.getCategoryCode_A());
			fecScheduleBRecord_A.setCanOffice(csvScheduleBRecord.getCanOffice_A());
			fecScheduleBRecord_A.setCanState(csvScheduleBRecord.getCanState_A());
			fecScheduleBRecord_A.setCanDist(csvScheduleBRecord.getCanDist_A());
			
			for(ItemElectConstant iec : ItemElectConstant.values()){
				if (StringUtils.containsIgnoreCase(
						csvScheduleBRecord.getItemElectCode_A(),
						iec.getDescription())) {
					fecScheduleBRecord_A.setItemElectCode(iec.getCode());
					if(iec.getCode().equals(ItemElectConstant.OTHER.getCode())){
						fecScheduleBRecord_A.setItemElectOther(csvScheduleBRecord.getItemElectOther_A());
					}else{
						fecScheduleBRecord_A.setItemElectOther(csvScheduleBRecord.getItemElectYear_A());
					}
					break;
				}
			}
			
			fecScheduleBRecord_A.setAmountOfDisbursement(csvScheduleBRecord.getAmountOfDisbursement_A());
			fecScheduleBRecord_A.setMemoTextDescription(csvScheduleBRecord.getMemoTextDescription_A());
			
			Pattern pattern = Pattern.compile("\\_(.*?)\\-");
			Matcher match = pattern.matcher(csvScheduleBRecord.getName());
			if (match.find()) {
				fecScheduleBRecord_A.setImageNumber(match.group(1));
			}
			
			return fecScheduleBRecord_A;
	}
	
	private static FECScheduleBRecord getFECScheduleBRecord_B(CSVScheduleBRecord csvScheduleBRecord) {
			
			FECScheduleBRecord fecScheduleBRecord_B = new FECScheduleBRecord();
			fecScheduleBRecord_B.setFormType(FECFileConstant.SCHEDULE_B_PREFIX + csvScheduleBRecord.getFormType());
			
			//TODO: Get id from summary page
			fecScheduleBRecord_B.setFecCommitteeId("C00091892");
			
			if(!StringUtils.isBlank(csvScheduleBRecord.getPersonOrOrganization_B())){
				if(csvScheduleBRecord.getPersonOrOrganization_B().equals(IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
					fecScheduleBRecord_B.setRecipientOrganizationName(csvScheduleBRecord.getRecipientOrganizationName_B());
				}else{
					String splitedFullName[] = 	FECConverterUtil.splitFullName(csvScheduleBRecord.getRecipientOrganizationName_B());
						
					fecScheduleBRecord_B.setRecipientPrefix(splitedFullName[0]);
					fecScheduleBRecord_B.setRecipientFirstName(splitedFullName[1]);
					fecScheduleBRecord_B.setRecipientMiddleName(splitedFullName[2]);
					fecScheduleBRecord_B.setRecipientLastName(splitedFullName[3]);		
					fecScheduleBRecord_B.setRecipientSuffix(splitedFullName[4]);
					
				}
			}
			
			fecScheduleBRecord_B.setStreet1(csvScheduleBRecord.getStreet1_B().replace(csvScheduleBRecord.getStreet2_B(), ""));
			fecScheduleBRecord_B.setStreet2(csvScheduleBRecord.getStreet2_B());
			fecScheduleBRecord_B.setCity(csvScheduleBRecord.getCity_B());
			fecScheduleBRecord_B.setState(csvScheduleBRecord.getState_B());
			fecScheduleBRecord_B.setZip(csvScheduleBRecord.getZip_B());
			
			if(!StringUtils.isBlank(csvScheduleBRecord.getDateOfDisbursement_B())){
				try{
					fecScheduleBRecord_B.setDateOfDisbursement(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleBRecord.getDateOfDisbursement_B())));
				}
				catch (ParseException e){
					fecScheduleBRecord_B.setDateOfDisbursement(csvScheduleBRecord.getDateOfDisbursement_B());
				}
			}
			
			fecScheduleBRecord_B.setPurposeOfDisbursement(csvScheduleBRecord.getPurposeOfDisbursement_B());
			fecScheduleBRecord_B.setBeneficiaryCommitteeName(csvScheduleBRecord.getBeneficiaryCommitteeName_B());
			fecScheduleBRecord_B.setCanLastName(csvScheduleBRecord.getCanLastName_B());
			fecScheduleBRecord_B.setCanFirstName(csvScheduleBRecord.getCanFirstName_B());
			fecScheduleBRecord_B.setCanMiddleName(csvScheduleBRecord.getCanMiddleName_B());
			fecScheduleBRecord_B.setCanPrefix(csvScheduleBRecord.getCanPrefix_B());
			fecScheduleBRecord_B.setCanSuffix(csvScheduleBRecord.getCanSuffix_B());
			fecScheduleBRecord_B.setCategoryCode(csvScheduleBRecord.getCategoryCode_B());
			fecScheduleBRecord_B.setCanOffice(csvScheduleBRecord.getCanOffice_B());
			fecScheduleBRecord_B.setCanState(csvScheduleBRecord.getCanState_B());
			fecScheduleBRecord_B.setCanDist(csvScheduleBRecord.getCanDist_B());
			
			for(ItemElectConstant iec : ItemElectConstant.values()){
				if (StringUtils.containsIgnoreCase(
						csvScheduleBRecord.getItemElectCode_B(),
						iec.getDescription())) {
					fecScheduleBRecord_B.setItemElectCode(iec.getCode());
					if(iec.getCode().equals(ItemElectConstant.OTHER.getCode())){
						fecScheduleBRecord_B.setItemElectOther(csvScheduleBRecord.getItemElectOther_B());
					}else{
						fecScheduleBRecord_B.setItemElectOther(csvScheduleBRecord.getItemElectYear_B());
					}
					break;
				}
			}
			
			fecScheduleBRecord_B.setAmountOfDisbursement(csvScheduleBRecord.getAmountOfDisbursement_B());
			fecScheduleBRecord_B.setMemoTextDescription(csvScheduleBRecord.getMemoTextDescription_B());
			
			Pattern pattern = Pattern.compile("\\_(.*?)\\-");
			Matcher match = pattern.matcher(csvScheduleBRecord.getName());
			if (match.find()) {
				fecScheduleBRecord_B.setImageNumber(match.group(1));
			}

			return fecScheduleBRecord_B;
			
	}
	
	private static FECScheduleBRecord getFECScheduleBRecord_C(CSVScheduleBRecord csvScheduleBRecord) {
		
			FECScheduleBRecord fecScheduleBRecord_C = new FECScheduleBRecord();
		
			fecScheduleBRecord_C.setFormType(FECFileConstant.SCHEDULE_B_PREFIX + csvScheduleBRecord.getFormType());
			
			//TODO: Get id from summary page
			fecScheduleBRecord_C.setFecCommitteeId("C00091892");
			
			if(!StringUtils.isBlank(csvScheduleBRecord.getPersonOrOrganization_C())){
				if (csvScheduleBRecord.getPersonOrOrganization_C().equals(IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
					fecScheduleBRecord_C.setRecipientOrganizationName(csvScheduleBRecord.getRecipientOrganizationName_C());
				}else{
					String splitedFullName[] = 	FECConverterUtil.splitFullName(csvScheduleBRecord.getRecipientOrganizationName_C());
						
					fecScheduleBRecord_C.setRecipientPrefix(splitedFullName[0]);
					fecScheduleBRecord_C.setRecipientFirstName(splitedFullName[1]);
					fecScheduleBRecord_C.setRecipientMiddleName(splitedFullName[2]);
					fecScheduleBRecord_C.setRecipientLastName(splitedFullName[3]);		
					fecScheduleBRecord_C.setRecipientSuffix(splitedFullName[4]);
				}
			}
		
			fecScheduleBRecord_C.setStreet1(csvScheduleBRecord.getStreet1_C().replace(csvScheduleBRecord.getStreet2_C(), ""));
			fecScheduleBRecord_C.setStreet2(csvScheduleBRecord.getStreet2_C());
			fecScheduleBRecord_C.setCity(csvScheduleBRecord.getCity_C());
			fecScheduleBRecord_C.setState(csvScheduleBRecord.getState_C());
			fecScheduleBRecord_C.setZip(csvScheduleBRecord.getZip_C());
			
			if(!StringUtils.isBlank(csvScheduleBRecord.getDateOfDisbursement_C())){
				try{
					fecScheduleBRecord_C.setDateOfDisbursement(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleBRecord.getDateOfDisbursement_C())));
				}
				catch (ParseException e){
					fecScheduleBRecord_C.setDateOfDisbursement(csvScheduleBRecord.getDateOfDisbursement_C());
				}
			}
			
			fecScheduleBRecord_C.setDateOfDisbursement(csvScheduleBRecord.getDateOfDisbursement_C());
			fecScheduleBRecord_C.setPurposeOfDisbursement(csvScheduleBRecord.getPurposeOfDisbursement_C());
			fecScheduleBRecord_C.setBeneficiaryCommitteeName(csvScheduleBRecord.getBeneficiaryCommitteeName_C());
			fecScheduleBRecord_C.setCanLastName(csvScheduleBRecord.getCanLastName_C());
			fecScheduleBRecord_C.setCanFirstName(csvScheduleBRecord.getCanFirstName_C());
			fecScheduleBRecord_C.setCanMiddleName(csvScheduleBRecord.getCanMiddleName_C());
			fecScheduleBRecord_C.setCanPrefix(csvScheduleBRecord.getCanPrefix_C());
			fecScheduleBRecord_C.setCanSuffix(csvScheduleBRecord.getCanSuffix_C());
			fecScheduleBRecord_C.setCategoryCode(csvScheduleBRecord.getCategoryCode_C());
			fecScheduleBRecord_C.setCanOffice(csvScheduleBRecord.getCanOffice_C());
			fecScheduleBRecord_C.setCanState(csvScheduleBRecord.getCanState_C());
			fecScheduleBRecord_C.setCanDist(csvScheduleBRecord.getCanDist_C());
			
			for(ItemElectConstant iec : ItemElectConstant.values()){
				if (StringUtils.containsIgnoreCase(
						csvScheduleBRecord.getItemElectCode_C(),
						iec.getDescription())) {
					fecScheduleBRecord_C.setItemElectCode(iec.getCode());
					if(iec.getCode().equals(ItemElectConstant.OTHER.getCode())){
						fecScheduleBRecord_C.setItemElectOther(csvScheduleBRecord.getItemElectOther_C());
					}else{
						fecScheduleBRecord_C.setItemElectOther(csvScheduleBRecord.getItemElectYear_C());
					}
					break;
				}
			}
			
			fecScheduleBRecord_C.setAmountOfDisbursement(csvScheduleBRecord.getAmountOfDisbursement_C());
			fecScheduleBRecord_C.setMemoTextDescription(csvScheduleBRecord.getMemoTextDescription_C());
			
			Pattern pattern = Pattern.compile("\\_(.*?)\\-");
			Matcher match = pattern.matcher(csvScheduleBRecord.getName());
			if (match.find()) {
				fecScheduleBRecord_C.setImageNumber(match.group(1));
			}
			
			return fecScheduleBRecord_C;
	}
}
