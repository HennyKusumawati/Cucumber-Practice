package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.time.Duration;
import java.util.List;


public class AddLanguagesSteps extends CommonMethods {
    @When("user clicks on Admin button")
    public void user_clicks_on_admin_button() {
        click(addLanguagesPage.adminOption);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @When("Admin navigated to qualifications")
    public void admin_navigated_to_qualifications() {
      click(addLanguagesPage.qualification);

    }
    @When("Admin clicks on Languages")
    public void admin_clicks_on_languages() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(addLanguagesPage.languages);
    }

    @When("Admin add any language")
    public void admin_add_any_languages() {
        click(addLanguagesPage.addBtn);
        sendText("Indonesian", addLanguagesPage.addLang);
    }

    @When("Admin clicks save button")
    public void admin_clicks_save_button() {
        click(addLanguagesPage.saveBtn);
    }
    @Then("Admin user successfully add languages")
    public void admin_user_successfully_add_languages() throws InterruptedException {
        List<WebElement>langs=driver.findElements(By.xpath("//table[@id='recordsListTable']/tbody/tr/td/a"));
        for(WebElement lang:langs){
        if(lang.getText().equals("Indonesian")){
            System.out.println("passed");
            Thread.sleep(2000);

        }}
    }

}
