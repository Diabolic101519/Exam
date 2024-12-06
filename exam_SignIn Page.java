// - Signin Page
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.Test; 

public class SignIn { 

   WebDriver driver;  

   @Test

   public void signInPage() {
         driver= new ChromeDriver();

         driver.get("https://datacom.com/nz/en/contact-us");
         Thread.sleep(3000);
        // click on button with the id "Sign In Button"
         WebElement button = driver.findElement(By.By.cssSelector("button[data-test-id='sign-in']"));
         button.click();
         // get sing in title
         title = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]/div/h2"));
		 Thread.sleep(3000);
         String ActualTitle = driver.getTitle();
         Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sign in to Datacom | Get access to Datacom's payroll applications and specific marketplace platforms for your region."");
         //This method verifyTitle if boolean and if the method is meet then it wall pass if not it will error
		 assertFalse(verifyTitle);
         Thread.sleep(3000);
   }

}
