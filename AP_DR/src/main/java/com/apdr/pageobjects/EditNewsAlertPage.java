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

public class EditNewsAlertPage extends TestBase {

	public EditNewsAlertPage() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);


	// Click on Edit button for NewsAlert page
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/main/section/nav/ul/li[2]/a")
	WebElement ClickonEditTab;
	
	
	public void NewsAlertEditButton() {
		wait.until(ExpectedConditions.visibilityOf(ClickonEditTab));
		ClickonEditTab.click();}
	
	
	}
	


