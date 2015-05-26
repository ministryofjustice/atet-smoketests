package uk.gov.justice.digital.atet.factories;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.atet.pages.ATETAboutTheClaimPage;
import uk.gov.justice.digital.atet.pages.ATETAdditionalRespondentsPage;
import uk.gov.justice.digital.atet.pages.ATETCheckYourClaimPage;
import uk.gov.justice.digital.atet.pages.ATETClaimSubmittedPage;
import uk.gov.justice.digital.atet.pages.ATETClaimsDetailPage;
import uk.gov.justice.digital.atet.pages.ATETClaimOutcomePage;
import uk.gov.justice.digital.atet.pages.ATETClaimantsDetailPage;
import uk.gov.justice.digital.atet.pages.ATETEmploymentDetails;
import uk.gov.justice.digital.atet.pages.ATETPayIssueFeePage;
import uk.gov.justice.digital.atet.pages.ATETGroupClaimsPage;
import uk.gov.justice.digital.atet.pages.ATETMoreAboutTheClaimPage;
import uk.gov.justice.digital.atet.pages.ATETPage;
import uk.gov.justice.digital.atet.pages.ATETPayYourFeeByCardPage;
import uk.gov.justice.digital.atet.pages.ATETFeePage;
import uk.gov.justice.digital.atet.pages.ATETRepresentativeDetailsPage;
import uk.gov.justice.digital.atet.pages.ATETRespondentsDetailPage;
import uk.gov.justice.digital.atet.pages.ATETReturnToAClaimPage;
import uk.gov.justice.digital.atet.pages.ATETSavingYourClaimPage;
import uk.gov.justice.digital.atet.pages.ATETStartPage;

public class PageFactory {

	public static ATETStartPage getATETStartPage(WebDriver driver) {
		return new ATETStartPage(driver);
	}

	public static ATETSavingYourClaimPage getATETSavingYourClaimPage(WebDriver driver) {
		return new ATETSavingYourClaimPage(driver);
	}

	public static ATETClaimantsDetailPage getATETClaimantDetailsPage(WebDriver driver) {
		return new ATETClaimantsDetailPage(driver);
	}

	public static ATETPage getATETPage(WebDriver driver) {
		return new ATETPage(driver);
	}
	
	public static ATETGroupClaimsPage getATETGroupClaimsPage(WebDriver driver){
	    return new ATETGroupClaimsPage(driver);	
	}

	public static ATETRepresentativeDetailsPage getATETRepresentativeDetailsPage(WebDriver driver){
	    return new ATETRepresentativeDetailsPage(driver);	
	}
	
	public static ATETRespondentsDetailPage getATETRespondentsDetailPage(WebDriver driver){
		return new ATETRespondentsDetailPage(driver);
	}
	
	public static ATETAdditionalRespondentsPage getATETAdditionalRespondentsPage(WebDriver driver){
		return new ATETAdditionalRespondentsPage(driver);
	}
	
	public static ATETEmploymentDetails getATETEmploymentDetails(WebDriver driver){
		return new ATETEmploymentDetails(driver);
	}
	
	public static ATETAboutTheClaimPage getATETAboutYourClaimPage(WebDriver driver){
		return new ATETAboutTheClaimPage(driver);
	}
	
	public static ATETClaimsDetailPage getATETClaimDetailPage(WebDriver driver){
		return new ATETClaimsDetailPage(driver);
	}
	
	public static ATETClaimOutcomePage getATETClaimOutcomePage(WebDriver driver){
		return new ATETClaimOutcomePage(driver);
	}
	
	public static ATETAboutTheClaimPage getATETAboutTheClaimPage(WebDriver driver){
		return new ATETAboutTheClaimPage(driver);
	}	
	
	public static ATETMoreAboutTheClaimPage getATETMoreAboutTheClaimPage(WebDriver driver){
		return new ATETMoreAboutTheClaimPage(driver);
	}	
	
	public static ATETCheckYourClaimPage getATETCheckYourClaimPage(WebDriver driver){
		return new ATETCheckYourClaimPage(driver);
	}
	
	public static ATETFeePage getATETFeePage(WebDriver driver){
		return new ATETFeePage(driver);
	}
	
	
	public static ATETReturnToAClaimPage getATETReturnToAClaimPage(WebDriver driver){
		return new ATETReturnToAClaimPage(driver);
	}
	
	public static ATETFeePage getATETPayYourFeePage(WebDriver driver){
		return new ATETFeePage(driver);
	}
	
	
	public static ATETPayIssueFeePage getATETPayIssueFeePage(WebDriver driver){
		return new ATETPayIssueFeePage(driver);
	}
	
	public static ATETPayYourFeeByCardPage getATETPayYourFeeByCardPage(WebDriver driver){
		return new ATETPayYourFeeByCardPage(driver);
	}
	
	public static ATETClaimSubmittedPage getATETClaimSubmittedPage(WebDriver driver){
		return new ATETClaimSubmittedPage(driver);
	}
	
	
}
