package lekcija9;

import majasDarbs.lekcija9.MainPage;
import majasDarbs.lekcija9.SearchResults;
import majasDarbs.lekcija9.SignInModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends BaseTest {
    @Test
    public void testRegistrationWindowClosesCorrectly () throws InterruptedException {
        MainPage mainPage = new MainPage(parluks);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("b-mui-carousel--placeholder")));
        mainPage.clickSignInButton();

        SignInModal signInModal = new SignInModal(parluks);
        signInModal.waitForSignInModalAppear();
        signInModal.closeButtonClick();
        signInModal.waitForSignInModalToDissappear();

        Assert.assertEquals(signInModal.getModalWindow().size(), 0);


    }
    @Test
    public void testSearchFunctionality() throws InterruptedException {
        MainPage mainPage = new MainPage(parluks);
        mainPage.searchProduct("apelsīni");
        Thread.sleep(5000);
        SearchResults searchResultsPage = new SearchResults(parluks);
        List<WebElement> searchResultList = searchResultsPage.getSearchResultList();
        Assert.assertEquals(searchResultList.size(),6);

        mainPage.searchProduct("burkāni");
        Thread.sleep(5000);
        searchResultList = searchResultsPage.getSearchResultList();
        Assert.assertEquals(searchResultList.size(),23);

        for (WebElement webElement : searchResultList) {
            System.out.println(webElement.getText());

        }

    }


}
