package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "SearchInput")
    private WebElement searchField;
    public void clickSearchField(){
        searchField.click();
    }
    public void setSearchField(String value){
        searchField.sendKeys(value);
    }
    @FindBy(id = "SearchResultSubmit")
    private WebElement submitButton;
    public void clickSubmitButton(){
        submitButton.click();
    }

    @FindBy(css = ".h2 .visually-hidden")
    private WebElement searchResultMessage;
    public String getSearchResultMessage(){
        searchResultMessage.getText();
        return getSearchResultMessage();
    }

}
