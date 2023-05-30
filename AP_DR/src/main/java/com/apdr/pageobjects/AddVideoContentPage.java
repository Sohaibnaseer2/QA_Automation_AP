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

    //video link text locator
    @FindBy(linkText = "Video")
    WebElement videoBtn;

    //create video text locator
    @FindBy(css = ".page-title")
    WebElement createTxt;

    //Slug input field locator
    @FindBy(id = "edit-title-0-value")
    WebElement slugInputField;

    //Headline Input field locator
    @FindBy(id = "edit-field-headline-0-value")
    WebElement headlineInputField;

    //Source Input field locator
    @FindBy(id = "edit-field-source-0-value")
    WebElement sourceInputField;

    //Add files button locator to upload video file
    @FindBy(id = "edit-field-video-file-2-0-upload--2_browse")
    WebElement addFileButton;

    //remove button locator
    @FindBy(xpath = "//input[@id='edit-field-video-file-2-0-remove-button--5B0MBvXCuTQ']")
    WebElement removeBtn;

    //Body Input Field locator
    @FindBy(id = "edit-body-0-value")
    WebElement bodyInputField;

    //Save as Drop down field locator
    @FindBy(id = "edit-moderation-state-0-state")
    WebElement saveAsDropDown;

    //Save button locator
    @FindBy(id = "edit-submit")
    WebElement saveBtn;


    public String clickOnVideoButton(){
        wait.until(ExpectedConditions.elementToBeClickable(videoBtn));
        videoBtn.click();
        wait.until(ExpectedConditions.visibilityOf(createTxt));
        String message=createTxt.getText();
        return message;
    }

    public void addSlug(String slug){
        slugInputField.sendKeys(slug);

    }
    public void add_Headline_Source( String headline, String source){
        headlineInputField.sendKeys(headline);
        sourceInputField.clear();
        sourceInputField.sendKeys(source);
    }

    public void addVideoFileFromLocalRepository() throws AWTException {

        addFileButton.click();
       // addFileButton.sendKeys("C:\\Users\\muhammad.sabahat\\Desktop\\ApVideoUpload\\ApDr.mp4");
        StringSelection ss = new StringSelection("../QA_Automation_AP/AP_DR/AudioVideo/APvideo.mp4");
      // StringSelection ss = new StringSelection("C:\\Users\\sohaib.naseer\\Desktop\\APvideo.mp4");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V

        Robot robot = new Robot();
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.setAutoDelay(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.setAutoDelay(1000);
    }

    public void addBodyForVideo(String body) throws InterruptedException{
    	Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);",bodyInputField);
        bodyInputField.sendKeys(body);
    }	

	  public void viewRemoveButton() throws InterruptedException{
		  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOf(removeBtn));
	  }
	 
     public void clickOnSaveButton() {

        saveBtn.click();
    }

}
