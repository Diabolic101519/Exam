//-- Open Browser and get the title
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.Test; 

public class OpenBrowser { 

   WebDriver driver;  

   @Test

   public void verifyTitle() {

         driver= new ChromeDriver();

         driver.get("https://datacom.com/nz/en/contact-us");
         Thread.sleep(3000);
         Assert.assertEquals(driver.getTitle(), "Our locations | Contact one of our global offices or one of our teams to find out more about how we can help you, or to answer any query you may have.");
         Thread.sleep(3000);
         driver.quit();

   }

}


