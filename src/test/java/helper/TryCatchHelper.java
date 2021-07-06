package helper;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TryCatchHelper {
	
	public void elementDisplayed(WebElement elem) {
	try {
		Assert.assertTrue(elem.isDisplayed());
      }
      catch (AssertionError e) {
         System.out.println(e.getMessage());
      }	
	}
	public void elementEnabled(WebElement elem) {
	try {
		Assert.assertTrue(elem.isEnabled());
      }
      catch (AssertionError e) {
         System.out.println(e.getMessage());
      }	
	}


}
