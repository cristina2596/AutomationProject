package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {

    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By consent = By.xpath("//p[text()='Consent']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmail = By.xpath("//input[@type='email']");
    private By inputPhoneNumber = By.xpath("//input[@ng-model='Phone']");
    private By maleGender = By.xpath("//input[@value='Male']");
    private By femaleGender = By.xpath("//input[@value='FeMale']");
    private By cricketCheckmarks = By.id("checkbox1");
    private By movieCheckmarks = By.id("checkbox2");
    private By hockeyCheckmarks = By.id("checkbox3");
    private By languageField = By.id("msdd");
    String selectLanguage = "//a[contains(text(), '%s')]";
    private By selectSkills = By.id("Skills");
    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By insertCountry = By.xpath("//input[@role='textbox']");
    private By selectYear = By.id("yearbox");
    private By selectMonth = By.xpath("//select[@ng-model='monthbox']");
    private By selectDay = By.id("daybox");
    private By password1 = By.id("firstpassword");
    private By secondPassword = By.id("secondpassword");
    private By chooseFileButton = By.id("imagesrc");
    private By submitButton = By.id("submitbtn");

    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting 'FirstName and LastName");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void pressConsent() {
        LOG.info("Press consent");
        driver.findElement(consent).click();
    }

    public void insertAddress(String address) {
        LOG.info("Insert address");
        driver.findElement(inputAddress).sendKeys(address);
    }

    public void insertEmail(String email) {
        LOG.info("Insert email");
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void insertPhoneNumber(String phone) {
        LOG.info("Insert phone number");
        driver.findElement(inputPhoneNumber).sendKeys(phone);
    }

    public void setMaleGender() {
        LOG.info("Clicking the 'male radio button'");
        driver.findElement(maleGender).click();
    }

    public void setFemaleGender() {
        LOG.info("Clicking female radio button");
        driver.findElement(femaleGender).click();
    }


    public void setCricketCheckmarks() {
        LOG.info("Clicking Cricket checkmarks");
        driver.findElement(cricketCheckmarks).click();

    }

    public void setMovieCheckmarks() {
        LOG.info("Clicking movie checkmarks");
        driver.findElement(movieCheckmarks).click();

    }

    public void setHockeyCheckmarks() {
        LOG.info("Clicking Hockey checkmarks");
        driver.findElement(hockeyCheckmarks).click();
    }

    public void selectLanguage(String language) {
        driver.findElement(languageField).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language)));
    }

    public void setSelectSkills(String skill) {
        LOG.info("Selecting a skill");
        Select newSkill = new Select(driver.findElement(selectSkills));
        newSkill.selectByValue(skill);

    }

    public void setSelectCountry(String country) {
        LOG.info("Selecting country");
        driver.findElement(selectCountry).click();
        driver.findElement(insertCountry).sendKeys(country);
        driver.findElement(selectCountry).sendKeys(Keys.ENTER);
    }

    public void setDateofBirth(String year, String month, String day) {
        LOG.info("Selecting date of birth");
        Select newYear = new Select(driver.findElement(selectYear));
        newYear.selectByValue(year);
        Select newMonth = new Select(driver.findElement(selectMonth));
        newMonth.selectByValue(month);
        Select newDay = new Select(driver.findElement(selectDay));
        newDay.selectByValue(day);

    }

    public void setPassword(String pass) {
        LOG.info("Setting password and confirm passoword");
        driver.findElement(password1).sendKeys(pass);
        driver.findElement(secondPassword).sendKeys(pass);

    }

    public void chooseFile() {
        LOG.info("Uploading file");
        WebElement chooseFile = driver.findElement(chooseFileButton);
        chooseFile.sendKeys("C:\\img\\prajitura.webp");
    }

    public void clickSubmitButton() {
        LOG.info("Click submit");
        driver.findElement(submitButton).click();
    }
}







