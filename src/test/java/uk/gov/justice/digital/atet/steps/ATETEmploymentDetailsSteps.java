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


public class ATETEmploymentDetailsSteps {
	

	private StepContext stepConText = StepContextSingleton.getInstance();

	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETEmploymentDetailsSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I click NO that I have not work for the employer before$")
	public void i_click_NO_that_I_have_not_work_for_the_employer_before() throws Throwable {
	    PageFactory.getATETEmploymentDetails(driver).clickEmployedByOrganisationInClaim_No();
	}

	@When("^I click YES that I have  worked for the employer before$")
	public void i_click_YES_that_I_have_worked_for_the_employer_before() throws Throwable {
	    PageFactory.getATETEmploymentDetails(driver).clickEmployedByOrganisationInClaim_Yes();
	}

	@When("^I click I am still working for the employer$")
	public void i_click_I_am_still_working_for_the_employer() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickStillWorkingForTheEmployer();
	}

	@When("^I click I am still working my notice with the employer$")
	public void i_click_I_am_still_working_my_notice_with_the_employer() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickWorkingANoticeForTheEmployer();
	}

	@When("^I click I am no longer working for the employer$")
	public void i_click_I_am_no_longer_working_for_the_employer() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickNolongerWorkingForTheEmployer();
	}

	@Then("^I am directed to page (\\d+) about the claim page$")
	public void i_am_directed_to_page_about_the_claim_page(int arg1) throws Throwable {
	    assertTrue(PageFactory.getATETAboutTheClaimPage(driver).verifyOnPage());
	}
	
	@When("^I enter my job title \"(.*?)\"$")
	public void i_enter_my_job_title(String job) throws Throwable {
	    PageFactory.getATETEmploymentDetails(driver).setJobTitle(job);
	}

	@When("^I enter employment start day \"(.*?)\"$")
	public void i_enter_employment_start_day(String day) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setStartDateDay(day);
	}

	@When("^I enter employment start month \"(.*?)\"$")
	public void i_enter_employment_start_month(String month) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setStartDateMonth(month);
	}

	@When("^I enter employment start year \"(.*?)\"$")
	public void i_enter_employment_start_year(String year) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setStartDateYear(year);
	}

	@When("^I enter employment end day \"(.*?)\"$")
	public void i_enter_employment_end_day(String day) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setEndDateDay(day);
	}

	@When("^I enter employment end month \"(.*?)\"$")
	public void i_enter_employment_end_month(String month) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setEndDateMonth(month);
	}

	@When("^I enter employment end year \"(.*?)\"$")
	public void i_enter_employment_end_year(String year) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setEndDateYear(year);
	}

	@When("^I click NO I did not work a notice period$")
	public void i_click_NO_I_did_not_work_a_notice_period() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickWorkedNotice_No();
	}

	@When("^I click YES I did work a notice period$")
	public void i_click_YES_I_did_work_a_notice_period() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickWorkedNotice_Yes();
	}

	@When("^I enter \"(.*?)\" employment duration units$")
	public void i_enter_employment_duration_units(String duration) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setEmploymentDuration(duration);
	}

	@When("^I click weekly employment duration units$")
	public void i_click_weekly_employment_duration_units() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickDurationWeeks();
	}

	@When("^I click months employment duration units$")
	public void i_click_months_employment_duration_units() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickDurationMonths();
	}
	
	@When("^I enter my gross pay \"(.*?)\"$")
	public void i_enter_my_gross_pay(String pay) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setGrossPay(pay);
	}

	@When("^I click weekly gross pay$")
	public void i_click_weekly_gross_pay() throws Throwable {
	    PageFactory.getATETEmploymentDetails(driver).clickGrossPayWeekly();
	}

	@When("^I click monthly gross pay$")
	public void i_click_monthly_gross_pay() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickGrossPayMonthly();
	}

	@When("^I enter my net pay \"(.*?)\"$")
	public void i_enter_my_net_pay(String pay) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setNetPay(pay);
	}

	@When("^I click weekly net pay$")
	public void i_click_weekly_net_pay() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickNetPayWeekly();
	}

	@When("^I click monthly net pay$")
	public void i_click_monthly_net_pay() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickNetPayMonthly();
	}

	@When("^I click NO not a member of an employers pension scheme$")
	public void i_click_NO_not_a_member_of_an_employers_pension_scheme() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickMemberOfEmployersPensionScheme_No();
	}

	@When("^I click YES I was a member of an employers pension scheme$")
	public void i_click_YES_I_was_a_member_of_an_employers_pension_scheme() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickMemberOfEmployersPensionScheme_Yes();
	}

	@When("^I enter any employer benefits:$")
	public void i_enter_any_employer_benefits(List<List<String>> benefits) throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).setEmploymentBenefitText(benefits.get(0).get(0));
	}

	@When("^I click NO I do not have a new job$")
	public void i_click_NO_I_do_not_have_a_new_job() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickNewJob_No();
	}

	@When("^I click YES I do have a new job$")
	public void i_click_YES_I_do_have_a_new_job() throws Throwable {
		PageFactory.getATETEmploymentDetails(driver).clickNewJob_Yes();
	}



}
