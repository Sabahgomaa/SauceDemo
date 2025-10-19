package testsWithLogin;

import Pages.HomePage;
import org.testng.annotations.Test;

public class AddRandomItemToCartTest extends BaseTestWithLogin{
    @Test
    public void addRandomItemToCart(){
        HomePage homePage= new HomePage(driver);
        homePage.addRandomToCart();
        homePage.navigateToShoppingCart().returnCartItemName();
    }
}
