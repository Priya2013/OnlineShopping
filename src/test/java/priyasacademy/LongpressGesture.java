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


public class LongpressGesture{

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
	driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
	driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	WebElement longClick=driver.findElement(AppiumBy.xpath("*//android.widget.TextView[@text='People Names']"));
	
	/*
	 * // Java ((JavascriptExecutor)
	 * driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
	 * "elementId", ((RemoteWebElement) element).getId() ));
	 */
	((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", 
			ImmutableMap.of("elementId", ((RemoteWebElement) longClick).getId(),"duration",2000));
	
      Thread.sleep(2000);
   String SampleMenu=driver.findElement(By.id("android:id/title")).getText();

   SoftAssert softassert=new SoftAssert();
   softassert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
   
	softassert.assertAll();
	driver.quit();
    
}
}