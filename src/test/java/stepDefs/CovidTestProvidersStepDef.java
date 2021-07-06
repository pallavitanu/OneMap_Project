package stepDefs;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CovidTestProvidersPageObjects;
import testBase.TestBase;

public class CovidTestProvidersStepDef extends TestBase{
	 
	CovidTestProvidersPageObjects ctp = new CovidTestProvidersPageObjects(driver);
	
	@When("^User can click Covid Test Providers option$")
	public void User_can_click_Covid_Test_Providers_option() {  
		ctp.clickPCRT();
	}
	
	@Then("^Validate that Covid Test Providers opens$")
	public void validate_that_Covid_Test_Providers_opens() {
		   ctp.validateCovidTestProvidersLabel();
	}
	
	@When("^User successfully search \"([^\"]*)\"$")
	public void user_successfully_search_text(String textForSearch) throws InterruptedException {
		ctp.searchExplorer(textForSearch);
	}
	
	@And("^User can click on list of covid swab providers link$")
	public void user_can_click_on_list_of_covid_swab_providers_link() {
		ctp.clickswabProviderLink();
	}
	
	@Then("^A seperate window of moh opens$")
	public void a_seperate_window_of_moh_opens() throws InterruptedException {
		ctp.validateNewWindowTitle();
		
	}
	@And("^Validate no link is broken$")
	public void validate_no_link_is_broken() throws IOException {
		ctp.validateBrokenLinks();
	}

}
