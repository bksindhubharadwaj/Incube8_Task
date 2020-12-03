package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.MenuPage;
import utilities.DriverFactory;

import java.security.cert.TrustAnchor;

public class StepDefiintionAssertion {
    public static WebDriver driver = DriverFactory.getInstance().driver;
    HomePage homePage;
    MenuPage menuPage;

    @Given("^Home page navigation$")
    public void Home_page_navigation() throws Throwable {
        driver.navigate().to("https://www.imdb.com/");
        driver.manage().window().fullscreen();
        this.homePage = new HomePage(driver);
    }


    @Then("^assert for title of episode as \"([^\"]*)\"$")
    public void assertForTitleOfEpisodeAs(String title) throws Throwable {
        String actualTitle = this.homePage.assertTitle(title);
        Assert.assertEquals(title, actualTitle.trim());
    }


    @Then("^assert for the rating as \"([^\"]*)\"$")
    public void assertForTheRatingAs(String rating) throws Throwable {
        String actualRating = this.homePage.assertRating();
        Assert.assertEquals(rating, actualRating.trim());
    }


    @Then("^assert for number of reviews$")
    public void assertForNumberOfReviews() {
        String actualReviews = this.homePage.assertReviews();
        assert actualReviews.length() > 0;
    }
}
