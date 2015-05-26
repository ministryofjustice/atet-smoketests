package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ATETSavingYourClaimPage extends ATETPage {

	private String expectedTextOnPage = "Saving your claim";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/header/h1");

	private String expectedInvalidEmailErrorText = "You have entered an invalid email address";
	private By expectedInvalidEmailErrorLabel = new By.ByXPath(
			".//*[@id='edit_application_number']/div[2]/div[2]/fieldset/div[1]/span");
	
	private String expectedNoMemorableNameEnteredErrorText = "Please create a memorable word so you can return to your claim";
	private By expectedNoMemorableNameEnteredErrorLabel = new By.ByXPath(
			".//*[@id='edit_application_number']/div[2]/div[2]/fieldset/div[2]/span");

	private String expectedErrorOnPageText = "Errors on page";
	private By expectedErrorOnPageLabel = new By.ByXPath(
			".//*[@id='error-heading']");

	private By claimNumber = new By.ByXPath(".//*[@class='number']");
	private By claimMemorableWord = new By.ByXPath(
			".//*[@id='application_number_password']");
	private By emailAddress = new By.ByXPath(
			".//*[@id='application_number_email_address']");

	public void setClaimMemorableWord(String word) throws Exception {
		setText(claimMemorableWord, word);
	}

	public String getClaimNumber() throws Exception {
		return getText(claimNumber);
	}

	public ATETSavingYourClaimPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyOnPage() throws Exception {
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public boolean errorDisplayed() throws Exception {
		waitForPageLoaded();
		try {
			isTextContainedInInnerText(expectedErrorOnPageLabel,
					expectedErrorOnPageText);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void setEmailAddress(String emailAddress) throws Exception {
		setText(this.emailAddress, emailAddress);
	}

	public boolean errorInvalidEmail() throws Exception {
		waitForPageLoaded();
		try {
			isTextContainedInInnerText(expectedInvalidEmailErrorLabel,
					expectedInvalidEmailErrorText);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean errorNoMemorableNameEnteredError() throws Exception {
		waitForPageLoaded();
		try {
			isTextContainedInInnerText(expectedNoMemorableNameEnteredErrorLabel,
					expectedNoMemorableNameEnteredErrorText);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean errorOnPage() throws Exception {
		return isTextContainedInInnerText(expectedErrorOnPageLabel, expectedErrorOnPageText);
	}



}
