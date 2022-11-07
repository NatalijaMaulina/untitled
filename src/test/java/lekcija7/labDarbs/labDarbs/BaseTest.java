package lekcija7.labDarbs.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver parluks;
    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.navigate().to(" https://www.saucedemo.com/");
        parluks.manage().window().maximize();

    }
    @AfterMethod
    public void tearDownBrowser(){

        parluks.quit();
    }

}
