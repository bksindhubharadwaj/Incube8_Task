package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.MenuPage;
import utilities.DriverFactory;

public class StepDefinitionGoT {

    public static WebDriver driver = DriverFactory.getInstance().driver;
    HomePage homePage;


    @Then("^searches for GoT$")
    public void searches_for_GoT() throws Throwable{
        this.homePage=new HomePage(driver);
        this.homePage.searchGoT();
    }

    @Then("^selects the Last watch link$")
    public void selects_the_Last_watch_link() throws Throwable{
        this.homePage=new HomePage(driver);
        boolean result =this.homePage.selectLastWatch();
        assert result;
    }
}
