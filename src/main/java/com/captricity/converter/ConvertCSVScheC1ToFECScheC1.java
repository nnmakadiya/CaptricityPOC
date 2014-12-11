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

import com.captricity.bean.CSVScheduleC1Record;
import com.captricity.bean.FECScheduleC1Record;
import com.captricity.constant.FECFileConstant;
import com.captricity.utils.FECConverterUtil;

public class ConvertCSVScheC1ToFECScheC1 {
	
	public static final String columns[] = new String[] {"name",
		"formType",
		"fecCommitteeId",
		"nameLender",
		"amtOfLoan",
		"loanInterestRatePercent",
		"street1",
		"streetFull",
		"street2",
		"dateIncurred",
		"city",
		"state",
		"zip",
		"dateDue",
		"yesNo_A",
		"dateOfOriginalLoan_A",
		"creditAmountThisDraw_B",
		"totalBalance_B",
		"yesNo_C",
		"collateralValueAmount_D",
		"yesNoCollateral_D",
		"description_D",
		"yesNoPerfectedInterest_D",
		"description_E",
		"yesNo_E",
		"estimatedValue_E",
		"accountName_E",
		"street1_E",
		"streetFull_E",
		"street2_E",
		"date_E",
		"state_E",
		"city_E",
		"zip_E",
		"description_F",
		"treasPrefix_G",
		"treasSuffix_G",
		"treasLastName_G",
		"treasMiddleName_G",
		"treasFirstName_G",
		"tresFullName_G",
		"treasDate_G",
		"authMiddleName",
		"authFullName",
		"authLastName",
		"authPrefix",
		"authFirstName",
		"authSuffix",
		"authTitle",
		"authDate"};
	
	private static final FastDateFormat FEC_DATE_RECEIVED = FastDateFormat.getInstance("yyyyMMdd");
	private static final FastDateFormat CSV_DATE_RECEIVED = FastDateFormat.getInstance("MMddyyyy");
	
	public static List<FECScheduleC1Record> convertCSVScheC1ToFECScheC1(String fileName){
		
		List<CSVScheduleC1Record> listCSVScheC1Record = new ArrayList<CSVScheduleC1Record>();
		
		try {
			CSVReader reader = new CSVReader(new FileReader(fileName), ',', '\"', 1);
			ColumnPositionMappingStrategy<CSVScheduleC1Record> mappingStrategy = new ColumnPositionMappingStrategy<CSVScheduleC1Record>();
			mappingStrategy.setType(CSVScheduleC1Record.class);
			mappingStrategy.setColumnMapping(columns);
			CsvToBean<CSVScheduleC1Record> csv = new CsvToBean<CSVScheduleC1Record>();
			listCSVScheC1Record = csv.parse(mappingStrategy, reader);
		}catch (Exception e) {
			e.printStackTrace();
		} 
		
		return convertCSVScheduleC1ToFECScheduleC1(listCSVScheC1Record);
	}
	
	private static List<FECScheduleC1Record> convertCSVScheduleC1ToFECScheduleC1(List<CSVScheduleC1Record> listCSVScheC1Record) {
		
		List<FECScheduleC1Record> listFECScheC1Record = new ArrayList<FECScheduleC1Record>();
		
		for(CSVScheduleC1Record csvScheduleC1Record : listCSVScheC1Record){
			
			FECScheduleC1Record fecScheduleC1Record = getFECScheduleC1Record(csvScheduleC1Record);
			listFECScheC1Record.add(fecScheduleC1Record);
				
		}
		return listFECScheC1Record;		
	}

	private static FECScheduleC1Record getFECScheduleC1Record(CSVScheduleC1Record csvScheduleC1Record) {
			
			FECScheduleC1Record fecScheduleC1Record = new FECScheduleC1Record();
			
			fecScheduleC1Record.setFormType(FECFileConstant.SCHEDULE_C1_PREFIX);
			fecScheduleC1Record.setFecCommitteeId(csvScheduleC1Record.getFecCommitteeId());
			
			fecScheduleC1Record.setNameLender(csvScheduleC1Record.getNameLender());
			fecScheduleC1Record.setStreet1(csvScheduleC1Record.getStreet1().replace(csvScheduleC1Record.getStreet2(), ""));
			fecScheduleC1Record.setStreet2(csvScheduleC1Record.getStreet2());
			fecScheduleC1Record.setCity(csvScheduleC1Record.getCity());
			fecScheduleC1Record.setState(csvScheduleC1Record.getState());
			fecScheduleC1Record.setZip(csvScheduleC1Record.getZip());
			fecScheduleC1Record.setAmtOfLoan(csvScheduleC1Record.getAmtOfLoan());
			fecScheduleC1Record.setLoanInterestRatePercent(csvScheduleC1Record.getLoanInterestRatePercent());
			if(!StringUtils.isBlank(csvScheduleC1Record.getDateIncurred())){
				try{
					fecScheduleC1Record.setDateIncurred(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleC1Record.getDateIncurred())));
				}
				catch (ParseException e){
					fecScheduleC1Record.setDateIncurred(csvScheduleC1Record.getDateIncurred());
				}
			}
			fecScheduleC1Record.setDateDue(csvScheduleC1Record.getDateDue());
			
			for(FECFileConstant.YesNoConstant fecYesNoConstant : FECFileConstant.YesNoConstant.values()){
				if(StringUtils.equalsIgnoreCase(fecYesNoConstant.getDescription(), csvScheduleC1Record.getYesNo_A())){
					fecScheduleC1Record.setYesNo_A(fecYesNoConstant.getCode());
					break;
				}
			}
			if(!StringUtils.isBlank(csvScheduleC1Record.getDateOfOriginalLoan_A()) 
					&& StringUtils.equals(FECFileConstant.YesNoConstant.YES.getCode(), fecScheduleC1Record.getYesNo_A())){
				try{
					fecScheduleC1Record.setDateOfOriginalLoan_A(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleC1Record.getDateOfOriginalLoan_A())));
				}
				catch (ParseException e){
					fecScheduleC1Record.setDateOfOriginalLoan_A(csvScheduleC1Record.getDateOfOriginalLoan_A());
				}
			}
			
			fecScheduleC1Record.setCreditAmountThisDraw_B(csvScheduleC1Record.getCreditAmountThisDraw_B());
			fecScheduleC1Record.setTotalBalance_B(csvScheduleC1Record.getTotalBalance_B());
			
			for(FECFileConstant.YesNoConstant fecYesNoConstant : FECFileConstant.YesNoConstant.values()){
				if(StringUtils.equalsIgnoreCase(fecYesNoConstant.getDescription(), csvScheduleC1Record.getYesNo_C())){
					fecScheduleC1Record.setYesNo_C(fecYesNoConstant.getCode());
					break;
				}
			}

			
			for(FECFileConstant.YesNoConstant fecYesNoConstant : FECFileConstant.YesNoConstant.values()){
				if(StringUtils.equalsIgnoreCase(fecYesNoConstant.getDescription(), csvScheduleC1Record.getYesNoCollateral_D())){
					fecScheduleC1Record.setYesNoCollateral_D(fecYesNoConstant.getCode());
					break;
				}
			}
			if(StringUtils.equals(FECFileConstant.YesNoConstant.YES.getCode(),fecScheduleC1Record.getYesNoCollateral_D())){
				fecScheduleC1Record.setDescription_D(csvScheduleC1Record.getDescription_D());	
			}
			fecScheduleC1Record.setCollateralValueAmount_D(csvScheduleC1Record.getCollateralValueAmount_D());
			for(FECFileConstant.YesNoConstant fecYesNoConstant : FECFileConstant.YesNoConstant.values()){
				if(StringUtils.equalsIgnoreCase(fecYesNoConstant.getDescription(), csvScheduleC1Record.getYesNoPerfectedInterest_D())){
					fecScheduleC1Record.setYesNoPerfectedInterest_D(fecYesNoConstant.getCode());
					break;
				}
			}

			
			for(FECFileConstant.YesNoConstant fecYesNoConstant : FECFileConstant.YesNoConstant.values()){
				if(StringUtils.equalsIgnoreCase(fecYesNoConstant.getDescription(), csvScheduleC1Record.getYesNo_E())){
					fecScheduleC1Record.setYesNo_E(fecYesNoConstant.getCode());
					break;
				}
			}
			if(StringUtils.equals(FECFileConstant.YesNoConstant.YES.getCode(),fecScheduleC1Record.getYesNo_E())){
				fecScheduleC1Record.setDescription_E(csvScheduleC1Record.getDescription_E());	
			}
			fecScheduleC1Record.setEstimatedValue_E(csvScheduleC1Record.getEstimatedValue_E());
			if(!StringUtils.isBlank(csvScheduleC1Record.getDate_E())){
				try{
					fecScheduleC1Record.setDate_E(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleC1Record.getDate_E())));
				}
				catch (ParseException e){
					fecScheduleC1Record.setDate_E(csvScheduleC1Record.getDate_E());
				}
			}
			fecScheduleC1Record.setAccountName_E(csvScheduleC1Record.getAccountName_E());
			fecScheduleC1Record.setStreet1_E(csvScheduleC1Record.getStreet1_E().replace(csvScheduleC1Record.getStreet2_E(), ""));
			fecScheduleC1Record.setStreet2_E(csvScheduleC1Record.getStreet2_E());
			fecScheduleC1Record.setCity_E(csvScheduleC1Record.getCity_E());
			fecScheduleC1Record.setState_E(csvScheduleC1Record.getState_E());
			fecScheduleC1Record.setZip_E(csvScheduleC1Record.getZip_E());
			
			fecScheduleC1Record.setDescription_F(csvScheduleC1Record.getDescription_F());
			
			if(!StringUtils.isBlank(csvScheduleC1Record.getTresFullName_G())){
				String splitedFullName[] = 	FECConverterUtil.splitFullName(csvScheduleC1Record.getTresFullName_G());
				fecScheduleC1Record.setTreasPrefix_G(splitedFullName[0]);
				fecScheduleC1Record.setTreasFirstName_G(splitedFullName[1]);
				fecScheduleC1Record.setTreasMiddleName_G(splitedFullName[2]);
				fecScheduleC1Record.setTreasLastName_G(splitedFullName[3]);
				fecScheduleC1Record.setTreasSuffix_G(splitedFullName[4]);
			}
			if(!StringUtils.isBlank(csvScheduleC1Record.getTreasDate_G())){
				try{
					fecScheduleC1Record.setTreasDate_G(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleC1Record.getTreasDate_G())));
				}
				catch (ParseException e){
					fecScheduleC1Record.setTreasDate_G(csvScheduleC1Record.getTreasDate_G());
				}
			}
			
			if(!StringUtils.isBlank(csvScheduleC1Record.getAuthFullName())){
				String splitedFullName[] = FECConverterUtil.splitFullName(csvScheduleC1Record.getAuthFullName());
				fecScheduleC1Record.setAuthPrefix(splitedFullName[0]);
				fecScheduleC1Record.setAuthFirstName(splitedFullName[1]);
				fecScheduleC1Record.setAuthMiddleName(splitedFullName[2]);
				fecScheduleC1Record.setAuthLastName(splitedFullName[3]);
				fecScheduleC1Record.setAuthSuffix(splitedFullName[4]);
			}
			fecScheduleC1Record.setAuthTitle(csvScheduleC1Record.getAuthTitle());
			if(!StringUtils.isBlank(csvScheduleC1Record.getAuthDate())){
				try{
					fecScheduleC1Record.setAuthDate(FEC_DATE_RECEIVED.format(CSV_DATE_RECEIVED.parse(csvScheduleC1Record.getAuthDate())));
				}
				catch (ParseException e){
					fecScheduleC1Record.setAuthDate(csvScheduleC1Record.getAuthDate());
				}
			}
			
			Pattern pattern = Pattern.compile("\\_(.*?)\\-");
			Matcher match = pattern.matcher(csvScheduleC1Record.getName());
			if (match.find()) {
				fecScheduleC1Record.setImageNumber(match.group(1));
			}

			return fecScheduleC1Record;	
	}
}
