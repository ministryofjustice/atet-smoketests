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
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ATETAdditionalRespondentsSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();

	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETAdditionalRespondentsSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I click NO there are no claims against other respondents$")
	public void i_click_No_there_are_no_claims_against_other_respondents()
			throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
				.clickHasClaimsAgainstOtherRespondents_No();
	}

	@When("^as additonal respondent (\\d+) enter name \"(.*?)\"$")
	public void as_additonal_respondent_enter_name(int respondent, String name)
			throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.setRespondentName(respondent, name);
	}

	@When("^I click YES there are claims against other respondents$")
	public void i_click_Yes_there_are_claims_against_other_respondents()
			throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
				.clickHasClaimsAgainstOtherRespondents_Yes();
	}


	@When("^as additonal respondent (\\d+) enter address building number or name \"(.*?)\"$")
	public void as_additonal_respondent_enter_address_building_number_or_name(
			int respondent, String building) throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.setRespondentBuilding(respondent, building);
	}

	@When("^as additonal respondent (\\d+) enter street address \"(.*?)\"$")
	public void as_additonal_respondent_enter_street_address(int respondent,
			String street) throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.setRespondentStreet(respondent, street);
	}

	@When("^as additonal respondent (\\d+) enter town or city \"(.*?)\"$")
	public void as_additonal_respondent_enter_town_or_city(int respondent, String locality)
			throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.setRespondentLocality(respondent, locality);
	}

	@When("^as additonal respondent (\\d+) enter county \"(.*?)\"$")
	public void as_additonal_respondent_enter_county(int respondent, String county)
			throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.setRespondentCounty(respondent, county);
	}

	@When("^as additonal respondent (\\d+) enter postcode \"(.*?)\"$")
	public void as_additonal_respondent_enter_postcode(int respondent, String postcode)
			throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.setRespondentPostcode(respondent, postcode);
	}

	@When("^as additonal respondent (\\d+) enter acas number \"(.*?)\"$")
	public void as_additonal_respondent_enter_acas_number(int respondent, String acas)
			throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.setRespondentAcasNumber(respondent, acas);
	}

	@When("^as additonal respondent (\\d+) click I dont have an acas number$")
	public void as_additonal_respondent_click_I_dont_have_an_acas_number(
			int respondent) throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.clickHasAcasNumber_No(respondent);
	}

	@When("^as additonal respondent (\\d+) click there is a joint claimant has an acas number$")
	public void as_additonal_respondent_click_there_is_a_joint_claimant_has_an_acas_number(
			int respondent) throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.clickJointClaimantHasAcasNumber(respondent);
	}

	@When("^as additonal respondent (\\d+) click that acas does not have authority to concilitate$")
	public void as_additonal_respondent_click_that_acas_does_not_have_authority_to_concilitate(
			int respondent) throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.clickNoAuthorityToConcilitate(respondent);
	}

	@When("^as additonal respondent (\\d+) click my employer has been in touch with acas$")
	public void as_additonal_respondent_click_my_employer_has_been_in_touch_with_acas(
			int respondent) throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.clickEmployerAlreadyInTouch(respondent);
	}

	@When("^as additonal respondent (\\d+) click I am applying for interim relief$")
	public void as_additonal_respondent_click_I_am_applying_for_interim_relief(
			int respondent) throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.clickReasonInterimRelief(respondent);
	}

	@When("^as additonal respondent (\\d+) click I am my claim is against a security service$")
	public void as_additonal_respondent_click_I_am_my_claim_is_against_a_security_service(
			int respondent) throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.clickClaimAgainstSecurityService(respondent);
	}

	@When("^I click add another respondent$")
	public void i_click_add_another_respondent() throws Throwable {
		PageFactory.getATETAdditionalRespondentsPage(driver)
		.clickAddAdditionalRespondent();
	}

	@Then("^I am directed to page (\\d+) employment details page$")
	public void i_am_directed_to_page_employment_details_page(int arg1)
			throws Throwable {
		assertTrue(PageFactory.getATETEmploymentDetails(driver).verifyOnPage());
	}

}
