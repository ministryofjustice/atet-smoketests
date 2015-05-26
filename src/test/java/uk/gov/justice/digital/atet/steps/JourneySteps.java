package uk.gov.justice.digital.atet.steps;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.atet.factories.JourneyFactory;
import uk.gov.justice.digital.atet.factories.PageFactory;
import uk.gov.justice.digital.atet.step.StepContext;
import uk.gov.justice.digital.atet.step.StepContextSingleton;
import uk.gov.justice.digital.atet.webdriver.SharedDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JourneySteps {

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public JourneySteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@Given("^I am on the claim detail page$")
	public void i_am_on_the_claim_detail_page() throws Throwable {
		journeyFactory.getATETClaimDetailPageJourney();
	}

	@Given("^I am on the saving your claim page$")
	public void i_am_on_the_saving_your_claim_page() throws Throwable {
		journeyFactory.getATETSavingYourClaimPageJourney();
	}

	@Given("^I am on the start page$")
	public void i_am_on_the_start_page() throws Throwable {
		journeyFactory.getATETStartPageJourney();
	}

	@Given("^I am on the save your claim page$")
	public void i_am_on_the_save_your_claim_page() throws Throwable {
		journeyFactory.getATETSavingYourClaimPageJourney();
	}

	@Given("^I am on the claimant details page$")
	public void i_am_on_the_claimant_details_page() throws Throwable {
		journeyFactory.getATETClaimantDetailsPageJourney();
	}

	@Given("^I am on the group claims page$")
	public void i_am_on_the_group_claims_page() throws Throwable {
		journeyFactory.getATETGroupClaimsPageJourney();
	}
	
	@Given("^I am on the representatives detail page$")
	public void i_am_on_the_representatives_detail_page() throws Throwable {
		journeyFactory.getATETRepresetantiveDetailsPageJourney();
	}

	@Given("^I am on the respondent details page$")
	public void i_am_on_the_respondent_details_page() throws Throwable {
		journeyFactory.getATETRespondentDetailsPageJourney();
	}


	@Given("^I am on the additional respondents page$")
	public void i_am_on_the_additional_respondents_page() throws Throwable {
		journeyFactory.getATETAdditionalRespondentsPageJourney();
	}

	@Given("^I am on the employment details page$")
	public void i_am_on_the_employment_details_page() throws Throwable {
		journeyFactory.getATETEmploymentDetailsPageJourney();
	}

	@Given("^I am on the about the claim page$")
	public void i_am_on_the_about_the_claim_page() throws Throwable {
		journeyFactory.getATETAboutYourClaimPageJourney();
	}

	@Given("^I am on the claim outcome page$")
	public void i_am_on_the_claim_outcome_page() throws Throwable {
		journeyFactory.getATETClaimOutcomePageJourney();
	}

	@Given("^I am on the more about the claim page$")
	public void i_am_on_the_more_about_the_claim_page() throws Throwable {
		journeyFactory.getATETMoreAboutTheClaimPageJourney();
	}

	@Given("^I am on the fee page$")
	public void i_am_on_the_fee_page() throws Throwable {
		journeyFactory.getATETFeePageJourney();
	}

	@Given("^I am on the check your claim page$")
	public void i_am_on_the_check_your_claim_page() throws Throwable {
		journeyFactory.getATETCheckYourClaimPageJourney();
	}
	
	@Given("^I am on the pay issue fee page$")
	public void i_am_on_the_pay_issue_fee_page() throws Throwable {
	    journeyFactory.getATETPayIssueFeeJourney();
	}
	
	
	@Given("^I am on the card payment page$")
	public void i_am_on_the_card_payment_page() throws Throwable {
		journeyFactory.getATETPayYourFeeBankJourney();
	}

	@Then("^I capture a screen image \"(.*?)\"$")
	public void i_capture_a_screen_image(String sFileName) throws Throwable {
		PageFactory.getATETPage(driver).capturePageScreenShot(sFileName);
	}
	
	@When("^I click the browser back button$")
	public void i_click_the_browser_back_button() throws Throwable {
	    PageFactory.getATETAboutTheClaimPage(driver).back();
	}

}
