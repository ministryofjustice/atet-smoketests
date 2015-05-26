package uk.gov.justice.digital.atet.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.atet.factories.JourneyFactory;
import uk.gov.justice.digital.atet.factories.PageFactory;
import uk.gov.justice.digital.atet.step.StepContext;
import uk.gov.justice.digital.atet.step.StepContextSingleton;
import uk.gov.justice.digital.atet.webdriver.SharedDriver;

public class EmailValidationSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public EmailValidationSteps(SharedDriver driver) {
         this.driver = driver;
 		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I enter a valid email address \"(.*?)\"$")
	public void i_enter_a_valid_email_address(String emailAddress) throws Throwable {
		stepConText.setEmailAddress(emailAddress);
	    PageFactory.getATETSavingYourClaimPage(driver).setEmailAddress(emailAddress);
	}
	
	@When("^I enter a invalid email address \"(.*?)\"$")
	public void i_enter_a_invalid_email_address(String emailAddress) throws Throwable {
		stepConText.setEmailAddress(emailAddress);
		PageFactory.getATETSavingYourClaimPage(driver).setEmailAddress(emailAddress);
	}

	@Then("^I receive an error$")
	public void i_receive_an_error() throws Throwable {
	    assertTrue("Expected Error for invalid email address : " + stepConText.getEmailAddress(),PageFactory.getATETSavingYourClaimPage(driver).errorDisplayed());
	}

	@Then("^the error is invalid email address$")
	public void the_error_is_invalid_email_address() throws Throwable {
		assertTrue(PageFactory.getATETSavingYourClaimPage(driver).errorInvalidEmail());
	}

}
