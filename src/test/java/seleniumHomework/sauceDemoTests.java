package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.lekcija8.*;

import java.time.Duration;

public class sauceDemoTests {
    public WebDriver parluks;
    WebDriverWait wait;

    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.navigate().to(" https://www.saucedemo.com/");
        parluks.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        parluks.manage().window().maximize();
        wait = new WebDriverWait(parluks, Duration.ofSeconds(10));
        LoginPage loginPage  = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");


    }
    @AfterMethod
    public void tearDownBrowser(){

        parluks.quit();
    }
    @Test
    public void testOrder (){
        ProductsPage produktuLapa = new ProductsPage(parluks);
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");
        produktuLapa.clickAddToCartButton();
        CartPage grozaLapa = new CartPage(parluks);
        produktuLapa.getCartButton().click();
        Assert.assertEquals(grozaLapa.getPageTitle().getText(), "YOUR CART");
        grozaLapa.getCheckoutButton().click();
        CheckoutPage checkoutLapa = new CheckoutPage(parluks);
        Assert.assertEquals(grozaLapa.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        checkoutLapa.inputFirstName( "Natālija");
        checkoutLapa.inputLastName("Mauļina");
        checkoutLapa.inputZip("2114");
        checkoutLapa.clickContinueButton();
        CheckoutOverviewPage checkOutOverViewLapa = new CheckoutOverviewPage(parluks);
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "CHECKOUT: OVERVIEW");
        checkOutOverViewLapa.clickFinishButton();
        CheckoutSuccessPage checkOutSuccessLapa = new CheckoutSuccessPage(parluks);
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "CHECKOUT: COMPLETE!");
        checkOutSuccessLapa.clickBackButton();


    }




}
