package utility;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.online.shopping.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	  System.out.println("Testing");
	
	  
	//  driver.findElement(By.id("identifierId")).sendKeys("pdahal2023@nrnusa.org");
	
	  //*[@id="identifierNext"]/div/button/span
	    LoginPage loginPage= new LoginPage(driver);
	    loginPage.userName("pdahal2023@nrnusa.org");
	    loginPage.NextUserName();
	    loginPage.passWord("Presiha@2010");
	    loginPage.NextPassword();
	       
	
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		 * WebElement passWord1=
		 * driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		 * passWord1.sendKeys("Preisha@2010");
		 */
			
	        	//*[@id="passwordNext"]/div/button/span
	        	
	  //*[@id="yDmH0d"]/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[3]/div/div[1]/div/div/div[1]/div/input
		
		
		
	   // driver.findElement(By.id("password")).sendKeys("Preisha@2010");
	 //   loginPage.passWord("Preisha@2010");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  driver.get("https://www.gmail.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
  }

  @AfterMethod
  public void afterMethod() {
	//  driver.quit();
  }

}
