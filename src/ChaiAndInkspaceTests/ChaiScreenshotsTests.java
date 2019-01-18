package ChaiAndInkspaceTests;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import ChaiAndInkspacePages.ChaiOrInkspacePage;

import Helpers.Helpers;
import TestBase.Driver;
import TestBase.TestBaseClass;

public class ChaiScreenshotsTests extends TestBaseClass {

	@SuppressWarnings("unused")
	@Test(priority=1)
  public void ChaiDesktopScreenshots() throws Exception 
  {
		
		ChaiOrInkspacePage.InkspacePage().ClickOnLoginButton();
		ChaiOrInkspacePage.InkspaceLoginPage().LoginIntoInkspaceWithValidCredentialsAsOrganizer();
		ChaiOrInkspacePage.InkspaceHomePage().InkspaceBetaWindowClickOnToSureIllJoinOption();
		ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();	
		ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();
		ChaiOrInkspacePage.ChaiFTEPage().SkipButtonClick();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().ClickOnTheAddOrRemoveButton();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().RemoveCollaboratorShowOptions();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().RemoveCollaboratorOptionsScreenshot();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().ClickOnRemoveUser();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().RemoveCollaboratorConfirmationScreenshot();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().RemoveCollaboratorOkOption();
		
		for (int i = 0; i < Helpers.Languages.length; i++) {
		Helpers.CurrentLanguage=Helpers.Languages[i];
		ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().ClickOnTheAddOrRemoveButton();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().AddCollaboratorsCreateScreenshot();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().AddCollaboratorScreenshot();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().TypeInCorrectValueToAddCollaborator();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().ClickOnTheSendInvitationButton();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().InvitationHasBeenSentWindowScreenshot();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().ClickOnTheInvitationHasBeenSentOkButton();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().ClickOnTheAddOrRemoveButton();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().RemoveCollaboratorShowOptions();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().RemoveCollaboratorOptionsScreenshot();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().ClickOnRemoveUser();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().RemoveCollaboratorConfirmationScreenshot();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().RemoveCollaboratorOkOption();
	
		if(Driver.Name=="Android"){
			ChaiOrInkspacePage.ChaiHomePage().ClickOnTheMultipleOptionsButtonMobile();
			ChaiOrInkspacePage.ChaiHomePage().MultipleOptionsScreenshotMobile();
			ChaiOrInkspacePage.ChaiHomePage().ClickOnTheImportOptionMobile();
			ChaiOrInkspacePage.ChaiHomePage().ImportOptionsScreenshotMobile();
		}else
		{
			ChaiOrInkspacePage.ChaiHomePage().ImportButtonClick();
			ChaiOrInkspacePage.ChaiHomePage().ImportCreateScreenshot();
		}
		}
		
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().ClickOnTheAddOrRemoveButton();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().AddCollaboratorsCreateScreenshot();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().AddCollaboratorScreenshot();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().TypeInCorrectValueToAddCollaborator();
		ChaiOrInkspacePage.ChaiAddAndRemoveCollaborators().ClickOnTheSendInvitationButton();
		
  }
  
	  


	@Test(priority=2)
	public static void AccessDenied() throws IOException, InterruptedException
	{
		ChaiOrInkspacePage.InkspacePage().ClickOnLoginButton();
		ChaiOrInkspacePage.InkspaceLoginPage().LoginIntoInkspaceWithValidCredentialsNotCollaboratorOrOrganizer();
		ChaiOrInkspacePage.InkspaceHomePage().InkspaceBetaWindowClickOnToSureIllJoinOption();
		
		for (int i = 0; i < Helpers.Languages.length; i++) {
			
		Helpers.SetLanguage(Helpers.Languages[i]);
		ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();
		ChaiOrInkspacePage.ChaiAccessDeniedPage().AccessDeniedWindowScreenshot();
		
		}
	}
  	
  
		@Test(priority=3)
	  public static void WaitingForOrganizer() throws IOException, InterruptedException
	  {
		ChaiOrInkspacePage.InkspacePage().ClickOnLoginButton();
		ChaiOrInkspacePage.InkspaceLoginPage().LoginIntoInkspaceWithValidCredentialsAsCollaborator();
		ChaiOrInkspacePage.InkspaceHomePage().InkspaceBetaWindowClickOnToSureIllJoinOption();
		ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();
		ChaiOrInkspacePage.ChaiFTEPage().SkipButtonClick();
		for (int i = 0; i < Helpers.Languages.length; i++) {
		Helpers.SetLanguage(Helpers.Languages[i]);
		ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();
		ChaiOrInkspacePage.ChaiWaitingForOrganizerPage().WaitForTheOrganizerWindowScreenshot();
		}	
	  }
	  
	  @Test(priority=4)
	  	public void CopyCutDeletePasteOptions() throws InterruptedException, AWTException, IOException
	  	{
	  		ChaiOrInkspacePage.InkspacePage().ClickOnLoginButton();
			ChaiOrInkspacePage.InkspaceLoginPage().LoginIntoInkspaceWithValidCredentialsAsOrganizer();
			ChaiOrInkspacePage.InkspaceHomePage().InkspaceBetaWindowClickOnToSureIllJoinOption();
			ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();	
			ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();
			ChaiOrInkspacePage.ChaiFTEPage().SkipButtonClick();
			for (int i = 0; i < Helpers.Languages.length; i++) {
				
			Helpers.CurrentLanguage=Helpers.Languages[i];
			ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();
			ChaiOrInkspacePage.ChaiHomePage().DrawingMakeASelection();
			ChaiOrInkspacePage.ChaiHomePage().CopyCutDeleteOptionsScreenshot();
			ChaiOrInkspacePage.ChaiHomePage().ClickOnTheCopyOption();
			ChaiOrInkspacePage.ChaiHomePage().PasteOptionScreenshot();
			
			}
	  	}


  		
	//@Test
	public static void FTEAndHomePage() throws InterruptedException, IOException
	{
		for (int i = 0; i < Helpers.Languages.length; i++) {
		TestBaseClass.TestInitialization();
		Helpers.CurrentLanguage=Helpers.Languages[i];
		ChaiOrInkspacePage.InkspacePage().ClickOnLoginButton();
		ChaiOrInkspacePage.InkspaceLoginPage().LoginIntoInkspaceWithValidCredentialsAsOrganizer();
		ChaiOrInkspacePage.InkspaceHomePage().InkspaceBetaWindowClickOnToSureIllJoinOption();
		ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();
		ChaiOrInkspacePage.ChaiHomePage().LoadingWindowScreenshot();
		ChaiOrInkspacePage.ChaiHomePage().GoToChaiHomePage();
		ChaiOrInkspacePage.ChaiFTEPage().FTEFirstPageScreenshot();
		ChaiOrInkspacePage.ChaiFTEPage().FTEFirstPageNextButtonClick();
		ChaiOrInkspacePage.ChaiFTEPage().FTESecondPageScreenshot();
		ChaiOrInkspacePage.ChaiFTEPage().FTESecondPageNextButtonClick();
		ChaiOrInkspacePage.ChaiFTEPage().FTEThirdPageScreenshot();
		ChaiOrInkspacePage.ChaiFTEPage().FTEThirdPageNextButtonClick();
		ChaiOrInkspacePage.ChaiHomePage().HomePageScreenshot();
		TestBaseClass.TestFinished();
		}
	}
  
  
	}
