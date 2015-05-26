package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ATETAboutTheClaimPage extends ATETPage {
	private By unfairDismissalWhatIsThisLink = new By.ByXPath(
			".//*[@id='edit_claim_type']/div[1]/fieldset[1]/details/summary/span");
	private By isUnfairDismissal = new By.ById("claim_type_is_unfair_dismissal");
	private By discriminationSexIncludingEqualPay = new By.ById(
			"claim_type_discrimination_claims_sex_including_equal_pay");
	private By discriminationDisability = new By.ById(
			"claim_type_discrimination_claims_disability");
	private By discriminationRace = new By.ById(
			"claim_type_discrimination_claims_race");
	private By discriminationAge = new By.ById(
			"claim_type_discrimination_claims_age");
	private By discriminationPregnancyOrMaternity = new By.ById(
			"claim_type_discrimination_claims_pregnancy_or_maternity");
	private By discriminationReligionOrBelief = new By.ById(
			"claim_type_discrimination_claims_religion_or_belief");
	private By discriminationSexualOrientation = new By.ById(
			"claim_type_discrimination_claims_sexual_orientation");
	private By discriminationMarriageOrCivilPartnership = new By.ById(
			"claim_type_discrimination_claims_marriage_or_civil_partnership");
	private By discriminationGenderReassignment = new By.ById(
			"claim_type_discrimination_claims_gender_reassignment");
	private By payClaimsRedundancy = new By.ById(
			"claim_type_pay_claims_redundancy");
	private By payClaimsNotice = new By.ById("claim_type_pay_claims_notice");
	private By payClaimsHoliday = new By.ById("claim_type_pay_claims_holiday");
	private By payClaimsArrears = new By.ById("claim_type_pay_claims_arrears");
	private By payClaimsOther = new By.ById("claim_type_pay_claims_other");
	private By isOtherTypeOfClaim = new By.ById(
			"claim_type_is_other_type_of_claim");
	private By isOtherTypeOfClaimDetailText = new By.ById(
			"claim_type_other_claim_details");
	private By isWhistleblowing_Yes = new By.ById(
			"claim_type_is_whistleblowing_true");
	private By isWhistleblowing_No = new By.ById(
			"claim_type_is_whistleblowing_false");
	private By sendClaimToWhistleblowingEntity_Yes = new By.ById(
			"claim_type_send_claim_to_whistleblowing_entity_true");
	private By sendClaimToWhistleblowingEntity_No = new By.ById(
			"claim_type_send_claim_to_whistleblowing_entity_false");
	private String expectedTextOnPage = "About the claim";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/header/h1");

	public ATETAboutTheClaimPage(WebDriver driver) {
		super(driver);
	}

	public void clickUnfairDismissalWhatIsThisLink() throws Exception {
		click(unfairDismissalWhatIsThisLink);
	}

	public void clickIsUnfairDismissal() throws Exception {
		click(isUnfairDismissal);
	}

	public void clickDiscriminationSexIncludingEqualPay() throws Exception {
		click(discriminationSexIncludingEqualPay);
	}

	public void clickDiscriminationDisability() throws Exception {
		click(discriminationDisability);
	}

	public void clickDiscriminationRace() throws Exception {
		click(discriminationRace);
	}

	public void clickDiscriminationAge() throws Exception {
		click(discriminationAge);
	}

	public void clickDiscriminationPregnancyOrMaternity() throws Exception {
		click(discriminationPregnancyOrMaternity);
	}

	public void clickDiscriminationReligionOrBelief() throws Exception {
		click(discriminationReligionOrBelief);
	}

	public void clickDiscriminationSexualOrientation() throws Exception {
		click(discriminationSexualOrientation);
	}

	public void clickDiscriminationMarriageOrCivilPartnership()
			throws Exception {
		click(discriminationMarriageOrCivilPartnership);
	}

	public void clickDiscriminationGenderReassignment() throws Exception {
		click(discriminationGenderReassignment);
	}

	public void clickPayClaimsRedundancy() throws Exception {
		click(payClaimsRedundancy);
	}

	public void clickPayClaimsNotice() throws Exception {
		click(payClaimsNotice);
	}

	public void clickPayClaimsHoliday() throws Exception {
		click(payClaimsHoliday);
	}

	public void clickPayClaimsArrears() throws Exception {
		click(payClaimsArrears);
	}

	public void clickPayClaimsOther() throws Exception {
		click(payClaimsOther);
	}

	public void clickIsOtherTypeOfClaim() throws Exception {
		click(isOtherTypeOfClaim);
	}

	public void setTextIsOtherTypeOfClaimDetailText(String text)
			throws Exception {
		setText(isOtherTypeOfClaimDetailText, text);
	}

	public boolean hasFocusIsOtherTypeOfClaimDetailText() throws Exception {
		return hasFocus(isOtherTypeOfClaimDetailText);
	}

	public boolean verifyIsOtherTypeOfClaimDetailTextText(String inputText)
			throws Exception {
		return getAttributeValue(isOtherTypeOfClaimDetailText, "value")
				.equalsIgnoreCase(inputText);
	}

	public void clickIswhistleblowingYes() throws Exception {
		click(isWhistleblowing_Yes);
	}

	public void clickIswhistleblowingNo() throws Exception {
		click(isWhistleblowing_No);
	}

	public void clickSendclaimtowhistleblowingentityYes() throws Exception {
		click(sendClaimToWhistleblowingEntity_Yes);
	}

	public void clickSendclaimtowhistleblowingentityNo() throws Exception {
		click(sendClaimToWhistleblowingEntity_No);
	}

	public boolean verifyOnPage() throws Exception {
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
}
