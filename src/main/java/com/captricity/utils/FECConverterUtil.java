package com.captricity.utils;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.PrefixConstant;
import com.captricity.constant.SuffixConstant;

public class FECConverterUtil {
	
	public static String[] splitFullName(String fullName){
		
		String finalSplitedFullName [] = new String[5];
		
		String splitedFullName[] = StringUtils.split(fullName, " ");
		
		if(splitedFullName.length == 5){
			finalSplitedFullName[0] = splitedFullName[0];
			finalSplitedFullName[1] = splitedFullName[1];
			finalSplitedFullName[2] = splitedFullName[2];
			finalSplitedFullName[3] = splitedFullName[3];
			finalSplitedFullName[4] = splitedFullName[4];
		}else if(splitedFullName.length == 4){
			//TODO: Handle other values
			boolean isConstantFound = false;
	        for (PrefixConstant pc : PrefixConstant.values()){
	        	if(StringUtils.containsIgnoreCase(splitedFullName[0], pc.getPrefix())){
	        		finalSplitedFullName[0] = splitedFullName[0];
	    			finalSplitedFullName[1] = splitedFullName[1];
	    			finalSplitedFullName[2] = splitedFullName[2];
	    			finalSplitedFullName[3] = splitedFullName[3];
	    			isConstantFound = true;
	    			break;
	        	}
	        }
	        if(!isConstantFound){
		        for (SuffixConstant sc : SuffixConstant.values()){
		        	if(StringUtils.containsIgnoreCase(splitedFullName[3], sc.getSuffix())){
		    			finalSplitedFullName[1] = splitedFullName[0];
		    			finalSplitedFullName[2] = splitedFullName[1];
		    			finalSplitedFullName[3] = splitedFullName[2];
		    			finalSplitedFullName[4] = splitedFullName[3];
		    			isConstantFound = true;
		    			break;
		        	}
		        }
	        }
		}else if(splitedFullName.length == 3){
			finalSplitedFullName[1] = splitedFullName[0];
			finalSplitedFullName[2] = splitedFullName[1];
			finalSplitedFullName[3] = splitedFullName[2];
		}else if(splitedFullName.length == 2){
			finalSplitedFullName[1] = splitedFullName[0];
			finalSplitedFullName[3] = splitedFullName[1];
		}else{
			finalSplitedFullName[1] = splitedFullName[0];
		}
		
		return finalSplitedFullName;
	}
	
}
