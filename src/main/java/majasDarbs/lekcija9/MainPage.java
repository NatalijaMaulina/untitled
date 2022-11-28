package majasDarbs.lekcija9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    WebDriver parluks;
    WebDriverWait wait;

    public MainPage (WebDriver parluks){
        this.parluks = parluks;
        wait = new WebDriverWait(parluks, Duration.ofSeconds(10));
    }
    private By searchInputField = By.cssSelector("header.b-header input.b-search");
    private By signInButton = By.id("fti-header-login");
    public void clickSignInButton(){
        parluks.findElement(signInButton).click();
    }
    public void searchProduct(String productName){
        parluks.findElement(searchInputField).sendKeys( productName);
        parluks.findElement(searchInputField).sendKeys(Keys.ENTER);
    }

}
