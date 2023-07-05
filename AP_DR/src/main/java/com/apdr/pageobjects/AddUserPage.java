package com.apdr.pageobjects;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUserPage extends TestBase {

	public AddUserPage() {

		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);

	// email address input field locator
	@FindBy(id = "edit-mail")
	WebElement emailInputField;

	// author role check box locator
	@FindBy(xpath = "//label[@for='edit-role-change-customer']")
	WebElement authorCheckbox;
	
	
	// password input field locator
	@FindBy(css = "input.password-field.js-password-field.form-text.required")
	WebElement passwordInputField;

	// confirm password input field locator
	@FindBy(css = "input.password-confirm.js-password-confirm.form-text.required")
	WebElement confirmPasswordInput;

	// organisation name input field locator
	@FindBy(id = "edit-field-organization-name-0-value")
	WebElement orgNameInput;

	// organisation id input field locator
	@FindBy(id = "edit-field-organization-id-0-value")
	WebElement orgIdInput;

	// MDMID input field locator
	@FindBy(id = "edit-field-mdmid-0-value")
	WebElement mdmidInput;

	// user Id input field locator
	@FindBy(id = "edit-field-user-id-0-value")
	WebElement userIdInput;

	// last name input field locator
	@FindBy(id = "edit-field-last-name-0-value")
	WebElement lastNameInput;

	// first name input field locator
	@FindBy(id = "edit-field-first-name-0-value")
	WebElement firstNameInput;

	// Dr system role input field locator
	@FindBy(id = "edit-field-drsystemrole-0-value")
	WebElement drSystemRole;

	// create new account button locator
	@FindBy(id = "edit-submit")
	WebElement createNewAcc;

	public void addEmail(String _email) {
		wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
		emailInputField.sendKeys(_email);
	}

	public void selectUserRole() {
		authorCheckbox.click();
	}

	public void addPassAndConfirmPass(String _pass, String _confPass) {
		passwordInputField.sendKeys(_pass);
		confirmPasswordInput.sendKeys(_confPass);
	}

	public void addOrgNameAndOrgId(String _org, String _orgId) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", orgNameInput);
		orgNameInput.sendKeys(_org);
		orgIdInput.sendKeys(_orgId);
	}

	public void addMMIDM(String _mdmid) {
		mdmidInput.sendKeys(_mdmid);

	}

	public void addUserInfo(String _urderId, String _last, String _first, String _sysRole) {
		userIdInput.sendKeys(_urderId);
		lastNameInput.sendKeys(_last);
		firstNameInput.sendKeys(_first);
		drSystemRole.sendKeys(_sysRole);

	}

	public void Roleselection() {
		wait.until(ExpectedConditions.elementToBeClickable(authorCheckbox));
		Actions action = new Actions((driver) );
		action.moveToElement(authorCheckbox).click().perform();
		//authorCheckbox.click();
	}

	public void clickOnCreateUser() throws InterruptedException {
		createNewAcc.click();
		Thread.sleep(3000);
	}

}
