package priyasacademy;

import java.io.File;
import org.apache.commons.io.FileUtils; 
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics {

	
	@Test(groups={"smoke"}) 

	public void AppiumTest() throws IOException {
		// code to start the appium server
      
		
       
       

       
		
		 Properties prop=new Properties();
	       FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resources//data.properties");
			prop.load(fis);
		String ipAddress=	prop.getProperty("ipAddress");
	
			
			  AppiumDriverLocalService service= new AppiumServiceBuilder()
			 .withAppiumJS(new File(
			 "C://Users//sabit//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"
			 )) .withIPAddress(ipAddress).usingPort(4723).build();
			 
			
			
			
			UiAutomator2Options options = new UiAutomator2Options();
		//options.setChromedriverExecutable("C:\\Users\\sabit\\Drivers\\chromedriver-win64_v115.0.5790.170");

		
		 options.setDeviceName("PriyasPhone");
		//options.setDeviceName("Android Device");
		options.setApp("C://Users//sabit//eclipse-workspace//GeneralStore//src//test//java//resources//General-Store.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		getScreenshot(driver);

	}
	
	
	
	public static void getScreenshot(AndroidDriver driver) {
	    try {
	        // Take the screenshot using Appium's driver
	        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        // Define the destination path
	        String destination = System.getProperty("user.dir") + "//Screenshots//index.png";
	        
	        // Copy the screenshot to the destination path
	        FileUtils.copyFile(source, new File(destination));
	        
	        System.out.println("Screenshot saved to: " + destination);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
