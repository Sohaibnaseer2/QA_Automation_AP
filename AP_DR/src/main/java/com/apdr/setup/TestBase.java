package com.apdr.setup;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.apdr.utalities.WaitUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase {

	// Selenium Webdriver variables
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com" + "/apdr/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {

			ChromeOptions options = new ChromeOptions();
			
			/*
			 * options.addArguments("--no-sandbox"); options.addArguments("--headless");
			 * options.addArguments("window-size=1200,1100");
			 */
			 
			  driver = new ChromeDriver(options);

		}

			driver.manage().window().maximize();
		 //driver.manage().window().setSize(new Dimension(1200,1100));

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtils.IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WaitUtils.PAGE_LOAD_TIMEOUT));

		driver.get(prop.getProperty("url"));
	}

	public static WebDriver getDriver() {

		return driver;
	}

}
