package stepDefs;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.cucumber.listener.Reporter;

import com.google.common.io.Files;

import enums.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testBase.TestBase;


public class Hooks {
	
	TestBase testBase;
	WebDriver driver;
	ExtentReports extent;
	
	public Properties prop;
	
	public String getData() throws IOException {
		
		String browserName = System.getProperty("browser");
		return browserName;
	}

	@Before
	public void initializeTest() throws IOException {
		testBase = new TestBase();
		String b =this.getData();
				if(b.equalsIgnoreCase("chrome")) {
		testBase.selectBrowser(Browsers.CHROME.name());
		
		}
		else if (b.equalsIgnoreCase("firefox")) {
			testBase.selectBrowser(Browsers.FIREFOX.name());
		}
				
	}
	
	@After(order =1)
	public void endTest(Scenario scenario) throws InterruptedException, IOException {
		 if (scenario.isFailed()) {
			 testBase = new TestBase();
			 String screenshotName = scenario.getName().replaceAll(" ", "_");
			 
			 //This takes a screenshot from the driver at save it to the specified location
			 File sourcePath = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.FILE);
			 
			 //Building up the destination path for the screenshot to save
			 //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
			 String path= System.getProperty("user.dir") + "/reports/" + screenshotName + ".png";
			 File destinationPath = new File(path);
			 //Copy taken screenshot from source location to destination location
			 //Files.copy(sourcePath, destinationPath); 
			 FileUtils.copyFile(sourcePath, destinationPath);
			 //This attach the specified screenshot to the test
			 //Reporter.addScreenCaptureFromPath(destinationPath.toString());
		
		 }	
	}
	
	 @After(order = 0)
	 public void AfterSteps() {
		 TestBase.driver.close();
	 }
}
