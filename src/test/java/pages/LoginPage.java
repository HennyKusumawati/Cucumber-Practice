package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;

public class LoginPage extends CommonMethods {

    @FindBy(xpath = "//*[@id='txtUsername']")
    public WebElement usernameTextField;

    @FindBy(css="input#txtPassword")
    public WebElement passwordTextField;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;



    public void enterUsername() throws IOException {
        sendText(ConfigReader.read("userName"),loginPage.usernameTextField);
    }

    public void enterPassword() throws IOException {
        sendText(ConfigReader.read("password"),loginPage.passwordTextField);
    }
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
}
