package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.AddUserPage;
import com.apdr.pageobjects.HomePage;
import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class AddCustomerSupport extends TestBase {

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

	@Test(priority = 2, dataProviderClass = DataUtils.class, dataProvider = "customerSupportCredentials")
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
		addUserObj.RoleselectionForCustomer_Support();
	}
	
	@Test(priority = 4, dataProviderClass = DataUtils.class, dataProvider = "addUserData")
	@Description("Admin will add organisation Name and Org Id ")
	@Feature("Add users")
	@Story("As a Admin I need to add user org name and org id")
	public void add_Org_Name_And_Org_Id(String data) throws InterruptedException {
		String[] formInfo = data.split(",");
		addUserObj.addOrgNameAndOrgId(formInfo[2], formInfo[3]);
		addUserObj.addMMIDM(formInfo[4]);
		addUserObj.addUserInfo(formInfo[5], formInfo[6], formInfo[7], formInfo[8]);
		addUserObj.clickOnCreateUser();
	}
}
