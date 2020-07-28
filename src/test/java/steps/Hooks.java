package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class Hooks {


    @Before
    public void setup(Scenario scenario){
        //This is the most common use case. We need to initialize the driver once before launching the test.
        WebDriver driver;

        System.out.println("------------------------------");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("------------------------------");
    }



    public void setup2(){
        System.out.println("This is Hooks setup for google");
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("Hooks clean up");
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        Driver.quitDriver();
    }


}
