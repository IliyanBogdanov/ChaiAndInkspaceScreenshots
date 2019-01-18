package ChaiAndInkspacePages;

import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;


import Helpers.Helpers;

public class ChaiAddAndRemoveCollaborators {
	
	public static String GetDataReactID="";
	
	@FindBy(css="div.add-user-btn-wrapper > button.add-user-btn")
	public static WebElement AddOrRemoveButtonDesktop;
	
	@FindBy(id="169436")
	public static WebElement AddOrRemoveButtonMobile;
	
	@FindAll(@FindBy(id="169436"))
	public static List<WebElement> AddOrRemoveButtonsMobile;
	
	
	@FindBy(css="div.add-collaborators-container.show > button.add-collaborators")
	public static WebElement AddCollaboratorsButton;
	
	
	@FindBy(css="div.suggestionList > textarea")
	public static WebElement AddCollaboratorsTextArea;
	
	@FindBy(css="div.modal.fade.add-new-collaborator-modal.in > div.modal-dialog.modal-desktop > div.modal-content > div.modal-footer.invite-modal-footer > button")
	public static WebElement SendInvitationButton;
	
	
	@FindBys(@FindBy(css="ul.add-user-list>li"))
	public static  List<WebElement> GetAllCollaborators;
	
	@FindBy(xpath="//span[text()='Nenko Nenkov']")
	public static WebElement GetSpecificCollaborator;
	
	
	@FindBy(css="div.modal.fade.remove-user-modal.in > div.modal-dialog.modal-desktop > div.modal-content > div.modal-footer.invite-modal-footer > button.btn-modal.success")
	public static WebElement RemoveCollaboratorOkOption;
	
	
	@FindBy(css="div.modal-dialog.modal-desktop > div.modal-content > div.modal-footer.invite-success-modal-footer > button")
	public static WebElement InvitationHasBeenSentOkButton;
	
	
	
	
	public static WebElement RemoveCollaboratorMouseOverElement(String GetDataReactID)
	{
		if (TestBase.Driver.Name.equals("Android")) {
			return TestBase.Driver.Mobile.findElement(By.cssSelector("button[data-reactid^='"+GetDataReactID+"'"));
		}else
		{
			return TestBase.Driver.Desktop.findElement(By.cssSelector("button[data-reactid^='"+GetDataReactID+"'"));											
		}
	}
	
	@SuppressWarnings("unused")
	public static WebElement RemoveUserOption(String GetDataReactID)
	{
		if (TestBase.Driver.Name.equals("Android")) {
			return TestBase.Driver.Mobile.findElement(By.cssSelector("div.user-v-modal.show > ul > li"));
		}else
		{
			return TestBase.Driver.Desktop.findElement(By.cssSelector("div.user-v-modal.show > ul > li[data-reactid^='"+GetDataReactID+"']"));											
		}
	}
	
	@SuppressWarnings("unused")
	public void ClickOnTheAddOrRemoveButton() throws InterruptedException
	{
		if(TestBase.Driver.Name.equals("Android"))
		{
			TestBase.Driver.Wait.until(ExpectedConditions.visibilityOfAllElements(AddOrRemoveButtonsMobile));
			Thread.sleep(4000);
			TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(AddOrRemoveButtonMobile));
			AddOrRemoveButtonMobile.click();
		}else
		{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(AddOrRemoveButtonDesktop));
		Thread.sleep(3000);
		AddOrRemoveButtonDesktop.click();
		}

		
	}
	
	public void AddCollaboratorsCreateScreenshot() throws IOException
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(AddCollaboratorsButton));
		Helpers.CreateScreenshot("Collaborators",Helpers.CurrentLanguage);
		AddCollaboratorsButton.click();
	}
	
	public void AddCollaboratorScreenshot() throws IOException
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(SendInvitationButton));
		Helpers.CreateScreenshot("AddCollaboratorScreen",Helpers.CurrentLanguage);
	}
	
	public void TypeInCorrectValueToAddCollaborator() throws InterruptedException
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(SendInvitationButton));
		Thread.sleep(1000);
		AddCollaboratorsTextArea.clear();
		AddCollaboratorsTextArea.sendKeys("real_redman@abv.bg");
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(SendInvitationButton));
	}
	
	public void ClickOnTheSendInvitationButton()
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(SendInvitationButton));
		SendInvitationButton.click();
	}
	
	@SuppressWarnings("unused")
	public void RemoveCollaboratorShowOptions() throws Exception
	{
	if(TestBase.Driver.Name.equals("Android"))
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Nenko Nenkov']")));
		String GetCollaboratorName=TestBase.Driver.Mobile.findElement(By.xpath("//span[text()='Nenko Nenkov']")).getAttribute("data-reactid");	
		GetCollaboratorName=GetCollaboratorName.substring(0,GetCollaboratorName.length()-8);
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.close > i[data-reactid^='"+GetCollaboratorName+"']")));
		TestBase.Driver.Mobile.findElement(By.cssSelector("button.close > i[data-reactid^='"+GetCollaboratorName+"']")).click();
		Thread.sleep(3000);
	}else
	{
	Actions action=new Actions(TestBase.Driver.Desktop);
	for (int i = 0; i < GetAllCollaborators.size(); i++) 
	{
		String CollaboratorName=GetAllCollaborators.get(i).getText();	
		if(CollaboratorName.contains("Nenko Nenkov"))
		{
			action.moveToElement(GetAllCollaborators.get(i)).build().perform();
			GetDataReactID=GetAllCollaborators.get(i).getAttribute("data-reactid");
		}
	}
		RemoveCollaboratorMouseOverElement(GetDataReactID).click();
		Thread.sleep(3000);
	}
	}
	
	public void RemoveCollaboratorOptionsScreenshot() throws IOException
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(RemoveUserOption(GetDataReactID)));
		Helpers.CreateScreenshot("RemoveCollaborationOptions",Helpers.CurrentLanguage);
	}
	
	public void ClickOnRemoveUser()
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(RemoveUserOption(GetDataReactID)));
		RemoveUserOption(GetDataReactID).click();
	}
	
	public void RemoveCollaboratorConfirmationScreenshot() throws IOException
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(RemoveCollaboratorOkOption));
		Helpers.CreateScreenshot("RemoveCollaborationConfirmationWindow",Helpers.CurrentLanguage);
	}
	
	public void RemoveCollaboratorOkOption()
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(RemoveCollaboratorOkOption));
		RemoveCollaboratorOkOption.click();
	}
	
	
	public void InvitationHasBeenSentWindowScreenshot() throws IOException
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(InvitationHasBeenSentOkButton));
		Helpers.CreateScreenshot("InvitationHasBeenSentWindow",Helpers.CurrentLanguage);
	}
	
	public void ClickOnTheInvitationHasBeenSentOkButton()
	{
		TestBase.Driver.Wait.until(ExpectedConditions.elementToBeClickable(InvitationHasBeenSentOkButton));
		InvitationHasBeenSentOkButton.click();
	}
		
	
	
	

}
