package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.junit.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"imdbHeader-navDrawerOpen--desktop\"]/div")
    WebElement menu;

    @FindBy(id = "suggestion-search")
    WebElement searchBar;

    @FindBy(className = "react-autosuggest__suggestion")
    WebElement listEle;

    @FindBy(partialLinkText = "Game of Thrones: The Last Watch")
    WebElement clickLastWatch;

    @FindBy(xpath = "//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/h1")
    WebElement verifyHeader;

    @FindBy(xpath = "//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/strong")
    WebElement ratingReviewCount;

    @FindBy(partialLinkText = "Sign In")
    WebElement signInLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMenu() {
        menu.click();
    }

    public void searchGoT() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchBar.sendKeys("Game of thrones");
        searchBar.sendKeys(Keys.ENTER);
    }

    public boolean selectLastWatch() {
        clickLastWatch.click();
        System.out.println("Clicked on it");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (verifyHeader.getText().contains("Game of Thrones: The Last Watch")) {
            return true;
        } else {
            return false;
        }

    }

    public String assertTitle(String title) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchBar.sendKeys(title);
        searchBar.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.partialLinkText(title)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualTitle = driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/h1")).getText();
        return actualTitle.trim();
    }

    public String assertRating() {
        return driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/strong")).getText();
    }

    public String assertReviews() {
        String ratingReviewString = driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/strong")).getAttribute("title");
        String reviewString = null;
        String[] parts = ratingReviewString.split(" ");
        reviewString = parts[3];
        return reviewString;
    }

    public void navigateToSignIn() {
        this.signInLink.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
