package stepDefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.HomePageObjects;
import pageObjects.MoreMenuPageObjects;
import testBase.TestBase;

public class HomePageStepDef extends TestBase{
	//WebDriver driver;
	
	HomePageObjects hp = new HomePageObjects(driver); 	
	
	@Given("^User is on HomePage of URL \"([^\"]*)\"$")
	public void user_is_on_HomePage_of_URL_oneMap(String url) {
		driver.get(url);	   
		hp.crossEntryImage();
	}
	@When("^Validate that home page heading is displayed$")
	public void validate_that_home_page_heading_is_displayed() {
		hp.validatehomePageHeading();
	}
	@Then("^Validate that searchbox is enabled$")
	public void validate_that_searchbox_is_enabled() {
		hp.validateSearchBox();
	}
	@And("^Validate that Vaccination Centres icon is enabled$")
	public void validate_that_Vaccination_Centres_icon_is_enabled() {
		hp.validateVaccinationCentres();
	}
	@Then("^Validate that Covid Test Provider icon is enabled$")
	public void validate_that_Covid_Test_Provider_icon_is_enabled() {
		hp.validateCovideTestProvider();
	}
	@And("^Validate that Nearby Parks icon is enabled$")
	public void validate_that_Nearby_Parks_icon_is_enabled() {
		hp.validateNearbyParks();
	}
	@Then("^Validate that Essential Amenities icon is enabled$")
	public void validate_that_Essential_Amenities_icon_is_enabled() {
		hp.validateEssentialAmenities();
	}
	@And("^Validate that School Query icon is enabled$")
	public void validate_that_School_Query_icon_is_enabled() {
		hp.validateSchoolQuery();
	}
	@Then("^Validate that More Menu icon is enabled$")
	public void validate_that_More_Menu_icon_is_enabled() {
		hp.validateMoreMenuIcon();
	}
	@And("^Validate that notification icon is enabled$")
	public void validate_that_notification_icon_is_enabled() {
		hp.validatenotificationIcon();
	}
	@Then("^Validate that Map Tools icon is enabled$")
	public void validate_that_Map_Tools_icon_is_enabled() {
		hp.validatemapToolIcon();
	}
	@And("^Validate that toggle icon is enabled$")
	public void validate_that_toggle_icon_is_enabled() {
		hp.validatetoggleIcon();
	}


}
