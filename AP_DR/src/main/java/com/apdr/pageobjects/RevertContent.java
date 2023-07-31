package com.apdr.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class RevertContent extends TestBase {

	public RevertContent() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);

	// Click on Revision link
	@FindBy(xpath = "//a[normalize-space()='Revert']")
	WebElement ClickonRevertlink;

	// Click on Revert revision
	@FindBy(xpath = "//tr[@class='even']//a[contains(text(),'Revert')]")
	WebElement Revertbutton;

	@FindBy(xpath = "//input[@id='edit-submit']")
	WebElement Revertconfirmation;

	@FindBy(xpath = "//div[@aria-label='Status message']")
	public static WebElement Statusmsg;

	/*
	 * public void RevisionButton() {
	 * wait.until(ExpectedConditions.visibilityOf(RevisionTab));
	 * RevisionTab.click(); }
	 */


	public void ClickonRevertLink() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(ClickonRevertlink));
		Thread.sleep(2000);
		ClickonRevertlink.click();
	}

	public void ClickonRevertButton() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Revertbutton));
		Thread.sleep(2000);
		Revertbutton.click();
	}

	public void ConfirmationRevertButton() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Revertconfirmation));
		Thread.sleep(2000);
		Revertconfirmation.click();

	}

	public void Displayed_Message_Successfully() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Statusmsg));
		Thread.sleep(2000);
		// boolean message = Statusmsg.isDisplayed();
		// return message;
		// Assert.assertTrue(message);
		// System.out.println("Revert Successfully");
	}

}
