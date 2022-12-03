package pageObjects.lekcija8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver parluks) {

        super(parluks);
    }

    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    public void inputFirstName(String a){
        parluks.findElement(firstNameInputField).sendKeys(a);
    }

    private By lastNameInputField = By.id("last-name");

    public void inputLastName(String a){
        parluks.findElement(lastNameInputField).sendKeys(a);
    }

    private By zipInputField = By.id("postal-code");

    public void inputZip(String a){
        parluks.findElement(zipInputField).sendKeys(a);
    }

    public String getErrorText(){
        return parluks.findElement(errorText).getText();

    }

    public void clickContinueButton(){
        parluks.findElement(continueButton).click();

    }


}
