package com.apdr.testcases;

import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.NewsAlertContentPage;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewsAlertContent extends TestBase {

	public NewsAlertContent() {
		super();
	}

	HomePage homeObj;
	NewsAlertContentPage newsAlertObj;

	@BeforeTest
	public void addNewsAlertContentInitialization() {

		homeObj = new HomePage();
		newsAlertObj = new NewsAlertContentPage();

	}

	@Test(priority = 1)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void hover_Over_Content_Button() throws InterruptedException {

		homeObj.hoverOnContentButton();
	}

	@Test(priority = 2, dataProviderClass = DataUtils.class, dataProvider = "newsAlertContent")
	@Description("Admin will click on the News Alert link ")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on the News Alert link")
	public void addVideoContent(String data) throws InterruptedException {
		String[] formInfo = data.split(",");
		String titleTxt = newsAlertObj.clickOnNewsAlertLink();
		Assert.assertEquals(titleTxt, "Create News Alert", "Admin is not able to click on the News Alert Link");

		newsAlertObj.addEdsNote(formInfo[3]);

	}

	@Test(priority = 3, dataProviderClass = DataUtils.class, dataProvider = "newsAlertContent")
	@Description("Admin will Slug for News Alert")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to add slug for news alert")
	public void add_News_Alert_Slug(String data) {
		String[] formInfo = data.split(",");
		newsAlertObj.addSlug(formInfo[0]);
	}

	@Test(priority = 4, dataProviderClass = DataUtils.class, dataProvider = "newsAlertContent")
	@Description("Admin will add Alert for News")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to add alert for news ")
	public void add__Alert_News(String data) {
		String[] formInfo = data.split(",");
		newsAlertObj.addAlert(formInfo[1]);
	}

	@Test(priority = 5, dataProviderClass = DataUtils.class, dataProvider = "newsAlertContent")
	@Description("Admin will add Date line for News")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to add date line for news ")
	public void add_DateLine_For_News_Alert(String data) {
		String[] formInfo = data.split(",");
		newsAlertObj.addDateLine(formInfo[2]);
	}

	@Test(priority = 6)
	@Description("Admin will select category for new alert")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to select category of news alert ")
	public void select_News_Alert_Category() throws InterruptedException {
		newsAlertObj.selectCategory();
	}

	@Test(priority = 7, dataProviderClass = DataUtils.class, dataProvider = "newsAlertContent")
	@Description("Admin will add Eds Note for News")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to add eds note for news alert ")
	public void add_EdsNote_For_News_Alert(String data) {
		String[] formInfo = data.split(",");
		newsAlertObj.addDateLine(formInfo[2]);
	}

	@Test(priority = 8)
	@Description("Admin will click on save button")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on ave button to save news alert")
	public void click_Save_Button() {

		newsAlertObj.clickSaveButton();
	}

}
