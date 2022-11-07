package lekcija7.labDarbs.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoProductsTest extends BaseTest{

    @Test
    public void testAddProductToCart() throws InterruptedException {
        WebElement lietotajVardsIevadesLauks =  parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys("standard_user");

        WebElement parolesIevadesLauks =  parluks.findElement(By.id("password"));
        parolesIevadesLauks.sendKeys("secret_sauce");

        WebElement loginPoga =  parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement productPageTitle = parluks.findElement(By.cssSelector("span.title"));
        String actualPageTitle = productPageTitle.getText();

        Assert.assertEquals(actualPageTitle,"PRODUCTS");
        Thread.sleep(5000);
    }

}
