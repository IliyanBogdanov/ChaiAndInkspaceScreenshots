package Helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestBase.Driver;

public class Helpers {
	
	
	public static  String ChaiSession="https://inkspace.wacom.com/collaboration/?sessionId=64186494-fd3e-47cb-a66d-37006044a7d4&lang=en";
	public static String InkspaceURL="https://inkspace.wacom.com/user?lang=en";
	public static final String [] Languages={"en","de","es","fr","it","pl","ko","ru","ja","zhs","zht","pt"};
	//public static final String [] Languages={"ja","zhs","zht","pt"};
	public static String CurrentLanguage="en";
	
	public static void SetLanguage(String Language)
	{
		CurrentLanguage=Language;
	}
	
	
	@SuppressWarnings("unused")
	public static void CreateScreenshot(String ScreenshotName, String Language) throws IOException
	{
		if(Driver.Name.equals("Android"))
		{
			File CreateNewFile=((TakesScreenshot)Driver.Mobile).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(CreateNewFile,new File( "/Users/nenko/Documents/WacomProjectScreenshots/ChaiAndInkspaceScreenshots/ChaiMobile/"+Language+"/"+ScreenshotName+"_"+Language+".png"));
		}else if (Driver.Name.equals("FirefoxInkspace")) {
			File CreateNewFile=((TakesScreenshot)Driver.Desktop).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(CreateNewFile,new File( "/Users/nenko/Documents/WacomProjectScreenshots/ChaiAndInkspaceScreenshots/InkspaceDesktop/"+Language+"/"+ScreenshotName+"_"+Language+".png"));
		}else if(Driver.Name.equals("AndroidInkspace"))
		{
			File CreateNewFile=((TakesScreenshot)Driver.Mobile).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(CreateNewFile,new File( "/Users/nenko/Documents/WacomProjectScreenshots/ChaiAndInkspaceScreenshots/InkspaceAndroid/"+Language+"/"+ScreenshotName+"_"+Language+".png"));
		}
		else
		{
			File CreateNewFile=((TakesScreenshot)Driver.Desktop).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(CreateNewFile,new File( "/Users/nenko/Documents/WacomProjectScreenshots/ChaiAndInkspaceScreenshots/ChaiDesktop/"+Language+"/"+ScreenshotName+"_"+Language+".png"));
		}
		
	}

}
