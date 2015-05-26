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

public class ATETPayIssueFeeSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETPayIssueFeeSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I click pay by cheque$")
	public void i_click_pay_by_cheque() throws Throwable {
		PageFactory.getATETPayIssueFeePage(driver).clickToPayByCheque();
	}

	@When("^I click pay issue fee contact us$")
	public void i_click_pay_issue_fee_contact_us() throws Throwable {
		PageFactory.getATETPayIssueFeePage(driver).clickContactUs();
	}

	@When("^I click save claim to pdf$")
	public void i_click_save_claim_to_pdf() throws Throwable {
		PageFactory.getATETPayIssueFeePage(driver).clickSaveToPdf();
	}

	@When("^I click pay issue fee$")
	public void i_click_pay_issue_fee() throws Throwable {
		PageFactory.getATETPayIssueFeePage(driver).clickPayIssueButton();
	}

	@Then("^I am redirected to the pay fee by card page$")
	public void i_am_redirected_to_the_pay_fee_by_card_page() throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).verifyOnPage();
	}

}
