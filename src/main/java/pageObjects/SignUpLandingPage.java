package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SignUpLandingPage {
    WebDriver driver;

    @FindBy(partialLinkText = "Sign in with IMDb")
    WebElement signIn;

    @FindBy(partialLinkText = "Create a New Account")
    WebElement createNew;

    public SignUpLandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void signIn() {
        signIn.click();
    }

    public void createNew() {
        createNew.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
