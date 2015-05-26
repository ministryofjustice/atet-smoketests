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

public class ATETMoreAboutTheClaimSteps {
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETMoreAboutTheClaimSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@Then("^I click NO I do not have further information to add$")
	public void i_click_NO_I_do_not_have_further_information_to_add() throws Throwable {
	    PageFactory.getATETMoreAboutTheClaimPage(driver).clickOtherimportantdetailsNo();
	}

	@Then("^I click YES I do have further information to add$")
	public void i_click_YES_I_do_have_further_information_to_add() throws Throwable {
		PageFactory.getATETMoreAboutTheClaimPage(driver).clickOtherimportantdetailsYes();
	}

	@Then("^I enter further information for my claim:$")
	public void i_enter_further_information_for_my_claim(List<List<String>> text) throws Throwable {
		PageFactory.getATETMoreAboutTheClaimPage(driver).setTextOtherDetailsText(text.get(0).get(0));
	}

	@Then("^I am redirected to the page (\\d+) the fee page$")
	public void i_am_redirected_to_the_page_the_fee_page(int arg1) throws Throwable{
	   PageFactory.getATETFeePage(driver).verifyOnPage();
	}


}
