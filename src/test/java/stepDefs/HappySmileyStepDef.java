package stepDefs;

import org.sikuli.script.FindFailed;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HappySmileyPageObjects;
import testBase.TestBase;

public class HappySmileyStepDef extends TestBase{
	
	
	public HappySmileyPageObjects hs = new HappySmileyPageObjects(driver);
	
	@When("^User goes to Happy Smiley in homepage$")
	public void user_goes_to_Happy_Smiley_in_homepage() throws InterruptedException{  
			hs.happySmileyHover();
	}
	
	@Then("^User gives the rating$")
	public void user_gives_the_rating() throws FindFailed {
		hs.provideRating();
	}


}
