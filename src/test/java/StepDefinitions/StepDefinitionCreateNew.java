package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.ro.Si;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.SignUpLandingPage;
import pageObjects.SignupPage;
import utilities.DriverFactory;

import java.util.UUID;

public class StepDefinitionCreateNew {
    public static WebDriver driver = DriverFactory.getInstance().driver;
    HomePage homePage;
    SignUpLandingPage signUpLandingPage;
    SignupPage signupPage;

    @Given("^Landing page navigation$")
    public void landingPageNavigation() {
        driver.navigate().to("https://www.imdb.com/");
        driver.manage().window().fullscreen();
        this.homePage = new HomePage(driver);
        this.homePage.navigateToSignIn();
        this.signUpLandingPage = new SignUpLandingPage(driver);
    }

    @Then("^click on create new account$")
    public void clickOnCreateNewAccount() {
        this.signUpLandingPage.createNew();
    }


    @Then("^user enters name, email and password with prefix as \"([^\"]*)\"$")
    public void userEntersNameEmailAndPasswordWithPrefixAs(String arg0) throws Throwable {
        final String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 4);
        String name = arg0 + uuid;
        String email = arg0 + uuid + "@yahoo.com";
        String password = arg0 + uuid;
        this.signupPage = new SignupPage(driver);
        this.signupPage.setName(name);
        this.signupPage.setEmail(email);
        this.signupPage.setPassword(password);
        this.signupPage.setPasswordCheck(password);
    }

    @Then("^user clicks on submit$")
    public void userClicksOnSubmit() {
        this.signupPage.submit();
    }
}
