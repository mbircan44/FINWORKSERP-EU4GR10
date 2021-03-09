package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {



    public CalendarPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[2]")
    public WebElement calendar;



    @FindBy(xpath = "(//td[@*='fc-day fc-widget-content fc-sun fc-past'])[1]")
    public WebElement comment;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputName;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createBtn;

    @FindBy(xpath = "(//div[@class='fc-content'])[1]")
    public WebElement comment2;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-default'])[1]")
    public WebElement delete;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[2]")
    public WebElement ok;


}