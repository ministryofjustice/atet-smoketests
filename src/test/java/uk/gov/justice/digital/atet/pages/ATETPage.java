package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.atet.page.SeleniumPage;

public class ATETPage extends SeleniumPage {

	public ATETPage(WebDriver driver) {
		super(driver);
	}
	
	private By saveAndContinueButton = new By.ByXPath(".//*[@value='Save and continue']");
	
	private By guideLink = new By.ByXPath(".//*[@id='content']/div/div[3]/aside/ul[1]/li[1]/a");
	
	private By contactUsLink = new By.ByXPath(".//*[@id='content']/div/div[3]/aside/ul[1]/li[2]/a");
	
	private By saveAndCompleteLater = new By.ByXPath(".//*[@id='content']/div/div[3]/aside/ul[2]/li/form/button");
	
	public void clickSaveAndCompleteLater() throws Exception{
		click(saveAndCompleteLater);
	}
	
	public void clickContactUsLink() throws Exception {
		click(contactUsLink);
	}
	
	public void clickGuideLink() throws Exception{
		click(guideLink);
	}
	
	public void clickSaveAndContinueButton() throws Exception{
		click(saveAndContinueButton);
	}

}
