package com.apdr.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.DeleteContentPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.setup.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class Deletecontent extends TestBase {

    public Deletecontent(){
        super();
    }

    HomePage homeObj;
    DeleteContentPage Deleteobj;

    
    @BeforeTest
    public void DeletecontentInitialization(){

        homeObj= new HomePage();
        Deleteobj = new DeleteContentPage();
    }
    
    @Test(priority = 1)
    @Description("Admin will Hover the content link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the content button")
    public void hover_Over_Content_Button() throws InterruptedException {

        homeObj.hoverOnContentListingButton();
    }
    
    
    @Test(priority = 2)
    @Description("Admin will Hover the content link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the content button")
    public void Enter_Title_For_Delete_Content() throws InterruptedException {

    	Deleteobj.Titlesearchfield();
    }
    
    @Test(priority = 3)
    @Description("Admin will Hover the content link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the content button")
    public void Select_Value_From_Content_Type() throws InterruptedException {

    	Deleteobj.contenttype();
    }
    
    @Test(priority = 4)
    @Description("Admin will Hover the content link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the content button")
    public void Filter_Selection() throws InterruptedException {

    	Deleteobj.Filterclick();
    }
    @Test(priority = 5)
    @Description("Admin will Hover the content link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the content button")
    public void View_Selection() throws InterruptedException {

    	Deleteobj.Viewclick();
    }
    
    @Test(priority = 6)
    @Description("Admin will Hover the content link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the content button")
    public void Delete_Selection() throws InterruptedException {
    	Deleteobj.Deleteclick();
    }
    
    @Test(priority = 7)
    @Description("Admin will Hover the content link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the content button")
    public void Banner_Deleted_Successfully() throws InterruptedException {
    	Deleteobj.Click_delete_button();
    }
    
    
}
