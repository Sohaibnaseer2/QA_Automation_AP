package com.apdr.pageobjects;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage extends TestBase {

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	Actions builder = new Actions(driver);

	// User profile icon locator
	@FindBy(id = "toolbar-item-user")
	WebElement userProfile;

	// Manage button locator on the home page
	@FindBy(id = "toolbar-item-administration")
	WebElement manageBtn;

	// People button locator

	@FindBy(linkText = "Add User")
	WebElement AddUserBtn;

	// content button locator

	@FindBy(xpath = "//a[normalize-space()='Add Content']") 
	WebElement contentBtn;
	 	 
	// add role button locator
	@FindBy(css = "a.button.button-action.button--primary.button--small")
	WebElement addroleBtn;

	// Role Name Inpt field locator
	@FindBy(id = "edit-label")
	WebElement roleInputField;

	// Machine-readable name input field locator
	@FindBy(id = "edit-id")
	WebElement machineReabaleName;

	// Save button locator
	@FindBy(id = "edit-submit")
	WebElement saveBtn;

	// add role success message
	@FindBy(css = "div.messages.messages--status")
	WebElement addRoleSuccessMessage;

	/// click on Content Listing
	@FindBy(xpath = "//a[normalize-space()='Content Listing']")
	WebElement contentlisting;
	
	
	public boolean is_User_Profile_Is_Displayed_On_Home_Page() {
		wait.until(ExpectedConditions.visibilityOf(userProfile));
		boolean profileIcon = userProfile.isDisplayed();
		return profileIcon;
	}

	public void hoverOnContentButton() throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(contentBtn));
		builder.moveToElement(contentBtn).build().perform();
		contentBtn.click();
	}

	public void clickOnAddRoleButton() {
		wait.until(ExpectedConditions.elementToBeClickable(addroleBtn));
		addroleBtn.click();
	}

	public void addRoleName(String roleName) {
		wait.until(ExpectedConditions.elementToBeClickable(roleInputField));
		roleInputField.sendKeys(roleName);
	}

	public void addMachineReadableName(String machineName) {
		wait.until(ExpectedConditions.elementToBeClickable(machineReabaleName));
		machineReabaleName.sendKeys(machineName);
	}

	public void clickOnSaveButton() {
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
	}

	public boolean is_User_Role_Added_Successfully() {
		wait.until(ExpectedConditions.visibilityOf(addRoleSuccessMessage));
		boolean message = addRoleSuccessMessage.isDisplayed();
		return message;
	}

	public void clickOnuserButton() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(AddUserBtn));
		AddUserBtn.click();
		
	}

   public void hoverOnContentListingButton() throws InterruptedException {		
		wait.until(ExpectedConditions.elementToBeClickable(contentlisting));
		builder.moveToElement(contentlisting).build().perform();
		contentlisting.click();
	}
	
}
