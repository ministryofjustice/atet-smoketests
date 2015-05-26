package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.atet.page.SeleniumPage;

import org.openqa.selenium.By;

public class ATETFeePage extends ATETPage {
	private By seeMoreAboutFeesLink = new By.ByXPath(
			".//*[@id='edit_your_fee']/div[1]/div/div/p[2]/a");
	private By guideForFeeRemissionLink = new By.ByXPath(
			".//*[@id='edit_your_fee']/div[1]/fieldset/p/a");
	private By applyingForRemission_Yes = new By.ById(
			"your_fee_applying_for_remission_true");
	private By applyingForRemission_No = new By.ById(
			"your_fee_applying_for_remission_false");
	private By feeRemissionApplicationLink = new By.ByXPath(
			".//*[@id='remission_applied_info']/p[2]/a");
	private String expectedTextOnPage = "Fee";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/header/h1");
	
	
	private By claimantCount = new By.ById("your_fee_remission_claimant_count");
	
	public void setClaimantCount(int count) throws Exception{
		setText(claimantCount, Integer.toString(count));
	}

	public ATETFeePage(WebDriver driver) {
		super(driver);
	}

	public void clickSeeMoreAboutFeesLink() throws Exception {
		click(seeMoreAboutFeesLink);
	}

	public void clickGuideForFeeRemissionLink() throws Exception {
		click(guideForFeeRemissionLink);
	}

	public void clickApplyingforremissionYes() throws Exception {
		click(applyingForRemission_Yes);
	}

	public void clickApplyingforremissionNo() throws Exception {
		click(applyingForRemission_No);
	}

	public void clickFeeRemissionApplicationLink() throws Exception {
		click(feeRemissionApplicationLink);
	}
}