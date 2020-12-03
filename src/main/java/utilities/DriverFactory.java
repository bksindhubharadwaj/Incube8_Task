package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static DriverFactory singleInstance = null;

    public WebDriver driver;

    private DriverFactory() {
        driver = new ChromeDriver();
    }

    public static DriverFactory getInstance() {
        if (singleInstance == null)
            singleInstance = new DriverFactory();

        return singleInstance;
    }
}
