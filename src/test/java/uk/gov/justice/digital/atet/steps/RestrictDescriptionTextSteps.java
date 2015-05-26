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

public class RestrictDescriptionTextSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public RestrictDescriptionTextSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^you enter (\\d+) lines with (\\d+) characters in the claim description$")
	public void you_enter_lines_with_characters_in_the_claim_description(int number_of_lines, int number_of_characters) throws Throwable {
	    PageFactory.getATETClaimDetailPage(driver).setTextClaimsDetails(FakeDataFactory.generateRandomLines(number_of_lines, number_of_characters));
	}

	@Then("^I am directed to page (\\d+) claim outcome$")
	public void i_am_directed_to_page_claim_outcome(int arg1) throws Throwable {
	    assertTrue(PageFactory.getATETClaimOutcomePage(driver).verifyOnPage());
	}	
	
	@Then("^the error is exceeded the maximum number of characters permitted$")
	public void the_error_is_exceeded_the_maximum_number_of_characters_permitted() throws Throwable {
		assertTrue(PageFactory.getATETClaimDetailPage(driver).errorFieldExceedsCharacterLimit());
	}
	
	
}
