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
import pages.LoginPage;

public class ForgottenPassword {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = new ChromeDriver();
        System.setProperty("Web driver.chrome.driver", "resources/chrome-headless-shell.exe");

        driver.manage().window().maximize();
        driver.get(" https://madison-island.com");
    }

    @Test
    public void recoverPassword() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);


        homePage.clickAccountButton();
        loginPage.clickForgotPasswordLink();
        loginPage.setRecoverEmailField("campan.fanuela@yahoo.com");
        loginPage.clickSubmitRecoverPasswordButton();
        Thread.sleep(2000);

        WebElement resetSuccessMessage = driver.findElement(By.id("ResetSuccess"));
        String expectedText = "We've sent you an email with a link to update your password.";
        String actualText = resetSuccessMessage.getText();
        Assert.assertEquals(expectedText,actualText);


    }
    @After
    public void quit (){
        driver.quit();
    }
}
