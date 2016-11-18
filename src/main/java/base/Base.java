package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public abstract class Base {
    protected static WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    protected String getTitle() {
        return driver.getTitle();
    }

    protected WebElement findWebElement(String html) {
        WebElement el = driver.findElement(By.cssSelector(html));
        return el;
    }

    protected List<WebElement> findWebElementList(String html) {
        List<WebElement> list = driver.findElements(By.cssSelector(html));
        return list;
    }

    protected void fillInputWebElement(String html, String text) {
        WebElement el = findWebElement(html);
        el.clear();
        el.sendKeys(text);
    }

    protected void clickWebElement(String html) {
        findWebElement(html).click();
    }

    protected void waitForLoad(int i) {
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
