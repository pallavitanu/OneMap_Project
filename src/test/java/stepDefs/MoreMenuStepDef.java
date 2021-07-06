package stepDefs;

import io.cucumber.java.en.*;
import pageObjects.MoreMenuPageObjects;
import testBase.TestBase;


public class MoreMenuStepDef extends TestBase {
	
	MoreMenuPageObjects mm = new MoreMenuPageObjects(driver);
	
	@Then("^Validate that user can click phpcDisplay in moreMenu options$")
	public void validate_that_user_can_click_phpcDisplay_in_moreMenu_options() {
		mm.clickPHPC();	   
	}
	
	@And("^Validate that all the options in phpcDisplay are present$")
	public void validate_that_all_the_options_in_phpcDisplay_are_present() {
		mm.validatePHPCOptions();
	}
	
	@Then("^Validate that user can click LandQuery in moreMenu options$")
	public void validate_that_user_can_click_LandQuery_in_moreMenu_options(){
		mm.clickLandQuery();
	}
	
	@And("^Validate that query and tenure options in phpcDisplay are present$")
	public void validate_that_query_and_tenure_options_in_LandQuery_are_present() {
		mm.validateLandQueryOptions();	
	}
	
	@Then("^Validate that user can click DroneQuery in moreMenu options$")
	public void validate_that_user_can_click_DroneQuery_in_moreMenu_options() {
		mm.clickDroneQuery();	   
	}
	
	@And("^Validate that all options in DroneQuery are present$")
	public void validate_that_all_options_in_DroneQuery_are_present() {
		mm.validateDroneQueryOptions();
	}
	
	@Then("^Validate that user can click About One Map in moreMenu options$")
	public void validate_that_user_can_click_About_One_Map_in_moreMenu_options() {
		mm.clickAboutOneMap();	   
	}
	
	@And("^Validate that email and homepage link options in About One Map are present$")
	public void validate_that_email_and_homepage_link_options_in_DroneQuery_are_present() {
		mm.validateAboutUsOptions();
	}
	
	@Then("^Validate that user can click Help in moreMenu options$")
	public void validate_that_user_can_click_Help_in_moreMenu_options() {
		mm.clickHelpOption();	   
	}
	
	@And("^Validate that all options in Help are present$")
	public void validate_that_all_the_options_in_Help_are_present() {
		mm.helpOptions();
	}
	

}
