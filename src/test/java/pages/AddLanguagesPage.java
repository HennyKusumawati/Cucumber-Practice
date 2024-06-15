package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.HdrDocumentImpl;
import utils.CommonMethods;

public class AddLanguagesPage extends CommonMethods {
    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminOption;

    @FindBy(id = "menu_admin_Qualifications")
    public WebElement qualification;

    @FindBy(id = "menu_admin_viewLanguages")
    public WebElement languages;

    @FindBy(id = "btnAdd")
    public WebElement addBtn;

    @FindBy(id = "language_name")
    public WebElement addLang;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;

    @FindBy(xpath = "//table[@id='recordsListTable']/tbody/tr/td/a")
    public WebElement allLanguages;



    public AddLanguagesPage() {
        PageFactory.initElements(driver,this);
    }
}
