package pageObjects.lekcija8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver parluks) {

        super(parluks);
    }

    private By cartButton = By.id("shopping_cart_container");


    public WebElement getCartButton(){
        return parluks.findElement(cartButton);
    }




}
