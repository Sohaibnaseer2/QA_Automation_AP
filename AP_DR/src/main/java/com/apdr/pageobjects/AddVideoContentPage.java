package com.apdr.pageobjects;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class AddVideoContentPage extends TestBase {

	public AddVideoContentPage() {

		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	Actions builder = new Actions(driver);

	// video link text locator
	@FindBy(linkText = "Video")
	WebElement videoBtn;

	// create video text locator
	@FindBy(css = ".page-title")
	WebElement createTxt;

	// Slug input field locator
	@FindBy(id = "edit-title-0-value")
	WebElement slugInputField;

	// Headline Input field locator
	@FindBy(id = "edit-field-headline-0-value")
	WebElement headlineInputField;

	// Source Input field locator
	@FindBy(id = "edit-field-source-0-value")
	WebElement sourceInputField;

	// Add files button locator to upload video file
	@FindBy(id = "edit-field-video-file-2-0-upload")
	WebElement addFileButton;

	// remove button locator
	@FindBy(name = "#edit-field-video-file-2-0-remove-button")
	WebElement removeBtn;

	// Body Input Field locator
	@FindBy(id = "edit-body-0-value")
	WebElement bodyInputField;

	// Save as Drop down field locator
	@FindBy(id = "edit-moderation-state-0-state")
	WebElement saveAsDropDown;

	// Save button locator
	@FindBy(xpath = "//input[@id='edit-submit']")
	WebElement saveBtn;

	
	@FindBy(xpath = "//span[@class='field field--name-title field--type-string field--label-hidden']")
	WebElement VerifyTitle;
	
	
	@FindBy(xpath = "//video[@controls='controls']")
	WebElement VideoFilepresent;
	
	
	public String clickOnVideoButton() {
		wait.until(ExpectedConditions.elementToBeClickable(videoBtn));
		videoBtn.click();
		wait.until(ExpectedConditions.visibilityOf(createTxt));
		String message = createTxt.getText();
		return message;
	}

	public void addSlug(String slug) {
		slugInputField.sendKeys(slug);
		//String ValueSlug = slugInputField.getText();
		//return ValueSlug;
	}
	

	public void add_Headline_Source(String headline, String source) {
		headlineInputField.sendKeys(headline);
		sourceInputField.clear();
		sourceInputField.sendKeys(source);
	}

	public void addVideoFileFromLocalRepository() throws AWTException, InterruptedException {

		//builder.moveToElement(addFileButton).click().build().perform();
		addFileButton.sendKeys("C:\\Users\\sohaib.naseer\\git\\repository\\AP_DR\\AudioVideo\\Test1.mp4");
		//wait.until(ExpectedConditions.visibilityOf(removeBtn));
		Thread.sleep(5000);
	
	}

	public void addBodyForVideo(String body) throws InterruptedException {
		Thread.sleep(10000);
		js.executeScript("arguments[0].scrollIntoView(true);", bodyInputField);
		bodyInputField.sendKeys(body);
	}

	public void viewRemoveButton() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(removeBtn));
	}

	public void clickOnSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		saveBtn.click();
		Thread.sleep(2000);
	}
	
	public String Verify_Title() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(VerifyTitle));
		String Expected = VerifyTitle.getText();
		return Expected;
		}
	
	// Verify Video File is displayed or not.
	public boolean Video_File_Present() {
		boolean isFileDisplayed = VideoFilepresent.isDisplayed();
		return 	isFileDisplayed;
}
}