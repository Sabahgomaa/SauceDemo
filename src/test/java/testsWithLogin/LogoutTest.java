package testsWithLogin;
import Pages.LoginPage;
import methods.HomePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTestWithLogin{
    @Test
    public void logout(){
        HomePageMethods homePageMethods = new HomePageMethods(driver);
//        homePageMethods.performLogout();
        homePageMethods.openBurgerMenu();
        homePageMethods.clickLogoutButton();
        LoginPage loginPage =new LoginPage(driver);
        loginPage.verifyLogout((WebElement) By.xpath("//*[@id=\"login-button\"]"));
    }
}
