package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.MenuPage;
import utilities.DriverFactory;

public class StepDefinition {
    public static WebDriver driver = DriverFactory.getInstance().driver;
    HomePage homePage;
    MenuPage menuPage;


    @Given("^User navigates to page$")
    public void user_navigates_to_page() throws Throwable {
        driver.navigate().to("https://www.imdb.com/");
        driver.manage().window().fullscreen();

    }


    @Then("^click on menu button$")
    public void click_on_menu_button() throws Throwable {
        this.homePage = new HomePage(driver);
        this.homePage.clickMenu();
    }

    @Then("^select Top rated shows link$")
    public void select_Top_rated_shows_link() throws Throwable {
        this.menuPage = new MenuPage(driver);
        this.menuPage.selectRatedShows();
    }


}

