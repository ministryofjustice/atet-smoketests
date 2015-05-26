package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.atet.page.SeleniumPage;

import org.openqa.selenium.By;

public class ATETPayIssueFeePage extends ATETPage {
	private By payIssueButton = new By.ByXPath(
			".//*[@id='content']/div/div[3]/div/form/input[10]");
	private By toPayByCheque = new By.ByXPath(
			".//*[@id='content']/div/div[3]/div/details/summary/span");
	private By contactUs = new By.ByXPath(
			".//*[@id='content']/div/div[3]/div/p[2]/a");
	private By saveToPdf = new By.ByXPath(
			".//*[@id='details-content-0']/ol/li[1]/a");
	private String expectedTextOnPage = "Pay your fee";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/header/h1");


	public ATETPayIssueFeePage(WebDriver driver) {
		super(driver);
	}

	public void clickPayIssueButton() throws Exception {
		click(payIssueButton);
	}

	public void clickToPayByCheque() throws Exception {
		click(toPayByCheque);
	}

	public void clickContactUs() throws Exception {
		click(contactUs);
	}

	public void clickSaveToPdf() throws Exception {
		click(saveToPdf);
	}
}