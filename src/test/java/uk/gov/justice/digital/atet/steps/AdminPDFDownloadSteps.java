package uk.gov.justice.digital.atet.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class AdminPDFDownloadSteps {
	
	
	@Given("^we are signed into the atet admin system$")
	public void we_are_signed_into_the_atet_admin_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^we download a pdf file for <et_ref>:$")
	public void we_download_a_pdf_file_for_et_ref(List<List<String>> et1_refs) throws Throwable {
	    throw new PendingException();
	}

}
