package com.apdr.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apdr.pageobjects.InitialPasswordContentPage;

import com.apdr.setup.TestBase;

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

	@Test(priority = 1 , enabled = false)
	@Description("User can click on the forget button")
	public void Click_mailnator_Email() throws InterruptedException {
		InitialPassObj.Resetbuttonlink();
	}

	@Test(priority = 2 , enabled = false)
	@Description("User can click on the forget button")
	public void Click_Forget_Button() throws InterruptedException {
		InitialPassObj.Resetbuttonlink();
	}

	@Test(priority = 3 , enabled = false)
	@Description("User can enter email address ")
	public void Enter_Email_Address() throws InterruptedException {
		InitialPassObj.Enter_Email();
	}

	@Test(priority = 4 , enabled = false)
	@Description("User submit button ")
	public void Submit_Button() throws InterruptedException {
		InitialPassObj.Submit_BTN();
	}

	@Test(priority = 5)
	@Description("Cilck on Mailinator Email ")
	public void OpenNewMailbox() throws InterruptedException {
		InitialPassObj.Mail_Initial_Click();
	}
	
	@Test(priority = 6 , enabled = false)
	@Description("User submit button ")
	public void OpenMailbox() throws InterruptedException {
		InitialPassObj.Mail_Click();
	}

	@Test(priority = 7 , enabled = false)
	@Description("User submit button ")
	public void NewPass() throws InterruptedException {
		InitialPassObj.Enter_NewPassword();
	}

	@Test(priority = 8 , enabled = false)
	@Description("User submit button ")
	public void Confirm_Pass() throws InterruptedException {
		InitialPassObj.Enter_ConfirmNewPassword();
	}

	@Test(priority = 9 , enabled = false)
	@Description("User submit button ")
	public void ResetSUbmit() throws InterruptedException {
		InitialPassObj.Click_SaveButton();
	}

}
