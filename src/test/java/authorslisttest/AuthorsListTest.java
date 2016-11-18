package authorslisttest;

import authorslist.AuthorsList;
import basetest.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AuthorsListTest extends BaseTest {
    AuthorsList authorsList;

    @BeforeClass
    public void beforeClass() {
        authorsList = new AuthorsList(driver);
    }

    @Test
    public void authorsListSize() {
        authorsList.authorsListSize();
    }

    @Test (priority = 1)
    public void authorsListFirstCharTest() {
        authorsList.authorsListFirstChar('A');
    }

    @Test (priority = 2)
    public void authorsListPaginationTest() {
        authorsList.authorsListPagination();
    }
}
