package priyasacademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ExtentReport {
      WebDriver driver;
	ExtentReports extent;
	@BeforeTest
	public void config() {
		//ExtentReport,ExtentSparkReporter
	String path=	System.getProperty("usr.dir")+"//reports//index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("WebAutomation Result");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Priyaranjan");
		
	}
	@Test

	public void AppiumTest() throws IOException {
		// code to start the appium server
   	   // extent.createTest("Your Test Name");
         driver=new ChromeDriver();
         driver.get("https://google.com");
         extent.flush();

	}}

