package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SearchPage;

public class SearchList {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver.manage().window().maximize();
        driver.get(" https://madison-island.com/search");
    }
    @Test
    public void searchProduct() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);

        searchPage.clickSearchField();
        searchPage.setSearchField("AVIATOR");
        searchPage.clickSubmitButton();
        Thread.sleep(2000);

//        Assert.assertEquals(searchPage.getSearchResultMessage(), "1 RESULT FOR AVIATOR");
    }
    @After
    public void quit (){
        driver.quit();
    }

}
