package com.apdr.testcases;

import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.NewsStoryContentPage;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddNewsStoryContent extends TestBase {

    public AddNewsStoryContent(){
        super();
    }

    HomePage homeObj;
    NewsStoryContentPage newsStoryObj;


    @BeforeTest
    public void addNewsStoryContentInitialization(){
        homeObj= new HomePage();
        newsStoryObj= new NewsStoryContentPage();

    }

    @Test(priority = 1)
    @Description("Admin will Hover the content link ")
    @Feature("Add News Story content")
    @Story("As a Admin I need to hover the content button")
    public void hover_Over_Content_Button() throws InterruptedException {

        homeObj.hoverOnContentButton();
    }

    @Test(priority = 2)
    @Description("Admin will click on the News story link ")
    @Feature("Add News Story content")
    @Story("As a Admin I need to click on the News story button link")
    public void clickOnNewsStoryLink() throws InterruptedException {
        String titleTxt = newsStoryObj.clickOnNewsStoryLink();
        Assert.assertEquals(titleTxt, "Create News Story", "Admin is not able to click on the news story link");
    }

    @Test(priority = 3, dataProviderClass = DataUtils.class, dataProvider = "newsStoryContent")
    @Description("Admin will add news Story slug")
    @Feature("Add News Story content")
    @Story("As a Admin I need to add slug for the news story")
    public void addSlugForNewStory(String data) {
        String[] formInfo= data.split(",");
        newsStoryObj.addSlug(formInfo[0]);
    }
    @Test(priority = 4, dataProviderClass = DataUtils.class, dataProvider = "newsStoryContent")
    @Description("Admin will add news Story headline")
    @Feature("Add News Story content")
    @Story("As a Admin I need to add headline for the news story")
    public void addheadLineForNewStory(String data) {
        String[] formInfo= data.split(",");
        newsStoryObj.addHeadLine(formInfo[1]);
    }
    @Test(priority = 5, dataProviderClass = DataUtils.class, dataProvider = "newsStoryContent")
    @Description("Admin will add news Story summary")
    @Feature("Add News Story content")
    @Story("As a Admin I need to add summary for the news story")
    public void addsummaryForNewStory(String data) {
        String[] formInfo= data.split(",");
        newsStoryObj.addSummary(formInfo[2]);
    }

    @Test(priority = 6, dataProviderClass = DataUtils.class, dataProvider = "newsStoryContent")
    @Description("Admin will add news Story body")
    @Feature("Add News Story content")
    @Story("As a Admin I need to add body for the news story")
    public void addbodyForNewStory(String data) {
        String[] formInfo= data.split(",");
        newsStoryObj.addBody(formInfo[3]);
    }

    @Test(priority = 7, dataProviderClass = DataUtils.class, dataProvider = "newsStoryContent")
    @Description("Admin will add Byline and bytitle for news Story")
    @Feature("Add News Story content")
    @Story("As a Admin I need to add by line and by title for the news story")
    public void addByLineAndByTitleForNewStory(String data) {
        String[] formInfo= data.split(",");
        newsStoryObj.addByLineAndByTitle(formInfo[4],formInfo[5] );
    }

    @Test(priority = 7, dataProviderClass = DataUtils.class, dataProvider = "newsStoryContent")
    @Description("Admin will add dateline for news Story")
    @Feature("Add News Story content")
    @Story("As a Admin I need to add dateline for the news story")
    public void adddateLineForNewStory(String data) {
        String[] formInfo= data.split(",");
        newsStoryObj.addDateline(formInfo[6]);
    }

    @Test(priority = 8)
    @Description("Admin will select news Story category")
    @Feature("Add News Story content")
    @Story("As a Admin I need to select the category of news story")
    public void selectNewsStoryCategory() {
        newsStoryObj.selectCategory();
    }
    @Test(priority = 9, dataProviderClass = DataUtils.class, dataProvider = "newsStoryContent")
    @Description("Admin will add eds Note for news Story")
    @Feature("Add News Story content")
    @Story("As a Admin I need to add eds note for the news story")
    public void addEdsNoteForNewStory(String data) {
        String[] formInfo= data.split(",");
        newsStoryObj.addEdsNote(formInfo[7]);
    }

    @Test(priority = 10)
    @Description("Admin will click on the save button ")
    @Feature("Add News Story content")
    @Story("As a Admin I need to click on the save button to add News story with content on APDR")
    public void clickOnSaveButton(){
        newsStoryObj.clickOnSaveButton();
    }







}
