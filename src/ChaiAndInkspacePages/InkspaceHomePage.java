package ChaiAndInkspacePages;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import TestBase.Driver;
import io.appium.java_client.TouchAction;

public class InkspaceHomePage {

	@FindBy(css="div.collaboration_beta > div.submit > input")
	public static WebElement InkspaceBetaWindowSureIllJoinOption;
	
	
	@FindBy(id="btn-upload")
	public static WebElement UploadButtonDesktop;
	
	@FindBy(css="div > div.menu_navi > a")
	public static WebElement UploadButtonMobile;
	
	@FindBy(css="span.name")
	public static WebElement UserDropdownButton;
	
	@FindBy(css="dl.collaborations > dt > a.start_collaboration")
	public static WebElement StartCollaborationButton;
	
	@FindBy(css="div.new_collaboration > h2 > a > span.icon.cancel")
	public static WebElement CancelCollaborationButton;
	
	@FindAll(@FindBy(css="div[id^='content_file_scroll_']"))
	public static List<WebElement> AllVisiblePictures;
	
	
	@FindBy(css="div.actions > ul > li.contextmenu_start_collaboration > a")
	public static WebElement PictureStartCollaborationOption;
	
	@FindBy(css="div[id='preview']>div[id='preview_paper_page']>div[id='mCSB_4']>div[id='mCSB_4_container']>div[id='preview_contents']>div.contents_con>span")
	public static WebElement PicturePreviewMoreOptionsButton;
	
	@FindBy(css="div[id='mCSB_4_container'] > div[id='preview_contents'] > a")
	public static WebElement PicturePreviewCloseButton;
	
	@FindBy(css="div.expire_trial_dialog>div.linkbtn>a.cancel")
	public static WebElement ExpiredSubscriptionModalCancelOption;
	
	@FindBy(css="div.overlay_menu.expire_trial_dialog > form > div.btn_dialog_wrapper > div.linkbtn > a.cancel")
	public static WebElement ExpiredSubscriptionModalCancelOptionMobile;
	
	@FindBy(css="div.missing_organizer_dialog>div.linkbtn>a.cancel")
	public static WebElement MissingOrganizerModalCancelOption;
	
	@FindBy(css="div.overlay_menu.missing_organizer_dialog > div.btn_dialog_wrapper > div.linkbtn > a.cancel")
	public static WebElement MissingOrganizerModalCancelOptionMobile;
	
	@FindBy(css="div.notify_trial_dialog>div.linkbtn>a.cancel")
	public static WebElement FreeTrialReadyToExpireModalCancelOption;
	
	@FindBy(css="div.overlay_menu.notify_trial_dialog > div.btn_dialog_wrapper > div.linkbtn>a.cancel")
	public static WebElement FreeTrialReadyToExpireModalCancelOptionMobile;
	
	@FindBy(css="div.premium_dialog>div.linkbtn>a.cancel")
	public static WebElement PremiumModalWindowCancelOption;
	
	@FindBy(css="div.overlay_menu.premium_dialog > div.btn_dialog_wrapper > div.linkbtn>a.cancel")
	public static WebElement PremiumModalWindowCancelOptionMobile;
	
	@FindBy(css="div[id^='content_file_scroll_'] > div.item_bottom > a")
	public static WebElement FirstPictureMoreOptionsAndroidMobile;
	
	@FindBy(css="div[id='header_con'] > div.menu_navi > a")
	public static WebElement LeftTopMenu;
	
	@FindBy(id="cloud_dashboard")
	public static WebElement LeftTopMenuMyAccountOption;
	
	@FindBy(css="div[id='sidr'] > dl.collaborations > dt")
	public static WebElement CollbaorationButton;
	
	
	public void InkspaceBetaWindowClickOnToSureIllJoinOption()
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(InkspaceBetaWindowSureIllJoinOption));
		InkspaceBetaWindowSureIllJoinOption.click();
	}
	
	
	public void InkspaceBetaWindowScreenshot() throws IOException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(InkspaceBetaWindowSureIllJoinOption));
		Helpers.CreateScreenshot("BetaCollaboration", Helpers.CurrentLanguage);
	}
	
	@SuppressWarnings("unused")
	public void InkspaceHomePageScreenshot() throws IOException
	{
		if(Driver.Name.equals("AndroidInkspace")){
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(FirstPictureMoreOptionsAndroidMobile));
			Helpers.CreateScreenshot("HomePage",Helpers.CurrentLanguage);
		}else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(UploadButtonDesktop));
			Helpers.CreateScreenshot("HomePage",Helpers.CurrentLanguage);
		}
	}
	
	
	public void ClickOnTheUserDropDownButton() throws InterruptedException, IOException
	{
		
		if (Driver.Name.equals("AndroidInkspace")) {
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(LeftTopMenu));
			LeftTopMenu.click();
				
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(LeftTopMenuMyAccountOption));
			int GetStartX=LeftTopMenuMyAccountOption.getLocation().getX()+100;
			int GetStartY=1000;
			int GetEndX=GetStartX;
			int GetEndY=GetStartY-500;
				
			InputStream is = Runtime.getRuntime().exec("/Users/nenko/Documents/android-sdk-macosx/platform-tools/adb shell input touchscreen swipe "+Integer.toString(GetStartX)+" "+Integer.toString(GetStartY)+" "+Integer.toString(GetEndX)+" "+Integer.toString(GetEndY)+" 2000").getInputStream();
			Thread.sleep(5000);
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='sidr'] > dl.collaborations > dt")));	
	
		}else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(UserDropdownButton));
			Thread.sleep(2000);
			UserDropdownButton.click();
		}
	}
	
	public void UserDropdownMenuOptionsScreenshot() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		Helpers.CreateScreenshot("UserMenuOptions", Helpers.CurrentLanguage);
	}
	
	public void ClickOnTheCollaborationButton() throws IOException
	{
		if(Driver.Name.equals("AndroidInkspace"))
		{
			//Driver.Wait.until(ExpectedConditions.elementToBeClickable(LeftTopMenu));
		//	LeftTopMenu.click();
			
			//Driver.Wait.until(ExpectedConditions.elementToBeClickable(LeftTopMenuMyAccountOption));
			//System.out.println(LeftTopMenuMyAccountOption.getLocation().getY());
			//int GetStartX=LeftTopMenuMyAccountOption.getLocation().getX()+100;
			//int GetStartY=1000;
			//int GetEndX=GetStartX;
			//int GetEndY=GetStartY-500;
			
			//InputStream is = Runtime.getRuntime().exec("/Users/nenko/Documents/android-sdk-macosx/platform-tools/adb shell input touchscreen swipe "+Integer.toString(GetStartX)+" "+Integer.toString(GetStartY)+" "+Integer.toString(GetEndX)+" "+Integer.toString(GetEndY)+" 2000").getInputStream();
			//int GetX=Driver.Mobile.findElement(By.id("cloud_dashboard")).getLocation().getY();
			
			
			//WebElement we=Driver.Mobile.findElement(By.cssSelector("div[id='sidr'] > dl.collaborations > dt"));
			//Driver.Mobile.findElement(By.cssSelector("div[id='sidr'] > dl.collaborations > dt")).click();
		}else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(StartCollaborationButton));
			StartCollaborationButton.click();
		}
	}
	
	public void CreateCollaborationScreenshot() throws IOException
	{
		if(Driver.Name.equals("AndroidInkspace"))
		{
		
		}else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(CancelCollaborationButton));
			Helpers.CreateScreenshot("StartCollaborationWindow", Helpers.CurrentLanguage);
		}
	}
	
	public void ClickOnTheCancelCollaborationButton() throws IOException
	{
		if(Driver.Name.equals("AndroidInkspace"))
		{
		
		}else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(CancelCollaborationButton));
			CancelCollaborationButton.click();
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(UploadButtonDesktop));
		}
	}
	
	public void ShowFirstPictureOptionsAndCreateScreenshot() throws InterruptedException, IOException
	{
		if( Driver.Name.equals("AndroidInkspace"))
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(FirstPictureMoreOptionsAndroidMobile));
			FirstPictureMoreOptionsAndroidMobile.click();
			Thread.sleep(3000);
			Helpers.CreateScreenshot("PictureOptions", Helpers.CurrentLanguage);
			InputStream is = Runtime.getRuntime().exec("/Users/nenko/Documents/android-sdk-macosx/platform-tools/adb shell input tap 100 1000").getInputStream();
			Thread.sleep(2000);

		}else{
			Actions actions=new Actions(Driver.Desktop);
			actions.contextClick(AllVisiblePictures.get(0)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(PictureStartCollaborationOption));
			Helpers.CreateScreenshot("PictureOptions", Helpers.CurrentLanguage);
		}
	}
	
	public void ClickOnTheFirstPicture() throws InterruptedException
	{
		
		if (Driver.Name.equals("AndroidInkspace")) 
		{
	
		}else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(AllVisiblePictures.get(0)));
			Driver.Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id^='content_file_scroll_']")));
			Thread.sleep(2000);
			AllVisiblePictures.get(0).click();
		}
	}
	
	public void ClickOnTheFirstPicturePreviewMoreOptionButton()
	{		
		if (Driver.Name.equals("AndroidInkspace")) 
		{
	
		}
		else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(PicturePreviewMoreOptionsButton));
			PicturePreviewMoreOptionsButton.click();
		}
	}
	
	public void PicturePreviewOptionsScreenshot() throws IOException
	{
		if (Driver.Name.equals("AndroidInkspace")) 
		{
	
		}
		else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(PicturePreviewCloseButton));
			Helpers.CreateScreenshot("PicturePreviewOptions", Helpers.CurrentLanguage);
		}
	}
	
	public void ClickOnThePicturePreviewCloseButton() throws IOException
	{
		if (Driver.Name.equals("AndroidInkspace")) 
		{
	
		}
		else
		{
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(PicturePreviewCloseButton));
			PicturePreviewCloseButton.click();
		}
	}
	
	public void ExpiredSubscriptionModalWindowScreenshot() throws IOException
	{
		if (Driver.Name.equals("AndroidInkspace")) 
		{
			Driver.Mobile.get(Helpers.InkspaceURL+"&p=expire");
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(ExpiredSubscriptionModalCancelOptionMobile));
			Helpers.CreateScreenshot("ExpiredSubscrionModalWindow", Helpers.CurrentLanguage);
		}else
		{
			Driver.Desktop.get(Helpers.InkspaceURL+"&p=expire");
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(ExpiredSubscriptionModalCancelOption));
			Helpers.CreateScreenshot("ExpiredSubscrionModalWindow", Helpers.CurrentLanguage);
		}	
	}
	
	public void MissingOrganizerModalWindowScreenshot() throws IOException
	{
		if (Driver.Name.equals("AndroidInkspace")) 
		{
			Driver.Mobile.get(Helpers.InkspaceURL+"&p=missing");	
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(MissingOrganizerModalCancelOptionMobile));
			Helpers.CreateScreenshot("MissingOrganizerModalWindow", Helpers.CurrentLanguage);
			
		}else
		{
			Driver.Desktop.get(Helpers.InkspaceURL+"&p=missing");	
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(MissingOrganizerModalCancelOption));
			Helpers.CreateScreenshot("MissingOrganizerModalWindow", Helpers.CurrentLanguage);
		}
	}
	
	
	
	public void FreeTrialReadyToExpireModalWindowScreenshot() throws IOException
	{
		if (Driver.Name.equals("AndroidInkspace")) 
		{
			Driver.Mobile.get(Helpers.InkspaceURL+"&p=notify");
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(FreeTrialReadyToExpireModalCancelOptionMobile));
			Helpers.CreateScreenshot("FreeTrialReadyToExpireModalWindow", Helpers.CurrentLanguage);
		}else
		{
			Driver.Desktop.get(Helpers.InkspaceURL+"&p=notify");
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(FreeTrialReadyToExpireModalCancelOption));
			Helpers.CreateScreenshot("FreeTrialReadyToExpireModalWindow", Helpers.CurrentLanguage);
		}
	}
	
	
	public void PremiumModalWindowScreenshot() throws IOException
	{	
		if (Driver.Name.equals("AndroidInkspace")) 
		{	
			Driver.Mobile.get(Helpers.InkspaceURL+"&p=premium");
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(PremiumModalWindowCancelOptionMobile));
			Helpers.CreateScreenshot("PremiumModalWindow", Helpers.CurrentLanguage);
		}else
		{
			Driver.Desktop.get(Helpers.InkspaceURL+"&p=premium");
			Driver.Wait.until(ExpectedConditions.elementToBeClickable(PremiumModalWindowCancelOption));
			Helpers.CreateScreenshot("PremiumModalWindow", Helpers.CurrentLanguage);
		}

	}
	
}
