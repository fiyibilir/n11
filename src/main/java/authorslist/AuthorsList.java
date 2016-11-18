package authorslist;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

public class AuthorsList extends Base {
    public AuthorsList(WebDriver driver) {
        super(driver);
    }

    public void authorsListSize() {
        List<WebElement> list = findWebElementList("#authorsList>div>ul>li");
        Assert.assertEquals(list.size(), 80);
    }

    public void authorsListFirstChar(char expectedCharacter) {
        List<WebElement> list = findWebElementList("#authorsList>div>ul>li");
        for (WebElement element : list) {
            Assert.assertEquals(expectedCharacter, element.getText().charAt(0));
        }
    }

    public void authorsListPagination() {
        List<WebElement> firstPageList = findWebElementList("#authorsList>div>ul>li");
        String lastElementOfFirstPage = firstPageList.get(firstPageList.size()-1).getText();
        clickWebElement(".pagination>a:nth-of-type(12)");
        waitForLoad(3);
        List<WebElement> secondPageList = findWebElementList("#authorsList>div>ul>li");
        String firstElementOfSecondPage = secondPageList.get(0).getText();
        Assert.assertTrue(!lastElementOfFirstPage.equals(firstElementOfSecondPage));
    }
}
