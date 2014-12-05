package com.captricity.mainfiles;

import java.util.List;

import com.blackbear.flatworm.FileCreator;
import com.captricity.bean.FECScheduleARecord;
import com.captricity.converter.ConvertCSVScheAToFECScheA;

public class CSVToFECFileMaker {
	
	public static void main(String[] args) {
		try{
			
		
			//Pass schedule A Captricity csv file
			List<FECScheduleARecord> listFECScheARecord = ConvertCSVScheAToFECScheA.convertCSVScheAToFECScheA("export-66829.csv");
			
			// Path where need to create csv file
			FileCreator fileCreator = new FileCreator("CSVToFECDescriptor.xml","D:/PROJECTS/Aurotech/Converted/C00091892-14020412651.fec");
			fileCreator.setRecordSeperator(System.getProperty("line.separator"));
			
			fileCreator.open();
			
			for(FECScheduleARecord fecScheduleARecord : listFECScheARecord){
			
				fileCreator.setBean(FECScheduleARecord.RECORD_NAME, fecScheduleARecord);
				fileCreator.write(FECScheduleARecord.RECORD_NAME);
			}
			
			fileCreator.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
}
