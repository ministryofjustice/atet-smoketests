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

public class ATETCheckYourClaimSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();

	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETCheckYourClaimSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}	

	@When("^I click edit claimant details$")
	public void i_click_edit_claimant_details() throws Throwable {
	    PageFactory.getATETCheckYourClaimPage(driver).clickEditClaimantDetails();
	}

	@When("^I click edit group claim$")
	public void i_click_edit_group_claim() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickEditGroupClaim();
	}

	@When("^I click edit representatives details$")
	public void i_click_edit_representatives_details() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickEditRepresentativeDetails();
	}

	@When("^I click edit respondent details$")
	public void i_click_edit_respondent_details() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickEditRespondentDetails();
	}

	@When("^I click edit additional respondents$")
	public void i_click_edit_additional_respondents() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickEditAdditionalRespondents();
	}

	@When("^I click edit employment details$")
	public void i_click_edit_employment_details() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickEditEmploymentDetails();
	}

	@When("^I click edit claim type$")
	public void i_click_edit_claim_type() throws Throwable {
	    PageFactory.getATETCheckYourClaimPage(driver).clickEditClaimType();
	}

	@When("^I click edit claim details$")
	public void i_click_edit_claim_details() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickEditClaimDetails();
	}

	@When("^I click edit claim outcome$")
	public void i_click_edit_claim_outcome() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickEditClaimOutcome();
	}

	@When("^I click edit additional information$")
	public void i_click_edit_additional_information() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickeditAdditionalInformation();
	}

	@When("^I click edit issue fee$")
	public void i_click_edit_issue_fee() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickEditIssueFee();
	}

	@When("^I click print check your claim link$")
	public void i_click_print_check_your_claim_link() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickPrintThisPage();
	}

	@When("^I click submit claim and move to payment$")
	public void i_click_submit_claim_and_move_to_payment() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickSubmitClaimAndProceedToPaymentButton();
	}
	
	@When("^I click submit claim$")
	public void i_click_submit_claim() throws Throwable {
		PageFactory.getATETCheckYourClaimPage(driver).clickSubmitClaim();
	}
	
	@Then("^I am redirected to the pay issue fee page$")
	public void i_am_redirected_to_the_pay_issue_fee_page() throws Throwable {
	    PageFactory.getATETPayIssueFeePage(driver).verifyOnPage();
	}
	
	@Then("^I am redirected to the claim submitted page$")
	public void i_am_redirected_to_the_claim_submitted_page() throws Throwable {
	    assertTrue(PageFactory.getATETClaimSubmittedPage(driver).verifyOnPage());
	}

	
	

}
