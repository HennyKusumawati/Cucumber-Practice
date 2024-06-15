package utils;

import pages.*;

public class PageInitializer {
    public static AddEmployeePage addEmployeePage;
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static EmployeeSearchPage employeeSearchPage;
    public static CreateLoginDetailPage createLoginDetailPage;
    public static AddLanguagesPage addLanguagesPage;

    public static void initializePageObjects(){
        addEmployeePage=new AddEmployeePage();
        loginPage=new LoginPage();
        dashboardPage=new DashboardPage();
        employeeSearchPage=new EmployeeSearchPage();
        createLoginDetailPage=new CreateLoginDetailPage();
        addLanguagesPage=new AddLanguagesPage();
    }


}
