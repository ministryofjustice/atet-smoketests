package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class ATETEmploymentDetails extends ATETPage {

	private String expectedTextOnPage = "Employment details";
	private By expectedTextOnPageSelector = new By.ByXPath(".//*[@id='content']/div/header/h1");
	
	private By employedByOrganisationInClaim_No= new By.ByXPath(".//*[@id='employment_was_employed_false']");
	private By employedByOrganisationInClaim_Yes= new By.ByXPath(".//*[@id='employment_was_employed_true']");
	
	private By stillWorkingForTheEmployer = new By.ByXPath(".//*[@id='employment_current_situation_still_employed']");
	private By workingANoticeForTheEmployer = new By.ByXPath(".//*[@id='employment_current_situation_notice_period']");
	private By nolongerWorkingForTheEmployer = new By.ByXPath(".//*[@id='employment_current_situation_employment_terminated']");
	
	private By jobTitle = new By.ByXPath(".//*[@id='employment_job_title']");
	private By startDateDay = new By.ByXPath(".//*[@id='employment_start_date_day']");
	private By startDateMonth = new By.ByXPath(".//*[@id='employment_start_date_month']");
	private By startDateYear = new By.ByXPath(".//*[@id='employment_start_date_year']");
	private By endDateDay = new By.ByXPath(".//*[@id='employment_end_date_day']");
	private By endDateMonth = new By.ByXPath(".//*[@id='employment_end_date_month']");
	private By endDateYear = new By.ByXPath(".//*[@id='employment_end_date_year']");
	
	private By workedNotice_Yes = new By.ByXPath(".//*[@id='employment_worked_notice_period_or_paid_in_lieu_true']");
	private By workedNotice_No = new By.ByXPath(".//*[@id='employment_worked_notice_period_or_paid_in_lieu_false']");
	
	private By noticePeriodDuration = new By.ByXPath(".//*[@id='employment_notice_pay_period_count']");
	private By noticePeriodDurationWeeks = new By.ByXPath(".//*[@id='employment_notice_pay_period_type_weeks']");
	private By noticePeriodDurationMonths = new By.ByXPath(".//*[@id='employment_notice_pay_period_type_months']");
	
	private By averageHoursWorkedPerWeek = new By.ByXPath(".//*[@id='employment_average_hours_worked_per_week']");
	
	private By grossPay = new By.ByXPath(".//*[@id='employment_gross_pay']");
	private By grossPayWeekly = new By.ByXPath(".//*[@id='employment_gross_pay_period_type_weekly']");
	private By grossPayMonthly = new By.ByXPath(".//*[@id='employment_gross_pay_period_type_monthly']");
	
	private By netPay = new By.ByXPath(".//*[@id='employment_net_pay']");
	private By netPayWeekly = new By.ByXPath(".//*[@id='employment_net_pay_period_type_weekly']");
	private By netPayMonthly = new By.ByXPath(".//*[@id='employment_net_pay_period_type_monthly']");
	
	private By memberOfEmployersPensionScheme_No = new By.ByXPath(".//*[@id='employment_enrolled_in_pension_scheme_false']");
	private By memberOfEmployersPensionScheme_Yes = new By.ByXPath(".//*[@id='employment_enrolled_in_pension_scheme_true']");
	
	private By employmentBenefitText = new By.ByXPath(".//*[@id='employment_benefit_details']");
	
	private By newJob_No = new By.ByXPath(".//*[@id='employment_found_new_job_false']");
	private By newJob_Yes = new By.ByXPath(".//*[@id='employment_found_new_job_true']");
	
	public void setEmploymentBenefitText(String benefits) throws Exception{
		setText(employmentBenefitText,benefits);
	}
	
	public void clickNewJob_No() throws Exception{
		click(newJob_No);
	}
	
	public void clickNewJob_Yes() throws Exception{
		click(newJob_Yes);
	}
	
	public void setGrossPay(String pay) throws Exception{
		setText(grossPay, pay);
	}
	
	public void clickGrossPayWeekly() throws Exception{
		click(grossPayWeekly);
	}
	
	public void clickGrossPayMonthly() throws Exception{
		click(grossPayMonthly);
	}
	
	public void setNetPay(String pay) throws Exception{
		setText(netPay, pay);
	}
	
	public void clickNetPayWeekly() throws Exception{
		click(netPayWeekly);
	}
	
	public void clickNetPayMonthly() throws Exception{
		click(netPayMonthly);
	}
	
	public void clickMemberOfEmployersPensionScheme_No() throws Exception{
		click(memberOfEmployersPensionScheme_No);
	}
	
	public void clickMemberOfEmployersPensionScheme_Yes() throws Exception{
		click(memberOfEmployersPensionScheme_Yes);
	}
	
	public void setJobTitle(String job) throws Exception{
		setText(jobTitle, job);
	}
	
	public void setStartDateDay(String day) throws Exception{
		setText(startDateDay, day);
	}
	
	public void setStartDateMonth(String month) throws Exception{
		setText(startDateMonth, month);
	}	
	
	public void setStartDateYear(String year) throws Exception{
		setText(startDateYear, year);
	}	
	
	public void setEndDateDay(String day) throws Exception{
		setText(endDateDay, day);
	}
	
	public void setEndDateMonth(String month) throws Exception{
		setText(endDateMonth, month);
	}	
	
	public void setEndDateYear(String year) throws Exception{
		setText(endDateYear, year);
	}	
	
	public void clickWorkedNotice_Yes() throws Exception{
		click(workedNotice_Yes);
	}
	
	public void clickWorkedNotice_No() throws Exception{
		click(workedNotice_No);
	}
	
	public void setEmploymentDuration(String duration) throws Exception{
		setText(noticePeriodDuration, duration);
	}
	
	public void clickDurationWeeks() throws Exception{
		click(noticePeriodDurationWeeks);
	}
	
	public void clickDurationMonths() throws Exception{
		click(noticePeriodDurationMonths);
	}
	
	public void setAverageHoursWorkedPerWeek(String hours) throws Exception{
		setText(averageHoursWorkedPerWeek, hours);
	}
	
	public void clickNolongerWorkingForTheEmployer() throws Exception{
		click(nolongerWorkingForTheEmployer);
	}
	
	public void clickWorkingANoticeForTheEmployer() throws Exception{
		click(workingANoticeForTheEmployer);
	}
	
	public void clickStillWorkingForTheEmployer() throws Exception{
		click(stillWorkingForTheEmployer);
	}
	
	public void clickEmployedByOrganisationInClaim_Yes() throws Exception{
		click(employedByOrganisationInClaim_Yes);
	}
	
	public void clickEmployedByOrganisationInClaim_No() throws Exception{
		click(employedByOrganisationInClaim_No);
	}
	
	public ATETEmploymentDetails(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
	
}
