package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#MainContent > ul > li > div > a")
    private WebElement sunglassesLink;

    public void clickSunglassesLink() {
        sunglassesLink.click();
    }

    @FindBy(id = "AddToCartText-product-template")
    private WebElement addToCart;
    public void clickAddToCartButton(){
        addToCart.click();
    }

    @FindBy(css = ".small--hide .cart__remove")
    private WebElement removeButton;

    public void clickRemoveButton(){
        removeButton.click();
    }

    @FindBy(css = ".cart--empty-message")
    private WebElement removeTextMessage;

    public String getRemoveTextMessage(){
        return removeTextMessage.getText();
    }

}
