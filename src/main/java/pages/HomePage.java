package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".icon-login")
    private WebElement accountButton;
    @FindBy(css = ".search-bar__form-wrapper > form > input")
    private WebElement searchButton;
    @FindBy(css = ".site-nav__link--active")
    private WebElement catalogButton;

    public void clickCatalogButton(){
        catalogButton.click();
    }
    public void clickAccountButton(){
        accountButton.click();
    }
    public void clickSearchButton(){
        searchButton.click();
    }


}

