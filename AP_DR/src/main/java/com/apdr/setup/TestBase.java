package com.apdr.setup;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com" +
                    "/apdr/config/config.properties");
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
        	WebDriverManager.chromedriver().setup();
			
			 //ChromeOptions options = new ChromeOptions(); 
			 //options.setHeadless(true);
				/*
				 * options.addArguments("--headless=new");
				 * options.addArguments("--disable-extensions");
				 * options.addArguments("--disable-dev-shm-usage");
				 * options.addArguments("--no-sandbox");
				 * options.addArguments("window-size=800,600");
				 */
			// options.addArguments("--Headless=new");
        	 
            /*System.setProperty("webdriver.chrome.driver","chrome/chromedriver.exe");*/
//                    
            driver = new ChromeDriver();

        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
    
        //driver.manage().timeouts().pageLoadTimeout(WaitUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(WaitUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
		/*
		 * Dimension currentDimension = driver. manage(). window(). getSize(); int
		 * height = currentDimension. getHeight(); int width = currentDimension.
		 * getWidth(); System. out. println("Current height: "+ height); System. out.
		 * println("Current width: "+width);
		 */
    }

    public static WebDriver getDriver() {

        return driver;
    }

  

}

