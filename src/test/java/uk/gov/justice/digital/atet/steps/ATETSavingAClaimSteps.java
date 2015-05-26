package uk.gov.justice.digital.atet.steps;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.atet.factories.FakeDataFactory;
import uk.gov.justice.digital.atet.factories.JourneyFactory;
import uk.gov.justice.digital.atet.factories.PageFactory;
import uk.gov.justice.digital.atet.step.StepContext;
import uk.gov.justice.digital.atet.step.StepContextSingleton;
import uk.gov.justice.digital.atet.webdriver.SharedDriver;

public class ATETSavingAClaimSteps {
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETSavingAClaimSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@Then("^error dialog is displayed on the saving yoiur claim page$")
	public void error_dialog_is_displayed_on_the_saving_yoiur_claim_page() throws Throwable {
	    assertTrue(PageFactory.getATETSavingYourClaimPage(driver).errorOnPage());
	}
	
	@When("^I enter an optional email address$")
	public void i_enter_an_optional_email_address() throws Throwable {
	    PageFactory.getATETSavingYourClaimPage(driver).setEmailAddress(FakeDataFactory.getEmailAddress());
	}


}
