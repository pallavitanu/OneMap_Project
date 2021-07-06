package pageObjects;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import helper.WaitHelper;

public class NearbyParkPageObjects {
	
	WaitHelper waitHelper;
	public WebDriver driver;	
	public NearbyParkPageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	@FindBy(xpath="//div[@id='ParksDisplay']")
	private WebElement ParksDisplay;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement OK;
	
	@FindBy(xpath="//label[text()='Nearby Parks']")
	private WebElement NearbyParkLabel;
	
	@FindBy(xpath="//div[@class='ThemeDownloadKML right']")
	private WebElement downloadButton;
	
	@FindBy(xpath="//select[@class='swal2-select']")
	private WebElement kmlDropDown;
	
	@FindBy(xpath="//button[text()='Download!']")
	private WebElement kmlDownloadButton;
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//div[@title='Information']")
	private WebElement infoButton;
	
	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement infoTitle;
	
	public void clickNearbyPark() {
		ParksDisplay.click();
	}
	public void okButton() {
		waitHelper.waitForElement(OK, 5);
		OK.click();
	}
	
	public void validateNearbyParkLabel() {
		waitHelper.waitForElement(NearbyParkLabel, 5);
		Assert.assertTrue(NearbyParkLabel.isDisplayed());
	}
	
	public void downloadButtonClick() {
		downloadButton.click();
	}
	
	public void downloadkmlFile() throws InterruptedException {
		waitHelper.waitForElement(kmlDropDown, 5);
		Select s = new Select(kmlDropDown);
		s.selectByVisibleText("Parks (KML)");
		kmlDownloadButton.click();
		Thread.sleep(3000);
		File f = new File(System.getProperty("user.dir")+"/nationalparks.kml");
		if(f.exists()) {
			System.out.println("nationalparks.kml file downloaded");
			f.delete();
		}
	}
	public void clickCancel() {
		cancelButton.click();
	}
	
	public void clickInfoButton() {
		infoButton.click();
	}
	
	public void verifyInfoWindow() {
		waitHelper.waitForElement(infoTitle, 5);
		Assert.assertEquals(infoTitle.getText(), "Information");
	}
	
}
