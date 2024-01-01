package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {
    private WebDriver driver;


    @Before
    public void initDriver() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver.manage().window().maximize();
        driver.get(" https://madison-island.com");


    }



    @Test
    public void loginWithValidCredentials() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        homePage.clickAccountButton();
        loginPage.clickEmailField();
        loginPage.setEmailField("campan.fanuela@yahoo.com");
        loginPage.setPasswordField("logintest@yahoo.com");
        loginPage.clickSingInButton();
        Thread.sleep(1000);
        loginPage.clickRecaptcha();

        String expectedResults = "Fanuela Campan";
        String actualResults = accountPage.getWelcomeText();
        Assert.assertEquals(expectedResults,actualResults);
    }


//    @After
//    public void quit (){
//        driver.quit();
//    }
}
