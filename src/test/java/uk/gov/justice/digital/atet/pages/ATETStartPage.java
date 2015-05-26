package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.atet.page.SeleniumPage;

public class ATETStartPage extends SeleniumPage {
	
	private String expectedTextOnPage = "Make a claim to an employment tribunal";
	private By expectedTextOnPageSelector = new By.ByXPath(".//*[@id='content']/div/header/h1");
	
	private By startAClaimButton = new By.ByXPath(".//*[@value='Start a claim']");
	
	private By returnToAClaimButton = new By.ByXPath(".//*[@id='new_claim']/section/div[3]/a");
	
	public void clickReturnToAClaim() throws Exception{
		click(returnToAClaimButton);
	}
	
	public void clickStartAClaimButton() throws Exception{
		click(startAClaimButton);
	}

	public ATETStartPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
	    
}
