package ChaiAndInkspacePages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import TestBase.Driver;

public class ChaiFTEPage {

	
	
	@FindBy(id="SKIP")
	public static WebElement SkipButton;
	
	@FindBy(id="INVITE_TEAM")
	public static WebElement FirstPageNextButton;
	
	@FindBy(id="COLLABORATE")
	public static WebElement SecondPageNextButton;
	
	@FindBy(css="div.fte-group > div.fte-btn-group > button[data-reactid^='.0.0.f.']")
	public static WebElement ThirdPageNextButton;
	
	
	public void SkipButtonClick(){
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(SkipButton));
		SkipButton.click();
	}
	
	public void FTEFirstPageScreenshot() throws IOException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(SkipButton));
		Helpers.CreateScreenshot("FTEFirstPage",Helpers.CurrentLanguage);
	}
	
	public void FTEFirstPageNextButtonClick()
	{
		FirstPageNextButton.click();
	}
	
	public void FTESecondPageScreenshot() throws IOException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(SecondPageNextButton));
		Helpers.CreateScreenshot("FTESecondPage",Helpers.CurrentLanguage);
	}
	
	public void FTESecondPageNextButtonClick()
	{
		SecondPageNextButton.click();
	}
	
	public void FTEThirdPageScreenshot() throws IOException, InterruptedException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(ThirdPageNextButton));
		Helpers.CreateScreenshot("FTEThirdPage",Helpers.CurrentLanguage);
	}
	
	public void FTEThirdPageNextButtonClick()
	{
		ThirdPageNextButton.click();
	}
	
	
	
}
