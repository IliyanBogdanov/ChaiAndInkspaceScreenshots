package ChaiAndInkspacePages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import TestBase.Driver;

public class ChaiAccessDeniedPage {

	@FindBy(css="div.modal-content > div.modal-footer.invite-modal-footer > button.btn-modal.success")
	public static WebElement AccessDeniedWindow;

	public static void AccessDeniedWindowScreenshot() throws IOException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(AccessDeniedWindow));
		Helpers.CreateScreenshot("AccessDenied",Helpers.CurrentLanguage);
	}
	
	
}
