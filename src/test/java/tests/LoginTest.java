package tests;

import Pages.HomePage;
import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{
    @Test(testName = "Login with valid credentials.", priority = 2, groups = {"Smoke", "Regression"})
    public void loginTest(){
        LoginMethods loginMethods=new LoginMethods(driver);
        loginMethods.performLogin(PropertyManager.getInstance().getValidUsername(), PropertyManager.getInstance().getValidPassword());
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(homePage.readTitle(),"Products");
    }
}
