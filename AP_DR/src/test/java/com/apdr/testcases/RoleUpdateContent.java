package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.ContentListingPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.UpdateRolePage;
import com.apdr.setup.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class RoleUpdateContent extends TestBase {

	public RoleUpdateContent() {
		super();
	}

	HomePage homeObj;
	ContentListingPage DeleteContentListingobj;
	UpdateRolePage UpdateRoleobj;

	@BeforeTest
	public void DeletecontentInitialization() {

		homeObj = new HomePage();
		DeleteContentListingobj = new ContentListingPage();
		UpdateRoleobj = new UpdateRolePage();
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

		UpdateRoleobj.Titlesearchfield();
	}

	@Test(priority = 3)
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
	public void Grid_Selection() throws InterruptedException {

		UpdateRoleobj.resultclick();
	}

	@Test(priority = 6)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Role_Tab() throws InterruptedException {

		UpdateRoleobj.RoleSelection();
	}

	@Test(priority = 7)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void PrevioiusRoleselection() throws InterruptedException {

		UpdateRoleobj.PreviousRole();
	}

	@Test(priority = 8)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void Updated_Role() throws InterruptedException {

		UpdateRoleobj.UpdateRole();
	}

	@Test(priority = 9)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void ConfirmBtn_Selection() throws InterruptedException {

		DeleteContentListingobj.Click_ConfirmBtn();
	}

}
