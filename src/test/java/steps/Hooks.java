package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

import java.io.IOException;

public class Hooks extends CommonMethods {
    //precondition
    @Before
    public void start() throws IOException {
        openBrowserAndLaunchApplication();
    }

    //post condition
    @After
    public void end(Scenario scenario){
        byte[]pic;
        //we call screenshot method in Hooks, right before closing app, bc we want
        //take a screenshot in the end of the execution. Just 1 ss per execution.

        if(scenario.isFailed()) {
            pic=takeScreenshot("failed/"+scenario.getName());
            //getName()
        }else {pic=takeScreenshot("passed/"+scenario.getName());}
        scenario.attach(pic,"image/png", scenario.getName());
        closeBrowser();
    }

}
