package com.captricity.converter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import com.blackbear.flatworm.errors.FlatwormConfigurationValueException;
import com.blackbear.flatworm.errors.FlatwormConversionException;
import com.blackbear.flatworm.errors.FlatwormCreatorException;
import com.blackbear.flatworm.errors.FlatwormInputLineLengthException;
import com.blackbear.flatworm.errors.FlatwormInvalidRecordException;
import com.blackbear.flatworm.errors.FlatwormUnsetFieldValueException;
import com.captricity.bean.CSVScheduleARecord;
import com.captricity.bean.FECScheduleARecord;
import com.captricity.constant.FECFileConstant;
import com.captricity.constant.IdentifyNameConstant;
import com.captricity.constant.ItemElectConstant;
import com.captricity.utils.FECConverterUtil;

public class ConvertCSVScheAToFECScheA {
	
	private static final FastDateFormat FEC_DATE_RECEIVED = FastDateFormat.getInstance("yyyyMMdd");
	private static final FastDateFormat CSV_DATE_RECEIVED = FastDateFormat.getInstance("MMddyyyy");
	
	public static List<FECScheduleARecord> convertCSVScheAToFECScheA(String fileName){
		
		List<CSVScheduleARecord> listCSVScheARecord = new ArrayList<CSVScheduleARecord>();
		
		ConfigurationReader parser = new ConfigurationReader();
		try {
			FileFormat ff = parser.loadConfigurationFile("CSVScheduleADescriptor.xml");
			InputStream in = new FileInputStream(fileName);
			BufferedReader bufIn = new BufferedReader(new InputStreamReader(in));
			MatchedRecord results;
				while ((results = ff.getNextRecord(bufIn)) != null) {
					if (results.getRecordName().equals("FH")) {
						continue;
					}else{
						CSVScheduleARecord csvScheABody = (CSVScheduleARecord) results.getBean("BODY");
						listCSVScheARecord.add(csvScheABody);
					}
				}

		}catch (FlatwormCreatorException flatwormCreatorException) {
			flatwormCreatorException.printStackTrace();
		} catch (FlatwormUnsetFieldValueException flatwormUnsetFieldValueError) {
			flatwormUnsetFieldValueError.printStackTrace();
		} catch (FlatwormConfigurationValueException flatwormConfigurationValueError) {
			flatwormConfigurationValueError.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (FlatwormInvalidRecordException e) {
			e.printStackTrace();
		} catch (FlatwormInputLineLengthException e) {
			e.printStackTrace();
		} catch (FlatwormConversionException e) {
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
		
		if (csvScheduleARecord.getPersonOrOrganization_A().equals(
				IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
			fecScheduleARecord_A.setContribOrganizationName(csvScheduleARecord.getContribOrganizationName_A());
		}else{
			
			//TODO: Handle Other prefix, suffix
			String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleARecord.getContribOrganizationName_A());
			
			fecScheduleARecord_A.setContributorPrefix(splitedFullName[0]);
			fecScheduleARecord_A.setContributorFirstName(splitedFullName[1]);
			fecScheduleARecord_A.setContributorMiddleName(splitedFullName[2]);
			fecScheduleARecord_A.setContributorLastName(splitedFullName[3]);
			fecScheduleARecord_A.setContributorSuffix(splitedFullName[4]);
		}
		
		fecScheduleARecord_A.setStreet1(csvScheduleARecord.getStreet1_A());
		fecScheduleARecord_A.setStreet2(csvScheduleARecord.getStreet2_A().replace(csvScheduleARecord.getStreet1_A(), ""));
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
					//TODO: Need to replace with Receipt For text
					fecScheduleARecord_A.setItemElectOther("2014");
				}
				break;
			}
		}
		
		fecScheduleARecord_A.setAggregateYTD(csvScheduleARecord.getAggregateYTD_A());
		fecScheduleARecord_A.setAmountReceived(csvScheduleARecord.getAmountReceived_A());
		fecScheduleARecord_A.setMemoDescription(csvScheduleARecord.getMemoDescription_A());
		
		fecScheduleARecord_A.setImageNumber("14020412802");
		return fecScheduleARecord_A;
	}
	
	private static FECScheduleARecord getFECScheduleARecord_B(
			CSVScheduleARecord csvScheduleARecord) {
		
		FECScheduleARecord fecScheduleARecord_B = new FECScheduleARecord();
		
		fecScheduleARecord_B.setFormType(FECFileConstant.SCHEDULE_A_PREFIX + csvScheduleARecord.getFormType());
		fecScheduleARecord_B.setFilerFECCommitteeId("C00091892");//TODO: get the value from summary page
		
		if (csvScheduleARecord.getPersonOrOrganization_B().equals(
				IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
			fecScheduleARecord_B.setContribOrganizationName(csvScheduleARecord.getContribOrganizationName_B());
		}else{
			
			//TODO: Handle Other prefix, suffix
			String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleARecord.getContribOrganizationName_B());
			
			fecScheduleARecord_B.setContributorPrefix(splitedFullName[0]);
			fecScheduleARecord_B.setContributorFirstName(splitedFullName[1]);
			fecScheduleARecord_B.setContributorMiddleName(splitedFullName[2]);
			fecScheduleARecord_B.setContributorLastName(splitedFullName[3]);
			fecScheduleARecord_B.setContributorSuffix(splitedFullName[4]);
		}
		
		fecScheduleARecord_B.setStreet1(csvScheduleARecord.getStreet1_B());
		fecScheduleARecord_B.setStreet2(csvScheduleARecord.getStreet2_B().replace(csvScheduleARecord.getStreet1_B(), ""));
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
					//TODO: Need to replace with Receipt For text
					fecScheduleARecord_B.setItemElectOther("2014");
				}
				break;
			}
		}
		
		fecScheduleARecord_B.setAggregateYTD(csvScheduleARecord.getAggregateYTD_B());
		fecScheduleARecord_B.setAmountReceived(csvScheduleARecord.getAmountReceived_B());
		fecScheduleARecord_B.setMemoDescription(csvScheduleARecord.getMemoDescription_B());
		
		fecScheduleARecord_B.setImageNumber("14020412802");
		return fecScheduleARecord_B;
	}
	
	private static FECScheduleARecord getFECScheduleARecord_C(
			CSVScheduleARecord csvScheduleARecord) {
		
		FECScheduleARecord fecScheduleARecord_C = new FECScheduleARecord();
		
		fecScheduleARecord_C.setFormType(FECFileConstant.SCHEDULE_A_PREFIX + csvScheduleARecord.getFormType());
		fecScheduleARecord_C.setFilerFECCommitteeId("C00091892");//TODO: get the value from summary page
		
		if (csvScheduleARecord.getPersonOrOrganization_C().equals(
				IdentifyNameConstant.ORGANIZATION.getIdentfyDetail())){
			fecScheduleARecord_C.setContribOrganizationName(csvScheduleARecord.getContribOrganizationName_C());
		}else{
			
			//TODO: Handle Other prefix, suffix
			String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleARecord.getContribOrganizationName_C());
			
			fecScheduleARecord_C.setContributorPrefix(splitedFullName[0]);
			fecScheduleARecord_C.setContributorFirstName(splitedFullName[1]);
			fecScheduleARecord_C.setContributorMiddleName(splitedFullName[2]);
			fecScheduleARecord_C.setContributorLastName(splitedFullName[3]);
			fecScheduleARecord_C.setContributorSuffix(splitedFullName[4]);

		}
		
		fecScheduleARecord_C.setStreet1(csvScheduleARecord.getStreet1_C());
		fecScheduleARecord_C.setStreet2(csvScheduleARecord.getStreet2_C().replace(csvScheduleARecord.getStreet1_C(), ""));
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
					//TODO: Need to replace with Receipt For text
					fecScheduleARecord_C.setItemElectOther("2014");
				}
				break;
			}
		}		
		
		fecScheduleARecord_C.setAggregateYTD(csvScheduleARecord.getAggregateYTD_C());
		fecScheduleARecord_C.setAmountReceived(csvScheduleARecord.getAmountReceived_C());
		fecScheduleARecord_C.setMemoDescription(csvScheduleARecord.getMemoDescription_C());
		
		fecScheduleARecord_C.setImageNumber("14020412802");
		return fecScheduleARecord_C;
	}
}
