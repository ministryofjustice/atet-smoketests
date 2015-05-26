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

import java.util.List;

public class ATETClaimantDetailsSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();

	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETClaimantDetailsSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I select my title \"(.*?)\"$")
	public void i_select_my_title(String title) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setTitleByValue(title);
	}

	@When("^I enter my first name \"(.*?)\"$")
	public void i_enter_my_first_name(String firstName) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setFirstName(firstName);
	}

	@When("^I enter my last name \"(.*?)\"$")
	public void i_enter_my_last_name(String lastName) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setLastName(lastName);
	}

	@When("^I enter my DOB day number \"(.*?)\"$")
	public void i_enter_my_DOB_day_number(String day) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setDayDOB(day);
	}

	@When("^I enter my DOB month number \"(.*?)\"$")
	public void i_enter_my_DOB_month_number(String month) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setMonthDOB(month);
	}

	@When("^I enter my DOB year \"(.*?)\"$")
	public void i_enter_my_DOB_year(String year) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setYearDOB(year);
	}

	@When("^I select my gender as male$")
	public void i_select_my_gender_as_male() throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).clickGenderMale();
	}

	@When("^I select my gender as female$")
	public void i_select_my_gender_as_female() throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).clickGenderFemale();
	}

	@When("^I select my gender as other$")
	public void i_select_my_gender_as_other() throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver)
				.clickGenderPreferNotToSay();
	}

	@When("^I select NO I don't need assitance$")
	public void i_select_NO_I_don_t_need_assitance() throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).clickNeedAssistance_No();
	}

	@When("^I select YES I need assistance$")
	public void i_select_YES_I_need_assistance() throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver)
				.clickNeedAssistance_Yes();
	}

	@When("^I enter the details of the assitance required:$")
	public void i_enter_the_details_of_the_assitance_required(
			List<List<String>> textLines) throws Throwable {
		StringBuilder builder = new StringBuilder();
		for (int index = 0; index < textLines.get(0).size(); index++) {
			builder.append(textLines.get(0).get(index) + "\n");
		}
		PageFactory.getATETClaimantDetailsPage(driver).setNeedAssistanceText(
				builder.toString());
	}

	@When("^I enter my address building number or name \"(.*?)\"$")
	public void i_enter_my_address_building_number_or_name(String building)
			throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setAddressBuilding(building);
	}

	@When("^I enter my street address \"(.*?)\"$")
	public void i_enter_my_street_address(String street) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setAddressStreet(street);
	}

	@When("^I enter my town or city \"(.*?)\"$")
	public void i_enter_my_town_or_city(String locality) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setAddressLocality(locality);
	}

	@When("^I enter my county \"(.*?)\"$")
	public void i_enter_my_county(String county) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setAddressCounty(county);
	}

	@When("^I enter my postcode \"(.*?)\"$")
	public void i_enter_my_postcode(String postcode) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setAddressPostcode(postcode);
	}

	@When("^I select my country \"(.*?)\"$")
	public void i_select_my_country(String country) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setAddressCountry(country);
	}

	@When("^I enter my claimant mobile or phone number \"(.*?)\"$")
	public void i_enter_my_claimant_mobile_or_phone_number(String mobile)
			throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setClaimantMobile(mobile);
	}

	@When("^I enter my alternative claimant mobile or phone number \"(.*?)\"$")
	public void i_enter_my_alternative_claimant_mobile_or_phone_number(
			String mobile) throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setClaimantAlternativeMobile(mobile);
	}

	@When("^I enter my claimant detail email address \"(.*?)\"$")
	public void i_enter_my_claimant_detail_email_address(String email)
			throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).setClaimantEmailAddress(email);
	}

	@When("^I select correspondence should be by post$")
	public void i_select_correspondence_should_be_by_post() throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).clickContactPreferencePost();
	}

	@When("^I select correspondence should be by email$")
	public void i_select_correspondence_should_be_by_email() throws Throwable {
		PageFactory.getATETClaimantDetailsPage(driver).clickContactPreferenceEmail();
	}
	
	@Then("^I am directed to page (\\d+) group claims$")
	public void i_am_directed_to_page_group_claims(int arg1) throws Throwable {
	    assertTrue(PageFactory.getATETGroupClaimsPage(driver).verifyOnPage());
	}
	

@Then("^I am directed to page (\\d+) representatives details page$")
public void i_am_directed_to_page_representatives_details_page(int arg1) throws Throwable {
    assertTrue(PageFactory.getATETRepresentativeDetailsPage(driver).verifyOnPage());
}

}
