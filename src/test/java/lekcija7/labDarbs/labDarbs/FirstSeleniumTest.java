package lekcija7.labDarbs.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver parluks;
    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.navigate().to("https://www.lu.lv/");
        parluks.manage().window().maximize();

    }
    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
    }
    @Test
    public void testFirstWebPage(){
        System.out.println("Pirmais Selenium tests");
        parluks.quit();
    }
    @Test
    public void testPageTitle(){
        String nosaukums = parluks.getTitle();
        Assert.assertEquals(nosaukums, "Latvijas Universitāte");
        parluks.quit();
    }


}
