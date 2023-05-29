package com.apdr.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class Notifyimporteduserpage extends TestBase {
	
	public Notifyimporteduserpage() {

        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
    @FindBy(linkText = "Import/Notify Users")
   	WebElement ClicktabImportUsers;
    
    @FindBy(linkText = "//a[contains(text(),'Notify imported Users')]") 
	WebElement Notifyusers;
    
    public void Click_Importusertab() {
	wait.until(ExpectedConditions.elementToBeClickable(ClicktabImportUsers));
	ClicktabImportUsers.click();}
    
	 
	 public void Click_Notify_user() {
	 wait.until(ExpectedConditions.elementToBeClickable(Notifyusers));
	 Notifyusers.click();}
    
}
