package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import helper.TryCatchHelper;
import helper.WaitHelper;

public class HomePageObjects {
	
	WaitHelper waitHelper;
	public WebDriver driver;	
	public HomePageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	TryCatchHelper tc = new TryCatchHelper();
	
	@FindBy(xpath="//img[@alt='Got it, do not show again']")
	private WebElement crossImage;
	
	@FindBy(xpath="//span[text()='A Singapore Government Agency Website']")
	private WebElement homePageHeading;
	
	@FindBy(xpath="//input[@id='search-text']")
	private WebElement searchBox;
	
	@FindBy(xpath="//div[@id='VaccinationDisplay']")
	private WebElement VaccinationCentres;
	
	@FindBy(xpath="//div[@id='PCRTDisplay']")
	private WebElement PCRTDisplay;
	
	@FindBy(xpath="//div[@id='ParksDisplay']")
	private WebElement ParksDisplay;
	
	@FindBy(xpath="//div[@id='EssDisplay']")
	private WebElement EssDisplay;
	
	@FindBy(xpath="//div[@id='SQDisplay']")
	private WebElement SQDisplay;
	
	@FindBy(xpath="//a[@class='wb collapsed']")
	private WebElement moreMenu;
	
	@FindBy(xpath="//div[@id='ShowNotification']")
	private WebElement notification;
	
	@FindBy(xpath="//div[@id='ShowOtherMarkers']")
	private WebElement mapTool;
	
	@FindBy(xpath="//div[@id='toggleLocateMe']")
	private WebElement toggle;

	
	public void crossEntryImage() {
		this.crossImage.click();	
	}
	
	public void validatehomePageHeading() {
		tc.elementDisplayed(homePageHeading);
	}
	public void validateSearchBox() {
		tc.elementEnabled(searchBox);
	}
	public void validateVaccinationCentres() {
		tc.elementEnabled(VaccinationCentres);
	}
	public void validateCovideTestProvider() {
		tc.elementEnabled(PCRTDisplay);
	}
	public void validateNearbyParks() {
		tc.elementEnabled(ParksDisplay);	
	}
	public void validateEssentialAmenities() {
		tc.elementEnabled(EssDisplay);
	}
	public void validateSchoolQuery() {
		tc.elementEnabled(SQDisplay);
	}
	public void validateMoreMenuIcon() {
		tc.elementEnabled(moreMenu);
	}
	
	public void validatenotificationIcon() {
		tc.elementEnabled(notification);
	}
	public void validatemapToolIcon() {
		tc.elementEnabled(mapTool);
	}
	public void validatetoggleIcon() {
		tc.elementEnabled(toggle);	
	}
	
	
}
