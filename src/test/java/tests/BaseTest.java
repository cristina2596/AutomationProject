package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;

public class BaseTest {
    @BeforeSuite
    public void init(){
        BasePage.setUP();
    }
    @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
    }
}
