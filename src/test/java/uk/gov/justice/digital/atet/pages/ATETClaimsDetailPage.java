package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.WebDriver;
import uk.gov.justice.digital.atet.page.SeleniumPage;
import org.openqa.selenium.By;

public class ATETClaimsDetailPage extends SeleniumPage {
	private By moreAboutWritingYourClaimStatementLink = new By.ByXPath(
			".//*[@id='edit_claim_details']/div[1]/p/a");
	private By uploadItAsASeparateDocumentLink = new By.ByXPath(
			".//*[@id='edit_claim_details']/div[1]/details/summary/span");
	private By claimsDetails = new By.ById("claim_details_claim_details");
	private By otherKnownClaimantsYes = new By.ById(
			"claim_details_other_known_claimants_true");
	private By otherKnownClaimantNames = new By.ById(
			"claim_details_other_known_claimant_names");
	private By otherKnownClaimantsNo = new By.ById(
			"claim_details_other_known_claimants_false");
	private String expectedTextOnPage = "Claim details";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/header/h1");
	
	private By expectedFieldExceedsCharacterMaxErrorLabel = new By.ByXPath(
			".//*[@class='input form-group text optional claim_details_claim_details field_with_errors field_with_hint']/span");
	private String expectedFieldExceedsCharacterMaxErrorext = "The information you have provided for this field must not exceed 2500 characters";

	
	public boolean errorFieldExceedsCharacterLimit() {
		waitForPageLoaded();
		try {
			isTextContainedInInnerText(
					expectedFieldExceedsCharacterMaxErrorLabel,
					expectedFieldExceedsCharacterMaxErrorext);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public ATETClaimsDetailPage(WebDriver driver) {
		super(driver);
	}

	public void clickMoreAboutWritingYourClaimStatementLink() throws Exception {
		click(moreAboutWritingYourClaimStatementLink);
	}

	public void clickUploadItAsASeparateDocumentLink() throws Exception {
		click(uploadItAsASeparateDocumentLink);
	}

	public void setTextClaimsDetails(String text) throws Exception {
		setText(claimsDetails, text);
	}

	public boolean hasFocusClaimsDetails() throws Exception {
		return hasFocus(claimsDetails);
	}

	public boolean verifyClaimsDetailsText(String inputText) throws Exception {
		return getAttributeValue(claimsDetails, "value").equalsIgnoreCase(
				inputText);
	}

	public void clickOtherKnownClaimantsYes() throws Exception {
		click(otherKnownClaimantsYes);
	}

	public void setTextOtherKnownClaimantNames(String text) throws Exception {
		setText(otherKnownClaimantNames, text);
	}

	public boolean hasFocusOtherKnownClaimantNames() throws Exception {
		return hasFocus(otherKnownClaimantNames);
	}

	public boolean verifyOtherKnownClaimantNamesText(String inputText)
			throws Exception {
		return getAttributeValue(otherKnownClaimantNames, "value")
				.equalsIgnoreCase(inputText);
	}

	public void clickOtherKnownClaimantsNo() throws Exception {
		click(otherKnownClaimantsNo);
	}

	public boolean verifyOnPage() throws Exception {
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
}

