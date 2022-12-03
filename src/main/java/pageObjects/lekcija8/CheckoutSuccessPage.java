package pageObjects.lekcija8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage extends BasePage {
    public CheckoutSuccessPage(WebDriver parluks) {

        super(parluks);
    }
    private By backButton = By.id("back-to-products");
    public WebElement backButton(){
        return parluks.findElement(backButton);
    }
    public void clickBackButton() {
        parluks.findElement(backButton).click();

    }
}