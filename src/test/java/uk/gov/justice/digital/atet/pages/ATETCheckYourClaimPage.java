package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class ATETCheckYourClaimPage extends ATETPage{

	private String expectedTextOnPage = "Check your claim";
	private By expectedTextOnPageSelector = new By.ByXPath(".//*[@id='content']/div/header/h1");
	
	private By submitClaimAndProceedToPaymentButton = new By.ByXPath(".//*[@value='Submit claim and proceed to payment']");
	private By submitClaim = new By.ByXPath(".//*[@value='Submit claim']");
	
	private By editClaimantDetails = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[1]/h2/a");
	private By editGroupClaim = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[2]/h2/a");
	private By editRepresentativeDetails = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[3]/h2/a");
	private By editRespondentDetails = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[4]/h2/a");
	private By editAdditionalRespondents = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[5]/h2/a");
	private By editEmploymentDetails = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[6]/h2/a");
	private By editClaimType = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[7]/h2/a");
	private By editClaimDetails = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[8]/h2/a");
	private By editClaimOutcome = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[9]/h2/a");
	private By editAdditionalInformation = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[10]/h2/a");
	private By editIssueFee = new By.ByXPath(".//*[@id='content']/div/div[3]/div/div[11]/h2/a");
	private By emailConfirmation = new By.ByXPath(".//*[@id='confirmation_email_email_addresses_bbcom']");
	
	private By printThisPage = new By.ByXPath(".//*[@id='content']/div/div[3]/div/p/a[2]");
	
	public void clickSubmitClaim() throws Exception{
		click(submitClaim);
	}
	
	public void clickPrintThisPage() throws Exception{
		click(printThisPage);
	}
	
	public void clickEmailConfirmation() throws Exception{
		click(emailConfirmation);
	}
	
	public void clickEditIssueFee() throws Exception{
		click(editIssueFee);
	}
	
	public void clickeditAdditionalInformation() throws Exception{
		click(editAdditionalInformation);
	}
	
	public void clickEditClaimOutcome() throws Exception{
		click(editClaimOutcome);
	}
	
	public void clickEditClaimDetails() throws Exception{
		click(editClaimDetails);
	}
	
	
	public void clickEditClaimType() throws Exception{
		click(editClaimType);
	}
	
	public void clickEditEmploymentDetails() throws Exception {
		click(editEmploymentDetails);
	}
	
	public void clickEditAdditionalRespondents() throws Exception{
		click(editAdditionalRespondents);
	}
	
	public void clickEditRespondentDetails() throws Exception{
         click(editRespondentDetails);
	}
	
	public void clickEditRepresentativeDetails() throws Exception{
		click(editRepresentativeDetails);
	}
	
	public void clickEditClaimantDetails() throws Exception{
		click(editClaimantDetails);
	}
	
	public void clickEditGroupClaim() throws Exception{
		click(editGroupClaim);
	}
	
	
	public boolean isEmailConfirmationChecked() throws Exception{
		return isSelected(emailConfirmation);
	}
	
	public void clickSubmitClaimAndProceedToPaymentButton() throws Exception{
		click(submitClaimAndProceedToPaymentButton);
	}
	
	public ATETCheckYourClaimPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}		
	
}
