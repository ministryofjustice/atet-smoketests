package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ATETClaimSubmittedPage extends ATETPage {
	
	private String expectedTextOnPage = "Claim submitted";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/header/h1");

	public ATETClaimSubmittedPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception {
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
