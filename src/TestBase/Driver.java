package TestBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class Driver {

	public static AppiumDriver<WebElement> Mobile;
	public static DesiredCapabilities capabilities;
	public static FirefoxDriver Desktop;
	public static WebDriverWait Wait;
	public static String Name="AndroidInkspace";
	
	@SuppressWarnings("unused")
	public static void DriverInitialization() throws MalformedURLException
	{
		if(Driver.Name.equals("Android") || Driver.Name.equals("AndroidInkspace"))
		{
			capabilities=new DesiredCapabilities();
		  	capabilities.setCapability("browserName", "Chrome");
		  	capabilities.setCapability("platformName", "Android");
		  	capabilities.setCapability("deviceName", "Note 4 (Galaxy Note4)");
		  	capabilities.setCapability("version", "6.0.1");
		  	capabilities.setCapability("nativeWebTap", true);
		  	Mobile = new io.appium.java_client.android.AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		  	Wait=new WebDriverWait(Mobile, 120);
		}
		else
		{
			Desktop=new FirefoxDriver();
			Desktop.manage().window().maximize();
			Wait=new WebDriverWait(Desktop, 120);
		}	
	}
	

	
	
	public static void GoTo(String URL)
	{
		if(Driver.Name.equals("Android") || Driver.Name.equals("AndroidInkspace"))
		{
			Mobile.get(URL);
		}else
		{
			Desktop.get(URL);
		}
	}
	
	
	public static void DriverClose()
	{
		if(Driver.Name.equals("Android") || Driver.Name.equals("AndroidInkspace"))
		{
			Mobile.quit();
		}else
		{
			Desktop.quit();
		}
	}

	
}
