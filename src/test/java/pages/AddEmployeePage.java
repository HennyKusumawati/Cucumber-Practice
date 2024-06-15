package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
    @FindBy(css="input#firstName")
    public WebElement firstNameLoc;

    @FindBy(xpath = "//*[@id='middleName']")
    public WebElement middleNameLoc;

    @FindBy(id = "lastName")
    public WebElement lastNameLoc;

    @FindBy(id = "btnSave")
    public  WebElement saveButton;

    @FindBy(id = "photofile")
    public  WebElement photograph;

    @FindBy(id = "chkLogin")
    public  WebElement checkBox;

    @FindBy(id = "user_name")
    public  WebElement userName;

    @FindBy(id = "user_password")
    public  WebElement password;


    @FindBy(id = "re_password")
    public  WebElement confirmPass;

    @FindBy(xpath = "//span[text()='Very Weak']")
    public WebElement vwStrengthMsg;

    @FindBy(xpath = "//span[text()='Strong']")
    public WebElement passStrengthMsg;

    @FindBy(xpath = "//span[text()='For a strong password, please use a hard to guess combination of text with upper and lower case characters, symbols and numbers']")
    public WebElement passMsg;

    public AddEmployeePage() {
        PageFactory.initElements(driver,this);
    }
}
