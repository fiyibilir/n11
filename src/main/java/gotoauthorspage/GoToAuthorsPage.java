package gotoauthorspage;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoToAuthorsPage extends Base {
    public GoToAuthorsPage(WebDriver driver) {
        super(driver);
    }

    public void goToAutorsPage() {
        clickWebElement("#contentMain>div>nav>ul>li:nth-of-type(8)");
        waitForLoad(6);
        clickWebElement(".fancybox-item.fancybox-close");
        waitForLoad(2);
        clickWebElement(".subCatMenu.l7>ul>li:nth-of-type(1)");
        waitForLoad(4);
        clickWebElement(".filter.authors>h2>a");
        Assert.assertTrue(getTitle().contains("Yazarlar"));
    }
}
