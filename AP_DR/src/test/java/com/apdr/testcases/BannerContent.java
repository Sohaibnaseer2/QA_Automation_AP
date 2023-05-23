package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.AddAudioContentPage;
import com.apdr.pageobjects.AddBannerPage;
import com.apdr.pageobjects.AddVideoContentPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.setup.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class BannerContent extends TestBase {

    public BannerContent(){
        super();
    }

    HomePage homeObj;
    AddVideoContentPage addcontentobj;
    AddBannerPage Bannerobj;


    @BeforeTest
    public void BannerContentInitialization(){

        homeObj= new HomePage();
        addcontentobj= new AddVideoContentPage();
        Bannerobj = new AddBannerPage();
    }

    @Test(priority = 1)
    @Description("Admin will Hover the content link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the content button")
    public void hover_Over_Content_Button() throws InterruptedException {

        homeObj.hoverOnContentButton();
    }
	
    @Test(priority = 2)
    @Description("Admin will Hover the Banner link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the Banner button")
    public void Banner_Link() throws InterruptedException {

    	Bannerobj.clickOnBannerButton();
    }
	
    @Test(priority = 3)
    @Description("Admin will enter title of Banner Page ")
    @Feature("Add content")
    @Story("As a Admin I need to enter title of Banner Page")
    public void Banner_Title_Text() throws InterruptedException {

    	Bannerobj.Banner_Title();
    }
	
    @Test(priority = 4)
    @Description("Admin will click on the save button ")
    @Feature("Add video content")
    @Story("As a Admin I need to click on the save button of Banner page.")
    public void clickOnSaveButton() {
		 
        addcontentobj.clickOnSaveButton();
    }
}
