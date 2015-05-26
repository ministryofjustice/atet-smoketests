package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.atet.factories.FakeDataFactory;
import uk.gov.justice.digital.atet.page.SeleniumPage;

public class ATETClaimantsDetailPage extends ATETPage {
	private String expectedTextOnPage = "Claimant’s details";
	private By expectedTextOnPageSelector = new By.ByXPath(".//*[@id='content']/div/header/h1");
	
	private By selectTitle = new By.ByXPath(".//*[@id='claimant_title']");
	
	private By firstName = new By.ByXPath(".//*[@id='claimant_first_name']");
	private By lastName = new By.ByXPath(".//*[@id='claimant_last_name']");
	
	private By dayDOB = new By.ByXPath(".//*[@id='claimant_date_of_birth_day']");
	private By monthDOB = new By.ByXPath(".//*[@id='claimant_date_of_birth_month']");
	private By yearDOB = new By.ByXPath(".//*[@id='claimant_date_of_birth_year']");
	
	private By genderMale = new By.ByXPath(".//*[@id='claimant_gender_male']");
	private By genderFemale = new By.ByXPath(".//*[@id='claimant_gender_female']");
	private By genderPreferNotToSay = new By.ByXPath(".//*[@id='claimant_gender_prefer_not_to_say']");
	
	private By addressBuilding = new By.ByXPath(".//*[@id='claimant_address_building']");
	private By addressStreet = new By.ByXPath(".//*[@id='claimant_address_street']");
	private By addressLocality = new By.ByXPath(".//*[@id='claimant_address_locality']");
	private By addressCounty = new By.ByXPath(".//*[@id='claimant_address_county']");
	private By addressPostcode = new By.ByXPath(".//*[@id='claimant_address_post_code']");
	
	private By addressCountry = new By.ByXPath(".//*[@id='claimant_address_country']");
	
	private By needAssistance_Yes = new By.ByXPath(".//*[@id='claimant_has_special_needs_true']");
	private By needAssistance_No = new By.ByXPath(".//*[@id='claimant_has_special_needs_false']");
	private By needAssistanceText = new By.ByXPath(".//*[@id='claimant_special_needs']");
	
	private By contactPreferenceEmail = new By.ByXPath(".//*[@id='claimant_contact_preference_email']");
	private By contactPreferencePost = new By.ByXPath(".//*[@id='claimant_contact_preference_post']");
	
	private By claimantEmailAddress = new By.ByXPath(".//*[@id='claimant_email_address']");
	private By claimantMobile = new By.ByXPath(".//*[@id='claimant_address_telephone_number']");
	private By claimantAlternativeMobile = new By.ByXPath(".//*[@id='claimant_mobile_number']");
	
	public void setAddressCountry(String country) throws Exception{
		setSelectOptionByVisibleText(addressCountry, country);
	}
	
	public void setClaimantEmailAddress(String email) throws Exception{
		setText(claimantEmailAddress, email);		
	}
	
	public void setClaimantMobile(String mobile) throws Exception{
		setText(claimantMobile, mobile);
	}
	
	public void setClaimantAlternativeMobile(String mobile) throws Exception{
		setText(claimantAlternativeMobile, mobile);
	}
	
	public void clickNeedAssistance_Yes() throws Exception{
		click(needAssistance_Yes);
	}
	
	public void clickNeedAssistance_No() throws Exception{
		click(needAssistance_No);
	}
	
	public void clickContactPreferenceEmail() throws Exception{
		click(contactPreferenceEmail);
	}
	
	public void setNeedAssistanceText(String text) throws Exception{
		setText(needAssistanceText,text);
	}
	
	public void clickContactPreferencePost() throws Exception{
		click(contactPreferencePost);
	}
	
	public void setDayDOB(String day) throws Exception{
		setText(dayDOB, day);
	}
	
	public void setMonthDOB(String month) throws Exception{
		setText(monthDOB, month);
	}	
	
	public void setYearDOB(String year) throws Exception{
		setText(yearDOB, year);
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
	
	public void clickGenderMale() throws Exception{
		click(genderMale);
	}
	
	public void clickGenderFemale() throws Exception{
		click(genderFemale);
	}
	
	public void clickGenderPreferNotToSay() throws Exception{
		click(genderPreferNotToSay);
	}
	
	public void setTitleByValue(String title) throws Exception{
		setSelectOptionByVisibleText(selectTitle, title);
	}

	public void setFirstName(String firstName) throws Exception{
		setText(this.firstName, firstName);
	}
	
	public void setLastName(String lastName) throws Exception{
		setText(this.lastName, lastName);
	}
	
	public void setMandatoryFields() throws Exception{
		setTitleByValue(FakeDataFactory.getClaimantTitle());
		setFirstName(FakeDataFactory.getClaimantFirstName());
		setLastName(FakeDataFactory.getClaimantLastName());
		clickGenderFemale();
		setAddressBuilding(FakeDataFactory.getClaimantBuilding());
		setAddressStreet(FakeDataFactory.getClaimantStreet());
		setAddressLocality(FakeDataFactory.getClaimantLocality());
		setAddressCounty(FakeDataFactory.getClaimantCounty());
		setAddressPostcode(FakeDataFactory.getClaimantPostcode());
		clickContactPreferencePost();
	}

	public ATETClaimantsDetailPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}


	
}
