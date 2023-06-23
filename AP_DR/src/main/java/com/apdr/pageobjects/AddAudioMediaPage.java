package com.apdr.pageobjects;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;
import io.qameta.allure.Step;
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

public class AddAudioMediaPage extends TestBase {

    public AddAudioMediaPage(){
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
    Actions builder = new Actions(driver);


    //Audio link button locator
    @FindBy(xpath = "//*[@id=\"block-seven-content\"]/ul/li[1]/a/span")
    WebElement audioBtn;

    //choose file button locator
    @FindBy(id = "edit-field-media-audio-file-0-upload")
    WebElement chooseAudioFile;

    //Remove button locaotr
    @FindBy(name = "field_media_audio_file_0_remove_button")
    WebElement removeBtn;

    //Revision log message input field locator
    @FindBy(id = "edit-revision-log-message-0-value")
    WebElement revisionLogMsgInput;

    //submit button locator
    @FindBy(id = "edit-submit")
    WebElement saveBtn;



    public void clickOnAudioLink(){
        wait.until(ExpectedConditions.elementToBeClickable(audioBtn));
        audioBtn.click();
    }


    @Step(" User will click video link : {0}, User will add video detail and save : {1}  ")
    public void AddAudioFile() throws AWTException {
        wait.until(ExpectedConditions.elementToBeClickable(chooseAudioFile));
        builder.moveToElement(chooseAudioFile).click().build().perform();
        StringSelection ss = new StringSelection("C:\\Users\\sohaib.naseer\\git\\repository\\AP_DR\\AudioVideo\\APaudio.mp3");
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

    public void addRevisionLogMessage(){
        revisionLogMsgInput.sendKeys("You can do only one revision");
    }

    public void viewRemoveButton(){
        wait.until(ExpectedConditions.visibilityOf(removeBtn));
    }

    public void clickOnSaveButton(){
        saveBtn.click();
    }
}
