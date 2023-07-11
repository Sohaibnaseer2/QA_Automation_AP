package com.apdr.testcases;

import com.apdr.pageobjects.AddUserPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddAdminUser extends TestBase {

	HomePage homeObj;
	AddUserPage addUserObj;

	@BeforeTest
	public void addUserInitialization() {

		homeObj = new HomePage();
		addUserObj = new AddUserPage();
	}

	@Test(priority = 1)
	@Description("Admin will Hover the Add User link ")
	@Feature("Add User")
	@Story("As a Admin I need to hover the Add User module")
	public void hover_Over_AddUser_Link() throws InterruptedException {

		homeObj.clickOnuserButton();
	}

	@Test(priority = 2, dataProviderClass = DataUtils.class, dataProvider = "adminCredentials")
	@Description("Admin will add user email address")
	@Feature("Add users")
	@Story("As a Admin I need to add user email address")
	public void add_Role_For_Users(String data) {
		String[] formInfo = data.split(",");
		addUserObj.addEmail(formInfo[0]);
		addUserObj.addPassAndConfirmPass(formInfo[1], formInfo[1]);

	}
	
	@Test(priority = 3)
	@Description("Admin will select user role")
	@Feature("Add users")
	@Story("As a Admin I need to select user role")
	public void select_Users_role() throws InterruptedException {
		addUserObj.RoleselectionForAdmin();
	}

	@Test(priority = 4, dataProviderClass = DataUtils.class, dataProvider = "addUserData")
	@Description("Admin will add organisation Name and Org Id ")
	@Feature("Add users")
	@Story("As a Admin I need to add user org name and org id")
	public void add_Org_Name_And_Org_Id(String data) {
		String[] formInfo = data.split(",");
		addUserObj.addOrgNameAndOrgId(formInfo[2], formInfo[3]);

	}

	@Test(priority = 5, dataProviderClass = DataUtils.class, dataProvider = "addUserData")
	@Description("Admin will add MDMID")
	@Feature("Add users")
	@Story("As a Admin I need to add MDMID")
	public void add_User_MDMID(String data) {
		String[] formInfo = data.split(",");
		addUserObj.addMMIDM(formInfo[4]);

	}

	@Test(priority = 6, dataProviderClass = DataUtils.class, dataProvider = "addUserData")
	@Description("Admin will add user information")
	@Feature("Add users")
	@Story("As a Admin I need to add user information")
	public void add_User_Informtion(String data) {
		String[] formInfo = data.split(",");
		addUserObj.addUserInfo(formInfo[5], formInfo[6], formInfo[7], formInfo[8]);

	}

	@Test(priority = 7)
	@Description("Admin will click on create new account button")
	@Feature("Add users")
	@Story("As a Admin I need to click on create new account button")
	public void click_On_Create_New_Account_Button() throws InterruptedException {
		addUserObj.clickOnCreateUser();
	}

}
