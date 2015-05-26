package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

public class ATETRepresentativeDetailsPage extends ATETPage {
	
	private String expectedTextOnPage = "Representative’s details";
	private By expectedTextOnPageSelector = new By.ByXPath(".//*[@id='content']/div/header/h1");
	
	private By hasRepresentative_No = new By.ByXPath(".//*[@id='representative_has_representative_false']");
	private By hasRepresentative_Yes = new By.ByXPath(".//*[@id='representative_has_representative_true']");
	private By representativeType = new By.ByXPath(".//*[@id='representative_type']");
	private By organisationName = new By.ByXPath(".//*[@id='representative_organisation_name']");
	private By representativeName = new By.ByXPath(".//*[@id='representative_name']");
	
	private By addressBuilding = new By.ByXPath(".//*[@id='representative_address_building']");
	private By addressStreet = new By.ByXPath(".//*[@id='representative_address_street']");
	private By addressLocality = new By.ByXPath(".//*[@id='representative_address_locality']");
	private By addressCounty = new By.ByXPath(".//*[@id='representative_address_county']");
	private By addressPostcode = new By.ByXPath(".//*[@id='representative_address_post_code']");
	
	private By representativeEmailAddress = new By.ByXPath(".//*[@id='representative_email_address']");
	private By representativeMobile = new By.ByXPath(".//*[@id='representative_address_telephone_number']");
	private By representativeAlternativeMobile = new By.ByXPath(".//*[@id='representative_mobile_number']");
	
	private By representativeDXNumber = new By.ByXPath(".//*[@id='representative_dx_number']");
	
	private By whatIsADxNumberLink = new By.ByXPath(".//*[@id='edit_representative']/div[1]/fieldset/fieldset[2]/details/summary/span");
	
	public void clickWhatIsADxNumber() throws Exception{
		click(whatIsADxNumberLink);
	}
	
	public void setRepresentativeDXNumber(String dx) throws Exception{
		setText(representativeDXNumber,dx);
	}
	
	
	public void setRepresentativeEmailAddress(String email) throws Exception{
		setText(representativeEmailAddress, email);
	}
	
	public void setRepresentativeMobile(String mobile) throws Exception{
		setText(representativeMobile, mobile);
	}
	
	public void setRepresentativeAlternativeMobile(String mobile) throws Exception{
		setText(representativeAlternativeMobile, mobile);
	}
	
	public void setAddressBuilding(String building) throws Exception{
		setText(addressBuilding, building);
	}
	
	public void setAddressStreet(String street) throws Exception{
		setText(addressStreet, street);
	}
	
	public void setAddressLocality(String locality) throws Exception{
		setText(addressLocality, locality);
	}	
	
	
	public void setAddressCounty(String county) throws Exception{
		setText(addressCounty, county);
	}
	
	
	public void setAddressPostcode(String postcode) throws Exception{
		setText(addressPostcode, postcode);
	}
	
	
	
	public void setRepresentativeName(String name) throws Exception{
		setText(representativeName, name);
	}
	
	public void setOrganisationName(String name) throws Exception{
		setText(organisationName, name);
	}
	
	public void selectRepresentativeType(String selection) throws Exception{
		setSelectOptionByVisibleText(representativeType, selection);
	}
	
	public void clickHasRepresentative_No() throws Exception{
		click(hasRepresentative_No );
	}
	
	public void clickHasRepresentative_Yes() throws Exception{
		click(hasRepresentative_Yes );
	}
	
	public ATETRepresentativeDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
}
