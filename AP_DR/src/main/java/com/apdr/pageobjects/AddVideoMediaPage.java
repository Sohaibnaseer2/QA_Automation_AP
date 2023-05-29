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
import java.util.concurrent.TimeUnit;

public class AddVideoMediaPage extends TestBase {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    Actions builder = new Actions(driver);

    @FindBy(xpath = "//*[@id='block-seven-primary-local-tasks']/nav/nav/ul/li[2]/a")
    WebElement mediabutton;

    @FindBy(xpath = "//*[@id='block-seven-local-actions']/ul/li/a")
    WebElement addmedia;

    @FindBy(xpath = "//*[@id='block-seven-content']/ul/li[5]/a")
    WebElement addVideo;

    @FindBy(name = "files[field_media_video_file_0]")
    WebElement choosefile;

    @FindBy(xpath = "//*[@id='edit-revision-log-message-0-value']")
    WebElement revisionlog;

    @FindBy(xpath = "//*[@id='edit-submit']")
    WebElement submitbtn;

    //Remove button locaotr
    @FindBy(xpath = "//*[@id=\"edit-field-media-video-file-0-remove-button--xOhV4gV7pW4\"]")
    WebElement removeBtn;

    @FindBy(id = "edit-field-media-video-file-0--2HA-Kr3-Znk--label")
    WebElement uploadedfile;

    //content button locator
    @FindBy(css = "a.toolbar-icon.toolbar-icon-system-admin-content")
    WebElement contentBtn;

    public void clickOnContentButton(){
        wait.until(ExpectedConditions.elementToBeClickable(contentBtn)).click();
    }

    public AddVideoMediaPage(){
        PageFactory.initElements(driver, this);
    }

    @Step(" User will hit the url : {0}, User will click on the media button : {1}  ")
    public void ClickOnMediaButton(){
        wait.until(ExpectedConditions.elementToBeClickable(mediabutton));
        mediabutton.click();
        wait.until(ExpectedConditions.elementToBeClickable(addmedia));
        addmedia.click();
    }

    @Step(" User will click video link : {0}, User will add video detail and save : {1}  ")
    public void ClickVideoButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addVideo));
        addVideo.click();
    }

    @Step(" User will click video link : {0}, User will add video detail and save : {1}  ")
    public void AddVideoDetail() throws AWTException {
        wait.until(ExpectedConditions.elementToBeClickable(choosefile));
        builder.moveToElement(choosefile).click().build().perform();
        StringSelection ss = new StringSelection("C:\\Users\\sohaib.naseer\\Desktop\\APvideo.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //imitate mouse events like ENTER, CTRL+C, CTRL+V

        Robot robot = new Robot();
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    @Step(" User will click video link : {0}, User will add revision log detail and save : {1}  ")
    public void AddRevisionDetail(){
        revisionlog.click();
        revisionlog.sendKeys("I have upload the new video in video section.");

    }

    public void clickSaveButtonToStoreMedia() throws InterruptedException {
        Thread.sleep(15000);
        submitbtn.click();
    }
}
