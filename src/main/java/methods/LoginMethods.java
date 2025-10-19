package methods;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginMethods extends LoginPage {
    public LoginMethods(WebDriver driver) {
        super(driver);
    }
    public void performLogin(String username, String password){
        writeUsername(username);
        writePassword(password);
        clickLoginButton();
    }
}
