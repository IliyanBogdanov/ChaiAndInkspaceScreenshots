package ChaiAndInkspacePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import TestBase.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InkspacePage {

	public static String URL="https://inkspace.wacom.com/index.html?lang=en";
	
	@FindBy(id="login")
	public static WebElement LogInButton;
	
	public void ClickOnLoginButton()
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(LogInButton));
		LogInButton.click();
	}
	
	public void GoToInkspacePage()
	{	
		int GetLanguageStartIndex=URL.indexOf("lang=");
		String GetCurrentLanguage=URL.substring(GetLanguageStartIndex, URL.length());
		URL=URL.replace(GetCurrentLanguage, "lang="+Helpers.CurrentLanguage);
		if(Driver.Name.equals("Android") || Driver.Name.equals("AndroidInkspace"))
		{
			Driver.Mobile.get(URL);
		}else
		{
			Driver.Desktop.get(URL);
		}
	}
	
	
}
