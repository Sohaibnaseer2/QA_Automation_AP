package com.apdr.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.AddAudioContentPage;
import com.apdr.pageobjects.AddVideoContentPage;
import com.apdr.pageobjects.Adduploadcsvpage;
import com.apdr.pageobjects.HomePage;

import com.apdr.setup.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class Adduploadcsvcontent extends TestBase {

	public Adduploadcsvcontent() {
		super();
	}

	HomePage homeObj;
	Adduploadcsvpage addfileobj;
	AddVideoContentPage addcontentobj;

	@BeforeTest
	public void addContentInitialization() {

		homeObj = new HomePage();
		addfileobj = new Adduploadcsvpage();
		addcontentobj = new AddVideoContentPage();

	}

	@Test(priority = 1)
	@Description("Admin will Hover the Upload file link ")
	@Feature("Add content")
	@Story("As a Admin I need to hover the Upload file button")
	public void hover_Over_Content_Button() throws InterruptedException {

		addfileobj.Uploaduserscsvfile();
	}

	@Test(priority = 2)
	@Description("Admin will select add file from local repo and will upload to APDR")
	@Feature("Add file upload")
	@Story("As a Admin I need to upload a document file")
	public void addFiletest() throws AWTException {
		addfileobj.FileClickable();

	}

	@Test(priority = 3)
	@Description("Admin will click on the save button ")
	@Feature("Add Audio content")
	@Story("As a Admin I need to click on the save button to add Audio with content on APDR")
	public void click_On_SaveButton() throws InterruptedException {
		addcontentobj.clickOnSaveButton();
	}

}
