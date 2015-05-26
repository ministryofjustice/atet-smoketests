package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.atet.factories.FakeDataFactory;

public class ATETRespondentsDetailPage extends ATETPage {

	private String expectedTextOnPage = "Respondent’s details";
	private By expectedTextOnPageSelector = new By.ByXPath(".//*[@id='content']/div/header/h1");
	
	private By respondentName = new By.ByXPath(".//*[@id='respondent_name']");

	
	private By addressBuilding = new By.ByXPath(".//*[@id='respondent_address_building']");
	private By addressStreet = new By.ByXPath(".//*[@id='respondent_address_street']");
	private By addressLocality = new By.ByXPath(".//*[@id='respondent_address_locality']");
	private By addressCounty = new By.ByXPath(".//*[@id='respondent_address_county']");
	private By addressPostcode = new By.ByXPath(".//*[@id='respondent_address_post_code']");
	
	private By respondentMobile = new By.ByXPath(".//*[@id='respondent_address_telephone_number']");
	
	private By respondentIsWorkAddress_Yes = new By.ByXPath(".//*[@id='respondent_worked_at_same_address_true']");
	private By respondentIsWorkAddress_No = new By.ByXPath(".//*[@id='respondent_worked_at_same_address_false']");
	
	
	private By workAddressBuilding = new By.ByXPath(".//*[@id='respondent_work_address_building']");
	private By workAddressStreet = new By.ByXPath(".//*[@id='respondent_work_address_street']");
	private By workAddressLocality = new By.ByXPath(".//*[@id='respondent_work_address_locality']");
	private By workAddressCounty = new By.ByXPath(".//*[@id='respondent_work_address_county']");
	private By workAddressPostcode = new By.ByXPath(".//*[@id='respondent_work_address_post_code']");
	
	private By workRespondentMobile = new By.ByXPath(".//*[@id='respondent_work_address_telephone_number']");
	
	private By acasNumber = new By.ByXPath(".//*[@id='respondent_acas_early_conciliation_certificate_number']");
	private By hasNoAcasNumber = new By.ByXPath(".//*[@id='respondent_no_acas_number']");
	
	private By acas_JointClaimantHasAacasNumber = new By.ByXPath(".//*[@id='respondent_no_acas_number_reason_joint_claimant_has_acas_number']");
	private By acas_NoAuthorityToConcilitate = new By.ByXPath(".//*[@id='respondent_no_acas_number_reason_acas_has_no_jurisdiction']");
	private By acas_EmployerAlreadyInTouch = new By.ByXPath(".//*[@id='respondent_no_acas_number_reason_employer_contacted_acas']");
	private By acas_ReasonInterimRelief = new By.ByXPath(".//*[@id='respondent_no_acas_number_reason_interim_relief']");
	private By acas_ClaimAgainstSecurityService = new By.ByXPath(".//*[@id='respondent_no_acas_number_reason_claim_against_security_services']");
	
	public void clickClaimAgainstSecurityService() throws Exception{
		click(acas_ClaimAgainstSecurityService);
	}
	
	public void clickReasonInterimRelief() throws Exception{
		click(acas_ReasonInterimRelief);
	}
	
	public void clickEmployerAlreadyInTouch() throws Exception{
		click(acas_EmployerAlreadyInTouch);
	}
	
	public void clickNoAuthorityToConcilitate() throws Exception{
		click(acas_NoAuthorityToConcilitate);
	}
	
	public void clickJointClaimantHasAacasNumber() throws Exception{
		click(acas_JointClaimantHasAacasNumber);
	}
	
	public void clickHasNoAcasNumber() throws Exception{
		click(hasNoAcasNumber);
	}
	
	public void setRespondentMobile(String mobile) throws Exception{
		setText(respondentMobile, mobile);
	}
	
	public ATETRespondentsDetailPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}	
	
	public void setRespondentName(String name) throws Exception{
		setText(respondentName, name);
	}
	
	public void setAddressBuilding(String building) throws Exception{
		setText(addressBuilding, building);
	}
	
	public void setAddressStreet(String street) throws Exception{
		setText(addressStreet, street);
	}
	
	public void setAddressLocality(String locality) throws Exception{
		setText(addressLocality, locality);
	}	
	
	
	public void setAddressCounty(String county) throws Exception{
		setText(addressCounty, county);
	}
	
	
	public void setAddressPostcode(String postcode) throws Exception{
		setText(addressPostcode, postcode);
	}
	
	public void setWorkAddressBuilding(String building) throws Exception{
		setText(workAddressBuilding, building);
	}
	
	public void setWorkAddressStreet(String street) throws Exception{
		setText(workAddressStreet, street);
	}
	
	public void setWorkAddressLocality(String locality) throws Exception{
		setText(workAddressLocality, locality);
	}	
	
	
	public void setWorkAddressCounty(String county) throws Exception{
		setText(workAddressCounty, county);
	}
	
	
	public void setWorkAddressPostcode(String postcode) throws Exception{
		setText(workAddressPostcode, postcode);
	}	
	public void setAcasNumber(String acas) throws Exception{
		setText(acasNumber, acas);
	}
	
	public void setMandatoryFields() throws Exception{
		setRespondentName(FakeDataFactory.getRespondentName());
		setAddressBuilding(FakeDataFactory.getRespondentBuilding());
		setAddressStreet(FakeDataFactory.getRespondentStreet());
		setAddressLocality(FakeDataFactory.getRespondentLocality());
		setAddressCounty(FakeDataFactory.getRespondentCounty());
		setAddressPostcode(FakeDataFactory.getRespondentPostcode());
		setAcasNumber(FakeDataFactory.getAcasNumber());
	}

	public void clickRespondentAddressIsNotWorkAddress_No() throws Exception {
		click(respondentIsWorkAddress_No);		
	}
	
	public void clickRespondentAddressIsNotWorkAddress_Yes() throws Exception {
		click(respondentIsWorkAddress_Yes);		
	}

	public void setWorkRespondentMobile(String mobile) throws Exception {
		setText(workRespondentMobile,mobile);
		
	}

	
}
