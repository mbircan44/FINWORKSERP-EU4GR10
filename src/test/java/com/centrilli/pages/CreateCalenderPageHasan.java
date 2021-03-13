package com.centrilli.pages;

import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalenderPageHasan {

    @FindBy(xpath = " //body/nav[@id='oe_main_menu_navbar']/div[2]/ul[1]/li[13]/a[1]/span[1]")
    public WebElement project;

    @FindBy(xpath = " //button[contains(text(),'Create')]")
    public WebElement create;

    @FindBy(xpath = "//input[@placeholder='e.g. Office Party']")
    public WebElement placeHolder;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement projectName;

    @FindBy(xpath = "//input[@name='alias_name']")
    public WebElement projectMail;

    @FindBy(xpath = "//button[@name='close_dialog']")
    public WebElement create2;

    @FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/a[1]")
    public  WebElement button1;

    @FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/a[1]")
    public WebElement settings;

    @FindBy(xpath = "//a[contains(text(),'Emails')]")
    public WebElement emails;

    @FindBy(xpath = "//input[@name='alias_name']")
    public WebElement writeEmail;

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
    public WebElement saveBtn;

    @FindBy(xpath = "//label[contains(text(),'Project Name')]")
    public WebElement redProject;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement redBox;

    @FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]")
    public WebElement createdProject;

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/span[1]/span[2]")
    public WebElement pageNum;







    public CreateCalenderPageHasan(){
        PageFactory.initElements(Driver.get(), this);
    }



    public void LoginPosManager(){

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String username = ConfigurationReader.get("pos_manager_username");
        String password = ConfigurationReader.get("pos_manager_password");



        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);


    }

    public CharSequence ProjectName(){

        String projectName01 = ConfigurationReader.get("project_name");


        return  projectName01;
    }

    public CharSequence ProjectEmail(){
        String projectEmail01=ConfigurationReader.get("project_email");
        return projectEmail01;
    }

    public int NewPageNum(){

        int actualPageNum= Integer.parseInt(pageNum.getText());

        int oldPageNUm=actualPageNum-1;

        return  oldPageNUm;
    }
}
