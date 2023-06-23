package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.ContentListingPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.SingleNotify;
import com.apdr.setup.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class SingleNotifyuserContent extends TestBase {

	public SingleNotifyuserContent() {
		super();
	}

	HomePage homeObj;
	SingleNotify SingleNotifyobj;
	ContentListingPage DeleteContentListingobj;

	@BeforeTest
	public void addContentInitialization() {

		homeObj = new HomePage();
		SingleNotifyobj = new SingleNotify();
		DeleteContentListingobj = new ContentListingPage();

	}

	@Test(priority = 1)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void hover_Over_UserListing_Button() throws InterruptedException {

		homeObj.hoverOnUserListingButton();
	}

	@Test(priority = 2)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Enter_Title_For_Search_User() throws InterruptedException {

		DeleteContentListingobj.Titlesearchfield();
	}

	@Test(priority = 3)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Filter_Selection() throws InterruptedException {

		DeleteContentListingobj.Filterclick();
	}

	@Test(priority = 4)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Checkbox_Selection() throws InterruptedException {

		DeleteContentListingobj.click_Checkbox();
	}

	@Test(priority = 5)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Click_On_Notification_Button() throws InterruptedException {

		SingleNotifyobj.Click_On_Notify();
	}

}
