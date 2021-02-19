package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement htmlTitleBtn;

    @FindBy(xpath = "//label[text()='Email']")
    public WebElement emailTxt;

    @FindBy(xpath = "//label[text()='Password']")
    public WebElement passwordText;

    @FindBy(id = "login")
    public WebElement userNameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//a[text()='Reset Password']")
    public WebElement resetPasswordBtn;

    @FindBy(className = "navbar-toggle")
    public WebElement navigationToggleBtn;

    // this is the Sign in button under navigationToggle
    @FindBy(xpath = "//b[text()='Sign in']")
    public WebElement signInBtn;

    public void login(String userNameStr, String passwordStr) {
        userNameBox.sendKeys(userNameStr);
        passwordBox.sendKeys(passwordStr);
        submitBtn.click();
    }


}
