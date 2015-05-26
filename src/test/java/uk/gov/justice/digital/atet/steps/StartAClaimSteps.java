package uk.gov.justice.digital.atet.steps;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import uk.gov.justice.digital.atet.step.StepContext;
import uk.gov.justice.digital.atet.step.StepContextSingleton;
import uk.gov.justice.digital.atet.factories.FakeDataFactory;
import uk.gov.justice.digital.atet.factories.JourneyFactory;
import uk.gov.justice.digital.atet.factories.PageFactory;
import uk.gov.justice.digital.atet.webdriver.SharedDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartAClaimSteps {
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public StartAClaimSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}


	@When("^I select to start a claim$")
	public void i_select_to_start_a_claim() throws Throwable {
	    PageFactory.getATETStartPage(driver).clickStartAClaimButton();
	}

	@Then("^I am directed to page (\\d+) saving my claim$")
	public void i_am_directed_to_page_saving_my_claim(int arg1) throws Throwable {
	    assertTrue(PageFactory.getATETSavingYourClaimPage(driver).verifyOnPage());
	}	
	


	@When("^I enter a memorable word$")
	public void i_enter_a_memorable_word() throws Throwable {
	    PageFactory.getATETSavingYourClaimPage(driver).setClaimMemorableWord(FakeDataFactory.getATETMemorableWord());
	}

	@Then("^I am directed to page (\\d+) claimant details$")
	public void i_am_directed_to_page_claimant_details(int arg1) throws Throwable {
	    assertTrue(PageFactory.getATETClaimantDetailsPage(driver).verifyOnPage());
	}
	
	@When("^I click save and continue$")
	public void i_click_save_and_continue() throws Throwable {
	    PageFactory.getATETPage(driver).clickSaveAndContinueButton();
	}

	@When("^I select to return to a claim$")
	public void i_select_to_return_to_a_claim() throws Throwable {
	    PageFactory.getATETStartPage(driver).clickReturnToAClaim();
	}

	@Then("^I am redirected to return to claim page$")
	public void i_am_redirected_to_return_to_claim_page() throws Throwable {
	    assertTrue(PageFactory.getATETReturnToAClaimPage(driver).verifyOnPage());
	}


}
