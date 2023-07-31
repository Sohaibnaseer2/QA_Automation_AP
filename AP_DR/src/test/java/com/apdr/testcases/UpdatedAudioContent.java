package com.apdr.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.AddAudioContentPage;
import com.apdr.pageobjects.EditAllfields;
import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.RevertContent;
import com.apdr.pageobjects.UnpublishedContent;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class UpdatedAudioContent extends TestBase {

		public UpdatedAudioContent() {
			super();
		}

		HomePage homeObj;
		AddAudioContentPage UpdatedAudioObj;
		EditAllfields EditContentobj;
		RevertContent Revertcontentobj;
		UnpublishedContent Unpublishobj;
		
		
		@BeforeTest
		public void addNewsAlertContentInitialization() {

			homeObj = new HomePage();
			UpdatedAudioObj = new AddAudioContentPage();
			EditContentobj = new EditAllfields();
			Revertcontentobj = new RevertContent();
			Unpublishobj = new UnpublishedContent();
		}
		
			
		@Test(priority = 2)
		@Description("Admin will click on the News Alert link ")
		@Feature("Edit News Alert Content")
		@Story("As a Admin I need to click on the News Alert link")
		public void Edit_Btn_Clicked() throws InterruptedException {
			EditContentobj.Click_on_Edit_Button();

		}
		
		@Test(priority = 3, dataProviderClass = DataUtils.class, dataProvider = "UpdatedaudioDataProvider")
		@Description("Admin will add content for Audio ")
		@Feature("Add Audio content")
		@Story("As a Admin I need to add slug, headline and source for Audio")
		public void add_Slug_Speaker_Intro_For_Audio(String data) {
			String[] formInfo = data.split(",");
			UpdatedAudioObj.addSlug1(formInfo[0]);
			UpdatedAudioObj.add_Speaker_And_Intro1(formInfo[1], formInfo[2]);
			UpdatedAudioObj.RemoveAudioButton1();
			
		}

		@Test(priority = 4)
		@Description("Admin will select Audio file from local repo and will upload to APDR ")
		@Feature("Add Audio content")
		@Story("As a Admin I need to upload a Audio file")
		public void Upload_Audio_File() throws AWTException, InterruptedException {
			UpdatedAudioObj.add_Audio_file1();
		}

		@Test(priority = 5)
		@Description("Admin will click on the News Alert link ")
		@Feature("Add News Alert Content")
		@Story("As a Admin I need to click on the News Alert link")
		public void Select_State_to_Unpublish() throws InterruptedException {
			Unpublishobj.Click_on_Unpublished_State();

		}
		
		@Test(priority = 6)
		@Description("Admin will click on the save button ")
		@Feature("Add Audio content")
		@Story("Click on the save button to add Audio file with content.")
		public void click_On_SaveButton() throws InterruptedException {
			UpdatedAudioObj.clickOnSaveButton1();
			// addAudioContentObj.viewAudioRemoveButton();
			//String titleTxt = addAudioContentObj.clickOnSaveButton();
			//Assert.assertEquals(titleTxt, "Audio upload through upgraded Automation testing script | Associated Press", "Audio module save successfully.");
		}

		@Test(priority = 6, enabled = false)
		@Description("Verify that Audio File is Uploaded or not ? ")
		@Feature("Add Audio content")
		@Story("Verify that Audio File is Uploaded or not ?")
		public void Audio_File_Verification() throws InterruptedException {
			//boolean Filechecking = addAudioContentObj.Audio_File_Present();	
			//Assert.assertTrue(Filechecking, "Audio File is not Displayed. Please check." );
		}

}
