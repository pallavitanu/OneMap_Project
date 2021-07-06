package pageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import helper.WaitHelper;


public class CovidTestProvidersPageObjects  {
	
	WaitHelper waitHelper;
	public WebDriver driver;	
	public CovidTestProvidersPageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	@FindBy(xpath="//div[@id='PCRTDisplay']")
	private WebElement PCRTDisplay;
	
	@FindBy(xpath="//label[text()='COVID-19 Test Providers']")
	private WebElement covidTestProvidersLabel;
	
	@FindBy(xpath="//input[@id='search-text']")
	private WebElement searchBox;
	
	@FindBy(xpath="//p[@class='block wrap']")
	private WebElement searchedObject;
	
	@FindBy(xpath="//div[@class='DroneCheckBox']/a")
	private WebElement swabProviderLink;
	
	
	public void clickPCRT() {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 5);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//div[@id='PCRTDisplay']")));
		 */
		PCRTDisplay.click();
		
	}
	
	public void validateCovidTestProvidersLabel() {
		waitHelper.waitForElement(covidTestProvidersLabel, 5);
		Assert.assertTrue(covidTestProvidersLabel.isDisplayed());
	}
	
	public void searchExplorer (String textSearch) throws InterruptedException {
		searchBox.sendKeys(textSearch);
		Thread.sleep(3000);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		try {
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}catch(NoAlertPresentException noAlert) {
			noAlert.getMessage();
		}
		waitHelper.waitForElement(searchedObject, 5);
		String actualString = searchedObject.getText();
		Assert.assertEquals(actualString, textSearch);	
	}
	
	public void clickswabProviderLink() {
		waitHelper.waitForElement(swabProviderLink, 7);
		swabProviderLink.click();
	}
	public void validateNewWindowTitle() throws InterruptedException {
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		i1.next();
		String childWindowId = i1.next();
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle ,"MOH | Regulations, Guidelines and Circulars");
	}
	
	public void validateBrokenLinks() throws IOException {
		List<WebElement> links = driver.findElements(By.xpath("//a[starts-with(@href,'http')]"));
		for(WebElement link : links) {
			String urls = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(urls).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			if(respCode>400) {
				System.out.println("The link with Text "+link.getText()+"is broken with code: "+respCode);
			}
		}
	}
		
		
}


