package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";
    String firstName = "Ion";
    String lastName = "Popescu";
    String address = "Cluj, Strada ION Barbu, nr 456";
    String email = "automation@domain.com";
    String phone = "0123456789";
    String language = "English";
    String skill = "Java";
    String country = "India";
String year="1992";
String month="February";
String day= "25";
    @Test
    public void fillRegister() {
        driver.get(newUrl);
        sleep(3000L);

        LOG.info("Press the consent button");
        registerPage.pressConsent();

        LOG.info("Typing full name");
        registerPage.insertFullName(firstName, lastName);

        LOG.info("Type in Address");
        registerPage.insertAddress(address);

        LOG.info("Type in email");
        registerPage.insertEmail(email);

        LOG.info("Type in phone number");
        registerPage.insertPhoneNumber(phone);


        LOG.info("Select gender");
        registerPage.setMaleGender();
        registerPage.setFemaleGender();

        LOG.info("Select Hobbies");
        registerPage.setCricketCheckmarks();
        registerPage.setMovieCheckmarks();
        registerPage.setHockeyCheckmarks();


        LOG.info("Select language");
        registerPage.selectLanguage(language);

        LOG.info("Select skill");
        registerPage.setSelectSkills(skill);

        LOG.info("Select country");
        registerPage.setSelectCountry(country);


        LOG.info("Select date of bith");
        registerPage.setDateofBirth(year,month,day);
        sleep(5000L);
    }
}
