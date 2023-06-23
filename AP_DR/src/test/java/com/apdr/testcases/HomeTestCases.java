package com.apdr.testcases;

import com.apdr.pageobjects.HomePage;
import com.apdr.pageobjects.LoginPage;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTestCases extends TestBase {

	HomePage homeObj;

	@BeforeTest
	public void homeInitialization() {

		homeObj = new HomePage();
	}

	@Test(priority = 1)
	@Description("User will hover over the peoples link and then will click the roles option")
	@Feature("Manage role & users")
	@Story("As a Admin I can select roles option from peoples drop down")
	public void select_Add_User_Option_From_Peoples_DropDown() throws InterruptedException {

		/* homeObj.hoverOnPeopleButton(); */
		homeObj.hoverOnContentButton();
		homeObj.clickOnuserButton();

	}

}
