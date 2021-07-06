package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EssentialAmenitiesPageObjects;
import testBase.TestBase;

public class EssentialAmenitiesStepDef extends TestBase{

	public EssentialAmenitiesPageObjects ea = new EssentialAmenitiesPageObjects(driver);
	
	@When("^User can click Essential Amenities option$")
	public void User_can_click_Essential_Amenities_option() {  
		ea.clickEss();
	}
	
	@Then("^Validate that Essential Amenities opens$")
	public void validate_that_Essential_Amenities_opens() {
		ea.validateEssentialAmenitiesLabel();
	}
	
	@When("^User clicks on the Retail Pharmacy Locations Option$")
	public void user_clicks_on_the_Retail_Pharmacy_Locations_Option() {
		ea.selectRetailPharmacyLocations();
	}
	
	@And("^Validate that cancel button is enabled$")
	public void validate_that_cancel_button_is_enabled() {
		ea.verifyNoCancelButton();
	}
	
	@Then("^User click on Yes button$")
	public void user_click_on_Yes_button() {
		ea.clickyesShowResultButton();
		
	}
	@And("^Validate that Retail Pharmacy Locations present in Map$")
	public void validate_that_Retail_Pharmacy_Locations_present_in_Map() {
		ea.verifyRetailPharmacyLocations();
	}
}
