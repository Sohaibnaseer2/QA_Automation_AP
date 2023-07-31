package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.EditAllfields;
import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.NewsStoryContentPage;
import com.apdr.pageobjects.RevertContent;
import com.apdr.pageobjects.UnpublishedContent;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class UpdateNewsStroyContent extends TestBase {

	public UpdateNewsStroyContent() {
		super();
	}

	HomePage homeObj;
	NewsStoryContentPage newsStoryObj;
	EditAllfields EditContentobj;
	RevertContent Revertcontentobj;
	UnpublishedContent Unpublishobj;
	
	
	@BeforeTest
	public void addNewsAlertContentInitialization() {

		homeObj = new HomePage();
		newsStoryObj = new NewsStoryContentPage();
		EditContentobj = new EditAllfields();
		Revertcontentobj = new RevertContent();
		Unpublishobj = new UnpublishedContent();
	}
	
	
	@Test(priority = 1)
	@Description("Admin will click on the News Alert link ")
	@Feature("Edit News Alert Content")
	@Story("As a Admin I need to click on the News Alert link")
	public void Edit_Btn_Clicked() throws InterruptedException {
		EditContentobj.Click_on_Edit_Button();

	}
	
	
	@Test(priority = 2, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsStoryContent")
	@Description("Admin will add news Story slug")
	@Feature("Add News Story content")
	@Story("As a Admin I need to add slug for the news story")
	public void addSlugForNewStory(String data) {
		String[] formInfo = data.split(",");
		newsStoryObj.addSlug1(formInfo[0]);
	}

	@Test(priority = 3, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsStoryContent")
	@Description("Admin will add news Story headline")
	@Feature("Add News Story content")
	@Story("As a Admin I need to add headline for the news story")
	public void addheadLineForNewStory(String data) {
		String[] formInfo = data.split(",");
		newsStoryObj.addHeadLine1(formInfo[1]);
	}

	@Test(priority = 4, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsStoryContent")
	@Description("Admin will add news Story summary")
	@Feature("Add News Story content")
	@Story("As a Admin I need to add summary for the news story")
	public void addsummaryForNewStory(String data) {
		String[] formInfo = data.split(",");
		newsStoryObj.addSummary1(formInfo[2]);
	}

	@Test(priority = 5, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsStoryContent")
	@Description("Admin will add news Story body")
	@Feature("Add News Story content")
	@Story("As a Admin I need to add body for the news story")
	public void addbodyForNewStory(String data) {
		String[] formInfo = data.split(",");
		newsStoryObj.addBody1(formInfo[3]);
	}

	@Test(priority = 6, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsStoryContent")
	@Description("Admin will add Byline and bytitle for news Story")
	@Feature("Add News Story content")
	@Story("As a Admin I need to add by line and by title for the news story")
	public void addByLineAndByTitleForNewStory(String data) {
		String[] formInfo = data.split(",");
		newsStoryObj.addByLineAndByTitle1(formInfo[4], formInfo[5]);
	}

	@Test(priority = 7, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsStoryContent")
	@Description("Admin will add dateline for news Story")
	@Feature("Add News Story content")
	@Story("As a Admin I need to add dateline for the news story")
	public void adddateLineForNewStory(String data) {
		String[] formInfo = data.split(",");
		newsStoryObj.addDateline1(formInfo[6]);
	}

	@Test(priority = 8)
	@Description("Admin will select news Story category")
	@Feature("Add News Story content")
	@Story("As a Admin I need to select the category of news story")
	public void selectNewsStoryCategory() {
		newsStoryObj.selectCategory1();
	}

	@Test(priority = 9, dataProviderClass = DataUtils.class, dataProvider = "UpdatedNewsStoryContent")
	@Description("Admin will add eds Note for news Story")
	@Feature("Add News Story content")
	@Story("As a Admin I need to add eds note for the news story")
	public void addEdsNoteForNewStory(String data) {
		String[] formInfo = data.split(",");
		newsStoryObj.addEdsNote1(formInfo[7]);
	}
	
	@Test(priority = 8)
	@Description("Admin will click on the News Alert link ")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on the News Alert link")
	public void Select_State_to_Unpublish() throws InterruptedException {
		Unpublishobj.Click_on_Unpublished_State();

	}

	@Test(priority = 10)
	@Description("Admin will click on the save button ")
	@Feature("Add News Story content")
	@Story("As a Admin I need to click on the save button to add News story with content on APDR")
	public void clickOnSaveButton() {
		newsStoryObj.clickOnSaveButton();
	}

	
	
}
	


