package testsWithLogin;

import Pages.HomePage;
import Pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.Random;

public class AddMostExpensiveItemTest extends BaseTestWithLogin {
    @Test
    public void addMostExpensiveItem(){
        HomePage homePage=new HomePage(driver);
        ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
        String nCart=shoppingCartPage.returnCartItemName();
        System.out.println(nCart);
        homePage.addMostExpensiveItemToCart();
        String itemName = homePage.returnMostExpensiveItemName();
        System.out.println(itemName);
        homePage.navigateToShoppingCart();
        String nCart2=shoppingCartPage.returnCartItemName();
        System.out.println(nCart2);
        Reporter.log("OVO MI LOGUJEMO!");
        Assert.assertEquals(shoppingCartPage.returnCartItemName(), itemName);
    }
}
