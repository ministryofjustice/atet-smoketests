package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ATETClaimOutcomePage extends ATETPage {
	private By claimOutcomeCompensationOnly = new By.ById(
			"claim_outcome_desired_outcomes_compensation_only");
	private By claimOutcomeTribunalRecommendation = new By.ById(
			"claim_outcome_desired_outcomes_tribunal_recommendation");
	private By claimOutcomeReinstatedEmployment = new By.ById(
			"claim_outcome_desired_outcomes_reinstated_employment_and_compensation");
	private By claimOutcomeNewEmployment = new By.ById(
			"claim_outcome_desired_outcomes_new_employment_and_compensation");
	private By claimOtherOutcomeDetails = new By.ById(
			"claim_outcome_other_outcome");
	private String expectedTextOnPage = "Claim outcome";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/header/h1");

	public ATETClaimOutcomePage(WebDriver driver) {
		super(driver);
	}

	public void clickClaimOutcomeCompensationOnly() throws Exception {
		click(claimOutcomeCompensationOnly);
	}

	public void clickClaimOutcomeTribunalRecommendation() throws Exception {
		click(claimOutcomeTribunalRecommendation);
	}

	public void clickClaimOutcomeReinstatedEmployment() throws Exception {
		click(claimOutcomeReinstatedEmployment);
	}

	public void clickClaimOutcomeNewEmployment() throws Exception {
		click(claimOutcomeNewEmployment);
	}

	public void setTextClaimOtherOutcomeDetails(String text) throws Exception {
		setText(claimOtherOutcomeDetails, text);
	}

	public boolean hasFocusClaimOtherOutcomeDetails() throws Exception {
		return hasFocus(claimOtherOutcomeDetails);
	}

	public boolean verifyClaimOtherOutcomeDetailsText(String inputText)
			throws Exception {
		return getAttributeValue(claimOtherOutcomeDetails, "value")
				.equalsIgnoreCase(inputText);
	}

	public boolean verifyOnPage() throws Exception {
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
}

