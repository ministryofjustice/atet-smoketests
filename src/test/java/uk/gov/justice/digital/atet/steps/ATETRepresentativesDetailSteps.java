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

public class ATETRepresentativesDetailSteps {
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETRepresentativesDetailSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	

	@When("^I select NO I have no representative$")
	public void i_select_NO_I_have_no_representative() throws Throwable {
	    PageFactory.getATETRepresentativeDetailsPage(driver).clickHasRepresentative_No();
	}

	@When("^I select YES I have a representative$")
	public void i_select_YES_I_have_a_representative() throws Throwable {
		PageFactory.getATETRepresentativeDetailsPage(driver).clickHasRepresentative_Yes();
	}

	@When("^I select that the representative is a \"(.*?)\"$")
	public void i_select_that_the_representative_is_a(String type) throws Throwable {
	    PageFactory.getATETRepresentativeDetailsPage(driver).selectRepresentativeType(type);
	}

	@When("^I enter the representatives organisation name \"(.*?)\"$")
	public void i_enter_the_representatives_organisation_name(String name) throws Throwable {
	    PageFactory.getATETRepresentativeDetailsPage(driver).setOrganisationName(name);
	}

	@When("^I enter the representatives name \"(.*?)\"$")
	public void i_enter_the_representatives_name(String name) throws Throwable {
	    PageFactory.getATETRepresentativeDetailsPage(driver).setRepresentativeName(name);
	}

	@When("^I enter the representatives address building number or name \"(.*?)\"$")
	public void i_enter_the_representatives_address_building_number_or_name(String building) throws Throwable {
	    PageFactory.getATETRepresentativeDetailsPage(driver).setAddressBuilding(building);
	}

	@When("^I enter the representatives street address \"(.*?)\"$")
	public void i_enter_the_representatives_street_address(String street) throws Throwable {
	    PageFactory.getATETRepresentativeDetailsPage(driver).setAddressStreet(street);
	}

	@When("^I enter the representatives town or city \"(.*?)\"$")
	public void i_enter_the_representatives_town_or_city(String locality) throws Throwable {
		PageFactory.getATETRepresentativeDetailsPage(driver).setAddressLocality(locality);
	}

	@When("^I enter the representatives county \"(.*?)\"$")
	public void i_enter_the_representatives_county(String county) throws Throwable {
		PageFactory.getATETRepresentativeDetailsPage(driver).setAddressCounty(county);
	}

	@When("^I enter the representatives postcode \"(.*?)\"$")
	public void i_enter_the_representatives_postcode(String postcode) throws Throwable {
		PageFactory.getATETRepresentativeDetailsPage(driver).setAddressPostcode(postcode);
	}

	@When("^I enter the representatives mobile or phone number \"(.*?)\"$")
	public void i_enter_the_representatives_mobile_or_phone_number(String mobile) throws Throwable {
		PageFactory.getATETRepresentativeDetailsPage(driver).setRepresentativeMobile(mobile);
	}

	@When("^I enter the representatives alternative mobile or phone number \"(.*?)\"$")
	public void i_enter_the_representatives_alternative_mobile_or_phone_number(String mobile) throws Throwable {
		PageFactory.getATETRepresentativeDetailsPage(driver).setRepresentativeAlternativeMobile(mobile);
	}

	@When("^I enter the representatives email address \"(.*?)\"$")
	public void i_enter_the_representatives_email_address(String email) throws Throwable {
		PageFactory.getATETRepresentativeDetailsPage(driver).setRepresentativeEmailAddress(email);
	}

	@When("^I enter the representatives dx address \"(.*?)\"$")
	public void i_enter_the_representatives_dx_address(String dx) throws Throwable {
		PageFactory.getATETRepresentativeDetailsPage(driver).setRepresentativeDXNumber(dx);
	}

	@When("^I click what is a dx number$")
	public void i_click_what_is_a_dx_number() throws Throwable {
		PageFactory.getATETRepresentativeDetailsPage(driver).clickWhatIsADxNumber();
	}

	@Then("^I am directed to page (\\d+) respondents details page$")
	public void i_am_directed_to_page_respondents_details_page(int arg1) throws Throwable {
	    assertTrue(PageFactory.getATETRespondentsDetailPage(driver).verifyOnPage());
	}

}
