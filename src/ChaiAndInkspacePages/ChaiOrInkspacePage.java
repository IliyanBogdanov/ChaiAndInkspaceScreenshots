package ChaiAndInkspacePages;

import java.sql.Driver;

import org.openqa.selenium.support.PageFactory;

public class ChaiOrInkspacePage {

	
	
	@SuppressWarnings("unused")
	public static InkspaceLoginPage InkspaceLoginPage()
	{
		if(TestBase.Driver.Name.equals("Android") || TestBase.Driver.Name.equals("AndroidInkspace")){
			InkspaceLoginPage InkspaceLoginPage=new InkspaceLoginPage();
			PageFactory.initElements(TestBase.Driver.Mobile, InkspaceLoginPage);
			return InkspaceLoginPage;
		}else
		{
			InkspaceLoginPage InkspaceLoginPage=new InkspaceLoginPage();
			PageFactory.initElements(TestBase.Driver.Desktop, InkspaceLoginPage);
			return InkspaceLoginPage;
		}
		
	}
	
	@SuppressWarnings("unused")
	public static InkspacePage InkspacePage()
	{
		if(TestBase.Driver.Name.equals("Android") || TestBase.Driver.Name.equals("AndroidInkspace")){
			InkspacePage InkspacePage=new InkspacePage();
			PageFactory.initElements(TestBase.Driver.Mobile, InkspacePage);
			return InkspacePage;
	}else
	{
			InkspacePage InkspacePage=new InkspacePage();
			PageFactory.initElements(TestBase.Driver.Desktop, InkspacePage);
			return InkspacePage;
	}
	}
	

	@SuppressWarnings("unused")
	public static InkspaceHomePage InkspaceHomePage()
	{
		if(TestBase.Driver.Name.equals("Android") || TestBase.Driver.Name.equals("AndroidInkspace")){
			InkspaceHomePage InkspaceHomePage=new InkspaceHomePage();
			PageFactory.initElements(TestBase.Driver.Mobile, InkspaceHomePage);
			return InkspaceHomePage;
	}else
	{
			InkspaceHomePage InkspaceHomePage=new InkspaceHomePage();
			PageFactory.initElements(TestBase.Driver.Desktop, InkspaceHomePage);
			return InkspaceHomePage;
	}
	}
	
	@SuppressWarnings("unused")
	public static ChaiHomePage ChaiHomePage()
	{
		if(TestBase.Driver.Name.equals("Android") || TestBase.Driver.Name.equals("AndroidInkspace")){
			ChaiHomePage ChaiHomePage=new ChaiHomePage();
			PageFactory.initElements(TestBase.Driver.Mobile, ChaiHomePage);
			return ChaiHomePage;
	}else
	{
			ChaiHomePage ChaiHomePage=new ChaiHomePage();
			PageFactory.initElements(TestBase.Driver.Desktop, ChaiHomePage);
			return ChaiHomePage;
	}
	}
	
	
	@SuppressWarnings("unused")
	public static ChaiFTEPage ChaiFTEPage()
	{
	if(TestBase.Driver.Name.equals("Android") || TestBase.Driver.Name.equals("AndroidInkspace")){
			ChaiFTEPage ChaiFTEPage=new ChaiFTEPage();
			PageFactory.initElements(TestBase.Driver.Mobile, ChaiFTEPage);
			return ChaiFTEPage;
	}else
	{
			ChaiFTEPage ChaiFTEPage=new ChaiFTEPage();
			PageFactory.initElements(TestBase.Driver.Desktop, ChaiFTEPage);
			return ChaiFTEPage;
	}
	}
	
	@SuppressWarnings("unused")
	public static ChaiAddAndRemoveCollaborators ChaiAddAndRemoveCollaborators()
	{
	if(TestBase.Driver.Name.equals("Android") || TestBase.Driver.Name.equals("AndroidInkspace")){
			ChaiAddAndRemoveCollaborators ChaiAddAndRemoveCollaborators=new ChaiAddAndRemoveCollaborators();
			PageFactory.initElements(TestBase.Driver.Mobile, ChaiAddAndRemoveCollaborators);
			return ChaiAddAndRemoveCollaborators;
	}else
	{
			ChaiAddAndRemoveCollaborators ChaiAddAndRemoveCollaborators=new ChaiAddAndRemoveCollaborators();
			PageFactory.initElements(TestBase.Driver.Desktop, ChaiAddAndRemoveCollaborators);
			return ChaiAddAndRemoveCollaborators;
	}
	}
	
	@SuppressWarnings("unused")
	public static ChaiWaitingForOrganizerPage ChaiWaitingForOrganizerPage()
	{
	if(TestBase.Driver.Name.equals("Android") || TestBase.Driver.Name.equals("AndroidInkspace")){
			ChaiWaitingForOrganizerPage ChaiWaitingForOrganizerPage=new ChaiWaitingForOrganizerPage();
			PageFactory.initElements(TestBase.Driver.Mobile, ChaiWaitingForOrganizerPage);
			return ChaiWaitingForOrganizerPage;
	}else
	{
			ChaiWaitingForOrganizerPage ChaiWaitingForOrganizerPage=new ChaiWaitingForOrganizerPage();
			PageFactory.initElements(TestBase.Driver.Desktop, ChaiWaitingForOrganizerPage);
			return ChaiWaitingForOrganizerPage;
	}
	}
	
	@SuppressWarnings("unused")
	public static ChaiAccessDeniedPage ChaiAccessDeniedPage()
	{
	if(TestBase.Driver.Name.equals("Android") || TestBase.Driver.Name.equals("AndroidInkspace")){
			ChaiAccessDeniedPage ChaiAccessDeniedPage=new ChaiAccessDeniedPage();
			PageFactory.initElements(TestBase.Driver.Mobile, ChaiAccessDeniedPage);
			return ChaiAccessDeniedPage;
	}else
	{
			ChaiAccessDeniedPage ChaiAccessDeniedPage=new ChaiAccessDeniedPage();
			PageFactory.initElements(TestBase.Driver.Desktop, ChaiAccessDeniedPage);
			return ChaiAccessDeniedPage;
	}
	}
	

}
