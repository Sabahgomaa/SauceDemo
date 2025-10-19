package tests;

import common.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.PropertyManager;

public class BaseTest extends BrowserSetup {
    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("Chrome") String browser) {
        switch (browser.toLowerCase()){
            case "chrome":
                startChrome();
                break;
            case "edge":
                startEdge();
                break;
            case "firefox":
                startFirefox();
                break;
            default:
                startChrome();
                System.out.println("Trazeni browser nije podrzan, pokrenut je Chrome!");
        }

        driver.get(PropertyManager.getInstance().getUrl());
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    public WebDriver getDriver(){
        return driver;
    }
}
