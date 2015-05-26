package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.atet.page.SeleniumPage;

public class ATETGroupClaimsPage extends ATETPage {

	private String expectedTextOnPage = "Group claims";
	private By expectedTextOnPageSelector = new By.ByXPath(".//*[@id='content']/div/header/h1");
	
	private String title = ".//*[@id='additional_claimants_collection_attributes_%d_title']";
	private String firstName = ".//*[@id='additional_claimants_collection_attributes_%d_first_name']";
	private String lastName = ".//*[@id='additional_claimants_collection_attributes_%d_last_name']";
	private String dayDOB = ".//*[@id='additional_claimants_collection_attributes_%d_date_of_birth_day']";
	private String monthDOB = ".//*[@id='additional_claimants_collection_attributes_%d_date_of_birth_month']";
	private String yearDOB = ".//*[@id='additional_claimants_collection_attributes_%d_date_of_birth_year']";
	private String buildingName = ".//*[@id='additional_claimants_collection_attributes_%d_address_building']";
	private String street = ".//*[@id='additional_claimants_collection_attributes_%d_address_street']";
	private String locality = ".//*[@id='additional_claimants_collection_attributes_%d_address_locality']";
	private String county = ".//*[@id='additional_claimants_collection_attributes_%d_address_county']";
	private String postcode = ".//*[@id='additional_claimants_collection_attributes_%d_address_post_code']";
	
	private By peopleMakingClaimWithYou_Yes = new By.ByXPath(".//*[@id='additional_claimants_has_collection_true']");
	private By peopleMakingClaimWithYou_No = new By.ByXPath(".//*[@id='additional_claimants_has_collection_false']");
	
	private By addResourceLink = new By.ByXPath(".//*[@id='button_add_resource']");
	
	public void clickAddResource() throws Exception{
		click(addResourceLink);
	}
	
	public void clickPeopleMakingClaimWithYou_Yes() throws Exception{
		click(peopleMakingClaimWithYou_Yes);
	}
	
	public void clickPeopleMakingClaimWithYou_No() throws Exception{
		click(peopleMakingClaimWithYou_No);
	}
	
	private void setText(int claimant, String field, String text) throws Exception{
		System.out.println(String.format(field, claimant-1));
		By byField = new By.ByXPath(String.format(field, claimant-1));
		waitToGetElement(byField, HTTP_TIMEOUT);
		setText(byField,text);	
	}
	
	public void setTitle(int claimant,String title) throws Exception{
		setSelectOptionByVisibleText(new By.ByXPath(String.format(this.title, claimant-1)), title);
	}
	
	public void setFirstName(int claimant,String firstName) throws Exception{
		setText(claimant,this.firstName,firstName);
	}
	
	public void setLastName(int claimant,String lastName) throws Exception{
		setText(claimant,this.lastName,lastName);
	}
	
	public void setDayDOB(int claimant,String dayDOB) throws Exception{
		setText(claimant,this.dayDOB,dayDOB);
	}
	
	public void setMonthDOB(int claimant,String monthDOB) throws Exception{
		setText(claimant,this.monthDOB,monthDOB);
	}
	
	
	public void setYearDOB(int claimant,String yearDOB) throws Exception{
		setText(claimant,this.yearDOB,yearDOB);
	}
	
	
	public void setBuildingName(int claimant,String buildingName) throws Exception{
		setText(claimant,this.buildingName,buildingName);
	}
	
	
	public void setStreet(int claimant,String street) throws Exception{
		setText(claimant,this.street,street);
	}
	
	
	public void setLocality(int claimant,String locality) throws Exception{
		setText(claimant,this.locality,locality);
	}
	
	
	public void setCounty(int claimant,String county) throws Exception{
		setText(claimant,this.county,county);
	}
	
	
	public void setPostcode(int claimant,String postcode) throws Exception{
		setText(claimant,this.postcode,postcode);
	}
	
	public ATETGroupClaimsPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
