package pageObjects.lekcija8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    WebDriver parluks;
    public CheckoutPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    private By continueButton = By.id("continue");
    private By pageTitle = By.className("title");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    public void inputFirstName(String a){
        parluks.findElement(firstNameInputField).sendKeys(a);
    }

    public String getErrorText(){
        return parluks.findElement(errorText).getText();

    }

    public void clickContinueButton(){
        parluks.findElement(continueButton).click();

    }

    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }

}
