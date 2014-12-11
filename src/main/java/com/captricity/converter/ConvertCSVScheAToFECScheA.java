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

import com.captricity.bean.CSVScheduleARecord;
import com.captricity.bean.FECScheduleARecord;
import com.captricity.constant.FECFileConstant;
import com.captricity.constant.IdentifyNameConstant;
import com.captricity.constant.ItemElectConstant;
import com.captricity.utils.FECConverterUtil;

public class ConvertCSVScheAToFECScheA {
	
	private static final FastDateFormat FEC_DATE_RECEIVED = FastDateFormat.getInstance("yyyyMMdd");
	private static final FastDateFormat CSV_DATE_RECEIVED = FastDateFormat.getInstance("MMddyyyy");
	
	public static final  String[] columns = new String[] {"name",
		"formType",
		"contributorLateName_A",
		"contribOrganizationName_A",
		"contributorSuffix_A",
		"contributorFirstName_A",
		"contributorMiddleName_A",
		"contributorPrefix_A",
		"personOrOrganization_A",
		"street2_A",
		"street1_A",
		"streetFull_A",
		"dateReceived_A",
		"city_A",
		"state_A",
		"zip_A",
		"fecCommitteeIdNumber_A",
		"amountReceived_A",
		"indEmployer_A",
		"indOccupation_A",
		"itemElectYear_A",
		"itemElectCode_A",
		"aggregateYTD_A",
		"memoDescription_A",
		"itemElectOther_A",
		"contributorMiddleName_B",
		"contribOrganizationName_B",
		"contributorFirstName_B",
		"contributorPrefix_B",
		"contributorLastName_B",
		"personOrOrganization_B",
		"contributorSuffix_B",
		"streetFull_B",
		"street2_B",
		"street1_B",
		"dateReceived_B",
		"city_B",
		"state_B",
		"zip_B",
		"fecCommitteeIdNumber_B",
		"amountReceived_B",
		"indEmployer_B",
		"indOccupation_B",
		"itemElectYear_B",
		"itemElectCode_B",
		"aggregateYTD_B",
		"memoDescription_B",
		"itemElectOther_B",
		"contributorMiddleName_C",
		"contributorFirstName_C",
		"contributorLastName_C",
		"contribOrganizationName_C",
		"contributorPrefix_C",
		"contributorSuffix_C",
		"personOrOrganization_C",
		"street1_C",
		"streetFull_C",
		"street2_C",
		"dateReceived_C",
		"city_C",
		"state_C",
		"zip_C",
		"fecCommitteeIdNumber_C",
		"indEmployer_C",
		"indOccupation_C",
		"amountReceived_C",
		"itemElectYear_C",
		"itemElectCode_C",
		"aggregateYTD_C",
		"memoDescription_C",
		"itemElectOther_C",
		"subtotal",
		"total"};
	
	public static List<FECScheduleARecord> convertCSVScheAToFECScheA(String fileName){
		
		List<CSVScheduleARecord> listCSVScheARecord = new ArrayList<CSVScheduleARecord>();
		
		try {
			
			 CSVReader reader = new CSVReader(new FileReader(fileName), ',', '\"', 1);
			 ColumnPositionMappingStrategy<CSVScheduleARecord> mappingStrategy = new ColumnPositionMappingStrategy<CSVScheduleARecord>();
			 mappingStrategy.setType(CSVScheduleARecord.class);
			
		     mappingStrategy.setColumnMapping(columns);
		     
		     CsvToBean<CSVScheduleARecord> csv = new CsvToBean<CSVScheduleARecord>();
		     listCSVScheARecord = csv.parse(mappingStrategy, reader);

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return convertCSVScheduleAToFECScheduleA(listCSVScheARecord);
	}
	
	private static List<FECScheduleARecord> convertCSVScheduleAToFECScheduleA(List<CSVScheduleARecord> listCSVScheARecord) {
		
		List<FECScheduleARecord> listFECScheARecord = new ArrayList<FECScheduleARecord>();
		
		for(CSVScheduleARecord csvScheduleARecord : listCSVScheARecord){
			
			FECScheduleARecord fecScheduleARecord_A = getFECScheduleARecord_A(csvScheduleARecord);
			listFECScheARecord.add(fecScheduleARecord_A);
			
			FECScheduleARecord fecScheduleARecord_B = getFECScheduleARecord_B(csvScheduleARecord);
			
			listFECScheARecord.add(fecScheduleARecord_B);
			
			FECScheduleARecord fecScheduleARecord_C = getFECScheduleARecord_C(csvScheduleARecord);
			
			listFECScheARecord.add(fecScheduleARecord_C);
		}
		
		return listFECScheARecord;
		
	}

	private static FECScheduleARecord getFECScheduleARecord_A(
			CSVScheduleARecord csvScheduleARecord) {
		
		FECScheduleARecord fecScheduleARecord_A = new FECScheduleARecord();
		
		fecScheduleARecord_A.setFormType(FECFileConstant.SCHEDULE_A_PREFIX + csvScheduleARecord.getFormType());
		
		fecScheduleARecord_A.setFilerFECCommitteeId("C00091892");//TODO: get the value from summary page
		
		if(!StringUtils.isBlank(csvScheduleARecord.getPersonOrOrganization_A())){
			if (csvScheduleARecord.getPersonOrOrganization_A().equals(
					IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
				fecScheduleARecord_A.setContribOrganizationName(csvScheduleARecord.getContribOrganizationName_A());
			}else{
				
				String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleARecord.getContribOrganizationName_A());
				
				fecScheduleARecord_A.setContributorPrefix(splitedFullName[0]);
				fecScheduleARecord_A.setContributorFirstName(splitedFullName[1]);
				fecScheduleARecord_A.setContributorMiddleName(splitedFullName[2]);
				fecScheduleARecord_A.setContributorLastName(splitedFullName[3]);
				fecScheduleARecord_A.setContributorSuffix(splitedFullName[4]);
			}
		}
		
		fecScheduleARecord_A.setStreet1(csvScheduleARecord.getStreet1_A().replace(csvScheduleARecord.getStreet2_A(), ""));
		fecScheduleARecord_A.setStreet2(csvScheduleARecord.getStreet2_A());
		fecScheduleARecord_A.setCity(csvScheduleARecord.getCity_A());
		fecScheduleARecord_A.setState(csvScheduleARecord.getState_A());
		fecScheduleARecord_A.setZip(csvScheduleARecord.getZip_A());

		if(!StringUtils.isBlank(csvScheduleARecord.getDateReceived_A())){
			try {
				fecScheduleARecord_A.setDateReceived(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleARecord.getDateReceived_A())));
			} catch (ParseException e) {
				fecScheduleARecord_A.setDateReceived(csvScheduleARecord.getDateReceived_A());
			}
		}
		
		fecScheduleARecord_A.setFecCommitteeIdNumber(csvScheduleARecord.getFecCommitteeIdNumber_A());
		fecScheduleARecord_A.setIndEmployer(csvScheduleARecord.getIndEmployer_A());
		fecScheduleARecord_A.setIndOccupation(csvScheduleARecord.getIndOccupation_A());
		
		for(ItemElectConstant iec : ItemElectConstant.values()){
			if (StringUtils.containsIgnoreCase(
					csvScheduleARecord.getItemElectCode_A(),
					iec.getDescription())) {
				fecScheduleARecord_A.setItemElectCode(iec.getCode());
				if(iec.getCode().equals(ItemElectConstant.OTHER.getCode())){
					fecScheduleARecord_A.setItemElectOther(csvScheduleARecord.getItemElectOther_A());
				}else{
					fecScheduleARecord_A.setItemElectOther(csvScheduleARecord.getItemElectYear_A());
				}
				break;
			}
		}
		
		fecScheduleARecord_A.setAggregateYTD(csvScheduleARecord.getAggregateYTD_A());
		fecScheduleARecord_A.setAmountReceived(csvScheduleARecord.getAmountReceived_A());
		fecScheduleARecord_A.setMemoDescription(csvScheduleARecord.getMemoDescription_A());
		
		Pattern pattern = Pattern.compile("\\_(.*?)\\-");
		Matcher match = pattern.matcher(csvScheduleARecord.getName());
		if (match.find()) {
			fecScheduleARecord_A.setImageNumber(match.group(1));
		}
		
		return fecScheduleARecord_A;
	}
	
	private static FECScheduleARecord getFECScheduleARecord_B(
			CSVScheduleARecord csvScheduleARecord) {
		
		FECScheduleARecord fecScheduleARecord_B = new FECScheduleARecord();
		
		fecScheduleARecord_B.setFormType(FECFileConstant.SCHEDULE_A_PREFIX + csvScheduleARecord.getFormType());
		fecScheduleARecord_B.setFilerFECCommitteeId("C00091892");//TODO: get the value from summary page
		
		if(!StringUtils.isBlank(csvScheduleARecord.getPersonOrOrganization_B())){
			if (csvScheduleARecord.getPersonOrOrganization_B().equals(
					IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
				fecScheduleARecord_B.setContribOrganizationName(csvScheduleARecord.getContribOrganizationName_B());
			}else{
				
				String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleARecord.getContribOrganizationName_B());
				
				fecScheduleARecord_B.setContributorPrefix(splitedFullName[0]);
				fecScheduleARecord_B.setContributorFirstName(splitedFullName[1]);
				fecScheduleARecord_B.setContributorMiddleName(splitedFullName[2]);
				fecScheduleARecord_B.setContributorLastName(splitedFullName[3]);
				fecScheduleARecord_B.setContributorSuffix(splitedFullName[4]);
			}
		}
		fecScheduleARecord_B.setStreet1(csvScheduleARecord.getStreet1_B().replace(csvScheduleARecord.getStreet2_B(), ""));
		fecScheduleARecord_B.setStreet2(csvScheduleARecord.getStreet2_B());
		fecScheduleARecord_B.setCity(csvScheduleARecord.getCity_B());
		fecScheduleARecord_B.setState(csvScheduleARecord.getState_B());
		fecScheduleARecord_B.setZip(csvScheduleARecord.getZip_B());

		if(!StringUtils.isBlank(csvScheduleARecord.getDateReceived_B())){
			try {
				fecScheduleARecord_B.setDateReceived(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleARecord.getDateReceived_B())));
			} catch (ParseException e) {
				fecScheduleARecord_B.setDateReceived(csvScheduleARecord.getDateReceived_B());
			}
		}
		
		fecScheduleARecord_B.setFecCommitteeIdNumber(csvScheduleARecord.getFecCommitteeIdNumber_B());
		fecScheduleARecord_B.setIndEmployer(csvScheduleARecord.getIndEmployer_B());
		fecScheduleARecord_B.setIndOccupation(csvScheduleARecord.getIndOccupation_B());
		
		for(ItemElectConstant iec : ItemElectConstant.values()){
			if (StringUtils.containsIgnoreCase(
					csvScheduleARecord.getItemElectCode_B(),
					iec.getDescription())) {
				fecScheduleARecord_B.setItemElectCode(iec.getCode());
				if(iec.getCode().equals(ItemElectConstant.OTHER.getCode())){
					fecScheduleARecord_B.setItemElectOther(csvScheduleARecord.getItemElectOther_B());
				}else{
					fecScheduleARecord_B.setItemElectOther(csvScheduleARecord.getItemElectYear_B());
				}
				break;
			}
		}
		
		fecScheduleARecord_B.setAggregateYTD(csvScheduleARecord.getAggregateYTD_B());
		fecScheduleARecord_B.setAmountReceived(csvScheduleARecord.getAmountReceived_B());
		fecScheduleARecord_B.setMemoDescription(csvScheduleARecord.getMemoDescription_B());
		
		Pattern pattern = Pattern.compile("\\_(.*?)\\-");
		Matcher match = pattern.matcher(csvScheduleARecord.getName());
		if (match.find()) {
			fecScheduleARecord_B.setImageNumber(match.group(1));
		}
		return fecScheduleARecord_B;
	}
	
	private static FECScheduleARecord getFECScheduleARecord_C(
			CSVScheduleARecord csvScheduleARecord) {
		
		FECScheduleARecord fecScheduleARecord_C = new FECScheduleARecord();
		
		fecScheduleARecord_C.setFormType(FECFileConstant.SCHEDULE_A_PREFIX + csvScheduleARecord.getFormType());
		fecScheduleARecord_C.setFilerFECCommitteeId("C00091892");//TODO: get the value from summary page
		
		if(!StringUtils.isBlank(csvScheduleARecord.getPersonOrOrganization_C())){
			if (csvScheduleARecord.getPersonOrOrganization_C().equals(
					IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
				fecScheduleARecord_C.setContribOrganizationName(csvScheduleARecord.getContribOrganizationName_C());
			}else{
				
				String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleARecord.getContribOrganizationName_C());
				
				fecScheduleARecord_C.setContributorPrefix(splitedFullName[0]);
				fecScheduleARecord_C.setContributorFirstName(splitedFullName[1]);
				fecScheduleARecord_C.setContributorMiddleName(splitedFullName[2]);
				fecScheduleARecord_C.setContributorLastName(splitedFullName[3]);
				fecScheduleARecord_C.setContributorSuffix(splitedFullName[4]);
	
			}
		}
		
		fecScheduleARecord_C.setStreet1(csvScheduleARecord.getStreet1_C().replace(csvScheduleARecord.getStreet2_C(), ""));
		fecScheduleARecord_C.setStreet2(csvScheduleARecord.getStreet2_C());
		fecScheduleARecord_C.setCity(csvScheduleARecord.getCity_C());
		fecScheduleARecord_C.setState(csvScheduleARecord.getState_C());
		fecScheduleARecord_C.setZip(csvScheduleARecord.getZip_C());

		if(!StringUtils.isBlank(csvScheduleARecord.getDateReceived_C())){
			try {
				fecScheduleARecord_C.setDateReceived(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleARecord.getDateReceived_C())));
			} catch (ParseException e) {
				fecScheduleARecord_C.setDateReceived(csvScheduleARecord.getDateReceived_C());
			}
		}

		fecScheduleARecord_C.setFecCommitteeIdNumber(csvScheduleARecord.getFecCommitteeIdNumber_C());
		fecScheduleARecord_C.setIndEmployer(csvScheduleARecord.getIndEmployer_C());
		fecScheduleARecord_C.setIndOccupation(csvScheduleARecord.getIndOccupation_C());
		
		for(ItemElectConstant iec : ItemElectConstant.values()){
			if (StringUtils.containsIgnoreCase(
					csvScheduleARecord.getItemElectCode_C(),
					iec.getDescription())) {
				fecScheduleARecord_C.setItemElectCode(iec.getCode());
				if(iec.getCode().equals(ItemElectConstant.OTHER.getCode())){
					fecScheduleARecord_C.setItemElectOther(csvScheduleARecord.getItemElectOther_C());
				}else{
					fecScheduleARecord_C.setItemElectOther(csvScheduleARecord.getItemElectYear_C());
				}
				break;
			}
		}		
		
		fecScheduleARecord_C.setAggregateYTD(csvScheduleARecord.getAggregateYTD_C());
		fecScheduleARecord_C.setAmountReceived(csvScheduleARecord.getAmountReceived_C());
		fecScheduleARecord_C.setMemoDescription(csvScheduleARecord.getMemoDescription_C());
		
		Pattern pattern = Pattern.compile("\\_(.*?)\\-");
		Matcher match = pattern.matcher(csvScheduleARecord.getName());
		if (match.find()) {
			fecScheduleARecord_C.setImageNumber(match.group(1));
		}
		return fecScheduleARecord_C;
	}
}
