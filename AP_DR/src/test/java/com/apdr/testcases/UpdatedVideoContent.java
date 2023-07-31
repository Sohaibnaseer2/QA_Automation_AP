package com.apdr.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.apdr.pageobjects.AddVideoContentPage;
import com.apdr.pageobjects.EditAllfields;
import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.RevertContent;
import com.apdr.pageobjects.UnpublishedContent;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class UpdatedVideoContent extends TestBase {

	public UpdatedVideoContent() {
		super();
	}

	HomePage homeObj;
	AddVideoContentPage UpdatedVideoObj;
	EditAllfields EditContentobj;
	RevertContent Revertcontentobj;
	UnpublishedContent Unpublishobj;
	
	
	@BeforeTest
	public void addNewsAlertContentInitialization() {

		homeObj = new HomePage();
		UpdatedVideoObj = new AddVideoContentPage();
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
 
	@Test(priority = 2, dataProviderClass = DataUtils.class, dataProvider = "UpdatedvideoDataProvider")
	@Description("Admin will add content for video ")
	@Feature("Add video content")
	@Story("As a Admin I need to add slug, headline and source for video")
	public void add_Slug_Headline_Source_For_Video(String data) {
		String[] formInfo = data.split(",");
		UpdatedVideoObj.addSlug1(formInfo[0]);
		UpdatedVideoObj.add_Headline_Source1(formInfo[1], formInfo[2]);
	}

	@Test(priority = 3)
	@Description("Admin will select video file from local repo and will upload to APDR ")
	@Feature("Add video content")
	@Story("As a Admin I need to upload a video file")
	public void RemoveVideoFile() throws  InterruptedException {
		UpdatedVideoObj.viewRemoveButton1();
	}
	
	@Test(priority = 4)
	@Description("Admin will select video file from local repo and will upload to APDR ")
	@Feature("Add video content")
	@Story("As a Admin I need to upload a video file")
	public void addVideoFile() throws AWTException, InterruptedException {
		UpdatedVideoObj.addVideoFileFromLocalRepository1();
	}

	@Test(priority = 5, dataProviderClass = DataUtils.class, dataProvider = "UpdatedvideoDataProvider")
	@Description("Admin will add body for video file ")
	@Feature("Add video content")
	@Story("As a Admin I need to add body for video file")
	public void add_Body_For_Video(String data) throws InterruptedException {
		String[] formInfo = data.split(",");
		UpdatedVideoObj.addBodyForVideo1(formInfo[3]);

	}
	
	@Test(priority = 6)
	@Description("Admin will click on the News Alert link ")
	@Feature("Add News Alert Content")
	@Story("As a Admin I need to click on the News Alert link")
	public void Select_State_to_Unpublish() throws InterruptedException {
		Unpublishobj.Click_on_Unpublished_State();

	}

	@Test(priority = 7	)
	@Description("Admin will click on the save button ")
	@Feature("Add video content")
	@Story("As a Admin I need to click on the save button to add video with content on APDR")
	public void clickOnSaveButton() throws InterruptedException {
		// addcontentobj.viewRemoveButton();
		UpdatedVideoObj	.clickOnSaveButton1();
	}
	
	
}
