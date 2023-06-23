package com.apdr.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class UpdateRolePage extends TestBase {

	public UpdateRolePage() {

		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);

	// Enter value of Name or email contains
	@FindBy(xpath = "//input[@id='edit-user']")
	WebElement searchfield;

	/// selection inside grid of users
	@FindBy(xpath = "//a[@title='View user profile.']")
	WebElement Emailselection;

	// select Role tab
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/main/section/nav/ul/li[2]")
	WebElement Roleselection;

	// select first previous role
	@FindBy(xpath = "//label[@for='edit-role-change-customer']")
	WebElement PreviousRole;

	// Update Role
	@FindBy(xpath = "//label[@for='edit-role-change-customer-support']")
	WebElement UpdateRole;

	public void Titlesearchfield() {
		wait.until(ExpectedConditions.visibilityOf(searchfield));
		searchfield.sendKeys("Customer123@mailinator.com");
	}

	public void resultclick() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Emailselection));
		Thread.sleep(3000);
		Emailselection.click();
	}

	public void RoleSelection() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Roleselection));
		Thread.sleep(3000);
		Roleselection.click();
	}

	public void PreviousRole() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(PreviousRole));
		Thread.sleep(3000);
		PreviousRole.click();
	}

	public void UpdateRole() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(UpdateRole));
		Thread.sleep(3000);
		UpdateRole.click();
	}

}
