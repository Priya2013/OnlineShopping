package testphone;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;
public class AppiumTest {
	  public static void main(String[] args) {
	         
	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setUdid("ENUL630010");
	         
	        options.setCapability("appium:appPackage", "com.google.android.calculator");
	        options.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
	        options.setCapability("platformName", "Android");
	        options.setCapability("appium:platformVersion", "7.1.1");
	        options.setCapability("appium:automationName", "uiautomator2");
	         
	        try {
	            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	        } catch (MalformedURLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}
