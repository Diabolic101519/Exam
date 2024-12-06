// - Signin Page
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.Test; 

public class SignIn { 

   WebDriver driver;  

   @Test

   public void signInDataPay() {
         driver= new ChromeDriver();

         driver.get("https://datacom.com/nz/en/contact-us");
         Thread.sleep(3000);
        // click on button with the id "Sign In Data Pay"
         WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/div/div/ul/li[1]/div[2]/a"));
         button.click();
         // get sing in title
          WebElement user=driver.findElement(By.id("username"));
          WebElement pass=driver.findElement(By.id("password")); 
          user.sendKeys("examjava@gmail.com");
		  pass.sendKeys("123565");
		  Thread.sleep(3000);
          submit =driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/form/button"));
		  submit.click();
		  
		  // Verify if the username and password is correct or not
          String actualUrl="https://datacomdirectaccess.co.nz/login/username"; 
          String expectedUrl= driver.getCurrentUrl(); 
		  if(actualUrl.equalsIgnoreCase(expectedUrl)) {
          System.out.println("Test passed"); 
		  } 
		  else { 
		  System.out.println("Test failed"); 
		  }
  
   }

}
