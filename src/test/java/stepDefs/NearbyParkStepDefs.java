package stepDefs;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.NearbyParkPageObjects;
import testBase.TestBase;

public class NearbyParkStepDefs extends TestBase{
	
	NearbyParkPageObjects np = new NearbyParkPageObjects(driver);
	
	@When("^User can click Nearby Park option$")
	public void user_can_click_Nearby_Park_option() {  
		np.clickNearbyPark();
	}
	
	@And("^User click on the OK button$")
	public void user_click_on_the_OK_button() {
		np.okButton();
	}
	
	@Then("^Validate that Nearby Park opens")
	public void validate_that_Nearby_Park_opens() {
		np.validateNearbyParkLabel();
	}
	
	@When("^Validate that User successfully download the KML document$")
	public void validate_that_User_successfully_download_the_KML_document() throws InterruptedException {
		np.downloadButtonClick();
		np.downloadkmlFile();
	}
	
	@And("^User click on Cancel button$")
	public void user_click_on_Cancel_button() {
		np.clickCancel();
	}
	
	@Then("^User click on the Information icon$")
	public void user_click_on_the_Information_icon() {
		np.clickInfoButton();
	
	}
	
	@And("^Validate that Information window is opening$")
	public void validate_that_Information_window_is_opening() {
		np.verifyInfoWindow();
	}
	

}
