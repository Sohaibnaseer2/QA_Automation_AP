package com.apdr.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class ContentListingPage extends TestBase {

	public ContentListingPage() {

		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);

	// Search field for Content Listing
	@FindBy(xpath = "//input[@id='edit-user']")
	WebElement searchfield;

	// Content Type
	@FindBy(xpath = "//select[@id='edit-role']")
	WebElement Roleselection;

	@FindBy(xpath = "//input[@id='edit-submit-user-admin-people']")
	WebElement Filter;

	@FindBy(xpath = "//input[@id='edit-user-bulk-form-0']")
	WebElement checkbox;

	@FindBy(xpath = "//select[@id='edit-action']")
	WebElement ActionDropdown;

	@FindBy(xpath = "//input[@id='edit-submit--2']")
	WebElement ApplyITemseleted;

	@FindBy(xpath = "//label[@for='edit-user-cancel-method-user-cancel-delete']")
	WebElement DeleteAccount;

	@FindBy(xpath = "//input[@id='edit-submit']")
	WebElement ConfirmBtn;

	public void Titlesearchfield() {
		wait.until(ExpectedConditions.visibilityOf(searchfield));
		searchfield.sendKeys("sohaib@mailinator.com");
	}

	public void Roleselection() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Roleselection));
		Roleselection.click();
		Select select = new Select(Roleselection);
		//select.selectByValue("author");
		select.selectByValue("administrator");
		
	}

	public void Filterclick() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Filter));
		Thread.sleep(3000);
		Filter.click();
	}

	public void click_Checkbox() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		Thread.sleep(2000);
		checkbox.click();
	}

	public void ActionDropdownselection() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ActionDropdown));
		Roleselection.click();
		Select select = new Select(ActionDropdown);
		select.selectByValue("user_cancel_user_action");
	}

	public void ApplyItemselected() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ApplyITemseleted));
		Thread.sleep(2000);
		ApplyITemseleted.click();
	}

	public void DeleteAccoutSelection() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(DeleteAccount));
		Thread.sleep(2000);
		DeleteAccount.click();
	}

	public void Click_ConfirmBtn() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ConfirmBtn));
		Thread.sleep(2000);
		ConfirmBtn.click();
	}

}
