package com.captricity.mainfiles;

import java.util.List;

import com.blackbear.flatworm.FileCreator;
import com.captricity.bean.FECScheduleARecord;
import com.captricity.bean.FECScheduleBRecord;
import com.captricity.bean.FECScheduleC1Record;
import com.captricity.bean.FECScheduleC2Record;
import com.captricity.bean.FECScheduleCRecord;
import com.captricity.bean.FECScheduleDRecord;
import com.captricity.bean.FECSummaryRecord;
import com.captricity.converter.ConvertCSVScheAToFECScheA;
import com.captricity.converter.ConvertCSVScheBToFECScheB;
import com.captricity.converter.ConvertCSVScheC1ToFECScheC1;
import com.captricity.converter.ConvertCSVScheCToFECScheC;
import com.captricity.converter.ConvertCSVScheCToFECScheC2;
import com.captricity.converter.ConvertCSVScheDToFECScheD;
import com.captricity.converter.ConvertCSVSummaryToFECSummary;

public class CSVToFECFileMaker {
	
	public static void main(String[] args) {
		try{
			

			//Pass summary page Captricity csv file
			List<FECSummaryRecord> listFECSummaryRecords = ConvertCSVSummaryToFECSummary.convertCSVSheduleToFECShedule("export-68244.csv");
			
			//Pass schedule A Captricity csv file
			List<FECScheduleARecord> listFECScheARecords = ConvertCSVScheAToFECScheA.convertCSVScheAToFECScheA("export-68242.csv");
			
			//Pass schedule B Captricity csv file
			List<FECScheduleBRecord> listFECScheBRecords = ConvertCSVScheBToFECScheB.convertCSVScheBToFECScheB("export-68243.csv");
			
			//Pass schedule C Captricity csv file
			List<FECScheduleCRecord> listFECScheCRecords = ConvertCSVScheCToFECScheC.convertCSVScheCToFECScheC("export-68245.csv");

			//Pass schedule C2 Captricity csv file
			List<FECScheduleC2Record> listFECScheC2Records = ConvertCSVScheCToFECScheC2.convertCSVScheCToFECScheC2("export-68245.csv");
			
			//Pass schedule D Captricity csv file
			List<FECScheduleDRecord> listFECScheDRecords = ConvertCSVScheDToFECScheD.convertCSVScheDToFECScheD("export-68241.csv");
			
			//Pass schedule C1 Captricity csv file
			List<FECScheduleC1Record> listFECScheC1Records = ConvertCSVScheC1ToFECScheC1.convertCSVScheC1ToFECScheC1("export-68280.csv");

			// Path where need to create csv file
			FileCreator fileCreator = new FileCreator("CSVToFECDescriptor.xml","D:/PROJECTS/Aurotech/Converted/C00091892-14020412651.fec");
			fileCreator.setRecordSeperator(System.getProperty("line.separator"));
			
			fileCreator.open();
			
			// Write beans of summary page into .fec file
			for(FECSummaryRecord fecSummaryRecord : listFECSummaryRecords){
			
				fileCreator.setBean(FECSummaryRecord.RECORD_NAME, fecSummaryRecord);
				fileCreator.write(FECSummaryRecord.RECORD_NAME);
			}
			
			// Write beans of schedule A into .fec file
			for(FECScheduleARecord fecScheduleARecord : listFECScheARecords){
			
				fileCreator.setBean(FECScheduleARecord.RECORD_NAME, fecScheduleARecord);
				fileCreator.write(FECScheduleARecord.RECORD_NAME);
			}
			
			// Write beans of schedule B into .fec file
			for(FECScheduleBRecord fecScheduleBRecord : listFECScheBRecords){
				
				fileCreator.setBean(FECScheduleBRecord.RECORD_NAME, fecScheduleBRecord);
				fileCreator.write(FECScheduleBRecord.RECORD_NAME);
			}
			
			// Write beans of schedule C into .fec file
			for(FECScheduleCRecord fecScheduleCRecord : listFECScheCRecords){
				
				fileCreator.setBean(FECScheduleCRecord.RECORD_NAME, fecScheduleCRecord);
				fileCreator.write(FECScheduleCRecord.RECORD_NAME);
			}
			
			// Write beans of schedule C2 into .fec file
			for(FECScheduleC2Record fecScheduleC2Record : listFECScheC2Records){
				
				fileCreator.setBean(FECScheduleC2Record.RECORD_NAME, fecScheduleC2Record);
				fileCreator.write(FECScheduleC2Record.RECORD_NAME);
			}

			// Write beans of schedule D into .fec file
			for(FECScheduleDRecord fecScheduleDRecord : listFECScheDRecords){
				
				fileCreator.setBean(FECScheduleDRecord.RECORD_NAME, fecScheduleDRecord);
				fileCreator.write(FECScheduleDRecord.RECORD_NAME);
			}
			
			// Write beans of schedule C1 into .fec file
			for(FECScheduleC1Record fecScheduleC1Record : listFECScheC1Records){
				
				fileCreator.setBean(FECScheduleC1Record.RECORD_NAME, fecScheduleC1Record);
				fileCreator.write(FECScheduleC1Record.RECORD_NAME);
			}
			
			fileCreator.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
}
