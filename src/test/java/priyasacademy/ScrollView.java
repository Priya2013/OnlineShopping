package priyasacademy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class ScrollView{

@Test

public void AppiumTest() throws MalformedURLException, InterruptedException {
	//code to start the appium server
	
	/*
	 * AppiumDriverLocalService service= new AppiumServiceBuilder()
	 * .withAppiumJS(new File(
	 * "C://Users//sabit//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"
	 * )) .withIPAddress("127.0.0.1").usingPort(4723).build();
	 */
	
	
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("PriyasPhone");
	options.setApp("C://Users//sabit//eclipse-workspace//mobileTest//src//test//java//resources//ApiDemos-debug.apk");
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
    
	//Xpath,accessibilityID,androidUIAutomator,className
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	
	//scroll 

	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	
	boolean canScrollMore;

	//WebElement WebView=driver.findElement(AppiumBy.accessibilityId("WebView"));
	do {
	 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		    
		)
			 
			 );;
			 
			 if(driver.findElement(AppiumBy.accessibilityId("WebView")).isDisplayed()) {
				 driver.findElement(AppiumBy.accessibilityId("WebView")).click();
			    }
			 else {
				 continue;
			 }
	  
	}
	while(canScrollMore);
	
   SoftAssert softassert=new SoftAssert();

   
	softassert.assertAll();
	driver.quit();
    
}
}