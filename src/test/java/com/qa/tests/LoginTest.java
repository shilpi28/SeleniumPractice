package com.qa.tests;

import com.qa.pages.BaseClass;
import com.qa.pages.FlipkartHomePage;
import com.qa.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    private LoginPage loginPage;
    private FlipkartHomePage flipkartHomePage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver=new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void openFlipkart(){
        loginPage.gotoFlipkart();
    }

    @Test
    @Parameters({"userName","password"})
    public void verifyLoginSuccessful(String userName, String password){
        flipkartHomePage=loginPage.enterCredentials(userName,password);
    }
}
