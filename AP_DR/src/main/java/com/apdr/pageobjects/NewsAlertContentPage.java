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



public class NewsAlertContentPage extends TestBase {

    public NewsAlertContentPage() {
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions builder = new Actions(driver);
    
    
	/*
	 * @FindBy(linkText = "Add Content") WebElement contentBtn;
	 */
    
    //News alert link text locator
    @FindBy(linkText = "News Alert")
    WebElement newAlertLink;

    //create video text locator
    @FindBy(css = ".page-title")
    WebElement createTxt;

    //slug input field locator
    @FindBy(id = "edit-title-0-value")
    WebElement slugInput;

    //Alert input field locator
    @FindBy(id = "edit-field-alert-0-value")
    WebElement alertInput;

    //Date line input field locator
    @FindBy(id = "edit-field-dateline-0-value")
    WebElement dateLineInput;

    //category drop down
    @FindBy(xpath = "//*[@id='edit_field_category_chosen']/a/div/b")
    WebElement category;

    //Arts and entertainment drop down value locator
    @FindBy(xpath = "//*[@id='edit_field_category_chosen']/div/ul/li[2]")
    WebElement   artsAndEntertainment;

    //Eds note input field locator
    @FindBy(id = "edit-field-eds-note-0-value")
    WebElement edsNoteInput;

    //save button locator
    @FindBy(id = "edit-submit")
    WebElement saveBtn;

	
	/*
	 * public void hoverOnContentButton() throws InterruptedException {
	 * wait.until(ExpectedConditions.elementToBeClickable(contentBtn));
	 * builder.moveToElement(contentBtn).build().perform(); contentBtn.click();}
	 */
	 
    
    public String clickOnNewsAlertLink(){
        wait.until(ExpectedConditions.elementToBeClickable(newAlertLink));
        newAlertLink.click();
        wait.until(ExpectedConditions.visibilityOf(createTxt));
        String message=createTxt.getText();
        return message;
    }

    public void addSlug(String slug){
        slugInput.sendKeys(slug);
    }
    public void addAlert(String alert){
        alertInput.sendKeys(alert);
    }
    public void addDateLine(String dateLine){
        dateLineInput.sendKeys(dateLine);
    }


  /*  public void selectCategory(){
        builder.moveToElement(categoryDropDown).build().perform();
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='edit_field_category_chosen']/div/ul/li"));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("Business")) {
                list.get(i).click();
                break;
            }
        }
    }*/

    public void selectCategory() throws InterruptedException {
        category.click();
        artsAndEntertainment.click();
    }

    public void addEdsNote(String edsNote){
        edsNoteInput.sendKeys(edsNote);
    }

    public void clickSaveButton(){

        js.executeScript("arguments[0].scrollIntoView();", saveBtn);
        saveBtn.click();
    }
}
