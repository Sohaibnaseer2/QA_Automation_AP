package com.apdr.pageobjects;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdr.setup.TestBase;
import com.apdr.utalities.WaitUtils;

public class InitialPasswordContentPage extends TestBase {
	
	public InitialPasswordContentPage() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WaitUtils.DURATION));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions builder = new Actions(driver);

	@FindBy(xpath = "//td[@class='ng-binding'][normalize-space()='IMPORTANT NOTIFICATION: AP Backup Website']")
	WebElement Initiallink;
	
	@FindBy(xpath = "//a[contains(text(),'https://news.apbackup.org/auth/set-password?e=soha')]")
	WebElement MailpathClickInitialPass;
	
	
	/// Reset password

	@FindBy(xpath = "//a[@class='reset-pass']")
	WebElement Resetpassword;

	@FindBy(xpath = "//input[@id='mat-input-2']")
	WebElement Emailentered;

	@FindBy(xpath = "//button[@class='login-button']")
	WebElement Submitbtn;

	@FindBy(xpath = "//td[normalize-space()='[AP] Your AP Backup password request']")
	WebElement Mailnatorpath;
	
	@FindBy(xpath = "//a[contains(text(),'https://news.apbackup.org/auth/set-password?e=soha')]")
	WebElement MailpathClick; 

	@FindBy(xpath = "//input[@id='mat-input-0']")
	WebElement NewPassword;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	WebElement ConfirmNewPassword;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement Savebtn;
	
	public void Resetbuttonlink() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Resetpassword));
		Resetpassword.click();
		driver.getWindowHandle();

	}

	public void Enter_Email() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Emailentered));
		Emailentered.sendKeys("sohaib@mailinator.com");

	}

	public void Submit_BTN() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Submitbtn));
		Thread.sleep(3000);
		Submitbtn.click();		
		
	}

public void Mail_Initial_Click() throws InterruptedException {
		

		((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", "https://www.mailinator.com/v4/public/inboxes.jsp?to=sohaib");
		// Switch to the new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		//driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?to=sohaib");
		Thread.sleep(3000);
		Initiallink.click();
		Thread.sleep(3000);
		driver.switchTo().frame("texthtml_msg_body");
		MailpathClickInitialPass.click(); Thread.sleep(5000);
		
		
}
	public void Mail_Click() throws InterruptedException {
		

		((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", "https://www.mailinator.com/v4/public/inboxes.jsp?to=sohaib");
		// Switch to the new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		//driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?to=sohaib");
		Thread.sleep(3000);
		Mailnatorpath.click();
		Thread.sleep(3000);
		driver.switchTo().frame("texthtml_msg_body"); 
		MailpathClick.click();
		Thread.sleep(5000);
		tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));		
		
	}
	
	
	public void Enter_NewPassword() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(NewPassword));
		NewPassword.sendKeys("Test@123...");
	}

	public void Enter_ConfirmNewPassword() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ConfirmNewPassword));
		ConfirmNewPassword.sendKeys("Test@123...");
	}

	public void Click_SaveButton() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Savebtn));
		Savebtn.click();
	}
}
