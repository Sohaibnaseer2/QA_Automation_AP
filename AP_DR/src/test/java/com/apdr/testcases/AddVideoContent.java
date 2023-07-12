package com.apdr.testcases;

import com.apdr.pageobjects.AddVideoContentPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class AddVideoContent extends TestBase {

	public AddVideoContent() {
		super();
	}

	HomePage homeObj;
	AddVideoContentPage addcontentobj;

	@BeforeTest
	public void addContentInitialization() {

		homeObj = new HomePage();
		addcontentobj = new AddVideoContentPage();
	}

	@Test(priority = 1)
	@Description("Admin will Hover the content link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the content button")
	public void hover_Over_Content_Button() throws InterruptedException {

		homeObj.hoverOnContentButton();
	}

	@Test(priority = 2)
	@Description("Admin will click on the video link ")
	@Feature("Add video content")
	@Story("As a Admin I need to click on the video button link")
	public void addVideoContent() {
		String titleTxt = addcontentobj.clickOnVideoButton();
		Assert.assertEquals(titleTxt, "Create Video", "Admin is not able to click on the video button");

	}

	@Test(priority = 3, dataProviderClass = DataUtils.class, dataProvider = "videoDataProvider")
	@Description("Admin will add content for video ")
	@Feature("Add video content")
	@Story("As a Admin I need to add slug, headline and source for video")
	public void add_Slug_Headline_Source_For_Video(String data) {
		String[] formInfo = data.split(",");
		addcontentobj.addSlug(formInfo[0]);
		addcontentobj.add_Headline_Source(formInfo[1], formInfo[2]);
	}

	@Test(priority = 4)
	@Description("Admin will select video file from local repo and will upload to APDR ")
	@Feature("Add video content")
	@Story("As a Admin I need to upload a video file")
	public void addVideoFile() throws AWTException, InterruptedException {
		addcontentobj.addVideoFileFromLocalRepository();
	}

	@Test(priority = 5, dataProviderClass = DataUtils.class, dataProvider = "videoDataProvider")
	@Description("Admin will add body for video file ")
	@Feature("Add video content")
	@Story("As a Admin I need to add body for video file")
	public void add_Body_For_Video(String data) throws InterruptedException {
		String[] formInfo = data.split(",");
		addcontentobj.addBodyForVideo(formInfo[3]);

	}

	@Test(priority = 6)
	@Description("Admin will click on the save button ")
	@Feature("Add video content")
	@Story("As a Admin I need to click on the save button to add video with content on APDR")
	public void clickOnSaveButton() throws InterruptedException {
		// addcontentobj.viewRemoveButton();
		addcontentobj.clickOnSaveButton();
	}
	@Test(priority = 7)
	@Description("Verify that Video File is Uploaded or not ? ")
	public void Video_File_Verification() throws InterruptedException {
		boolean Filechecking = addcontentobj.Video_File_Present();	
		Assert.assertTrue(Filechecking, "Video File is not uploaded. Please check." );
	}
	
	@Test(priority = 8)
	@Description("Verify that Video File is Uploaded or not ? ")
	public void Verify_Title() throws InterruptedException {
		String MyActual = "Video upload through upgraded Automation testing script.";
		String MyExpected = addcontentobj.Verify_Title();			
		Assert.assertEquals(MyActual, MyExpected, "Title Verified Successfully.");
	}
}
