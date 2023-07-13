package com.apdr.pageobjects;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AddPhotoContentPage extends TestBase {

	public AddPhotoContentPage() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);

	// Photo link locator
	@FindBy(linkText = "Photo")
	WebElement photoBtn;

	// Slug input field locator
	@FindBy(id = "edit-title-0-value")
	WebElement imgSlug;

	// caption text area locator
	@FindBy(id = "edit-field-caption-0-value")
	WebElement captionTxtInput;

	// Instruction input field locator
	@FindBy(id = "edit-field-instructions-0-value")
	WebElement instructionInputField;

	// create video text locator
	@FindBy(css = ".page-title")
	WebElement createTxt;

	// calender input field locator
	@FindBy(id = "edit-field-created-0-value-date")
	WebElement calenderInputField;

	// Time Input field locator
	@FindBy(id = "edit-field-created-0-value-time")
	WebElement timeInputField;

	// country input field locator
	@FindBy(id = "edit-field-country-0-value")
	WebElement countryInputField;

	// state input field locator
	@FindBy(id = "edit-field-state-0-value")
	WebElement stateInputField;

	// city input field locator
	@FindBy(id = "edit-field-city-0-value")
	WebElement cityInputField;

	// Byline input field locator
	@FindBy(id = "edit-field-byline-0-value")
	WebElement byLineInput;

	// by title input field locator
	@FindBy(id = "edit-field-bytitle-0-value")
	WebElement byTitleInput;

	// source input field locator
	@FindBy(id = "edit-field-source-0-value")
	WebElement sourceInput;

	// credit line input field locator
	@FindBy(id = "edit-field-credit-line-0-value")
	WebElement creditLineInput;

	// Copywrite input field locator
	@FindBy(id = "edit-field-copyright-notice-0-value")
	WebElement copyWriteInput;

	// Transfer Input field locator
	@FindBy(id = "edit-field-transref-0-value")
	WebElement transferInput;

	// category drop down locator
	@FindBy(css = "a.chosen-single")
	WebElement categoryDropDown;

	// Supplementry category input field locator
	@FindBy(id = "edit-field-supplemental-category-0-value")
	WebElement supCategoryInput;

	// choose photo button locator
	@FindBy(id = "edit-field-photo-0-upload")
	WebElement chooseImgBtn;

	// Alternative text input field locator
	@FindBy(name = "field_photo[0][alt]")
	WebElement alternativeTxtInput;

	@FindBy(name = "field_photo_0_remove_button")
	WebElement removeBtn;

	// Save button locator
	@FindBy(id = "edit-submit")
	WebElement saveBtn;

	@FindBy(xpath = "//div[@class='field field--name-field-photo field--type-image field--label-visually_hidden']//div[@class='field__item']")
	WebElement PhotoPresent;
	
	
	public String clickOnPhotoLink() {
		wait.until(ExpectedConditions.elementToBeClickable(photoBtn));
		photoBtn.click();
		wait.until(ExpectedConditions.visibilityOf(createTxt));
		String message = createTxt.getText();
		return message;
	}

	public void addImgSlug(String slug) {
		imgSlug.sendKeys(slug);
	}

	public void add_Image_file() throws AWTException, InterruptedException {

		//builder.moveToElement(chooseImgBtn).click().build().perform();
		 //First line for Server side
		//chooseImgBtn.sendKeys("/home/AdminAccount/QA_Automation_AP/AP_DR/AudioVideo/AP Testimages.jpg");
		chooseImgBtn.sendKeys("C:\\Users\\sohaib.naseer\\git\\repository\\AP_DR\\AudioVideo\\AP Testimages.jpg");
		Thread.sleep(5000);
		 
		 
	}


	public void addImageCaptionAndInstructions(String caption, String instruction) {
		captionTxtInput.sendKeys(caption);
		instructionInputField.sendKeys(instruction);
	}

	public void addImageCountryDetails(String country, String state, String city) {

		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", countryInputField);
		countryInputField.sendKeys(country);
		stateInputField.sendKeys(state);
		cityInputField.sendKeys(city);
	}

	public void addImageBylineAndBytitle(String byline, String bytitle) {
		byLineInput.sendKeys(byline);
		byTitleInput.sendKeys(bytitle);
	}

	public void add_Image_Source_creditline_Copywrite_transref_SuppCategory(String source, String credit,
			String Copywrite, String Transref, String category) {
		js.executeScript("arguments[0].scrollIntoView();", transferInput);
		sourceInput.clear();
		sourceInput.sendKeys(source);
		creditLineInput.sendKeys(credit);
		copyWriteInput.sendKeys(Copywrite);
		transferInput.sendKeys(Transref);
		supCategoryInput.sendKeys(category);

	}

	public void Add_text_of_Alternative(String _Alttext) {
		wait.until(ExpectedConditions.elementToBeClickable(alternativeTxtInput));
		alternativeTxtInput.sendKeys(_Alttext);
	}

	public void clickOnSaveButton() throws InterruptedException
	{
		Thread.sleep(2000);
		saveBtn.click();
	}

	// Verify Photo is displayed or not.
		public boolean Photo_File_Present() {
			boolean isPhotoDisplayed = PhotoPresent.isDisplayed();
			return isPhotoDisplayed;
		}
	
}