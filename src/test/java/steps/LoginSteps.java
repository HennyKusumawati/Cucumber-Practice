package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;
import java.time.Duration;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() throws IOException {
        openBrowserAndLaunchApplication();
//eve
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() throws IOException {
        // WebElement usernameField = driver.findElement(By.xpath("//*[@id='txtUsername']"));
        // WebElement passwordField = driver.findElement(By.cssSelector("input#txtPassword"));
      //  loginPage.usernameTextField.sendKeys(ConfigReader.read("userName"));
      //  loginPage.passwordTextField.sendKeys(ConfigReader.read("password"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.enterUsername();// => This is where we call the method that we created
        //in the LoginPage class
        loginPage.enterPassword();

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        //  WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        //we can use xPath too, ie: //*[@id='btnLogin']
       click(loginPage.loginButton);
      //  jsClick(loginPage.loginButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
       // String welcome=dashboardPage.welcomeMsg.getText();
        //Assert.assertEquals("Welcome Admin",welcome);
        //or if we want to check using AssertTrue, we can write:
       // Assert.assertTrue(dashboardPage.welcomeMsg.isDisplayed());
       // System.out.println("test passed");
        //or comparing url
        String expectedUrl="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
       String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
