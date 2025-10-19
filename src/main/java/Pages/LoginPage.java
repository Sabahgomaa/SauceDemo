package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends  BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By usernameFieldBy = By.id("user-name");
    By passwordFieldBy = By.id("password");
    By loginButtonBy = By.xpath("//*[@id=\"login-button\"]");
    By errorNotificationBy = By.xpath("//h3[@data-test='error']");

    public void writeUsername(String username){
        writeText(usernameFieldBy, username);
    }
    public void writePassword(String password){
        writeText(passwordFieldBy, password);
    }
    public void clickLoginButton(){
        clickElement(loginButtonBy);
    }
    public void verifyFailedLogin(String expectedText){
        Assert.assertEquals(readTextFromElement(errorNotificationBy), expectedText);
    }
    public void verifyLogout(WebElement expectedText){

        Assert.assertEquals( new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(loginButtonBy)), loginButtonBy);
    }

//    Assert.assertEquals(readAttributeValueAsText(loginButtonBy, "value"), expectedText);
    }
