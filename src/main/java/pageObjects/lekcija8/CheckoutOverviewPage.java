package pageObjects.lekcija8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage extends BasePage{
    public CheckoutOverviewPage(WebDriver parluks) {

        super(parluks);
    }
    private By finishButton = By.id("finish");
    public WebElement finishButton(){
        return parluks.findElement(finishButton);
    }
    public void clickFinishButton() {
        parluks.findElement(finishButton).click();

    }

}
