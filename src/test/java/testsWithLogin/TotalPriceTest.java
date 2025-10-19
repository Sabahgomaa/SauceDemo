package testsWithLogin;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.ShoppingCartPage;
import dataGenerator.DataGenerator;
import methods.CheckoutMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TotalPriceTest extends BaseTestWithLogin{
    @Test
    public void checkPrice() {
        HomePage homePage = new HomePage(driver);
        homePage.addCheapestItemToCart();
        double cheapestItemPrice = homePage.returnCheapestItemPrice();

        double randomItemPrice = homePage.pickRandomItem();
        double expectedTotalPrice = cheapestItemPrice + randomItemPrice;

        homePage.navigateToShoppingCart();
        System.out.println("Current page: " + driver.getCurrentUrl());
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        System.out.println(driver.getPageSource());

        shoppingCartPage.navigateToCheckout();
        System.out.println("Current page: " + driver.getCurrentUrl());

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutMethods checkoutMethods = new CheckoutMethods(driver);
        checkoutMethods.fillInCheckoutDetails(DataGenerator.generateFirstName(), DataGenerator.generateLastName(), DataGenerator.generatePostalCode());

        Assert.assertEquals(checkoutPage.returnTotalPrice(), expectedTotalPrice);
    }
}
