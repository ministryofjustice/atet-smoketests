package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class ATETPayYourFeeByCardPage extends ATETPage {
	
	private String expectedTextOnPage = "Pay your fee";
	private By expectedTextOnPageSelector = new By.ByXPath(".//*[@id='content']/div/header/h1");
	
	private By mastercard = new By.ByXPath(".//*[@name='Eurocard_brand']");
	private By visacard = new By.ByXPath(".//*[@name='VISA_brand']");
	private By jcbcard = new By.ByXPath(".//*[@name='JCB_brand']");
	private By maestrocard = new By.ByXPath(".//*[@name='Maestro_brand']");
	private By cancel = new By.ByXPath(".//*[@name='Cancel']");
	
	private By totalCharge = new By.ByXPath(".//*[@id='ncol_ref']/tbody/tr[2]/td[2]/small");
	private By beneficiary = new By.ByXPath(".//*[@id='ncol_ref']/tbody/tr[3]/td[2]/small");
	private By canIPayByMaestroCardLink = new By.ByXPath(".//*[@id='content']/div/div[3]/form/table/tbody/tr[3]/td[3]/small/small/a");
	
	//MasterCard
	private By cardName = new By.ByXPath(".//*[@id='Ecom_Payment_Card_Name']");
	private By cardNumber = new By.ByXPath(".//*[@id='Ecom_Payment_Card_Number']");
	private By expiryMonth = new By.ByXPath(".//*[@id='Ecom_Payment_Card_ExpDate_Month']");
	private By expiryYear = new By.ByXPath(".//*[@id='Ecom_Payment_Card_ExpDate_Year']");
	private By cardVerificationCode = new By.ByXPath(".//*[@id='Ecom_Payment_Card_Verification']");
	
	private By cardVerificationWhatIsThis = new By.ByXPath(".//*[@id='content']/div/div[3]/form/table/tbody/tr[5]/td[2]/small[2]/small/a");
	
	
	
	private By backButton = new By.ByXPath(".//*[@id='btn_Back']");
	private By cancelAfterCardSelectedButton = new By.ByXPath(".//*[@id='ncol_cancel']");
	
	private By confirmPayment = new By.ByXPath(".//*[@id='submit3']");
	
	public void clickCardVerificationWhatIsThis() throws Exception{
		click(cardVerificationWhatIsThis);
	}
	
	public void clickBack() throws Exception{
		click(backButton);
	}
	
	public void clickCancelAfterCardSelected() throws Exception{
		click(cancelAfterCardSelectedButton);
	}
	
	public void clickConfirmPayment() throws Exception{
		click(confirmPayment);
	}
	
	
	public void setCardHoldersName(String name) throws Exception{
		setText(cardName, name);
	}
	
	public void setCardNumber(String number) throws Exception{
		setText(cardNumber, number);
	}
	
	public void setCardVerificationCode(String code) throws Exception{
		setText(cardVerificationCode, code);
	}
	
	
	public void setCardExpiryYear(String year) throws Exception{
		this.setSelectOptionByValue(expiryYear, year);
	}
	
	public void setCardExpiryMonth(String month) throws Exception{
		this.setSelectOptionByValue(expiryMonth, month);
	}
	
	public String getBeneFiciary() throws Exception{
		return getText(beneficiary);
	}
	
	public String getTotalCharge() throws Exception{
		return getText(totalCharge);
	}

	
	public void clickCanIPayByMaestroCardLink() throws Exception{
		click(canIPayByMaestroCardLink);
	}
	
	public void clickCancel() throws Exception{
		click(cancel);
	}
	
	
	public void clickMasterCard() throws Exception{
		click(mastercard);
	}
	
	public void clickVisaCard() throws Exception{
		click(visacard);
	}
	
	public void clickMaestroCard() throws Exception{
		click(maestrocard);
	}
	
	public void clickJcbCard() throws Exception{
		click(jcbcard);
	}
	
	public ATETPayYourFeeByCardPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}	
}
