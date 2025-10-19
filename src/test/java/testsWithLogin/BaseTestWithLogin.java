package testsWithLogin;

import methods.LoginMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import tests.BaseTest;
import utilities.PropertyManager;

public class BaseTestWithLogin extends BaseTest {

    @Override
    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("Chrome") String browser) {
        super.setup(browser);

        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.performLogin(PropertyManager.getInstance().getValidUsername(), PropertyManager.getInstance().getValidPassword());
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}