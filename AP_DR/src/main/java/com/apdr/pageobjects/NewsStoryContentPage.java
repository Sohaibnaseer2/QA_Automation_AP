package com.apdr.pageobjects;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewsStoryContentPage extends TestBase {

    public NewsStoryContentPage() {
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    JavascriptExecutor js = (JavascriptExecutor) driver;


    //News alert link text locator
    @FindBy(linkText = "News Story")
    WebElement newStoryLink;

    //create video text locator
    @FindBy(css = ".page-title")
    WebElement createTxt;

    @FindBy(id = "edit-title-0-value")
    WebElement slugInputField;

    @FindBy(id = "edit-field-headline-0-value")
    WebElement headlineInputField;

    @FindBy(id = "edit-field-summary-0-value")
    WebElement summaryInputField;

    @FindBy(id = "edit-body-0-value")
    WebElement bodyInputField;

    @FindBy(id = "edit-field-byline-0-value")
    WebElement byLineInput;

    @FindBy(id = "edit-field-bytitle-0-value")
    WebElement byTitileInput;

    @FindBy(id = "edit-field-dateline-0-value")
    WebElement dateLineInput;


    //category drop down
    @FindBy(xpath = "//*[@id='edit_field_category_chosen']/a/div/b")
    WebElement category;

    //Arts and entertainment drop down value locator
    @FindBy(xpath = "//*[@id='edit_field_category_chosen']/div/ul/li[2]")
    WebElement   artsAndEntertainment;

    @FindBy(id = "edit-field-eds-note-0-value")
    WebElement edsNoteInput;
    //Save button locator
    @FindBy(id = "edit-submit")
    WebElement saveBtn;

    public String clickOnNewsStoryLink(){
        wait.until(ExpectedConditions.elementToBeClickable(newStoryLink));
        newStoryLink.click();
        wait.until(ExpectedConditions.visibilityOf(createTxt));
        String message=createTxt.getText();
        return message;
    }

    public void addSlug(String _slug){
        slugInputField.sendKeys(_slug);
    }

    public void addHeadLine(String _headline){
        headlineInputField.sendKeys(_headline);
    }

    public void addSummary(String _summary){
        summaryInputField.sendKeys(_summary);
    }

    public void addBody(String _body){
        bodyInputField.sendKeys(_body);
    }

    public void addByLineAndByTitle(String _byline, String _bytitle){
        js.executeScript("arguments[0].scrollIntoView();", edsNoteInput);
        byLineInput.sendKeys(_byline);
        byTitileInput.sendKeys(_bytitle);
    }
    public void addDateline(String _dateline){
        dateLineInput.sendKeys(_dateline);
    }

    public void selectCategory() {
        category.click();
        artsAndEntertainment.click();
    }

    public void addEdsNote(String _eds){
        edsNoteInput.sendKeys(_eds);
    }

    public void clickOnSaveButton(){

        saveBtn.click();
    }

}


