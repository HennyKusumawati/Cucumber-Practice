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

    public AddEmployeePage() {
        PageFactory.initElements(driver,this);
    }
}
