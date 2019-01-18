package ChaiAndInkspacePages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import TestBase.Driver;

public class ChaiHomePage {

	@FindBy(id="login")
	public static WebElement LogInButton;

	
	@FindBy(css="ul.bottom-group > li > button.main-btn.btn.import > i")
	public static WebElement ImportButton;

	@FindBy(name="image")
	public static WebElement ImportFileOption;
	
	@FindBy(css="section.tools > button.main-btn.btn.mobile-toggle > i")
	public static WebElement MobileMultipleOptionButton;

	@FindBy(css="ul.bottom-group-mobile > li > button.main-btn.btn.import")
	public static WebElement MobileMultipleOptionImport;

	@FindBy(css="ul.bottom-group > li > button.main-btn.btn.fbr-menu")
	public static WebElement ReportBugOrSendFeedbackButtonOptions;
	
	@FindBy(css="section.tools > button.main-btn.btn.mobile-toggle > i")
	public static WebElement MultipleOptionsButton;
	
	@FindBy(css="ul.bottom-group-mobile > li > button.main-btn.btn.import")
	public static WebElement ImportOptionMobile;
	
	@FindBy(css="div.modal-body > div.preloader-content > i.preloader-icon")
	public static WebElement LoadingWindow;
	
	@FindBy(css="div.add-user-btn-wrapper > button.add-user-btn")
	public static WebElement CollaboratorOptionsDropdwonDesktop;
	
	@FindBy(id="169436")
	public static WebElement CollaboratorOptionsDropdwonMobile;
	
	@FindBy(xpath="//div[@id='main']/div/div/div[3]/div[2]/div/div/button")
	public static WebElement CopyOption;
	
	@FindBy(css="button.context-btn.btn-defalt.btn-paste > span")
	public static WebElement PasteOption;
	
	
	
	public void GoToChaiHomePage()
	{
		Driver.GoTo(Helpers.ChaiSession.replace("lang=en", "lang="+Helpers.CurrentLanguage));	
	}
	
	public void HomePageScreenshot() throws IOException
	{
		if(Driver.Name.equals("Android"))
		{
			Driver.Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("169436")));
		}else
		{
			Driver.Wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.add-user-btn-wrapper > button.add-user-btn")));
		}
		
		Helpers.CreateScreenshot("HomePage", Helpers.CurrentLanguage);
	}
	
	
	@SuppressWarnings("unused")
	public void ImportButtonClick()
	{
		if(Driver.Name.equals("Android"))
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(MobileMultipleOptionButton));
			MobileMultipleOptionButton.click();
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(MobileMultipleOptionImport));
			MobileMultipleOptionImport.click();
		}else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(ImportButton));
			ImportButton.click();
		}
	}
	
	@SuppressWarnings("unused")
	public void ImportCreateScreenshot() throws IOException, InterruptedException
	{
		if(Driver.Name.equals("Android"))
		{
			Thread.sleep(1000);
			Helpers.CreateScreenshot("ImportPicture",Helpers.CurrentLanguage);
			MobileMultipleOptionButton.click();
			Thread.sleep(1000);
			MobileMultipleOptionButton.click();
			
		}else
		{
			Thread.sleep(1000);
			Helpers.CreateScreenshot("ImportPicture",Helpers.CurrentLanguage);
			ImportButton.click();
		}
	}
	
	public void ClickOnReportBugOrSendFeedbackButtonOptions()
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(ReportBugOrSendFeedbackButtonOptions));
		ReportBugOrSendFeedbackButtonOptions.click();
	}
	
	public void ReportBugOrSendFeedbackButtonOptionsCreateScreenshot() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		Helpers.CreateScreenshot("ReportBugOrSendFeedback",Helpers.CurrentLanguage);
		ReportBugOrSendFeedbackButtonOptions.click();
	}
	
	
	public void ClickOnTheMultipleOptionsButtonMobile()
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(MultipleOptionsButton));
		MultipleOptionsButton.click();
	}
	
	public void MultipleOptionsScreenshotMobile() throws IOException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(MultipleOptionsButton));
		Helpers.CreateScreenshot("MultipleOptions",Helpers.CurrentLanguage);
	}
	
	
	public void ClickOnTheImportOptionMobile()
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(ImportOptionMobile));
		ImportOptionMobile.click();
	}
	
	
	public void ImportOptionsScreenshotMobile() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(MultipleOptionsButton));
		Helpers.CreateScreenshot("ImportOption",Helpers.CurrentLanguage);
	}
	
	public static void LoadingWindowScreenshot() throws IOException
	{
		Driver.Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-body > div.preloader-content > i.preloader-icon")));
		Helpers.CreateScreenshot("Loading",Helpers.CurrentLanguage);
		
	}
	
	public void DrawingMakeASelection() throws AWTException, InterruptedException, IOException
	{
		Thread.sleep(1000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/cliclick c:945,166").getInputStream ();
		Robot robot=new Robot();  
		Thread.sleep(2000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/cliclick m:1525,1030").getInputStream ();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/cliclick c:1525,1030").getInputStream ();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/cliclick m:1435,620").getInputStream ();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/cliclick c:1435,620").getInputStream ();
		Thread.sleep(15000);
		Thread.sleep(1000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/cliclick c:945,166").getInputStream ();
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON3_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_MASK);  
		Thread.sleep(1000);
	}
	
	public void CopyCutDeleteOptionsScreenshot() throws IOException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(CopyOption));
		Helpers.CreateScreenshot("CopyCutDeleteOptions",Helpers.CurrentLanguage);
	}
	
	
	public void ClickOnTheCopyOption() throws IOException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(CopyOption));
		CopyOption.click();
	}
	
	public void	PasteOptionScreenshot() throws InterruptedException, AWTException, IOException
	{ 
	    Robot robot=new Robot();  
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON3_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_MASK);  
		Thread.sleep(1000);
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(PasteOption));
		Helpers.CreateScreenshot("PasteOption",Helpers.CurrentLanguage);
		Thread.sleep(1000);  
	}
	
	
}
