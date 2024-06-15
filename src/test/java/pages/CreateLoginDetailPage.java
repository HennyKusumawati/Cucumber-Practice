package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.HdrDocumentImpl;
import utils.CommonMethods;

public class CreateLoginDetailPage extends CommonMethods {

    @FindBy(xpath = "//select[@id='status']")
    public WebElement statusEmp;




    public CreateLoginDetailPage() {
        PageFactory.initElements(driver,this);
    }
}
