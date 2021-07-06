package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.TryCatchHelper;
import helper.WaitHelper;

public class MoreMenuPageObjects {
	
	
	WaitHelper waitHelper;
	public WebDriver driver;	
	public MoreMenuPageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	TryCatchHelper tc = new TryCatchHelper();
	
	private void moreMenuOptionsVerify(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	
	@FindBy(xpath="//a[@class='wb collapsed']")
	private WebElement moreMenu;
	
	@FindBy(xpath="//*[@id='PHPCDisplay']")
	private WebElement phpcDisplay;
	
	@FindBy(xpath="//div[@id='LQDisplay']")
	private WebElement lqDisplay;
	
	@FindBy(xpath="//div[@id='DQDisplay']")
	private WebElement dqDisplay;
	
	@FindBy(xpath="//div[@id='ADisplay']")
	private WebElement aboutUs;
	
	@FindBy(xpath="//div[@id='FDDisplay']")
	private WebElement feedback;
	
	@FindBy(xpath="//div[@id='HDisplay']")
	private WebElement helpOption;
	
	//phpc
	@FindBy(xpath="//label[@id='cam-title']")
	private WebElement phpcQuery;
	
	@FindBy(xpath="//div[text()='Public Health Preparedness Clinics (PHPCs)']")
	private WebElement phpcOptions;
	
	@FindBy(xpath="//div[text()='Download PHPCs Data']")
	private WebElement phpcDataDownload;
	
	@FindBy(xpath="//img[@alt='govtech_logo']")
	private WebElement govtechLogo;
	
	@FindBy(xpath="//img[@alt='moh_logo']")
	private WebElement mohLogo;
	
	@FindBy(xpath="//img[@alt='phpc_logo']")
	private WebElement phpcLogo;
	
	@FindBy(xpath="//img[@alt='sla_logo']")
	private WebElement slaLogo;
	
	//LandQuery
	@FindBy(xpath="//label[text()='LandQuery ']")
	private WebElement landQuery;
	
	@FindBy(xpath="//li[@id='qt']/a")
	private WebElement queryOption;
	
	@FindBy(xpath="//li[@id='tt']/a")
	private WebElement tenureOptions;
	
	
	//DroneQuery
	@FindBy(xpath="//label[text()='DroneQuery']")
	private WebElement droneQuery;
	
	@FindBy(xpath="//div[text()='Areas within 5km of aerodromes']")
	private WebElement aerodromesOption;
	
	@FindBy(xpath="//div[text()='Areas within Danger Areas']")
	private WebElement dangerAreasOptions;
	
	@FindBy(xpath="//div[text()='Protected Area under Section 7 Air Navigation Act']")
	private WebElement protectedArea;
	
	@FindBy(xpath="//div[text()='Areas within Prohibited Areas']")
	private WebElement prohibitedAreas;

	//aboutUs
	@FindBy(xpath="//label[text()='About OneMap']")
	private WebElement aboutOneMap;
	
	@FindBy(xpath="//a[text()='onemap@sla.gov.sg']")
	private WebElement oneMapEmail;
	
	@FindBy(xpath="//a[text()='Click here to view Homepage']")
	private WebElement homePageLink;
	
	//Help
	@FindBy(xpath="//label[text()='Help']")
	private WebElement help;
	
	@FindBy(xpath="//a[text()=' Web browser Tutorial']")
	private WebElement webBrowserTutorial;
	
	@FindBy(xpath="//a[text()='Video Tutorial']")
	private WebElement videoTutorial;
	
	@FindBy(xpath="//a[text()='Abbreviations']")
	private WebElement abbreviations;
	
	@FindBy(xpath="//a[text()='Legend']")
	private WebElement legend;
	
	@FindBy(xpath="//a[text()='API Documentation Page']")
	private WebElement apiDocPage;
	
	@FindBy(xpath="//a[text()='Open Data Licence']")
	private WebElement oneDataLicence;
	
	public void clickPHPC(){	
		this.moreMenu.click();
		this.moreMenuOptionsVerify(phpcDisplay);
	}
	
	public void clickLandQuery() {	
		this.moreMenu.click();
		this.moreMenuOptionsVerify(lqDisplay);
	}
	
	public void clickDroneQuery() {	
		this.moreMenu.click();
		this.moreMenuOptionsVerify(dqDisplay);
	}
	
	public void clickAboutOneMap() {	
		this.moreMenu.click();
		this.moreMenuOptionsVerify(aboutUs);
	}
	
	public void clickHelpOption() {	
		this.moreMenu.click();
		this.moreMenuOptionsVerify(helpOption);
	}
	
	//phpc
	public void validatePHPCOptions() {
		waitHelper.waitForElement(phpcQuery, 5);
		tc.elementDisplayed(phpcQuery);
		tc.elementDisplayed(phpcOptions);
		tc.elementDisplayed(phpcDataDownload);
		tc.elementDisplayed(govtechLogo);
		tc.elementDisplayed(mohLogo);
		tc.elementDisplayed(phpcLogo);
		tc.elementDisplayed(slaLogo);
	}
	
	//LandQuery 
	public void validateLandQueryOptions() {
		waitHelper.waitForElement(landQuery, 5);
		tc.elementDisplayed(landQuery);
		tc.elementDisplayed(landQuery);
		tc.elementDisplayed(tenureOptions);
	}
	
	//DroneQuery 
	public void validateDroneQueryOptions() {
		waitHelper.waitForElement(droneQuery, 5);
		tc.elementDisplayed(droneQuery);
		tc.elementDisplayed(aerodromesOption);
		tc.elementDisplayed(dangerAreasOptions);
		tc.elementDisplayed(protectedArea);
		tc.elementDisplayed(prohibitedAreas);
	}
	
	//aboutUs 
	public void validateAboutUsOptions() {
		waitHelper.waitForElement(aboutOneMap, 5);
		tc.elementDisplayed(aboutOneMap);
		tc.elementDisplayed(oneMapEmail);
		tc.elementDisplayed(homePageLink);
	}
		
	//Help
	public void helpOptions() {
		waitHelper.waitForElement(help, 5);
		tc.elementDisplayed(help);
		tc.elementDisplayed(webBrowserTutorial);
		tc.elementDisplayed(videoTutorial);
		tc.elementDisplayed(abbreviations);
		tc.elementDisplayed(legend);
		tc.elementDisplayed(apiDocPage);
		tc.elementDisplayed(oneDataLicence);
	}

}
