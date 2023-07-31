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

public class UnpublishedContent extends TestBase {

	public UnpublishedContent() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);
	
	@FindBy(css = "#edit-moderation-state-0-state")
	WebElement Current_state;
	
	public void Click_on_Unpublished_State() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Current_state));
		Thread.sleep(2000);
		Select select = new Select(Current_state);
		select.selectByValue("archived");
		Thread.sleep(2000);
	}
	
	public void Click_on_published_State() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Current_state));
		Thread.sleep(2000);
		Select select = new Select(Current_state);
		select.selectByValue("published");
		Thread.sleep(2000);
	}

}
