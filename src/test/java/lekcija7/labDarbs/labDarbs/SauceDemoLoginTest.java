package lekcija7.labDarbs.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest {
     @Test
    private void testLogin(String username, String password, String expectedErrorMessage){
        WebElement lietotajVardsIevadesLauks =  parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys(username);
        WebElement parolesIevadesLauks =  parluks.findElement(By.id("password"));
        parolesIevadesLauks.sendKeys(password);
        WebElement loginPoga =  parluks.findElement(By.id("login-button"));
        loginPoga.click();
        WebElement errorPazinojums =  parluks.findElement(By.cssSelector("div.error-message-container h3"));
        String errorText = errorPazinojums.getText();
        Assert.assertEquals(errorText,expectedErrorMessage);

    }
    @Test
    public void testLoginWrongUsernameAndPassword(){
        testLogin("asadas","parole123","Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void testLoginEmptyUsernameAndPassword(){
        testLogin(" ","1234", "Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void testLoginWrongUsernameEmptyPassword(){
        testLogin("dasadad", " ", "Epic sadface: Username and password do not match any user in this service");
    }



}
