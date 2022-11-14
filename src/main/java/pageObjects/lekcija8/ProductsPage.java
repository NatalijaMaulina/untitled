package pageObjects.lekcija8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    WebDriver parluks;
    private By pageTitle = By.className("title");
    private By cartButton = By.id("shopping_cart_container");

    public WebElement getCartButton(){
        return parluks.findElement(cartButton);
    }
    public ProductsPage(WebDriver parluks) {
        this.parluks = parluks;
    }
    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }


}
