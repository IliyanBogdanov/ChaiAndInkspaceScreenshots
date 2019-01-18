package TestBase;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;

import ChaiAndInkspacePages.ChaiOrInkspacePage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass {


	
	@BeforeMethod
	public static void TestInitialization() throws MalformedURLException, InterruptedException {
	  Driver.DriverInitialization();  
	  Driver.GoTo("https://inkspace.wacom.com/index.html?lang=en");
	}


	@AfterMethod
	public static void TestFinished() {
	  Driver.DriverClose();  
	}

}
