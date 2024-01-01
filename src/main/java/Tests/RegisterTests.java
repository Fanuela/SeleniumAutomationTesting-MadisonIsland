package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class RegisterTests {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver.manage().window().maximize();
        driver.get(" https://madison-island.com/account/login");
    }

    @Test

    public void registerWithUsedCredentials() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        homePage.clickAccountButton();
        loginPage.clickRegisterLink();
        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Fanuela");
        driver.findElement(By.id("LastName")).sendKeys("Campan");
        driver.findElement(By.id("Email")).sendKeys("campan.fanuela@yahoo.com");
        driver.findElement(By.id("CreatePassword")).sendKeys("Campan.fanuela2020.com");
        driver.findElement(By.cssSelector("#create_customer > p > input")).click();
        Thread.sleep(1000);

        WebElement errorMessage = driver.findElement(By.cssSelector("#create_customer > div"));
        String expectedTest = "This email address is already associated with an account. If this account is yours, you can reset your password";
        String actualText = errorMessage.getText();
        Assert.assertEquals(expectedTest, actualText);

    }
}
//    @After
//    public void quit (){
//        driver.quit();
//    }
//}