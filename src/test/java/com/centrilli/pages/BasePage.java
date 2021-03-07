package com.centrilli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class BasePage {
    @FindBy(xpath="//body/nav[@id='oe_main_menu_navbar']/div[2]/ul[1]/li")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/ol[1]")
    public WebElement pageSubtitle;


}
