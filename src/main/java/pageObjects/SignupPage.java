package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SignupPage {
    WebDriver driver;

    @FindBy(id="ap_customer_name")
    WebElement name;

    @FindBy(id="ap_email")
    WebElement email;

    @FindBy(id="ap_password")
    WebElement password;

    @FindBy(id="ap_password_check")
    WebElement passwordCheck;

    @FindBy(id="continue")
    WebElement submit;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setPasswordCheck(String passwordCheck) {
        this.passwordCheck.sendKeys(passwordCheck);
    }

    public void submit() {
        this.submit.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
