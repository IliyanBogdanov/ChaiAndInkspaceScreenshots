package ChaiAndInkspaceTests;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ChaiAndInkspacePages.ChaiOrInkspacePage;
import Helpers.Helpers;
import TestBase.Driver;
import TestBase.TestBaseClass;

public class InkspaceScreenshotsTests  {
  @Test
  @Parameters("DriverName")
  public void InkspaceTests(String DriverName) throws InterruptedException, IOException {
		Driver.Name=DriverName;
		for (int i = 0; i < Helpers.Languages.length; i++) {
		Helpers.CurrentLanguage=Helpers.Languages[i];
		TestBaseClass.TestInitialization();
		ChaiOrInkspacePage.InkspacePage().GoToInkspacePage();
		ChaiOrInkspacePage.InkspacePage().ClickOnLoginButton();
		ChaiOrInkspacePage.InkspaceLoginPage().LoginIntoInkspaceWithValidCredentialsAsCollaborator();
		ChaiOrInkspacePage.InkspaceHomePage().InkspaceBetaWindowScreenshot();
		ChaiOrInkspacePage.InkspaceHomePage().InkspaceBetaWindowClickOnToSureIllJoinOption();
		ChaiOrInkspacePage.InkspaceHomePage().InkspaceHomePageScreenshot();
		System.out.println("dsa");
		
		if(Driver.Name.contains("Firefox")){
		Helpers.InkspaceURL=Driver.Desktop.getCurrentUrl();
		}else
		{
			Helpers.InkspaceURL=Driver.Mobile.getCurrentUrl();
		}
		
		ChaiOrInkspacePage.InkspaceHomePage().ShowFirstPictureOptionsAndCreateScreenshot();
		ChaiOrInkspacePage.InkspaceHomePage().ClickOnTheCollaborationButton();
		ChaiOrInkspacePage.InkspaceHomePage().CreateCollaborationScreenshot();
		ChaiOrInkspacePage.InkspaceHomePage().ClickOnTheCancelCollaborationButton();
		ChaiOrInkspacePage.InkspaceHomePage().ClickOnTheFirstPicture();
		ChaiOrInkspacePage.InkspaceHomePage().ClickOnTheFirstPicturePreviewMoreOptionButton();
		ChaiOrInkspacePage.InkspaceHomePage().PicturePreviewOptionsScreenshot();
		ChaiOrInkspacePage.InkspaceHomePage().ClickOnThePicturePreviewCloseButton();
		ChaiOrInkspacePage.InkspaceHomePage().ClickOnTheUserDropDownButton();
		ChaiOrInkspacePage.InkspaceHomePage().UserDropdownMenuOptionsScreenshot();
		ChaiOrInkspacePage.InkspaceHomePage().ExpiredSubscriptionModalWindowScreenshot();
		ChaiOrInkspacePage.InkspaceHomePage().MissingOrganizerModalWindowScreenshot();
		ChaiOrInkspacePage.InkspaceHomePage().FreeTrialReadyToExpireModalWindowScreenshot();
		ChaiOrInkspacePage.InkspaceHomePage().PremiumModalWindowScreenshot();
		
		TestBaseClass.TestFinished();
	  }
  }

}
