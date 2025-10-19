package testsWithLogin;

import Pages.HomePage;
import Pages.ShoppingCartPage;
import org.testng.annotations.Test;

public class AddBackpackToCartTest  extends BaseTestWithLogin {
    @Test
    public void addBackpackTest() {
        HomePage homePage = new HomePage(driver);
        homePage.addBackpackToCart();
        homePage.navigateToShoppingCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.verifyBackpackIsInCart("Remove");
    }
}