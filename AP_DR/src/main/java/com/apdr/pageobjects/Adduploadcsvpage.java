package com.apdr.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class Adduploadcsvpage extends TestBase {
	
	public Adduploadcsvpage() {
		PageFactory.initElements(driver, this);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, WaitUtils.elementWait);
	Actions builder = new Actions(driver);
	
	@FindBy(linkText = "Upload User's CSV")
	WebElement Uploaduserscsvfile;
	
	
	@FindBy(xpath = "//input[@id='edit-field-media-document-0-upload']")
    WebElement selecfileBtn;
	
	public void Uploaduserscsvfile() {
		wait.until(ExpectedConditions.elementToBeClickable(Uploaduserscsvfile));
		Uploaduserscsvfile.click();}
	
	
    public void FileClickable() throws AWTException {
    	builder.moveToElement(selecfileBtn).click().build().perform();
        StringSelection ss = new StringSelection("C:\\Users\\sohaib.naseer\\Desktop\\TEstUserfile.csv");
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
    	
	}

