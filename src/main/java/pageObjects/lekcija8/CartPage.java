package pageObjects.lekcija8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver parluks;
    public CartPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    private By checkoutButton = By.id("checkout");
    private By pageTitle = By.className("title");


    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }

    public WebElement getCheckoutButton(){
        return parluks.findElement(checkoutButton);
    }


}
