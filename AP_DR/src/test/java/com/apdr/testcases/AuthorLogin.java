package com.apdr.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.LoginPage;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class AuthorLogin extends TestBase {

	LoginPage loginObj;
	HomePage homeObj;

	public AuthorLogin() {
		super();
	}

	@BeforeTest
	public void loginIntialization() {
		loginObj = new LoginPage();
		homeObj = new HomePage();
	}

	@Test(priority = 1, dataProviderClass = DataUtils.class, dataProvider = "AuthorCredentials", enabled = true)
	@Description("User will hit the url and when user will land on the Login page then user will enter email and password and "
			+ "then user will click on the login button ")
	@Feature("LogIn")
	@Story("As a Admin I need to login to AP DR System")
	public void loginToApDr(String data) {
		String[] formInfo = data.split(",");
		loginObj.enterUserEmailAndPassword(formInfo[0], formInfo[1]);
		loginObj.clickOnLoginButton();
		Boolean result = homeObj.is_User_Profile_Is_Displayed_On_Home_Page();
		Assert.assertTrue(result, "User is unable to login and to land on the home page");
	}

	
	/*
	 * @AfterTest public void teardown() { driver.quit();
	 * 
	 * }
	 */
	 

}

