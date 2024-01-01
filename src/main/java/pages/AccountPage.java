package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".medium-up--one-third > p:nth-child(2)")
    private WebElement welcomeText;
    public String getWelcomeText() {
        welcomeText.getText();
        return getWelcomeText();
    }
}
