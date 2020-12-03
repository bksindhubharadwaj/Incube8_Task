package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SignUpLandingPage;
import utilities.DriverFactory;

public class StepDefinitionSignIn {
    public static WebDriver driver = DriverFactory.getInstance().driver;
    HomePage homePage;
    SignUpLandingPage signUpLandingPage;
    LoginPage loginPage;

    @Given("^Sign In Landing page navigation$")
    public void signInLandingPageNavigation() {
        driver.navigate().to("https://www.imdb.com/");
        driver.manage().window().fullscreen();
        this.homePage = new HomePage(driver);
        this.homePage.navigateToSignIn();
        this.signUpLandingPage = new SignUpLandingPage(driver);
    }

    @Then("^user clicks on sign in$")
    public void userClicksOnSignIn() {
        this.signUpLandingPage.signIn();
    }

    @Then("^user enters  email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void userEntersEmailAsAndPasswordAs(String email, String password) throws Throwable {
        this.loginPage = new LoginPage(driver);
        this.loginPage.setEmail(email);
        this.loginPage.setPassword(password);
    }

    @Then("^user clicks on login$")
    public void userClicksOnLogin() {
        this.loginPage.login();
    }

    @Then("^check if user name as \"([^\"]*)\" is displayed$")
    public void checkIfUserNameAsIsDisplayed(String name) throws Throwable {
        String actualName = driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/div/label[2]/div/span")).getText();
        Assert.assertEquals(name, actualName);
    }


}
