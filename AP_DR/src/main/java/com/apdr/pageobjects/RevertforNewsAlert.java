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



public class RevertforNewsAlert extends TestBase {

	public RevertforNewsAlert() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);

	// Click on View button for NewsAlert page
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/main/section/nav/ul/li[3]/a")
	WebElement RevisionTab;

	// Click on Revision button for NewsAlert page
	@FindBy(xpath = "//a[normalize-space()='Revert']")
	WebElement ClickonRevertButton;

	@FindBy(xpath = "//input[@id='edit-submit']")
	WebElement Revert;

	@FindBy(xpath = "//div[@aria-label='Status message']")
	public static WebElement Statusmsg;

	public void RevisionButton() {
		wait.until(ExpectedConditions.visibilityOf(RevisionTab));
		RevisionTab.click();
	}

	public void ClickonRevertButton() {
		wait.until(ExpectedConditions.visibilityOf(ClickonRevertButton));
		ClickonRevertButton.click();
	}

	public void ConfirmationRevertButton() {
		wait.until(ExpectedConditions.visibilityOf(Revert));
		Revert.click();
		
		}
	
	public void Displayed_Message_Successfully() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Statusmsg));
		Thread.sleep(2000);
		//boolean message = Statusmsg.isDisplayed();
		//return message;
		//Assert.assertTrue(message); 
		//System.out.println("Revert Successfully");
	}
	
}
