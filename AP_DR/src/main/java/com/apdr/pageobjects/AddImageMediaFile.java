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

public class AddImageMediaFile extends TestBase {
    public AddImageMediaFile(){
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, WaitUtils.elementWait);
    Actions builder = new Actions(driver);

    //Image link button locator
    @FindBy(xpath = "//*[@id=\"block-seven-content\"]/ul/li[3]/a/span")
    WebElement imageLinkBtn;

    //Choose Image media file button
    @FindBy(id = "edit-field-media-image-0-upload")
    WebElement chooseImage;

    //Alternative text input field locator
    @FindBy(css = "input.form-text.required")
    WebElement alternativeTxtInput;

    //Revision log message input field locator
    @FindBy(id = "edit-revision-log-message-0-value")
    WebElement revisionLoginput;

    //remove button locator
    @FindBy(name = "field_media_document_0_remove_button")
    WebElement removeBtn;

    //Submit button locator
    @FindBy(id = "edit-submit")
    WebElement saveBtn;

    public void clickOnImageLink(){
        wait.until(ExpectedConditions.elementToBeClickable(imageLinkBtn));
        imageLinkBtn.click();
    }


    @Step(" User will click video link : {0}, User will add video detail and save : {1}  ")
    public void AddMediaImageFile() throws AWTException {
        wait.until(ExpectedConditions.elementToBeClickable(chooseImage));
        builder.moveToElement(chooseImage).click().build().perform();
        StringSelection ss = new StringSelection("C:\\Users\\muhammad.sabahat\\Desktop\\ApVideoUpload\\logo.JPG");
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
        revisionLoginput.sendKeys("You can do only one revision");
    }

    public void viewRemoveButton(){
        wait.until(ExpectedConditions.elementToBeClickable(alternativeTxtInput));
        alternativeTxtInput.sendKeys("Let me add alternative text");
    }

    public void clickOnSaveButton(){
        saveBtn.click();
    }
}
