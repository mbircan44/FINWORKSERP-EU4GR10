package com.centrilli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalenderPage extends BasePage{

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[2]")
     public WebElement calendar;

    @FindBy(xpath = "(//a[@class='dropdown full']")
    public WebElement webSide;
}
