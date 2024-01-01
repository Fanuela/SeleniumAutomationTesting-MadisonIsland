package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "CustomerEmail")
    private WebElement emailField;
    @FindBy(id = "CustomerPassword")
    private WebElement passwordField;
    @FindBy(css = "#customer_login > div > input")
    private WebElement signInButton;
    @FindBy(id = "RecoverPassword" )
    private WebElement forgotPasswordLink;
    @FindBy(id = "RecoverEmail")
    private WebElement recoverEmailField;
    @FindBy(css = " div.text-center > p> input")
    private WebElement submitRecoverPasswordButton;
    @FindBy(id = "customer_register_link")
    private WebElement registerLink;
    @FindBy(css = "#recaptcha-anchor > div.recaptcha-checkbox-borderAnimation")
    private WebElement recaptchaCheckBox;



    public void clickEmailField(){
        emailField.click();
    }
    public void setEmailField(String text){
        emailField.sendKeys(text);
    }

    public void setPasswordField(String value){
        passwordField.sendKeys(value);
    }

    public void clickSingInButton(){
        signInButton.click();
    }

    public void clickForgotPasswordLink(){
        forgotPasswordLink.click();
    }

    public void setRecoverEmailField (String value){
        recoverEmailField.sendKeys(value);
    }
    public void clickSubmitRecoverPasswordButton(){
        submitRecoverPasswordButton.click();
    }
    public void clickRegisterLink(){
        registerLink.click();
    }

    public void clickRecaptcha(){
        recaptchaCheckBox.click();
    }
}
