package ChaiAndInkspacePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestBase.Driver;

public class InkspaceLoginPage {
	@FindBy(id="login")
	public static WebElement LogInButton;
	
	
	@FindBy(id="login-email")
	public static WebElement UsernameTextField;
	
	@FindBy(id="login-password")
	public static WebElement PasswordTextField;

	@FindBy(css="a > input[class='btn btn-done']")
	public static WebElement LogInToInkspaceButton;
	
	
	public void LoginIntoInkspaceWithValidCredentialsAsOrganizer() throws InterruptedException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(LogInToInkspaceButton));
		UsernameTextField.sendKeys("inkspace1.4@gmail.com");
		PasswordTextField.sendKeys("qawacomsofia0");
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(LogInToInkspaceButton));
		Thread.sleep(1000);
		LogInToInkspaceButton.click();
	}
	
	
	public void LoginIntoInkspaceWithValidCredentialsAsCollaborator() throws InterruptedException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(LogInToInkspaceButton));
		UsernameTextField.sendKeys("real_redman@abv.bg");
		PasswordTextField.sendKeys("8909264526N");
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(LogInToInkspaceButton));
		Thread.sleep(1000);
		LogInToInkspaceButton.click();
	}
	
	
	public void LoginIntoInkspaceWithValidCredentialsNotCollaboratorOrOrganizer() throws InterruptedException
	{
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(LogInToInkspaceButton));
		UsernameTextField.sendKeys("bsenglish@mail.bg");
		PasswordTextField.sendKeys("qawacomsofia0");
		Driver.Wait.until(ExpectedConditions.elementToBeClickable(LogInToInkspaceButton));
		Thread.sleep(1000);
		LogInToInkspaceButton.click();
	}
	
	
}
