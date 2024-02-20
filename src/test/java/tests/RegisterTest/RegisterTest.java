package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    @Test
    public void filRegister() {
        driver.get(newUrl);
        String firstName = "Ion";
        String lastName = "Popescu";
        LOG.info("Typing full name");
        registerPage.insertFullName(firstName, lastName);

    }
//base page, base test copy github
}
