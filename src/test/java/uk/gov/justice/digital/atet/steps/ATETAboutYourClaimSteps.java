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

public class ATETAboutYourClaimSteps {
	

	private StepContext stepConText = StepContextSingleton.getInstance();

	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETAboutYourClaimSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I click the what is this unfair dismissal link$")
	public void i_click_the_what_is_this_unfair_dismissal_link()
			throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickUnfairDismissalWhatIsThisLink();
	}

	@When("^I click unfair dismissal$")
	public void i_click_unfair_dismissal() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickIsUnfairDismissal();
	}

	@When("^I click sex dicrimination$")
	public void i_click_sex_dicrimination() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickDiscriminationSexIncludingEqualPay();
	}

	@When("^I click disability dicrimination$")
	public void i_click_disability_dicrimination() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickDiscriminationDisability();
	}

	@When("^I click race dicrimination$")
	public void i_click_race_dicrimination() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickDiscriminationRace();
	}

	@When("^I click age dicrimination$")
	public void i_click_age_dicrimination() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickDiscriminationAge();
	}

	@When("^I click maternity dicrimination$")
	public void i_click_maternity_dicrimination() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickDiscriminationPregnancyOrMaternity();
	}

	@When("^I click religious dicrimination$")
	public void i_click_religious_dicrimination() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickDiscriminationReligionOrBelief();
	}

	@When("^I click sexual orientation dicrimination$")
	public void i_click_sexual_orientation_dicrimination() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickDiscriminationSexualOrientation();
	}

	@When("^I click marital dicrimination$")
	public void i_click_marital_dicrimination() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickDiscriminationMarriageOrCivilPartnership();
	}

	@When("^I click gender reassignment dicrimination$")
	public void i_click_gender_reassignment_dicrimination() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickDiscriminationGenderReassignment();
	}

	@When("^I click redundancy pay$")
	public void i_click_redundancy_pay() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickPayClaimsRedundancy();
	}

	@When("^I click notice pay$")
	public void i_click_notice_pay() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickPayClaimsNotice();
	}

	@When("^I click holiday pay$")
	public void i_click_holiday_pay() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickPayClaimsHoliday();
	}

	@When("^I click arrears of pay$")
	public void i_click_arrears_of_pay() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickPayClaimsArrears();
	}

	@When("^I click other payments$")
	public void i_click_other_payments() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickPayClaimsOther();
	}

	@When("^I click other type of claim$")
	public void i_click_other_type_of_claim() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickIsOtherTypeOfClaim();
	}

	@When("^I enter details of the other claim \"(.*?)\"$")
	public void i_enter_details_of_the_other_claim(String text) throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).setTextIsOtherTypeOfClaimDetailText(text);
	}

	@When("^I click NO this claim is not whistleblowing$")
	public void i_click_NO_this_claim_is_not_whistleblowing() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickIswhistleblowingNo();
	}

	@When("^I click YES this claim is whistleblowing$")
	public void i_click_YES_this_claim_is_whistleblowing() throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickIswhistleblowingYes();
	}

	@When("^I click NO to fowarding the claim to whistleblowing authority$")
	public void i_click_NO_to_fowarding_the_claim_to_whistleblowing_authority()
			throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickSendclaimtowhistleblowingentityNo();
	}

	@When("^I click YES to forward the claim to the whistleblowing authority$")
	public void i_click_YES_to_forward_the_claim_to_the_whistleblowing_authority()
			throws Throwable {
		PageFactory.getATETAboutYourClaimPage(driver).clickSendclaimtowhistleblowingentityYes();
	}
	
	@Then("^I am redirected to page (\\d+) claim detail page$")
	public void i_am_redirected_to_page_claim_detail_page(int arg1) throws Throwable {
		assertTrue( PageFactory.getATETClaimDetailPage(driver).verifyOnPage() );
	}
	

}
