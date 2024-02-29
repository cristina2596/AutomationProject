package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By signInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By emailfield = By.xpath("//input[@ng-model='Email']");
    private By passwordfield = By.xpath("//input[@ng-model='Password']");
    private By enterButton = By.id("enterbtn");
    private By errorMessage = By.id("errormsg");
    private By skipSignInButton = By.id("btn2");
    private By signUp = By.id("email");
    private By registerButton = By.id("enterimg");


    public void clicksignInButton() {
        LOG.info("Click 'Sign in' button");
        driver.findElement(signInButton).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in' button is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo image is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void insertEmail(String Email) {
        LOG.info("input 'Email address' in field");
        driver
                .findElement(emailfield).sendKeys(Email);
    }

    public void insertPassword(String Passoword) {
        LOG.info("input 'Password' in field");
        driver.findElement(passwordfield).sendKeys(Passoword);
    }

    public void clickenterButton() {
        LOG.info("Click  'Enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        LOG.info("Verify if Error message is displayed");
        return driver.findElement(errorMessage).isDisplayed();
    }

    public void clickBack() {
        LOG.info("Click 'Back' in browser");
        driver.navigate().back();
    }

    public void clickSkipSignInbuttton() {
        LOG.info("Click 'Skip sign in' button");
        driver.findElement(skipSignInButton).click();
    }

    public void insertEemail(String email) {
        LOG.info("Insert email address");
        driver.findElement(signUp).sendKeys(email);
    }

    public void clickregisterButton() {
        LOG.info("Click Register button");
        driver.findElement(registerButton).click();
    }
}
