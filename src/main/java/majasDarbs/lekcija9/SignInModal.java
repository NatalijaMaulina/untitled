package majasDarbs.lekcija9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SignInModal {
    WebDriver parluks;
    WebDriverWait wait;


    public SignInModal(WebDriver parluks) {
        this.parluks = parluks;
        wait = new WebDriverWait(parluks, Duration.ofSeconds(10));

    }
    By modalWindow = By.cssSelector("div.b-login-modal");
    By closeButton = By.cssSelector("div.b-login-modal button.close");
    public void closeButtonClick(){
        parluks.findElement(closeButton).click();
    }
    public List<WebElement> getModalWindow(){
        return parluks.findElements(modalWindow);
    }
    public void waitForSignInModalAppear (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalWindow));
    }
    public void waitForSignInModalToDissappear (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalWindow));
    }
}
