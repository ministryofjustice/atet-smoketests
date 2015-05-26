package uk.gov.justice.digital.atet.steps;



import uk.gov.justice.digital.atet.factories.PageFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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

public class ATETRespondentDetailsSteps {
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETRespondentDetailsSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I enter the respondent name \"(.*?)\"$")
	public void i_enter_the_respondent_name(String name) throws Throwable {
         PageFactory.getATETRespondentsDetailPage(driver).setRespondentName(name);
	}

	@When("^I enter the respondent address building number or name \"(.*?)\"$")
	public void i_enter_the_respondent_address_building_number_or_name(String building) throws Throwable {
	    PageFactory.getATETRespondentsDetailPage(driver).setAddressBuilding(building);
	}

	@When("^I enter the respondent street address \"(.*?)\"$")
	public void i_enter_the_respondent_street_address(String street) throws Throwable {
	    PageFactory.getATETRespondentsDetailPage(driver).setAddressStreet(street);
	}

	@When("^I enter the respondent town or city \"(.*?)\"$")
	public void i_enter_the_respondent_town_or_city(String locality) throws Throwable {
	    PageFactory.getATETRespondentsDetailPage(driver).setAddressLocality(locality);
	}

	@When("^I enter the respondent county \"(.*?)\"$")
	public void i_enter_the_respondent_county(String county) throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).setAddressCounty(county);
	}

	@When("^I enter the respondent postcode \"(.*?)\"$")
	public void i_enter_the_respondent_postcode(String postcode) throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).setAddressPostcode(postcode);
	}

	@When("^I enter the respondent mobile or phone number \"(.*?)\"$")
	public void i_enter_the_respondent_mobile_or_phone_number(String mobile) throws Throwable {
	    PageFactory.getATETRespondentsDetailPage(driver).setRespondentMobile(mobile);
	}

	@When("^I click NO that the respondent address is not their work address$")
	public void i_click_NO_that_the_respondent_address_is_not_their_work_address() throws Throwable {
	    PageFactory.getATETRespondentsDetailPage(driver).clickRespondentAddressIsNotWorkAddress_No();
	}

	@When("^I click YES that the respondent address is their work address$")
	public void i_click_YES_that_the_respondent_address_is_their_work_address() throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).clickRespondentAddressIsNotWorkAddress_Yes();
	}

	@When("^I enter the respondent work address building number or name \"(.*?)\"$")
	public void i_enter_the_respondent_work_address_building_number_or_name(String building) throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).setWorkAddressBuilding(building);
	}

	@When("^I enter the respondent work street address \"(.*?)\"$")
	public void i_enter_the_respondent_work_street_address(String street) throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).setWorkAddressStreet(street);
	}

	@When("^I enter the respondent work town or city \"(.*?)\"$")
	public void i_enter_the_respondent_work_town_or_city(String locality) throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).setWorkAddressLocality(locality);
	}

	@When("^I enter the respondent work county \"(.*?)\"$")
	public void i_enter_the_respondent_work_county(String county) throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).setWorkAddressCounty(county);
	}

	@When("^I enter the respondent work postcode \"(.*?)\"$")
	public void i_enter_the_respondent_work_postcode(String postcode) throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).setWorkAddressPostcode(postcode);
	}

	@When("^I enter the respondent work mobile or phone number \"(.*?)\"$")
	public void i_enter_the_respondent_work_mobile_or_phone_number(String mobile) throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).setWorkRespondentMobile(mobile);
	}

	@When("^I enter the acas number \"(.*?)\"$")
	public void i_enter_the_acas_number(String acas) throws Throwable {
	    PageFactory.getATETRespondentsDetailPage(driver).setAcasNumber(acas);
	}

	@When("^I click I dont have an acas number$")
	public void i_click_I_dont_have_an_acas_number() throws Throwable {
	    PageFactory.getATETRespondentsDetailPage(driver).clickHasNoAcasNumber();
	}

	@When("^I click there is a joint claimant has an acas number$")
	public void i_click_there_is_a_joint_claimant_has_an_acas_number() throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).clickJointClaimantHasAacasNumber();
	}

	@When("^I click that acas does not have authority to concilitate$")
	public void i_click_that_acas_does_not_have_authority_to_concilitate() throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).clickNoAuthorityToConcilitate();
	}

	@When("^I click my employer has been in touch with acas$")
	public void i_click_my_employer_has_been_in_touch_with_acas() throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).clickEmployerAlreadyInTouch();
	}

	@When("^I click I am applying for interim relief$")
	public void i_click_I_am_applying_for_interim_relief() throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).clickReasonInterimRelief();
	}

	@When("^I click I am my claim is against a security service$")
	public void i_click_I_am_my_claim_is_against_a_security_service() throws Throwable {
		PageFactory.getATETRespondentsDetailPage(driver).clickClaimAgainstSecurityService();
	}

	@Then("^I am directed to page (\\d+) additional respondents page$")
	public void i_am_directed_to_page_additional_respondents_page(int arg1) throws Throwable {
	    assertTrue(PageFactory.getATETAdditionalRespondentsPage(driver).verifyOnPage());
	}

}
