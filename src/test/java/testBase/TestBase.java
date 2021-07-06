package testBase;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import enums.Browsers;
import enums.OS;


public class TestBase {
	
public static WebDriver driver;

	
	public WebDriver selectBrowser(String browser) {
		if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/Driver/chromedriver.exe");
				String downloadPath = System.getProperty("user.dir");
				HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadPath);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--headless");
				options.addArguments("--window-size=1920,1080");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/Driver/geckodriver.exe");
				
				String downloadPath = System.getProperty("user.dir");
				FirefoxOptions options = new FirefoxOptions();
				options.setAcceptInsecureCerts(true);
				
				options.addPreference("browser.download.folderList", 2);
				options.addPreference("browser.helperApps.alwaysAsk.force", false);
				options.addPreference("browser.download.dir", downloadPath); 
				options.addPreference("browser.download.defaultFolder",downloadPath); 
				options.addPreference("browser.download.manager.showWhenStarting", false);
				options.addPreference("browser.helperApps.neverAsk.saveToDisk","multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png ,image/jpeg, application/pdf, text/html,text/plain,  application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/octet-stream");
				//options.addArguments("--headless");
				options.addArguments("--window-size=1920,1080");
				driver = new FirefoxDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
				 
			}
		} else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/Driver/chromedriver");
				String downloadPath = System.getProperty("user.dir");
				HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadPath);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--headless");
				options.addArguments("--window-size=1920,1080");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/src/test/resources/Driver/geckodriver");
				String downloadPath = System.getProperty("user.dir");
				FirefoxOptions options = new FirefoxOptions();
				options.setAcceptInsecureCerts(true);
				
				options.addPreference("browser.download.folderList", 2);
				options.addPreference("browser.helperApps.alwaysAsk.force", false);
				options.addPreference("browser.download.dir", downloadPath); 
				options.addPreference("browser.download.defaultFolder",downloadPath); 
				options.addPreference("browser.download.manager.showWhenStarting", false);
				options.addPreference("browser.helperApps.neverAsk.saveToDisk","multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png ,image/jpeg, application/pdf, text/html,text/plain,  application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/octet-stream");
				options.addArguments("--headless");
				options.addArguments("--window-size=1920,1080");
				driver = new FirefoxDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		} else if (System.getProperty("os.name").toLowerCase().contains(OS.LINUX.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/Driver/linux/chromedriver");
				String downloadPath = System.getProperty("user.dir");
				HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadPath);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--headless");
				options.addArguments("--window-size=1920,1080");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/src/test/resources/Driver/linux/geckodriver");
				String downloadPath = System.getProperty("user.dir");
				FirefoxOptions options = new FirefoxOptions();
				options.setAcceptInsecureCerts(true);
				
				options.addPreference("browser.download.folderList", 2);
				options.addPreference("browser.helperApps.alwaysAsk.force", false);
				options.addPreference("browser.download.dir", downloadPath); 
				options.addPreference("browser.download.defaultFolder",downloadPath); 
				options.addPreference("browser.download.manager.showWhenStarting", false);
				options.addPreference("browser.helperApps.neverAsk.saveToDisk","multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png ,image/jpeg, application/pdf, text/html,text/plain,  application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/octet-stream");
				options.addArguments("--headless");
				options.addArguments("--window-size=1920,1080");
				driver = new FirefoxDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		}
		return driver;
	}
	
	


}
