package pageObjects.lekcija8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");

    private By loginButton = By.id("login-button");
    private By errorTextField = By.cssSelector("div.error-message-container h3");

    public void login(String username, String password){
        getUsernameField().sendKeys(username);
        getPasswodField().sendKeys(password);
        getLoginButton().click();
    }

    public String getErrorText(){
        return parluks.findElement(errorTextField).getText();
    }

    public WebElement getUsernameField(){
       return parluks.findElement(usernameInputField);
    }
    public WebElement getPasswodField(){
        return parluks.findElement(passwordInputField);
    }
    public WebElement getLoginButton(){
        return parluks.findElement(loginButton);
    }

    public LoginPage(WebDriver parluks) {
        super (parluks);
    }
}
