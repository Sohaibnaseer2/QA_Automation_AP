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

public class DeleteAudioPage extends TestBase {

	public DeleteAudioPage() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);

	// Search field for Content Listing
	@FindBy(xpath = "//input[@id='edit-title']")
	WebElement searchfield;

	// Content Type
	@FindBy(id = "edit-type")
	WebElement ContentType;

	public void Titlesearchfield() {
		wait.until(ExpectedConditions.visibilityOf(searchfield));
		searchfield.sendKeys("Audio upload through upgraded Automation testing script");
	}

	public void contenttype() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ContentType));
		ContentType.click();
		Select select = new Select(ContentType);
		select.selectByValue("audio");
	}

}
