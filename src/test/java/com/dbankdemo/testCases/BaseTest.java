package com.dbankdemo.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import com.dbankdemo.utilities.ReadConfig;

public class BaseTest {

    ReadConfig readConfig = new ReadConfig();

    public String baseURL = readConfig.getApplicationURL();
    public String username = readConfig.getUsername();
    public String password = readConfig.getPassword();
    public static WebDriver driver;

    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(@Optional String browser) {
        logger = Logger.getLogger("dbankdemo");
        PropertyConfigurator.configure("Log4j.properties");

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.chrome.driver", readConfig.getFirefoxPath());
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
