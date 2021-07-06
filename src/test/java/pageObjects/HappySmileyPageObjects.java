package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import helper.WaitHelper;

public class HappySmileyPageObjects {
	
	
	public WebDriver driver;	
	public HappySmileyPageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	Screen screen = new Screen();
	
	public void happySmileyHover() throws InterruptedException {
		Thread.sleep(2000);
		Pattern happySmiley = new Pattern("src/test/resources/Images/happySmiley.jpg"); 
		screen.exists(happySmiley);
		try {
			screen.hover(happySmiley);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}
	public void provideRating() throws FindFailed {
		Pattern helpUsImprove = new Pattern("src/test/resources/Images/HelpUsImproveImage.jpg");
		screen.click(helpUsImprove);
		Pattern rating = new Pattern("src/test/resources/Images/ratingImage.jpg");
		screen.click(rating);
		Pattern thankYou = new Pattern("src/test/resources/Images/thankYouImage.jpg");
		screen.exists(thankYou);
	
	}
	

}
