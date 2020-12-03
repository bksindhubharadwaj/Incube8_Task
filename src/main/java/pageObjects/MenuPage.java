package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.lang.*;
import java.util.concurrent.TimeUnit;

public class MenuPage {

    WebDriver driver;

    @FindBy(linkText="Top Rated Shows")
    WebElement topRatedShows;

    @FindBy(xpath="//*[@id=\"main\"]/div/span/div/div/h1")
    WebElement headerText;

    public MenuPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectRatedShows()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        topRatedShows.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(headerText.getText().equals("Top Rated TV Shows"))
        {
            System.out.println("Pass : Navigated to correct page");
        }
    }

}
