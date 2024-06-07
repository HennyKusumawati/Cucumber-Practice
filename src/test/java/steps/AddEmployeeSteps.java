package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddEmployeePage;
import utils.CommonMethods;
import utils.ExcelReader;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on Add Employee option")
    public void user_clicks_on_add_employee_option() {
        //  WebElement addEmpOption = driver.findElement(By.id("menu_pim_addEmployee"));
        click(dashboardPage.addEmpOption);
    }

    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {
        // WebElement firstNameLoc = driver.findElement(By.cssSelector("input#firstName"));
        // WebElement middleNameLoc = driver.findElement(By.xpath("//*[@id='middleName']"));
        // WebElement lastNameLoc = driver.findElement(By.id("lastName"));
       // System.out.println(1/0);=>example for failed case
        // AddEmployeePage addEmployeePage = new AddEmployeePage();
        sendText("Anna", addEmployeePage.firstNameLoc);
        sendText("MS", addEmployeePage.middleNameLoc);
        sendText("Maria", addEmployeePage.lastNameLoc);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        //  WebElement saveButton = driver.findElement(By.id("btnSave"));
        click(addEmployeePage.saveButton);
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added");
    }

    @When("user enters {string} {string} {string}")
    public void user_enters(String firstName, String middleName, String lastName) {
        //WebElement firstNameLoc = driver.findElement(By.cssSelector("input#firstName"));
        //WebElement middleNameLoc = driver.findElement(By.xpath("//*[@id='middleName']"));
        //WebElement lastNameLoc = driver.findElement(By.id("lastName"));
        //AddEmployeePage addEmployeePage = new AddEmployeePage();
        sendText(firstName, addEmployeePage.firstNameLoc);
        sendText(middleName, addEmployeePage.middleNameLoc);
        sendText(lastName, addEmployeePage.lastNameLoc);
    }

    @When("user enters {string} and {string} and {string}")
    public void user_enters_and_and(String first, String middle, String last) {
        //WebElement firstNameLoc = driver.findElement(By.cssSelector("input#firstName"));
        //WebElement middleNameLoc = driver.findElement(By.xpath("//*[@id='middleName']"));
        //WebElement lastNameLoc = driver.findElement(By.id("lastName"));
        //AddEmployeePage addEmployeePage = new AddEmployeePage();
        sendText(first, addEmployeePage.firstNameLoc);
        sendText(middle, addEmployeePage.middleNameLoc);
        sendText(last, addEmployeePage.lastNameLoc);
    }

    @When("user enters firstname and middlename and lastname from data table and verify")
    public void user_enters_firstname_and_middlename_and_lastname_from_data_table_and_verify(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> newEmployee = dataTable.asMaps();
        for (Map<String, String> employee : newEmployee) {
            String empFirstName = employee.get("firstname");
            String empMiddleName = employee.get("middlename");
            String empLastName = employee.get("lastname");

            sendText(empFirstName, addEmployeePage.firstNameLoc);
            sendText(empMiddleName, addEmployeePage.middleNameLoc);
            sendText(empLastName, addEmployeePage.lastNameLoc);

            click(addEmployeePage.saveButton);
            Thread.sleep(2000);
            click(dashboardPage.addEmpOption);
            Thread.sleep(2000);
        }

    }

    @When("user adds multiple employees from excel and validate them")
    public void user_adds_multiple_employees_from_excel_and_validate_them() throws InterruptedException {
        List<Map<String, String>> employeeData =  ExcelReader.read();

        for (Map<String, String> employee:
                employeeData){

            sendText(employee.get("firstName"), addEmployeePage.firstNameLoc);
            sendText(employee.get("middleName"), addEmployeePage.middleNameLoc);
            sendText(employee.get("lastName"), addEmployeePage.lastNameLoc);
            sendText(employee.get("Photograph"), addEmployeePage.photograph);

            //i have to click on checkbox if it is not selected
            if(!addEmployeePage.checkBox.isSelected()){
                click(addEmployeePage.checkBox);
            }

            sendText(employee.get("Username"), addEmployeePage.userName);
            sendText(employee.get("Password"), addEmployeePage.password);
            sendText(employee.get("confirmPassword"), addEmployeePage.confirmPass);
            click(addEmployeePage.saveButton);

            Thread.sleep(2000);
            //verification is pending
            //which is your homework

            click(dashboardPage.addEmpOption);
            Thread.sleep(2000);
        }
    }


}
