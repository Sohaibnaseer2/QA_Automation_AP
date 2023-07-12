package com.apdr.testcases;

import com.apdr.listeners.TestListener;
import com.apdr.pageobjects.AddAudioContentPage;

import com.apdr.pageobjects.AddVideoContentPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.LoginPage;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;

@Listeners(TestListener.class)
public class AddAudioContent extends TestBase {

	public AddAudioContent() {
		super();
	}

	LoginPage loginObj;
	HomePage homeObj;
	AddAudioContentPage addAudioContentObj;
	AddVideoContentPage addcontentobj;

	@BeforeTest
	public void addContentInitialization() {
		loginObj = new LoginPage();
		homeObj = new HomePage();
		addcontentobj = new AddVideoContentPage();
		addAudioContentObj = new AddAudioContentPage();

	}

	@Test(priority = 1)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void hover_Over_Content_Button() throws InterruptedException {

		homeObj.hoverOnContentButton();
	}

	@Test(priority = 2)
	@Description("Admin will click on the Audio link ")
	@Feature("Add video content")
	@Story("As a Admin I need to click on the Audio button link")
	public void addVideoContent() {
		String titleTxt = addAudioContentObj.clickOnAudioButton();
		Assert.assertEquals(titleTxt, "Create Audio", "Admin is not able to click on the Audio button");
		
		//Assert.assertEquals(titleTxt, "Create Audio | Associated Press", "Admin is not able to click on the Audio button");
	}

	@Test(priority = 3, dataProviderClass = DataUtils.class, dataProvider = "audioDataProvider")
	@Description("Admin will add content for Audio ")
	@Feature("Add Audio content")
	@Story("As a Admin I need to add slug, headline and source for Audio")
	public void add_Slug_Speaker_Intro_For_Audio(String data) {
		String[] formInfo = data.split(",");
		addcontentobj.addSlug(formInfo[0]);
		addAudioContentObj.add_Speaker_And_Intro(formInfo[1], formInfo[2]);
		
	}

	@Test(priority = 4)
	@Description("Admin will select Audio file from local repo and will upload to APDR ")
	@Feature("Add Audio content")
	@Story("As a Admin I need to upload a Audio file")
	public void Upload_Audio_File() throws AWTException, InterruptedException {
		addAudioContentObj.add_Audio_file();
	}

	@Test(priority = 5)
	@Description("Admin will click on the save button ")
	@Feature("Add Audio content")
	@Story("As a Admin I need to click on the save button to add Audio with content on APDR")
	public void clickOnSaveButton() throws InterruptedException {
		// addAudioContentObj.viewAudioRemoveButton();
		String titleTxt = addAudioContentObj.clickOnSaveButton();
		Assert.assertEquals(titleTxt, "Audio upload through upgraded Automation testing script | Associated Press", "Audio module save successfully.");
	}

	
	@Test(priority = 6)
	@Description("Verify that Audio File is Uploaded or not ? ")
	public void Audio_File_Verification() throws InterruptedException {
		boolean Filechecking = addAudioContentObj.Audio_File_Present();	
		Assert.assertTrue(Filechecking, "Audio File is not uploaded. Please check." );
	}

	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
