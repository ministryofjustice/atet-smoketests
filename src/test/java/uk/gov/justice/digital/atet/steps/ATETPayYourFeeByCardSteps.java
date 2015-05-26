package uk.gov.justice.digital.atet.steps;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.atet.factories.JourneyFactory;
import uk.gov.justice.digital.atet.factories.PageFactory;
import uk.gov.justice.digital.atet.step.StepContext;
import uk.gov.justice.digital.atet.step.StepContextSingleton;
import uk.gov.justice.digital.atet.webdriver.SharedDriver;
import uk.gov.justice.digital.atet.webdriver.SharedDriver;

public class ATETPayYourFeeByCardSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ATETPayYourFeeByCardSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I click pay by mastercard$")
	public void i_click_pay_by_mastercard() throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).clickMasterCard();
		;
	}

	@When("^I click pay by visa card$")
	public void i_click_pay_by_visa_card() throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).clickVisaCard();
	}

	@When("^I click pay by jcb card$")
	public void i_click_pay_by_jcb_card() throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).clickJcbCard();
	}

	@When("^I click pay by maestro$")
	public void i_click_pay_by_maestro() throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).clickMaestroCard();
	}

	@When("^I enter the card holders name \"(.*?)\"$")
	public void i_enter_the_card_holders_name(String name) throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver)
				.setCardHoldersName(name);
	}

	@When("^I enter the card number \"(.*?)\"$")
	public void i_enter_the_card_number(String number) throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).setCardNumber(number);
	}

	@When("^I select the card expiry month \"(.*?)\"$")
	public void i_select_the_card_expiry_month(String month) throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).setCardExpiryMonth(
				month);
	}

	@When("^I select the card expiry year \"(.*?)\"$")
	public void i_select_the_card_expiry_year(String year) throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).setCardExpiryYear(year);
	}

	@When("^I click the card back button$")
	public void i_click_the_card_back_button() throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).clickBack();
	}

	@When("^I click the card cancel button$")
	public void i_click_the_card_cancel_button() throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).clickCancel();
	}

	@When("^I click the card payment button$")
	public void i_click_the_card_payment_button() throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).clickConfirmPayment();
	}
	
	@When("^I enter the card verification number \"(.*?)\"$")
	public void i_enter_the_card_verification_number(String code) throws Throwable {
		PageFactory.getATETPayYourFeeByCardPage(driver).setCardVerificationCode(code);
	}
	



}
