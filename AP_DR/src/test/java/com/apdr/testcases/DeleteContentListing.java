package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.ContentListingPage;
import com.apdr.pageobjects.DeleteContentPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.setup.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class DeleteContentListing extends TestBase {

	public DeleteContentListing() {
		super();
	}

	HomePage homeObj;
	ContentListingPage DeleteContentListingobj;

	@BeforeTest
	public void DeletecontentInitialization() {

		homeObj = new HomePage();
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

	@Test(priority = 3 )
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Select_Value_From_Role_Dropdown() throws InterruptedException {

		DeleteContentListingobj.Roleselection();
	}

	@Test(priority = 4)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Filter_Selection() throws InterruptedException {

		DeleteContentListingobj.Filterclick();
	}

	@Test(priority = 5)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Checkbox_Selection() throws InterruptedException {

		DeleteContentListingobj.click_Checkbox();
	}

	@Test(priority = 6)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Actiondropdown_Selection() throws InterruptedException {

		DeleteContentListingobj.ActionDropdownselection();
	}

	@Test(priority = 7)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void ApplyItem_Selection() throws InterruptedException {

		DeleteContentListingobj.ApplyItemselected();
	}

	@Test(priority = 8)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void DeleteAccount_Selection() throws InterruptedException {

		DeleteContentListingobj.DeleteAccoutSelection();
	}

	@Test(priority = 9)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void ConfirmBtn_Selection() throws InterruptedException {

		DeleteContentListingobj.Click_ConfirmBtn();
	}

}
