package uk.gov.justice.digital.atet.steps;

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

import java.util.List;

public class ATETClaimsDetailSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();

	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETClaimsDetailSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I click about writing your claim statement link$")
	public void i_click_about_writing_your_claim_statement_link()
			throws Throwable {
		PageFactory.getATETClaimDetailPage(driver)
				.clickMoreAboutWritingYourClaimStatementLink();
	}

	@When("^I click it as upload separate document link$")
	public void i_click_it_as_upload_separate_document_link() throws Throwable {
		PageFactory.getATETClaimDetailPage(driver)
				.clickUploadItAsASeparateDocumentLink();
	}

	@When("^I enter the claim details:$")
	public void i_enter_the_claim_details(List<List<String>> text)
			throws Throwable {
		PageFactory.getATETClaimDetailPage(driver).setTextClaimsDetails(
				text.get(0).get(0));
	}

	@When("^I click YES there are other claimants$")
	public void i_click_YES_there_are_other_claimants() throws Throwable {
		PageFactory.getATETClaimDetailPage(driver)
				.clickOtherKnownClaimantsYes();
	}

	@When("^I click NO there are no othere claimants$")
	public void i_click_NO_there_are_no_othere_claimants() throws Throwable {
		PageFactory.getATETClaimDetailPage(driver).clickOtherKnownClaimantsNo();
	}

	@When("^I enter the other claimants names:$")
	public void i_enter_the_other_claimants_names(List<List<String>> text)
			throws Throwable {
		PageFactory.getATETClaimDetailPage(driver)
				.setTextOtherKnownClaimantNames(text.get(0).get(0));
	}

	@Then("^I am redirected to page (\\d+) claim outcome page$")
	public void i_am_redirected_to_page_claim_outcome_page(int arg1) throws Throwable {
		assertTrue(PageFactory.getATETClaimOutcomePage(driver).verifyOnPage());
	}

}
