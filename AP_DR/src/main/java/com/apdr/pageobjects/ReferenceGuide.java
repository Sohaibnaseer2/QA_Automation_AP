package com.apdr.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class ReferenceGuide extends TestBase {

	public ReferenceGuide() {

		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));

	@FindBy(xpath = "//a[normalize-space()='Reference Guide']")
	WebElement ClickRefguide;
	
	public void Click_Reference() {
		wait.until(ExpectedConditions.elementToBeClickable(ClickRefguide));
		ClickRefguide.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
