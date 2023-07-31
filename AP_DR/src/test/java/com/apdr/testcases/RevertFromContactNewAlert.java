package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.NewsAlertContentPage;
import com.apdr.pageobjects.RevertContent;
import com.apdr.setup.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class RevertFromContactNewAlert extends TestBase {

	public RevertFromContactNewAlert() {
		super();
	}

	HomePage homeObj;
	NewsAlertContentPage newsAlertObj;
	RevertContent Revertcontentobj;
	
	
	@BeforeTest
	public void addNewsAlertContentInitialization() {

		homeObj = new HomePage();
		newsAlertObj = new NewsAlertContentPage();
		Revertcontentobj = new RevertContent();
	}

	@Test(priority = 1)
	@Description("Admin will Edit on NewsAlert Page ")
	@Feature("Edit NewsAlert Content")
	@Story("As a Admin I need to Edit on NewsAlert Page")
	public void Click_on_Revert() throws InterruptedException {
		Revertcontentobj.ClickonRevertLink();
		Revertcontentobj.ClickonRevertButton();
		Revertcontentobj.ConfirmationRevertButton();
		Revertcontentobj.Displayed_Message_Successfully();
		
	}
	
}
