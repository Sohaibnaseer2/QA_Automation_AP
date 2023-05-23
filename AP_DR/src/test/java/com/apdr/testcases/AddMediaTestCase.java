package com.apdr.testcases;

import com.apdr.listeners.TestListener;
import com.apdr.pageobjects.AddAudioMediaPage;
import com.apdr.pageobjects.AddDocumentMediaFile;
import com.apdr.pageobjects.AddImageMediaFile;
import com.apdr.pageobjects.AddVideoMediaPage;
import com.apdr.setup.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;

@Listeners({TestListener.class})
public class AddMediaTestCase extends TestBase {

    AddVideoMediaPage mediaPage;
    AddAudioMediaPage audioMediaObj;
    AddDocumentMediaFile documentMediaObj;
    AddImageMediaFile imageMediaObj;

//    public AddMediaTestCase(){
//        super();
//    }
    @BeforeTest
    public void setup(){
        //initialization();
        mediaPage = new AddVideoMediaPage();
        audioMediaObj= new AddAudioMediaPage();
        documentMediaObj= new AddDocumentMediaFile();
        imageMediaObj= new AddImageMediaFile();
    }

    @Test(priority = 1)
    @Description("User will hit the url and when user will land on the Login page then user will enter email and password and " +
            "then user will click on the media button ")
    @Feature("Add Media")
    @Story("As a Admin I need to click on Media button")
    public void ClickMediaButton(){

        mediaPage.clickOnContentButton();
        mediaPage.ClickOnMediaButton();
    }
    @Test(priority = 2)
    @Description("User will click on the media button & click add video link")
    @Feature("Add Media")
    @Story("As a Admin I need to click on add video button")
    public void ClickVideoButton(){
        mediaPage.ClickVideoButton();
    }
    @Test(priority = 3)
    @Description("User will click on the media button & click add video link")
    @Feature("Add Media")
    @Story("As a Admin I need to click on add video button")
    public void AddVideoDeta() throws AWTException {
        mediaPage.AddVideoDetail();
    }
    @Test(priority = 4)
    @Description("User will click on the revision text area & click add detail")
    @Feature("Add Revision Detail")
    @Story("As a Admin I need to click on Revision Text area and add detail press Submit btn")
    public void AddRevisionDel() throws InterruptedException {
        mediaPage.AddRevisionDetail();
     //   mediaPage.viewRemoveButton();
        mediaPage.clickSaveButtonToStoreMedia();
    }

    @Test(priority = 5)
    @Description("User will hit the url and when user will land on the Login page then user will enter email and password and " +
            "then user will click on the media button ")
    @Feature("Add Media")
    @Story("As a Admin I need to click on Media button and add media button")
    public void clickMediaButton(){
        mediaPage.ClickOnMediaButton();
    }

    @Test(priority = 6)
    public void selectAudioMedia(){
        audioMediaObj.clickOnAudioLink();
    }

    @Test(priority = 7)
    public void addAudioMediaFile() throws AWTException {
        audioMediaObj.AddAudioFile();
    }
    @Test(priority = 8)
    public void addRevisionLogMessageForAudioMediaFile(){
        audioMediaObj.addRevisionLogMessage();
    }

    @Test(priority = 9)
    public void saveAudioMediaFile(){
        audioMediaObj.viewRemoveButton();
        audioMediaObj.clickOnSaveButton();
    }

    @Test(priority = 10)
    @Description("User will hit the url and when user will land on the Login page then user will enter email and password and " +
            "then user will click on the media button ")
    @Feature("Add Media")
    @Story("As a Admin I need to click on Media button and add media button")
    public void clickMediaButtonToAddDocument(){
        mediaPage.ClickOnMediaButton();
    }

    @Test(priority = 11)
    public void selectDocumentMedia(){
        documentMediaObj.clickOnDocumentLink();
    }

    @Test(priority = 12)
    public void addDocumentMediaFile() throws AWTException {
        documentMediaObj.AddMediaDocumentFile();
    }
    @Test(priority = 13)
    public void addRevisionLogMessageForDocumentMediaFile(){
       documentMediaObj.addRevisionLogMessage();
    }

    @Test(priority = 14)
    public void saveDocumentMediaFile(){
       documentMediaObj.viewRemoveButton();
       documentMediaObj.clickOnSaveButton();
    }

    @Test(priority = 15)
    @Description("User will hit the url and when user will land on the Login page then user will enter email and password and " +
            "then user will click on the media button ")
    @Feature("Add Media")
    @Story("As a Admin I need to click on Media button and add media button")
    public void clickMediaButtonToAddImageFile(){
        mediaPage.ClickOnMediaButton();
    }

    @Test(priority = 16)
    public void selectImageMedia(){
        imageMediaObj.clickOnImageLink();
    }

    @Test(priority = 17)
    public void addImageMediaFile() throws AWTException {
        imageMediaObj.AddMediaImageFile();
    }
    @Test(priority = 18)
    public void addRevisionLogMessageForImageMediaFile(){
      imageMediaObj.addRevisionLogMessage();
    }

    @Test(priority = 19)
    public void saveImageMediaFile(){
        imageMediaObj.viewRemoveButton();
        imageMediaObj.clickOnSaveButton();
    }



}
