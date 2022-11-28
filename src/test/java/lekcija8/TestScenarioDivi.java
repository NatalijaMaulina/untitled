package lekcija8;

import lekcija7.labDarbs.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.lekcija8.CartPage;
import pageObjects.lekcija8.CheckoutPage;
import pageObjects.lekcija8.LoginPage;
import pageObjects.lekcija8.ProductsPage;

public class TestScenarioDivi extends BaseTest {

    @Test
    public void testCheckoutPageMandatoryFields() throws InterruptedException {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage produktuLapa = new ProductsPage(parluks);
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");
        produktuLapa.getCartButton().click();
        CartPage grozaLapa = new CartPage(parluks);
        Assert.assertEquals(grozaLapa.getPageTitle().getText(), "YOUR CART");
        grozaLapa.getCheckoutButton().click();
        CheckoutPage checkoutLapa = new CheckoutPage(parluks);
        Assert.assertEquals(grozaLapa.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: First Name is required");
        checkoutLapa.inputFirstName( "Jana");
        checkoutLapa.clickContinueButton();
        Thread.sleep(5000);


    }



}
