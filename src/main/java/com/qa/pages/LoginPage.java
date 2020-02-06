package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//div[@class='_1XBjg- row']//input[@type='text']")
    private WebElement email;

    @FindBy(xpath = "//div[@class='_1XBjg- row']//input[@type='password']")
    private WebElement passWord;

    @FindBy(xpath = "//div[@class='_1XBjg- row']//button//span")
    private WebElement submitButton;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(this.driver,20);
        PageFactory.initElements(driver,this);
    }

    public void gotoFlipkart(){
        driver.get("https://www.flipkart.com/");
        this.wait.until(ExpectedConditions.visibilityOf(email));
    }

    public FlipkartHomePage enterCredentials(String userName, String password){
        email.sendKeys(userName);
        passWord.sendKeys(password);
        submitButton.click();
        return new FlipkartHomePage();
    }
}
