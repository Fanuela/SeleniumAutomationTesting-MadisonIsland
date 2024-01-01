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
import pages.ProductsPage;
import pages.SearchPage;

public class AddToCart {
    private WebDriver driver;


    @Before
    public void initDriver() {
        driver = new ChromeDriver();
        System.setProperty("Web driver.chrome.driver", "resources/chrome-headless-shell.exe");

        driver.manage().window().maximize();
        driver.get(" https://madison-island.com/search");

    }
    @Test
    public void addToCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);


        searchPage.clickSearchField();
        searchPage.setSearchField("Watch");
        searchPage.clickSubmitButton();
        productsPage.clickSunglassesLink();
        productsPage.clickAddToCartButton();

    }

    @Test
    public void removeFromCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);


        searchPage.clickSearchField();
        searchPage.setSearchField("Watch");
        searchPage.clickSubmitButton();
        productsPage.clickSunglassesLink();
        productsPage.clickAddToCartButton();
        productsPage.clickRemoveButton();

//        driver.findElement(By.cssSelector("#SiteNav > li:nth-child(2)")).click();
//        driver.findElement(By.cssSelector(".grid--view-items > li:nth-child(1)")).click();
//        driver.findElement(By.id("AddToCart-product-template")).click();
//        driver.findElement(By.cssSelector(".small--text-left > p > a")).click();
//        WebElement emptyMessage = driver.findElement(By.cssSelector(".cart--empty-message"));
//        String actualText = emptyMessage.getText();

        String expectedText = "Your cart is currently empty.";
        Assert.assertEquals(expectedText,productsPage.getRemoveTextMessage());


    }

    @After
    public void quit(){
        driver.close();

    }
}
