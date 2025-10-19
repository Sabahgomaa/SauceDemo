package methods;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageMethods extends HomePage {
    public HomePageMethods(WebDriver driver) {
        super(driver);
    }
    public void performLogout(){
        openBurgerMenu();
        clickLogoutButton();
    }
}
