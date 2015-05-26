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

public class ATETClaimOutcomeSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETClaimOutcomeSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I click compensation$")
	public void i_click_compensation() throws Throwable {
	    PageFactory.getATETClaimOutcomePage(driver).clickClaimOutcomeCompensationOnly();
	}

	@When("^I click recommendation from tribunal$")
	public void i_click_recommendation_from_tribunal() throws Throwable {
		PageFactory.getATETClaimOutcomePage(driver).clickClaimOutcomeTribunalRecommendation();
	}

	@When("^I click get your old job back$")
	public void i_click_get_your_old_job_back() throws Throwable {
		PageFactory.getATETClaimOutcomePage(driver).clickClaimOutcomeReinstatedEmployment();
	}

	@When("^I click get a new job with same employer$")
	public void i_click_get_a_new_job_with_same_employer() throws Throwable {
		PageFactory.getATETClaimOutcomePage(driver).clickClaimOutcomeNewEmployment();
	}

	@When("^I enter details for other claim compensation:$")
	public void i_enter_details_for_other_claim_compensation(List<List<String>> text) throws Throwable {
	    PageFactory.getATETClaimOutcomePage(driver).setTextClaimOtherOutcomeDetails(text.get(0).get(0));
	}

	@Then("^I am redirected to page (\\d+) more about your page$")
	public void i_am_redirected_to_page_more_about_your_page(int arg1) throws Throwable {
		assertTrue(PageFactory.getATETMoreAboutTheClaimPage(driver).verifyOnPage());
	}

}
