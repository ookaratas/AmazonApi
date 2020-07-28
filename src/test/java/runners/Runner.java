package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "junit:target/cucumber-reports/Cucumber.xml" },
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@etsy",
        monochrome = true
)
public class Runner {

}
