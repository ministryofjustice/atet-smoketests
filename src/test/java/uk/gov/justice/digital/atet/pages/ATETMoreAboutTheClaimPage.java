package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.WebDriver;
import uk.gov.justice.digital.atet.page.SeleniumPage;
import org.openqa.selenium.By;

public class ATETMoreAboutTheClaimPage extends ATETPage {
	private By otherImportantDetails_Yes = new By.ById(
			"additional_information_has_miscellaneous_information_true");
	private By otherImportantDetails_No = new By.ById(
			"additional_information_has_miscellaneous_information_false");
	private By otherDetailsText = new By.ById(
			"additional_information_miscellaneous_information");
	private String expectedTextOnPage = "More about the claim";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/header/h1");

	public ATETMoreAboutTheClaimPage(WebDriver driver) {
		super(driver);
	}

	public void clickOtherimportantdetailsYes() throws Exception {
		click(otherImportantDetails_Yes);
	}

	public void clickOtherimportantdetailsNo() throws Exception {
		click(otherImportantDetails_No);
	}

	public void setTextOtherDetailsText(String text) throws Exception {
		setText(otherDetailsText, text);
	}

	public boolean hasFocusOtherDetailsText() throws Exception {
		return hasFocus(otherDetailsText);
	}

	public boolean verifyOtherDetailsTextText(String inputText)
			throws Exception {
		return getAttributeValue(otherDetailsText, "value").equalsIgnoreCase(
				inputText);
	}

	public boolean verifyOnPage() throws Exception {
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
}
