package methods;

import Pages.CheckoutPage;
import org.openqa.selenium.WebDriver;

public class CheckoutMethods extends CheckoutPage {
    public CheckoutMethods(WebDriver driver) {
        super(driver);
    }

    public void fillInCheckoutDetails(String firstName, String lastName, String postalCode) {
        writeFirstName(firstName);
        writeLastName(lastName);
        writePostalCode(postalCode);
        clickContinueButton();
    }
}