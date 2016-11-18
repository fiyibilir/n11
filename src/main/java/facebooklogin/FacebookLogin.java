package facebooklogin;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.Iterator;
import java.util.Set;

public class FacebookLogin extends Base{
    public FacebookLogin(WebDriver driver) {
        super(driver);
    }

    public void facebookLogin() {
        final String facebookMail = "furkaniyibilirtest@gmail.com";
        final String facebookPassword = "n11testn11";
        clickWebElement(".btnSignIn");
        waitForLoad(2);
        String mainWindowHandle = driver.getWindowHandle();
        clickWebElement(".button.inicon.facebook.medium.facebookBtn.btnLogin");

        driver.getWindowHandles();
        Set<String> windows = driver.getWindowHandles();

        Iterator<String> iterator = windows.iterator();
        String currentWindowId;

        while (iterator.hasNext()) {
            currentWindowId = iterator.next().toString();

            if(!currentWindowId.equals(mainWindowHandle)) {
                driver.switchTo().window(currentWindowId);
                waitForLoad(5);
                fillInputWebElement("#email", facebookMail);
                fillInputWebElement("#pass", facebookPassword);
                clickWebElement("#loginbutton");
                waitForLoad(2);
            }
            driver.switchTo().window(mainWindowHandle);
        }

        waitForLoad(3);
        WebElement userName = findWebElement(".username");

        Assert.assertEquals(userName.getText(), "Furkan İyibilir");
    }
}
