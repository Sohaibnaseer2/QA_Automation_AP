package com.apdr.testcases;

import com.apdr.pageobjects.AddPhotoContentPage;
import com.apdr.pageobjects.AddVideoContentPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.LoginPage;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class AddPhotoContent extends TestBase {

    public AddPhotoContent(){

        super();
    }
    LoginPage  loginObj;
    HomePage homeObj;
    AddPhotoContentPage addPhoteContentObj;
    AddVideoContentPage addcontentobj;


    @BeforeTest
    public void addContentInitialization(){
    	loginObj = new LoginPage();
        homeObj= new HomePage();
        addcontentobj= new AddVideoContentPage();
        addPhoteContentObj= new AddPhotoContentPage();
    }


    @Test(priority = 1)
    @Description("Admin will Hover the content link ")
    @Feature("Add content")
    @Story("As a Admin I need to hover the content button")
    public void hover_Over_Content_Button() throws InterruptedException {

        homeObj.hoverOnContentButton();
    }

    @Test(priority = 2, dataProviderClass = DataUtils.class, dataProvider = "imageDataProvider")
    @Description("Admin will click on the video link ")
    @Feature("Add video content")
    @Story("As a Admin I need to click on the video button link")
    public void addPhotoContent(String data) throws AWTException, InterruptedException {
        String[] formInfo= data.split(",");
        String titleTxt= addPhoteContentObj.clickOnPhotoLink();
        Assert.assertEquals(titleTxt, "Create Photo", "Admin is able to click on the Photo button");
        
        addPhoteContentObj.addImgSlug(formInfo[0]);
		
		  addPhoteContentObj.addImageCaptionAndInstructions(formInfo[1],formInfo[2] );
			/* addPhoteContentObj.inputdate(); */
		  addPhoteContentObj.addImageCountryDetails(formInfo[3], formInfo[4],
		  formInfo[5]);
		  addPhoteContentObj.addImageBylineAndBytitle(formInfo[6],formInfo[7] );
		  addPhoteContentObj.
		  add_Image_Source_creditline_Copywrite_transref_SuppCategory(formInfo[8],
		  formInfo[9],formInfo[10],formInfo[11],formInfo[12] );
		  addPhoteContentObj.add_Image_file();
		  addPhoteContentObj.Add_text_of_Alternative(formInfo[13]);
        
    }

	
	/*
	 * public void viewAudioRemoveButton(){
	 * wait.until(ExpectedConditions.visibilityOf(removeBtn));
	 */
	 
    @Test(priority = 3)
    public void click_On_SaveButton() {
		/* addcontentobj.viewRemoveButton(); */ 
    	addPhoteContentObj.clickOnSaveButton();
    }
    
    @AfterTest
    public void teardown() {
  	  driver.quit();
    }
}
