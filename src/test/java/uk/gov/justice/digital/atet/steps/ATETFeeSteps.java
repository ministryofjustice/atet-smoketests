package uk.gov.justice.digital.atet.steps;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.atet.factories.JourneyFactory;
import uk.gov.justice.digital.atet.step.StepContext;
import uk.gov.justice.digital.atet.step.StepContextSingleton;
import uk.gov.justice.digital.atet.webdriver.SharedDriver;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.atet.factories.JourneyFactory;
import uk.gov.justice.digital.atet.step.StepContext;
import uk.gov.justice.digital.atet.step.StepContextSingleton;
import uk.gov.justice.digital.atet.webdriver.SharedDriver;

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

public class ATETFeeSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();

	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETFeeSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I click see more details on fees$")
	public void i_click_see_more_details_on_fees() throws Throwable {
		PageFactory.getATETFeePage(driver).clickSeeMoreAboutFeesLink();
	}

	@When("^I click the guide for fee remission$")
	public void i_click_the_guide_for_fee_remission() throws Throwable {
		PageFactory.getATETFeePage(driver).clickGuideForFeeRemissionLink();
	}

	@When("^I click NO I do not need fee remission$")
	public void i_click_NO_I_do_not_need_fee_remission() throws Throwable {
		PageFactory.getATETFeePage(driver).clickApplyingforremissionNo();
	}

	@When("^I click YES I do need fee remission$")
	public void i_click_YES_I_do_need_fee_remission() throws Throwable {
		PageFactory.getATETFeePage(driver).clickApplyingforremissionYes();
	}

	@When("^I click fee remission application form$")
	public void i_click_fee_remission_application_form() throws Throwable {
		PageFactory.getATETFeePage(driver).clickFeeRemissionApplicationLink();
	}

	@Then("^I am redirected to check your claim page$")
	public void i_am_redirected_to_check_your_claim_page() throws Throwable {
		assertTrue(PageFactory.getATETCheckYourClaimPage(driver).verifyOnPage());
	}
	
	@When("^I enter (\\d+) claimant count$")
	public void i_enter_claimant_count(int count) throws Throwable {
		PageFactory.getATETFeePage(driver).setClaimantCount(count);
	}

}
