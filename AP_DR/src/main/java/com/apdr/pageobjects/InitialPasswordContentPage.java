package com.apdr.pageobjects;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

	// @FindBy(xpath =
	// "//a[contains(text(),'https://newsqa.apbackup.org/auth/set-password?e=sohai')]")
	@FindBy(xpath = "//a[normalize-space()='https://newsqa.apbackup.org/auth/set-password']")
	WebElement MailpathClickInitialPass;

	/// Reset password

	@FindBy(xpath = "//a[@class='reset-pass']")
	WebElement Resetpassword;

	@FindBy(xpath = "//input[@id='mat-input-0']")
	WebElement Emailentered;

	@FindBy(xpath = "//button[@class='login-button']")
	WebElement Submitbtn;

	@FindBy(xpath = "//td[normalize-space()='[AP] Your AP Backup password request']")
	WebElement Mailnatorpath;

	@FindBy(xpath = "//a[contains(text(),'https://newsqa.apbackup.org/auth/set-password?e=soha')]")
	WebElement MailpathClick;

	@FindBy(xpath = "//input[@id='mat-input-0']")
	WebElement NewPassword;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	WebElement ConfirmNewPassword;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement Savebtn;

	// //div[@class='toast-message']
	 
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]")
	 public static WebElement VerifyPassword;

	
	public void Resetbuttonlink() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Resetpassword));
		Resetpassword.click();

	}

	public void Enter_Email(String _email) throws InterruptedException {
		Thread.sleep(30000);
		wait.until(ExpectedConditions.elementToBeClickable(Emailentered));
		Emailentered.sendKeys(_email);

	}

	public void Submit_BTN() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Submitbtn));
		Thread.sleep(2000);
		Submitbtn.click();
		Thread.sleep(6000);

	}

	public void Mail_Initial_Click() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.open(arguments[0])",
				"https://www.mailinator.com/v4/public/inboxes.jsp?to=sohaib21");
		// Switch to the new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));
		// driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?to=sohaib");
		Thread.sleep(3000);
		Initiallink.click();
		Thread.sleep(3000);
		driver.switchTo().frame("texthtml_msg_body");
		MailpathClickInitialPass.click();
		Thread.sleep(5000);
		tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));

	}

	public void Mail_Click() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("window.open(arguments[0])",
				"https://www.mailinator.com/v4/public/inboxes.jsp?to=sohaib21");
		// Switch to the new tab
		ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(tabs1.get(3));
		// driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?to=sohaib");
		Thread.sleep(3000);
		Mailnatorpath.click();
		Thread.sleep(3000);
		driver.switchTo().frame("texthtml_msg_body");
		MailpathClick.click();
		Thread.sleep(5000);
		tabs1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));

	}

	public void Enter_NewPassword(String _password) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(NewPassword));
		NewPassword.sendKeys(_password);

	}

	public void Enter_ConfirmNewPassword(String _password) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ConfirmNewPassword));
		ConfirmNewPassword.sendKeys(_password);
		Thread.sleep(2000);
	}

	public void Click_SaveButton() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Savebtn));	
		Savebtn.click();
		//String Actual = "Your New Password has been saved please log in.";
		//String Expected = VerifyPassword.getText();
		//Assert.assertEquals(Actual, Expected, "User is unable to reset the Password.");
		//Thread.sleep(6000);
				
	}
}
