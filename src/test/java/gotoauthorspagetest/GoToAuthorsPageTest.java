package gotoauthorspagetest;

import basetest.BaseTest;
import gotoauthorspage.GoToAuthorsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoToAuthorsPageTest extends BaseTest {
    GoToAuthorsPage goToAuthorsPage;

    @BeforeClass
    public void beforeClass() {
        goToAuthorsPage = new GoToAuthorsPage(driver);
    }

    @Test
    public void goToAuthorsPageTest() {
        goToAuthorsPage.goToAutorsPage();
    }
}
