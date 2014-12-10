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
			
			boolean isPrefixFound = false;
			boolean isSuffixFound = false;

	        for (PrefixConstant pc : PrefixConstant.values()){
	        	if(StringUtils.equalsIgnoreCase(splitedFullName[0], pc.getPrefix())){
	        		finalSplitedFullName[0] = splitedFullName[0];
	        		isPrefixFound = true;
	    			break;
	        	}
	        }
	        for (SuffixConstant sc : SuffixConstant.values()){
		       	if(StringUtils.equalsIgnoreCase(splitedFullName[3], sc.getSuffix())){
		   			finalSplitedFullName[4] = splitedFullName[3];
		   			isSuffixFound = true;
	    			break;
	        	}
	        }
	        if(isPrefixFound){
	        	finalSplitedFullName[1] = splitedFullName[1];
	        	finalSplitedFullName[2] = splitedFullName[2];
	        }else{
	        	finalSplitedFullName[1] = splitedFullName[0];
	        	finalSplitedFullName[2] = splitedFullName[1];
	        	finalSplitedFullName[3] = splitedFullName[2];
	        }
	        
	        if(!isSuffixFound && isPrefixFound){
	        	finalSplitedFullName[3] = splitedFullName[3];
	        }else if(!isSuffixFound && !isPrefixFound){
				// If in the name suffix is not found and prefix is not found
				// then consider fourth word as suffix
	        	finalSplitedFullName[4] = splitedFullName[3];
	        }
		}else if(splitedFullName.length == 3){
			
			boolean isPrefixFound = false;
			boolean isSuffixFound = false;

	        for (PrefixConstant pc : PrefixConstant.values()){
	        	if(StringUtils.equalsIgnoreCase(splitedFullName[0], pc.getPrefix())){
	        		finalSplitedFullName[0] = splitedFullName[0];
	        		isPrefixFound = true;
	    			break;
	        	}
	        }
	        for (SuffixConstant sc : SuffixConstant.values()){
		       	if(StringUtils.equalsIgnoreCase(splitedFullName[2], sc.getSuffix())){
		   			finalSplitedFullName[4] = splitedFullName[2];
		   			isSuffixFound = true;
	    			break;
	        	}
	        }
	        
	        if(isPrefixFound){
	        	finalSplitedFullName[1] = splitedFullName[1];
	        }else{
	        	finalSplitedFullName[1] = splitedFullName[0];
	        	finalSplitedFullName[2] = splitedFullName[1];
	        }
	        
	        if(!isSuffixFound){
	        	finalSplitedFullName[3] = splitedFullName[2];
	        }
			
		}else if(splitedFullName.length == 2){
			
			boolean isPrefixFound = false;
			boolean isSuffixFound = false;

	        for (PrefixConstant pc : PrefixConstant.values()){
	        	if(StringUtils.equalsIgnoreCase(splitedFullName[0], pc.getPrefix())){
	        		finalSplitedFullName[0] = splitedFullName[0];
	        		isPrefixFound = true;
	    			break;
	        	}
	        }
	        for (SuffixConstant sc : SuffixConstant.values()){
		       	if(StringUtils.equalsIgnoreCase(splitedFullName[1], sc.getSuffix())){
		   			finalSplitedFullName[4] = splitedFullName[1];
		   			isSuffixFound = true;
	    			break;
	        	}
	        }
	        
	        if(!isPrefixFound){
	        	finalSplitedFullName[1] = splitedFullName[0];
	        }
	        
	        if(!isSuffixFound){
	        	finalSplitedFullName[3] = splitedFullName[1];
	        }
		}else{
			
			boolean isPrefixFound = false;
			boolean isSuffixFound = false;

	        for (PrefixConstant pc : PrefixConstant.values()){
	        	if(StringUtils.equalsIgnoreCase(splitedFullName[0], pc.getPrefix())){
	        		finalSplitedFullName[0] = splitedFullName[0];
	        		isPrefixFound = true;
	    			break;
	        	}
	        }
	        if(!isPrefixFound){
		        for (SuffixConstant sc : SuffixConstant.values()){
			       	if(StringUtils.equalsIgnoreCase(splitedFullName[0], sc.getSuffix())){
			   			finalSplitedFullName[4] = splitedFullName[0];
			   			isSuffixFound = true;
		    			break;
		        	}
		        }
	        }
	        
	        if(!isPrefixFound && !isSuffixFound){
	        	finalSplitedFullName[1] = splitedFullName[0];	
	        }
		}
		return finalSplitedFullName;
	}
}
