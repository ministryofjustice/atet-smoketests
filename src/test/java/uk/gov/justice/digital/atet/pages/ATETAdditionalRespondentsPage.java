package uk.gov.justice.digital.atet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class ATETAdditionalRespondentsPage extends ATETPage {
	private String expectedTextOnPage = "Additional respondents";
	private By expectedTextOnPageSelector = new By.ByXPath(".//*[@id='content']/div/header/h1");
	
	private By hasAdditionalRespondents_No = new By.ByXPath(".//*[@id='additional_respondents_has_collection_false']");
	private By hasAdditionalRespondents_Yes = new By.ByXPath(".//*[@id='additional_respondents_has_collection_true']");
	
	private String respondentName = ".//*[@id='additional_respondents_collection_attributes_%d_name']";
	
	private String addressBuilding = ".//*[@id='additional_respondents_collection_attributes_%d_address_building']";
	private String addressStreet = ".//*[@id='additional_respondents_collection_attributes_%d_address_street']";
	private String  addressLocality = ".//*[@id='additional_respondents_collection_attributes_%d_address_locality']";
	private String addressCounty = ".//*[@id='additional_respondents_collection_attributes_%d_address_county']";
	private String addressPostcode = ".//*[@id='additional_respondents_collection_attributes_%d_address_post_code']";
	
	private String acasNumber = ".//*[@id='additional_respondents_collection_attributes_%d_acas_early_conciliation_certificate_number']";
	private String hasNoAcasNumber = ".//*[@id='additional_respondents_collection_attributes_%d_no_acas_number']";
	
	private String acas_JointClaimantHasAcasNumber = ".//*[@id='additional_respondents_collection_attributes_%d_no_acas_number_reason_joint_claimant_has_acas_number']";
	private String acas_NoAuthorityToConcilitate = ".//*[@id='additional_respondents_collection_attributes_%d_no_acas_number_reason_acas_has_no_jurisdiction']";
	private String acas_EmployerAlreadyInTouch = ".//*[@id='additional_respondents_collection_attributes_%d_no_acas_number_reason_employer_contacted_acas']";
	private String acas_ReasonInterimRelief = ".//*[@id='additional_respondents_collection_attributes_%d_no_acas_number_reason_interim_relief']";
	private String acas_ClaimAgainstSecurityService = ".//*[@id='additional_respondents_collection_attributes_%d_no_acas_number_reason_claim_against_security_services']";

	private By addAdditionalRespondentLink = new By.ByXPath(".//*[@id='button_add_resource']");
	
	private void click(int respondent, String field) throws Exception{
		click(new By.ByXPath(String.format(field,respondent-1)));
	}
	
	public void clickJointClaimantHasAcasNumber(int respondent) throws Exception{
		click(respondent, acas_JointClaimantHasAcasNumber);
	}
	
	public void clickNoAuthorityToConcilitate(int respondent) throws Exception{
		click(respondent, acas_NoAuthorityToConcilitate);
	}
	
	public void clickEmployerAlreadyInTouch(int respondent) throws Exception{
		click(respondent, acas_EmployerAlreadyInTouch);
	}
	
	public void clickReasonInterimRelief(int respondent) throws Exception{
		click(respondent, acas_ReasonInterimRelief);
	}
	
	public void clickClaimAgainstSecurityService(int respondent) throws Exception{
		click(respondent, acas_ClaimAgainstSecurityService);
	}
	
	public void clickAddAdditionalRespondent() throws Exception{
		click(addAdditionalRespondentLink);
	}
	
	public ATETAdditionalRespondentsPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void clickHasClaimsAgainstOtherRespondents_No() throws Exception {
		click(hasAdditionalRespondents_No);	
	}
	
	public void clickHasClaimsAgainstOtherRespondents_Yes() throws Exception {
		click(hasAdditionalRespondents_Yes);	
	}
	
	private void setText(int respondent, String field, String text) throws Exception{
		System.out.println(String.format(field, respondent-1));
		By byField = new By.ByXPath(String.format(field, respondent-1));
		waitToGetElement(byField, HTTP_TIMEOUT);
		setText(byField,text);	
	}

	public void setRespondentName(int respondent, String name) throws Exception {
		setText(respondent, respondentName, name );	
	}
	
	public void setRespondentBuilding(int respondent, String building) throws Exception {
		setText(respondent, addressBuilding, building );	
	}
	
	public void setRespondentStreet(int respondent, String street) throws Exception {
		setText(respondent, addressStreet, street );	
	}
	
	public void setRespondentLocality(int respondent, String locality) throws Exception {
		setText(respondent, addressLocality, locality );	
	}
	
	public void setRespondentCounty(int respondent, String county) throws Exception {
		setText(respondent, addressCounty, county );	
	}
	
	public void setRespondentPostcode(int respondent, String postcode) throws Exception {
		setText(respondent, addressPostcode, postcode );	
	}
	
	public void setRespondentAcasNumber(int respondent, String acas) throws Exception {
		setText(respondent, acasNumber, acas );	
	}
	
	public void clickHasAcasNumber_No(int respondent) throws Exception {
		click(new By.ByXPath(String.format(hasNoAcasNumber, respondent-1)));
	}


}
