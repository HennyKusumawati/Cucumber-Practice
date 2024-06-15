package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.io.IOException;
import java.time.Duration;

public class CreateLoginDetailsSteps extends CommonMethods {
    @When("Admin clicks on Create Login Details box")
    public void admin_clicks_on_create_login_details_box() {
        if(!addEmployeePage.checkBox.isSelected()){
            click(addEmployeePage.checkBox);
        }
    }
    @Then("Create Login Details box is enabled")
    public void create_login_details_box_is_enabled() {
      //  Assert.assertTrue(addEmployeePage.checkBox.isSelected());
     //   Assert.assertTrue(dashboardPage.passStrengthMsg.isDisplayed());
    }
    @When("Admin create username and password and confirm password")
    public void admin_create_username_and_password_and_confirm_password() throws InterruptedException {
        Thread.sleep(2000);
      // String username=addEmployeePage.lastNameLoc.getText()+(addEmployeePage.firstNameLoc.getText());
       // sendText(username, addEmployeePage.userName);
        Thread.sleep(2000);
         sendText("AnnaMaria", addEmployeePage.userName);
        //String username="AnnaMaria";
        //sendText(username, addEmployeePage.userName);

    String password="Hum@nhrm123";
   String confirmPassword="Hum@nhrm123";

        sendText(password, addEmployeePage.password);

        if (password.length()<8) {
            // WebElement warn1= driver.findElement(By.xpath("//span[text()='//span[text()='Should have at least 8 characters']']"));
            // Assert.assertEquals(warn1.getText(),"Should have at least 8 characters");
        Assert.assertEquals(addEmployeePage.vwStrengthMsg.getText(),"Very Weak");
            Assert.assertTrue(addEmployeePage.passMsg.isDisplayed());
        } else if (!password.matches("(?=.*[a-z]).*")){
           // Assert.assertEquals(dashboardPage.passStrengthMsg.getText(),"Very Weak");
            Assert.assertTrue(addEmployeePage.passMsg.isDisplayed());
        } else if (!password.matches("(?=.*[A-Z]).*")) {
            Assert.assertTrue(addEmployeePage.passMsg.isDisplayed());
        } else if (!password.matches("(?=.*[0-9]).*")) {
            Assert.assertTrue(addEmployeePage.passMsg.isDisplayed());
        } else if (!password.matches("(?=.*[!@#$%^&*]).*")) {
            Assert.assertTrue(addEmployeePage.passMsg.isDisplayed());
        } else {
            Assert.assertEquals(addEmployeePage.passStrengthMsg.getText(),"Strong");
            Assert.assertTrue(addEmployeePage.passMsg.isDisplayed());
        }


        sendText(confirmPassword, addEmployeePage.confirmPass);
       // Assert.assertEquals(confirmPassword,addEmployeePage.password.getText());

    }
    @When("Admin select status from status drop down")
    public void admin_select_status_from_status_drop_down() {

        selectFromDropDown("Enabled", createLoginDetailPage.statusEmp);
    }
    @When("Admin clicks on save button")
    public void admin_clicks_on_save_button() {
       click(addEmployeePage.saveButton);
    }

    @When("Admin clicks on logout button")
    public void admin_clicks_on_logout_button() {
        click(dashboardPage.welcomeMsg);
        selectFromDropDown(dashboardPage.welcomeMsg, "Logout");
    }
    @Then("Admin is successfully creating a login details for new employee")
    public void admin_is_successfully_creating_a_login_details_for_new_employee() {
        System.out.println("test passed");
    }

    @When("new employee enters valid username and password")
    public void new_employee_enters_valid_username_and_password() {
        sendText("Amaria", loginPage.usernameTextField);
        sendText("Hum@nhrm123", loginPage.passwordTextField);


    }
    @When("new employee clicks on login button")
    public void new_employee_clicks_on_login_button() {

        click(loginPage.loginButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Then("new employee is successfully logged in")
    public void new_employee_is_successfully_logged_in() {
        String welcome=dashboardPage.welcomeMsg.getText();
        Assert.assertEquals("Welcome Anna",welcome);
    }



}
