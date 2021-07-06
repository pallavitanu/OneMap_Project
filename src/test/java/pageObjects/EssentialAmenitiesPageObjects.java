package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import helper.WaitHelper;

public class EssentialAmenitiesPageObjects {
	
	
	WaitHelper waitHelper;
	public WebDriver driver;	
	public EssentialAmenitiesPageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	@FindBy(xpath="//div[@id='EssDisplay']")
	private WebElement EssDisplay;
	
	@FindBy(xpath="//label[text()='Essential Amenities (2km)']")
	private WebElement essentialAmenitiesLabel;
	
	@FindBy(xpath="//div[text()='Retail Pharmacy Locations']")
	private WebElement retailPharmacyLocations;
	
	@FindBy(xpath="//button[text()='No, Cancel']")
	private WebElement noCancelButton;
	
	@FindBy(xpath="//button[text()='Yes, show result island wide']")
	private WebElement yesShowResultButton;
	
	Screen screen = new Screen();
	Pattern RetailPharmacyLocations = new Pattern("src/test/resources/Images/RetailPharmacyLocationsImage.jpg"); 
	
	
	public void clickEss() {
		EssDisplay.click();	
	}
	
	public void validateEssentialAmenitiesLabel() {
		waitHelper.waitForElement(essentialAmenitiesLabel, 5);
		Assert.assertTrue(essentialAmenitiesLabel.isDisplayed());
	}
	
	public void selectRetailPharmacyLocations() {
		retailPharmacyLocations.click();
	}
	
	
	public void verifyNoCancelButton() {
		Assert.assertTrue(noCancelButton.isEnabled());
	}
	
	public void clickyesShowResultButton() {
		yesShowResultButton.click();
	}
	
	public void verifyRetailPharmacyLocations() {
		screen.exists(RetailPharmacyLocations);
		
	}
	


}
