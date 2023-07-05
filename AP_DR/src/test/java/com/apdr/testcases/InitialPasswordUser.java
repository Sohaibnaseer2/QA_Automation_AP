package com.apdr.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.InitialPasswordContentPage;

import com.apdr.setup.TestBase;
import com.apdr.utalities.DataUtils;

import io.qameta.allure.Description;


public class InitialPasswordUser extends TestBase {
	// LoginPage loginObj;

	public InitialPasswordUser() {

		super();
	}

	InitialPasswordContentPage InitialPassObj;

	@BeforeTest
	public void loginIntialization() {
		// loginObj = new LoginPage();;
		InitialPassObj = new InitialPasswordContentPage();

	}

	
	@Test(priority = 1 , enabled = true)
	@Description("Cilck on Mailinator Email ")
	public void OpenNewMailbox() throws InterruptedException {
		InitialPassObj.Mail_Initial_Click();
	}
	
	
	@Test(priority = 2 , enabled = true ,dataProviderClass = DataUtils.class, dataProvider = "addUserData")
	@Description("User can enter email address ")
	public void Enter_Email_Address(String data) throws InterruptedException {
		String[] formInfo = data.split(",");
		InitialPassObj.Enter_Email(formInfo[0]);
	}

	@Test(priority = 3 , enabled = true)
	@Description("User submit button ")
	public void Submit_Button() throws InterruptedException {
		InitialPassObj.Submit_BTN();
	}

	
	@Test(priority = 4 , enabled = true)
	@Description("User submit button ")
	public void OpenMailbox() throws InterruptedException {
		InitialPassObj.Mail_Click();
	}

	@Test(priority = 5 , enabled = true ,dataProviderClass = DataUtils.class, dataProvider = "addUserData")
	@Description("User submit button ")
	public void NewPass(String data) throws InterruptedException {
		String[] formInfo = data.split(",");
		InitialPassObj.Enter_NewPassword(formInfo[1]);
	}

	@Test(priority = 6 , enabled = true ,dataProviderClass = DataUtils.class, dataProvider = "addUserData")
	@Description("User submit button ")
	public void Confirm_Pass(String data) throws InterruptedException {
		String[] formInfo = data.split(",");
		InitialPassObj.Enter_ConfirmNewPassword(formInfo[1]);
	}

	@Test(priority = 7 , enabled = true)
	@Description("User submit button ")
	public void ResetSUbmit() throws InterruptedException {
		InitialPassObj.Click_SaveButton();
		String Actual = "Your New Password has been saved please log in.";
		String Expected = InitialPasswordContentPage.VerifyPassword.getText();
		Assert.assertEquals(Actual, Expected, "User is unable to reset the Password.");
		Thread.sleep(6000);
		
		
	}

}
