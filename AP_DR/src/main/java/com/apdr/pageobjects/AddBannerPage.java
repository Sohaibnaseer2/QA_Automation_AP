package com.apdr.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class AddBannerPage extends TestBase {

	public AddBannerPage() {
	PageFactory.initElements(driver, this);
}
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));

//Audio link locator
@FindBy(linkText = "Banner")
WebElement BannerBtn;

//create video text locator
@FindBy(xpath= "//input[@id='edit-title-0-value']")
WebElement BannerTxt;

public void clickOnBannerButton(){
    wait.until(ExpectedConditions.elementToBeClickable(BannerBtn));
    BannerBtn.click();

}

public void Banner_Title(){
    wait.until(ExpectedConditions.elementToBeClickable(BannerTxt));
    BannerTxt.sendKeys("Automation Script Banner");
    

}




}
