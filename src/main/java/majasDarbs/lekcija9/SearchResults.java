package majasDarbs.lekcija9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResults {
    WebDriver parluks;
    WebDriverWait wait;

    public SearchResults (WebDriver parluks){
        this.parluks = parluks;
        wait = new WebDriverWait(parluks, Duration.ofSeconds(10));
    }

   private By searchResultList = By.cssSelector("div.b-product--wrap2");

    public List<WebElement> getSearchResultList (){
        return parluks.findElements(searchResultList);

    }

}
