package com.apdr.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.EditAllfields;
import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.NewsAlertContentPage;
import com.apdr.pageobjects.RevertContent;
import com.apdr.pageobjects.UnpublishedContent;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class UpdatedNewsAlert extends TestBase {

	public UpdatedNewsAlert() {
		super();
	}

	HomePage homeObj;
	NewsAlertContentPage newsAlertObj;
	EditAllfields EditContentobj;
	RevertContent Revertcontentobj;
	UnpublishedContent Unpublishobj;
	
	
	@BeforeTest
	public void addNewsAlertContentInitialization() {

		homeObj = new HomePage();
		newsAlertObj = new NewsAlertContentPage();
		EditContentobj = new EditAllfields();
		Revertcontentobj = new RevertContent();
		Unpublishobj = new UnpublishedContent();
	}

	@Test(priority = 1 , enabled = false)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void hover_Over_Content_Button() throws InterruptedException {

		homeObj.hoverOnContentButton();
	}

	@Test(priority = 2, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsAlertContent" , enabled = false)
	@Description("Admin will click on the News Alert link ")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on the News Alert link")
	public void Click_On_News_Alert(String data) throws InterruptedException {
		String[] formInfo = data.split(",");
		String titleTxt = newsAlertObj.clickOnNewsAlertLink();
		Assert.assertEquals(titleTxt, "Create News Alert", "Admin is not able to click on the News Alert Link");
		//

	}
	
	
	@Test(priority = 2)
	@Description("Admin will click on the News Alert link ")
	@Feature("Edit News Alert Content")
	@Story("As a Admin I need to click on the News Alert link")
	public void Edit_Btn_Clicked() throws InterruptedException {
		EditContentobj.Click_on_Edit_Button();

	}

	@Test(priority = 3, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsAlertContent")
	@Description("Admin will Slug for News Alert")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to add slug for news alert")
	public void add_News_Alert_Slug(String data) {
		String[] formInfo = data.split(",");
		newsAlertObj.addSlug1(formInfo[0]);
	}

	@Test(priority = 4, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsAlertContent")
	@Description("Admin will add Alert for News")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to add alert for news ")
	public void add__Alert_News(String data) {
		String[] formInfo = data.split(",");
		newsAlertObj.addAlert1(formInfo[1]);
	}

	@Test(priority = 5, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsAlertContent")
	@Description("Admin will add Date line for News")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to add date line for news ")
	public void add_DateLine_For_News_Alert(String data) {
		String[] formInfo = data.split(",");
		newsAlertObj.addDateLine1(formInfo[2]);
	}

	@Test(priority = 6)
	@Description("Admin will select category for new alert")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to select category of news alert ")
	public void select_News_Alert_Category() throws InterruptedException {
		newsAlertObj.selectCategory();
	}

	@Test(priority = 7, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsAlertContent")
	@Description("Admin will add Eds Note for News")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to add eds note for news alert ")
	public void add_EdsNote_For_News_Alert(String data) {
		String[] formInfo = data.split(",");
		newsAlertObj.addEdsNote1(formInfo[3]);
	}

	@Test(priority = 8)
	@Description("Admin will click on the News Alert link ")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on the News Alert link")
	public void Select_State_to_Unpublish() throws InterruptedException {
		Unpublishobj.Click_on_Unpublished_State();

	}
	
	@Test(priority = 9)
	@Description("Admin will click on save button")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on ave button to save news alert")
	public void click_Save_Button() throws InterruptedException{

		newsAlertObj.clickSaveButton();
	}
	
	@Test(priority = 10, enabled = false)
	@Description("Admin will click on the News Alert link ")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on the News Alert link")
	public void Again_Edit_Btn_Clicked() throws InterruptedException {
		EditContentobj.Click_on_Edit_Button();
	}

	@Test(priority = 11 , enabled = false)
	@Description("Admin will click on the News Alert link ")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on the News Alert link")
	public void Select_State_to_publish() throws InterruptedException {
		Unpublishobj.Click_on_published_State();

	}
	
	@Test(priority = 12 , enabled = false)
	@Description("Admin will click on save button")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on ave button to save news alert")
	public void Again_click_Save_Button() throws InterruptedException {

		newsAlertObj.clickSaveButton();
	}
	

	
}
