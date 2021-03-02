package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
    public CalendarPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//tbody[@class='fc-body']")
    public WebElement calendarInput;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement createInput;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[2]/a[1]/div[2]")
    public  WebElement meetingLog;

    @FindBy(xpath = "//span[contains(text(),'Notes')]")
    public WebElement notesTab;








}
