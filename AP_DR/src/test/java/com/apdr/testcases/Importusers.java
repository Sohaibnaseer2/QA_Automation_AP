package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.AddVideoContentPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.Importuserspage;

import com.apdr.setup.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class Importusers extends TestBase {

	public Importusers() {
		super();
	}

	HomePage homeObj;
	Importuserspage Importfileobj;
	AddVideoContentPage addcontentobj;

	@BeforeTest
	public void addContentInitialization() {

		homeObj = new HomePage();
		Importfileobj = new Importuserspage();

	}

	@Test(priority = 1)
	@Description("Admin will click on the Import user tab ")
	@Feature("Import User")
	@Story("As a Admin I need to click the Import user tab")
	public void hover_Over_Import_Button() throws InterruptedException {

		Importfileobj.Click_Importusertab();
	}

	@Test(priority = 2)
	@Description("Admin will click on the Import file ")
	@Feature("Import File")
	@Story("As a Admin I need to click on the Import file")
	public void hover_Over_Import_file() throws InterruptedException {

		Importfileobj.Click_Importfile();
	}

}
