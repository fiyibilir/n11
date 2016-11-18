import basetest.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;

public class RunAll extends BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        String url = "https://www.n11.com";
        windowMax();
        openURL(url);
    }
    @AfterSuite
    public void afterSuite() {
        driverQuit();
    }
}
