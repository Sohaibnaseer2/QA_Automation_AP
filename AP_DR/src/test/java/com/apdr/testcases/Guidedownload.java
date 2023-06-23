package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.ReferenceGuide;
import com.apdr.setup.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class Guidedownload extends TestBase {

	public Guidedownload() {
		super();
	}

	HomePage homeObj;
	ReferenceGuide GuideObj;

	@BeforeTest
	public void GuidedownloadInitialization() {

		homeObj = new HomePage();
		GuideObj = new ReferenceGuide();

	}

	@Test(priority = 1)
	@Description("Admin will click on the Import user tab ")
	@Feature("Import User")
	@Story("As a Admin I need to click the Import user tab")
	public void Click_On_Reference_Button()  {

		GuideObj.Click_Reference();
	}
	
	
}
