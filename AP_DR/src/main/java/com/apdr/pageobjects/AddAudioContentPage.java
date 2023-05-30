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

    @FindBy(linkText  = "Add Content") 
	 WebElement contentBtn;
    
    //Audio link locaotr
    @FindBy(linkText = "Audio")
    WebElement audioBtn;

    //create video text locator
    @FindBy(css = ".page-title")
    WebElement createTxt;

    //Speaker input field locator
    @FindBy(id = "edit-field-speaker-0-value")
    WebElement speakerInputField;

    //Intro input field locator
    @FindBy(id = "edit-field-intro-0-value")
    WebElement introInputField;

    //choose file button locator
    @FindBy(id = "edit-field-audio-file-0-upload")
    WebElement chooseFileBtn;

    //Remove button locator
    @FindBy(name = "field_audio_file_0_remove_button")
    WebElement removeBtn;

  //submit button locator
    @FindBy(id = "edit-submit")
    WebElement saveBtn;

	/*
	 * public void hoverOnContentButton() throws InterruptedException {
	 * wait.until(ExpectedConditions.elementToBeClickable(contentBtn));
	 * //builder.moveToElement(contentBtn).build().perform(); contentBtn.click();
	 * 
	 * }
	 */
    
    public String clickOnAudioButton(){
        wait.until(ExpectedConditions.elementToBeClickable(audioBtn));
        audioBtn.click();
        wait.until(ExpectedConditions.visibilityOf(createTxt));
        String message=createTxt.getText();
        return message;
    }

    public void add_Speaker_And_Intro(String _speaker, String _intro){
        wait.until(ExpectedConditions.elementToBeClickable(speakerInputField));
        speakerInputField.sendKeys(_speaker);
        introInputField.sendKeys(_intro);
    }

    public void add_Audio_file() throws AWTException {

        builder.moveToElement(chooseFileBtn).click().build().perform();
        StringSelection ss = new StringSelection("../QA_Automation_AP/AP_DR/AudioVideo/APaudio.mp3");
        //StringSelection ss = new StringSelection("C:\\Users\\sohaib.naseer\\Desktop\\APaudio.mp3");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        
        //imitate mouse events like ENTER, CTRL+C, CTRL+V

        Robot robot = new Robot();
        robot.setAutoDelay(500);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.setAutoDelay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void viewAudioRemoveButton(){
        wait.until(ExpectedConditions.visibilityOf(removeBtn));
    }
    public void clickOnSaveButton() throws InterruptedException{
    	Thread.sleep(10000);
        saveBtn.click();
    }

}
