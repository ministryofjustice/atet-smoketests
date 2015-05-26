package uk.gov.justice.digital.atet.steps;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.atet.factories.JourneyFactory;
import uk.gov.justice.digital.atet.factories.PageFactory;
import uk.gov.justice.digital.atet.step.StepContext;
import uk.gov.justice.digital.atet.step.StepContextSingleton;
import uk.gov.justice.digital.atet.webdriver.SharedDriver;

public class ATETGroupClaimsPageSteps {
	
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETGroupClaimsPageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I click No people are not making a claim with me$")
	public void i_click_No_people_are_not_making_a_claim_with_me() throws Throwable {
	    PageFactory.getATETGroupClaimsPage(driver).clickPeopleMakingClaimWithYou_No();
	}

	@When("^I click Yes people are making a claim with me$")
	public void i_click_Yes_people_are_making_a_claim_with_me() throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).clickPeopleMakingClaimWithYou_Yes();
	}

	@When("^I enter group claimant (\\d+) title \"(.*?)\"$")
	public void i_enter_group_claimant_title(int claimant, String title) throws Throwable {
	    PageFactory.getATETGroupClaimsPage(driver).setTitle(claimant, title);
	}

	@When("^I enter group claimant (\\d+) first name \"(.*?)\"$")
	public void i_enter_group_claimant_first_name(int claimant, String firstName) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setFirstName(claimant, firstName);
	}

	@When("^I enter group claimant (\\d+) last name \"(.*?)\"$")
	public void i_enter_group_claimant_last_name(int claimant, String lastName) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setLastName(claimant, lastName);
	}

	@When("^I enter group claimant (\\d+) DOB day number \"(.*?)\"$")
	public void i_enter_group_claimant_DOB_day_number(int claimant, String dayDOB) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setDayDOB(claimant, dayDOB);
	}

	@When("^I enter group claimant (\\d+) DOB month number \"(.*?)\"$")
	public void i_enter_group_claimant_DOB_month_number(int claimant, String monthDOB) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setMonthDOB(claimant, monthDOB);
	}

	@When("^I enter group claimant (\\d+) DOB year \"(.*?)\"$")
	public void i_enter_group_claimant_DOB_year(int claimant, String yearDOB) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setYearDOB(claimant, yearDOB);
	}

	@When("^I enter group claimant (\\d+) address building number or name \"(.*?)\"$")
	public void i_enter_group_claimant_address_building_number_or_name(int claimant, String buildingName) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setBuildingName(claimant, buildingName);
	}

	@When("^I enter group claimant (\\d+) street address \"(.*?)\"$")
	public void i_enter_group_claimant_street_address(int claimant, String street) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setStreet(claimant, street);
	}

	@When("^I enter group claimant (\\d+) town or city \"(.*?)\"$")
	public void i_enter_group_claimant_town_or_city(int claimant, String locality) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setLocality(claimant,locality);
	}

	@When("^I enter group claimant (\\d+) county \"(.*?)\"$")
	public void i_enter_group_claimant_county(int claimant, String county) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setCounty(claimant, county);
	}

	@When("^I enter group claimant (\\d+) postcode \"(.*?)\"$")
	public void i_enter_group_claimant_postcode(int claimant, String postcode) throws Throwable {
		PageFactory.getATETGroupClaimsPage(driver).setPostcode(claimant, postcode);
	}

	@When("^I click add another claimant$")
	public void i_click_add_another_claimant() throws Throwable {
	    PageFactory.getATETGroupClaimsPage(driver).clickAddResource();
	}
	
	
}
