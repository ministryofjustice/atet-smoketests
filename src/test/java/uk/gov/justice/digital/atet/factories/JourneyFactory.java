package uk.gov.justice.digital.atet.factories;

import org.openqa.selenium.WebDriver;










import uk.gov.justice.digital.atet.factories.FakeDataFactory;
import uk.gov.justice.digital.atet.factories.PageFactory;
import uk.gov.justice.digital.atet.pages.ATETClaimantsDetailPage;
import uk.gov.justice.digital.atet.pages.ATETGroupClaimsPage;
import uk.gov.justice.digital.atet.pages.ATETPayYourFeeByCardPage;
import uk.gov.justice.digital.atet.pages.ATETRespondentsDetailPage;

public class JourneyFactory {

	private final WebDriver driver;


	public JourneyFactory(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@Journey
	public void getATETStartPageJourney() throws Exception{	
		driver.get(FakeDataFactory.getATETStartPageUrl());
		PageFactory.getATETStartPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETSavingYourClaimPageJourney() throws Exception{
		getATETStartPageJourney();
		PageFactory.getATETStartPage(driver).clickStartAClaimButton();
		PageFactory.getATETSavingYourClaimPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETClaimantDetailsPageJourney() throws Exception{
		getATETSavingYourClaimPageJourney();
		PageFactory.getATETSavingYourClaimPage(driver).setClaimMemorableWord(FakeDataFactory.getATETMemorableWord());
		PageFactory.getATETSavingYourClaimPage(driver).clickSaveAndContinueButton();
		PageFactory.getATETClaimantDetailsPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETGroupClaimsPageJourney() throws Exception{
		getATETClaimantDetailsPageJourney();
		ATETClaimantsDetailPage page = PageFactory.getATETClaimantDetailsPage(driver);
		page.setMandatoryFields();
		page.clickSaveAndContinueButton();
		PageFactory.getATETGroupClaimsPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETRepresetantiveDetailsPageJourney() throws Exception{
		getATETGroupClaimsPageJourney();
		PageFactory.getATETGroupClaimsPage(driver).clickSaveAndContinueButton();
		PageFactory.getATETRepresentativeDetailsPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETRespondentDetailsPageJourney() throws Exception{
		getATETRepresetantiveDetailsPageJourney();
		PageFactory.getATETRepresentativeDetailsPage(driver).clickSaveAndContinueButton();
		PageFactory.getATETRespondentsDetailPage(driver).verifyOnPage();
	}

	@Journey
	public void getATETAdditionalRespondentsPageJourney() throws Exception{
		getATETRespondentDetailsPageJourney();
		ATETRespondentsDetailPage page = PageFactory.getATETRespondentsDetailPage(driver);
		page.setMandatoryFields();
		page.clickSaveAndContinueButton();
		PageFactory.getATETAdditionalRespondentsPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETEmploymentDetailsPageJourney() throws Exception{
		getATETAdditionalRespondentsPageJourney();
		PageFactory.getATETAdditionalRespondentsPage(driver).clickSaveAndContinueButton();
		PageFactory.getATETEmploymentDetails(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETAboutYourClaimPageJourney() throws Exception{
		getATETEmploymentDetailsPageJourney();
		PageFactory.getATETEmploymentDetails(driver).clickSaveAndContinueButton();;
		PageFactory.getATETAboutYourClaimPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETClaimDetailPageJourney() throws Exception{
		getATETAboutYourClaimPageJourney();
		PageFactory.getATETAboutYourClaimPage(driver).clickSaveAndContinueButton();;
		PageFactory.getATETClaimDetailPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETClaimOutcomePageJourney() throws Exception{
		getATETClaimDetailPageJourney();
		PageFactory.getATETClaimDetailPage(driver).setTextClaimsDetails(FakeDataFactory.getClaimDetailDescription());
		PageFactory.getATETAboutYourClaimPage(driver).clickSaveAndContinueButton();;
		PageFactory.getATETClaimOutcomePage(driver).verifyOnPage();
	}	
	
	@Journey
	public void getATETMoreAboutTheClaimPageJourney() throws Exception{
		getATETClaimOutcomePageJourney();
		PageFactory.getATETClaimOutcomePage(driver).clickSaveAndContinueButton();
		PageFactory.getATETMoreAboutTheClaimPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETFeePageJourney() throws Exception{
		getATETMoreAboutTheClaimPageJourney();
		PageFactory.getATETMoreAboutTheClaimPage(driver).clickSaveAndContinueButton();;
		PageFactory.getATETFeePage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETCheckYourClaimPageJourney() throws Exception{
		getATETFeePageJourney();
		PageFactory.getATETFeePage(driver).clickSaveAndContinueButton();;
		PageFactory.getATETCheckYourClaimPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETPayIssueFeeJourney() throws Exception{
		getATETCheckYourClaimPageJourney();
		PageFactory.getATETCheckYourClaimPage(driver).clickSubmitClaimAndProceedToPaymentButton();
		PageFactory.getATETPayIssueFeePage(driver).verifyOnPage();
	}	
	
	@Journey
	public void getATETPayYourFeeBankJourney() throws Exception{
		getATETPayIssueFeeJourney();
		PageFactory.getATETPayIssueFeePage(driver).clickPayIssueButton();
		PageFactory.getATETPayYourFeeByCardPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getATETReturnToAClaimJourney() throws Exception{
		getATETStartPageJourney();
		PageFactory.getATETStartPage(driver).clickReturnToAClaim();
		PageFactory.getATETReturnToAClaimPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getSingleClaimantRemission() throws Exception{
		getATETFeePageJourney();
		PageFactory.getATETFeePage(driver).clickApplyingforremissionYes();
		PageFactory.getATETFeePage(driver).clickSaveAndContinueButton();
		PageFactory.getATETCheckYourClaimPage(driver).clickSubmitClaim();
		PageFactory.getATETFeePage(driver).capturePageScreenShot("singlewithremission");
		
	}
	
	@Journey
	public void getSingleClaimantNoRemission() throws Exception{
		getATETFeePageJourney();
		PageFactory.getATETFeePage(driver).verifyOnPage();
		PageFactory.getATETFeePage(driver).clickApplyingforremissionNo();
		PageFactory.getATETFeePage(driver).clickSaveAndContinueButton();
		PageFactory.getATETCheckYourClaimPage(driver).clickSubmitClaimAndProceedToPaymentButton();
		PageFactory.getATETPayIssueFeePage(driver).clickPayIssueButton();
		payByMastercard();
		PageFactory.getATETFeePage(driver).capturePageScreenShot("singlewithnoremission");		
	}
	
	private void payByMastercard() throws Exception{
		ATETPayYourFeeByCardPage page = PageFactory.getATETPayYourFeeByCardPage(driver);
		page.verifyOnPage();
		page.clickMasterCard();
		page.setCardExpiryMonth(FakeDataFactory.getCreditCardExpiryMonth());
		page.setCardExpiryYear(FakeDataFactory.getCreditCardExpiryYear());
		page.setCardVerificationCode(FakeDataFactory.getCreditCardVerificationNumber());
		page.setCardHoldersName(FakeDataFactory.getCreditCardName());
		page.setCardNumber(FakeDataFactory.getCreditCardNumber());
		page.clickConfirmPayment();
		PageFactory.getATETFeePage(driver).capturePageScreenShot("singlewithnoremission");		
	}
	
	
	private void NoRemmisionStartingFromFeePage() throws Exception{
		PageFactory.getATETFeePage(driver).clickApplyingforremissionNo();
		PageFactory.getATETFeePage(driver).clickSaveAndContinueButton();
		PageFactory.getATETCheckYourClaimPage(driver).clickSubmitClaimAndProceedToPaymentButton();
		PageFactory.getATETPayIssueFeePage(driver).clickPayIssueButton();

	}
	
	private void createGroupClaim() throws Exception{
		getATETGroupClaimsPageJourney();
		PageFactory.getATETGroupClaimsPage(driver);
		setGroupClaimant(1);
		setGroupClaimant(2);
		setGroupClaimant(3);
	}

	private void setGroupClaimant(int claimant) throws Exception{
			ATETGroupClaimsPage page = PageFactory.getATETGroupClaimsPage(driver);
			page.setTitle(claimant, "Mr");
			page.setFirstName(claimant, "FirstName_" + claimant);
			page.setLastName(claimant, "LastName_"+ claimant );
			page.setDayDOB(claimant, "23");
			page.setMonthDOB(claimant, "09");	
			page.setYearDOB(claimant, "1972");
			String claimantLabel = Integer.toString(claimant);
			page.setBuildingName(claimant, claimantLabel);
			page.setStreet(claimant, "The street " + claimantLabel );
			page.setLocality(claimant, "The Town");
			page.setCounty(claimant, "Hertfordshire");
			page.setPostcode(claimant, "SG8 0LT");
	}
	
	
	@Journey
	public void getGroupClaimantNoRemission() throws Exception{
		int numberOfClaimants = 2;
		getATETGroupClaimsPageJourney();
		PageFactory.getATETGroupClaimsPage(driver)
		.clickPeopleMakingClaimWithYou_Yes();
		for (int index = 1; index < numberOfClaimants; index++) {
			setGroupClaimant(index);
			if (index < numberOfClaimants)
				PageFactory.getATETGroupClaimsPage(driver).clickAddResource();	
		}	
       PageFactory.getATETGroupClaimsPage(driver).clickSaveAndContinueButton();
	}
	
}
