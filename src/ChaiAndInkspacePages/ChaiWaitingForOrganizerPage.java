package ChaiAndInkspacePages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import TestBase.Driver;

public class ChaiWaitingForOrganizerPage {
	
	@FindAll(@FindBy(css="div.modal.fade.waiting-organizer-modal.in > div.modal-dialog.modal-desktop  >div.modal-content > div.modal-body > div.preloader-content"))
	public static List<WebElement> WaitForTheOrganizerWindow;
	
	public void WaitForTheOrganizerWindowScreenshot() throws IOException
	{
		Driver.Wait.until(ExpectedConditions.visibilityOfAllElements(WaitForTheOrganizerWindow));
		Helpers.CreateScreenshot("WaitForOrganizerWindow",Helpers.CurrentLanguage);
	}

}
