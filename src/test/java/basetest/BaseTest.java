package basetest;

import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static WebDriver driver;

    protected void windowMax() {
        driver.manage().window().maximize();
    }
    protected void openURL(String url) {
        driver.get(url);
    }
    protected void driverQuit() {
        driver.close();
        driver.quit();
    }
}
