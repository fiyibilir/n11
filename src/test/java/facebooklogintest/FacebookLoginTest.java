package facebooklogintest;

import basetest.BaseTest;
import facebooklogin.FacebookLogin;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookLoginTest extends BaseTest {
    FacebookLogin facebookLogin;

    @BeforeClass
    public void beforeClass() {
        facebookLogin = new FacebookLogin(driver);
    }

    @Test
    public void facebookLoginTest() {
        facebookLogin.facebookLogin();
    }
}
