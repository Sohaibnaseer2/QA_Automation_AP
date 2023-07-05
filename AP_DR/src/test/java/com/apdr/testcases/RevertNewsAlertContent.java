package com.apdr.testcases;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.DeleteContentPage;
import com.apdr.pageobjects.DeleteNewsAlertPage;

import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.RevertforNewsAlert;
import com.apdr.setup.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class RevertNewsAlertContent extends TestBase {

	 public RevertNewsAlertContent() {
		super();
	}

	HomePage homeObj;
	DeleteContentPage Deleteobj;
	DeleteNewsAlertPage DeleteNewsAlert;
	RevertforNewsAlert RevertObj;

	@BeforeTest
	public void DeletecontentInitialization() {

		homeObj = new HomePage();
		Deleteobj = new DeleteContentPage();
		DeleteNewsAlert = new DeleteNewsAlertPage();
		RevertObj = new RevertforNewsAlert();
	}

	@Test(priority = 1)
	@Description("Admin will Hover the content link ")
	@Feature("Edit NewsAlert Content")
	@Story("As a Admin I need to hover the content button")
	public void hover_Over_Content_Button() throws InterruptedException {

		homeObj.hoverOnContentListingButton();
	}

	@Test(priority = 2)
	@Description("Admin will Hover the content link ")
	@Feature("Edit NewsAlert Content")
	@Story("As a Admin I need to hover the content button")
	public void Enter_Title_For_Delete_NewsAlert_Content() throws InterruptedException {

		DeleteNewsAlert.Titlesearchfield();
	}

	@Test(priority = 3)
	@Description("Admin will Hover the content link ")
	@Feature("Edit NewsAlert Content")
	@Story("As a Admin I need to hover the content button")
	public void Select_Value_From_Content_Type() throws InterruptedException {

		DeleteNewsAlert.contenttype();
	}

	@Test(priority = 4)
	@Description("Admin will Filer text on NewsAlert Page ")
	@Feature("Edit NewsAlert Content")
	@Story("As a Admin I need to hover the content button")
	public void Filter_Selection() throws InterruptedException {

		Deleteobj.Filterclick();
	}

	@Test(priority = 5)
	@Description("Admin will click on view button in NewsAlert Page ")
	@Feature("Edit NewsAlert Content")
	@Story("As a Admin I need to click on view button in NewsAlert Page")
	public void View_Selection() throws InterruptedException {

		Deleteobj.Viewclick();
	}

	@Test(priority = 6)
	@Description("Admin will Edit on NewsAlert Page ")
	@Feature("Edit NewsAlert Content")
	@Story("As a Admin I need to Edit on NewsAlert Page")
	public void Click_on_Revert() throws InterruptedException {
		RevertObj.RevisionButton();
		RevertObj.ClickonRevertButton();
		RevertObj.ConfirmationRevertButton();
		RevertObj.Displayed_Message_Successfully();
		
	}

	@Test(priority = 7)
	@Description("Admin will Edit on NewsAlert Page ")
	@Feature("Edit NewsAlert Content")
	@Story("As a Admin I need to Edit on NewsAlert Page")
	public void Check_Final_Text( ) throws InterruptedException {
		
		 RevertObj.Displayed_Message_Successfully();
		 Assert.assertTrue(RevertforNewsAlert.Statusmsg.isDisplayed()," User is unable to revert the News Alert. Something went wrong.Please check again." ); 
		
	}
	
	
}
