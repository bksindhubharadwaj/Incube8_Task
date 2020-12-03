package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import utilities.DriverFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/"
        //features = {"classpath:features"}
        , glue = {"StepDefinitions"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"}
        , monochrome = true
)
public class TestRunner {

    @AfterClass
    public static void teardown() {
        WebDriver driver = DriverFactory.getInstance().driver;
        driver.close();
        driver.quit();
    }
}

