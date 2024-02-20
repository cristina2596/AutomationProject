package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUpTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void signUp() {
        String email = "ahdsdlfjksdjkfjsd@gk.ro";
        LOG.info("insert email");
        signInPage.insertEemail(email);

        LOG.info("Click Register button");
        signInPage.clickregisterButton();


    }

}
