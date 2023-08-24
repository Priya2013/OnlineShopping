package com.online.shopping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
	
private  WebDriver driver;
	
	




public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}



public  void userName(String username) {
	// TODO Auto-generated method stub

	  driver.findElement(By.id("identifierId")).sendKeys(username);
	
}
public  void passWord(String password) {
	// TODO Auto-generated method stub
	
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
   	WebElement passWord1= driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
 	passWord1.sendKeys(password);
 
}

public void NextPassword() {
	WebElement next=driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span"));
	next.click();
  
}
public void NextUserName() {
	WebElement next=driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span"));
	next.click();
  
}

}
