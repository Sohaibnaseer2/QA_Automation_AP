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

public class AddDocumentMediaFile extends TestBase {
    public AddDocumentMediaFile(){
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
    Actions builder = new Actions(driver);

    //document link test
    @FindBy(xpath = "//*[@id=\"block-seven-content\"]/ul/li[2]/a/span")
    WebElement documentLinkBtn;

    //Choose file button locator
    @FindBy(id = "edit-field-media-document-0-upload")
    WebElement chooseFileBtn;

    //Revision log message input field locator
    @FindBy(id = "edit-revision-log-message-0-value")
    WebElement revisionLoginput;

    //remove button locator
    @FindBy(name = "field_media_document_0_remove_button")
    WebElement removeBtn;

    //Submit button locator
    @FindBy(id = "edit-submit")
    WebElement saveBtn;

    public void clickOnDocumentLink(){
        wait.until(ExpectedConditions.elementToBeClickable(documentLinkBtn));
        documentLinkBtn.click();
    }


    @Step(" User will click video link : {0}, User will add video detail and save : {1}  ")
    public void AddMediaDocumentFile() throws AWTException {
        wait.until(ExpectedConditions.elementToBeClickable(chooseFileBtn));
        builder.moveToElement(chooseFileBtn).click().build().perform();
        StringSelection ss = new StringSelection("C:\\Users\\muhammad.sabahat\\Desktop\\ApVideoUpload\\Auto.pdf");
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
        wait.until(ExpectedConditions.visibilityOf(removeBtn));
    }

    public void clickOnSaveButton(){
        saveBtn.click();
    }
}
