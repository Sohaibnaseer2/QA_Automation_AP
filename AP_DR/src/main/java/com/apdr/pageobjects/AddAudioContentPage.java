package com.apdr.pageobjects;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;
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

public class AddAudioContentPage extends TestBase {

	public AddAudioContentPage() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	Actions builder = new Actions(driver);

	// Audio link locator
	@FindBy(linkText = "Audio")
	WebElement audioBtn;

	// create video text locator
	@FindBy(css = ".page-title")
	WebElement createTxt;

	@FindBy(id = "edit-title-0-value")
	WebElement slugInputField;
	
	// Speaker input field locator
	@FindBy(id = "edit-field-speaker-0-value")
	WebElement speakerInputField;

	// Intro input field locator
	@FindBy(id = "edit-field-intro-0-value")
	WebElement introInputField;

	// choose file button locator

	@FindBy(name = "files[field_audio_file_0]")
	// @FindBy(xpath = "//input[@id='edit-field-audio-file-0-upload']")
	WebElement chooseFileBtn;

	// Remove button locator
	
	@FindBy(name = "field_audio_file_0_remove_button")
	WebElement removeBtn;

	// submit button locator
	@FindBy(id = "edit-submit")
	WebElement saveBtn;

	// Verify Audio File present or not.

	@FindBy(xpath = "//audio[@controls='controls']")
	WebElement AudioFilepresent;

	public String clickOnAudioButton() {
		wait.until(ExpectedConditions.elementToBeClickable(audioBtn));
		audioBtn.click();
		wait.until(ExpectedConditions.visibilityOf(createTxt));
		String message = createTxt.getText();
		return message;
	}

	public void addSlug(String slug) {
		slugInputField.sendKeys(slug);
		// String ValueSlug = slugInputField.getText();
		// return ValueSlug;
	}
	public void add_Speaker_And_Intro(String _speaker, String _intro) {
		wait.until(ExpectedConditions.elementToBeClickable(speakerInputField));
		speakerInputField.sendKeys(_speaker);
		introInputField.sendKeys(_intro);
	}

	public void add_Audio_file() throws AWTException, InterruptedException {
		// builder.moveToElement(chooseFileBtn).click().build().perform();
		// chooseFileBtn.click();

		// First line for Server side
		 //chooseFileBtn.sendKeys("/home/AdminAccount/DEV/QA_Automation_AP/AP_DR/AudioVideo/APaudio.mp3");
		chooseFileBtn.sendKeys("C:\\Users\\sohaib.naseer\\git\\repository\\AP_DR\\AudioVideo\\APaudio.mp3");
		Thread.sleep(8000);
	}

	public void viewAudioRemoveButton() {
		wait.until(ExpectedConditions.visibilityOf(removeBtn));
		
	}

	public String clickOnSaveButton() throws InterruptedException {
		saveBtn.click();
		Thread.sleep(2000);
		String message = driver.getTitle();
		return message;

	}

	// Verify Audio File is displayed or not.
	public boolean Audio_File_Present() {
		boolean isFileDisplayed = AudioFilepresent.isDisplayed();
		return isFileDisplayed;
	}
////////////////Edit Test cases ////////////
	
	public void addSlug1(String slug) {
		slugInputField.clear();
		slugInputField.sendKeys(slug);
		
		// String ValueSlug = slugInputField.getText();
		// return ValueSlug;
	}
	
	public void add_Speaker_And_Intro1(String _speaker, String _intro) {
		wait.until(ExpectedConditions.elementToBeClickable(speakerInputField));
		speakerInputField.clear();
		speakerInputField.sendKeys(_speaker);
		introInputField.clear();
		introInputField.sendKeys(_intro);
	}

	public void add_Audio_file1() throws AWTException, InterruptedException {
		// builder.moveToElement(chooseFileBtn).click().build().perform();
		// chooseFileBtn.click();

		// First line for Server side
		//chooseFileBtn.sendKeys("/home/AdminAccount/DEV/QA_Automation_AP/AP_DR/AudioVideo/APaudio.mp3");
		chooseFileBtn.sendKeys("C:\\Users\\sohaib.naseer\\git\\repository\\AP_DR\\AudioVideo\\UpdatedAudio.mp3");
		wait.until(ExpectedConditions.visibilityOf(removeBtn));
		Thread.sleep(3000);
	}
	
	public void RemoveAudioButton1() {
		wait.until(ExpectedConditions.visibilityOf(removeBtn));
		removeBtn.click();
	}
	
	public void clickOnSaveButton1() throws InterruptedException {
		saveBtn.click();
		/*
		 * Thread.sleep(5000); String message = driver.getTitle(); return message;
		 */
	}
}
