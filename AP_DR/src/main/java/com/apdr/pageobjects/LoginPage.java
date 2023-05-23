package com.apdr.pageobjects;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends TestBase {
	
    WebDriverWait wait = new WebDriverWait(driver, WaitUtils.elementWait);

    //Email address input field locator
    @FindBy(id = "edit-name")
    WebElement emailAddressField;

    // Password Input field locator
    @FindBy(id = "edit-pass")
    WebElement passwordField;

    //Login Button locator
    @FindBy(id = "edit-submit")
    WebElement loginBtn;


    public LoginPage() {
        PageFactory.initElements(driver, this);

    }

    //Enter user Name and Password
    @Step(" User will hit the url : {0}, when user will land on the Login page then user will enter email and password : {1}  ")
    public void enterUserEmailAndPassword(String adminEmail, String adminPass) {
        wait.until(ExpectedConditions.elementToBeClickable(emailAddressField));
        emailAddressField.sendKeys(adminEmail);
        passwordField.sendKeys(adminPass);
    }

    @Step(" User will hit the url : {0}, User will click on the login button : {1}  ")
    public void clickOnLoginButton(){
        loginBtn.click();
    }




}
