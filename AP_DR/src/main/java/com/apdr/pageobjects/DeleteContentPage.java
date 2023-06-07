package com.apdr.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class DeleteContentPage extends TestBase {

    public DeleteContentPage() {
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
    Actions builder = new Actions(driver); 


    //Search field for Content Listing
    @FindBy(xpath = "//input[@id='edit-title']")
    WebElement searchfield;
    
    //Content Type
    @FindBy(id = "edit-type")
    WebElement ContentType;
  
    @FindBy(xpath = "//input[@id='edit-submit-content']")
    WebElement Filter;
    
    @FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
    WebElement View;
    
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/main/section/nav/ul/li[3]/a")
    WebElement Delete;

    @FindBy(xpath = "//input[@id='edit-submit']")
    WebElement Deletebutton;
    
	public void Titlesearchfield() {
		wait.until(ExpectedConditions.visibilityOf(searchfield));
		searchfield.sendKeys("Automation Script Banner");}
	
	public void contenttype() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ContentType));
		ContentType.click();
		Select select = new Select(ContentType);
		select.selectByValue("banner");
	}
    
	public void Filterclick()throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Filter));
		Thread.sleep(3000);
		Filter.click();}
	
	public void Viewclick() {
		wait.until(ExpectedConditions.visibilityOf(View));
		View.click();}
	
	public void Deleteclick() {
		wait.until(ExpectedConditions.elementToBeClickable(Delete));
		Delete.click();}
	
	public void Click_delete_button() {
		wait.until(ExpectedConditions.elementToBeClickable(Deletebutton));
		Deletebutton.click();}
}
