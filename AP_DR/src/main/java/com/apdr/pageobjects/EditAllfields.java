package com.apdr.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class EditAllfields extends TestBase {

	public EditAllfields() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/section[1]/nav[1]/ul[1]/li[2]/a[1]")
	WebElement EditBtn;
	
	public void Click_on_Edit_Button() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EditBtn));
		Thread.sleep(3000);
		EditBtn.click();
	}
	
	
}
