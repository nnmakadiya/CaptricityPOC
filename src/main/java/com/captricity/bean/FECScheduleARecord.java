package com.captricity.bean;

import org.apache.commons.lang3.StringUtils;

import com.captricity.constant.FECFileConstant;

public class FECScheduleARecord {
	
	public static final String RECORD_NAME = "SA";
	
	private String formType;
	private String filerFECCommitteeId;
	private String contribOrganizationName;
	private String contributorLastName;
	private String contributorFirstName;
	private String contributorMiddleName;
	private String contributorPrefix;
	private String contributorSuffix;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zip;
	private String dateReceived;
	private String fecCommitteeIdNumber;
	private String indEmployer;
	private String indOccupation;
	private String itemElectCode;
	private String itemElectOther;
	private String aggregateYTD;
	private String amountReceived;
	private String memoDescription;
	private String imageNumber;
	
	public String getFormType() {
		if(StringUtils.isBlank(formType)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return formType + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setFormType(String formType) {
		this.formType = formType;
	}
	public String getFilerFECCommitteeId() {
		if(StringUtils.isBlank(filerFECCommitteeId)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return filerFECCommitteeId + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setFilerFECCommitteeId(String filerFECCommitteeId) {
		this.filerFECCommitteeId = filerFECCommitteeId;
	}
	public String getContribOrganizationName() {
		if(StringUtils.isBlank(contribOrganizationName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return contribOrganizationName + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setContribOrganizationName(String contribOrganizationName) {
		this.contribOrganizationName = contribOrganizationName;
	}
	public String getContributorLastName() {
		if(StringUtils.isBlank(contributorLastName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return contributorLastName + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setContributorLastName(String contributorLastName) {
		this.contributorLastName = contributorLastName;
	}
	public String getContributorFirstName() {
		if(StringUtils.isBlank(contributorFirstName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return contributorFirstName + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setContributorFirstName(String contributorFirstName) {
		this.contributorFirstName = contributorFirstName;
	}
	public String getContributorMiddleName() {
		if(StringUtils.isBlank(contributorMiddleName)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return contributorMiddleName + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setContributorMiddleName(String contributorMiddleName) {
		this.contributorMiddleName = contributorMiddleName;
	}
	public String getContributorPrefix() {
		if(StringUtils.isBlank(contributorPrefix)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return contributorPrefix + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setContributorPrefix(String contributorPrefix) {
		this.contributorPrefix = contributorPrefix;
	}
	public String getContributorSuffix() {
		if(StringUtils.isBlank(contributorSuffix)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return contributorSuffix + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setContributorSuffix(String contributorSuffix) {
		this.contributorSuffix = contributorSuffix;
	}
	public String getStreet1() {
		if(StringUtils.isBlank(street1)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return street1 + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		if(StringUtils.isBlank(street2)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return street2 + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		if(StringUtils.isBlank(city)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return city + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		if(StringUtils.isBlank(state)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return state + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		if(StringUtils.isBlank(zip)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return zip + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getDateReceived() {
		if(StringUtils.isBlank(dateReceived)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return dateReceived + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}
	public String getFecCommitteeIdNumber() {
		if(StringUtils.isBlank(fecCommitteeIdNumber)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return fecCommitteeIdNumber + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setFecCommitteeIdNumber(String fecCommitteeIdNumber) {
		this.fecCommitteeIdNumber = fecCommitteeIdNumber;
	}
	public String getIndEmployer() {
		if(StringUtils.isBlank(indEmployer)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return indEmployer + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIndEmployer(String indEmployer) {
		this.indEmployer = indEmployer;
	}
	public String getIndOccupation() {
		if(StringUtils.isBlank(indOccupation)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return indOccupation + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setIndOccupation(String indOccupation) {
		this.indOccupation = indOccupation;
	}
	public String getItemElectCode() {
		if(StringUtils.isBlank(itemElectCode)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return itemElectCode + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setItemElectCode(String itemElectCode) {
		this.itemElectCode = itemElectCode;
	}
	public String getItemElectOther() {
		if(StringUtils.isBlank(itemElectOther)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return itemElectOther + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setItemElectOther(String itemElectOther) {
		this.itemElectOther = itemElectOther;
	}
	public String getAggregateYTD() {
		if(StringUtils.isBlank(aggregateYTD)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return aggregateYTD + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setAggregateYTD(String aggregateYTD) {
		this.aggregateYTD = aggregateYTD;
	}
	public String getAmountReceived() {
		if(StringUtils.isBlank(amountReceived)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return amountReceived + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setAmountReceived(String amountReceived) {
		this.amountReceived = amountReceived;
	}
	public String getMemoDescription() {
		if(StringUtils.isBlank(memoDescription)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return memoDescription + (char)FECFileConstant.COLUMN_SEPARATOR;
	}
	public void setMemoDescription(String memoDescription) {
		this.memoDescription = memoDescription;
	}
	public String getImageNumber() {
		if(StringUtils.isBlank(imageNumber)){
			return "" + (char)FECFileConstant.COLUMN_SEPARATOR;
		}
		return imageNumber;
	}
	public void setImageNumber(String imageNumber) {
		this.imageNumber = imageNumber;
	}
}
