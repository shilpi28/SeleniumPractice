package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartHomePage {

    @FindBy(xpath = "//div[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//div[text()='More']")
    private WebElement more;

    @FindBy(xpath = "//Span[text()='Cart']")
    private WebElement cart;

}
