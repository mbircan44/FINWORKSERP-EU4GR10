package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() throws InterruptedException {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException{
        BrowserUtils.waitFor(3);
        String actualUsername = Driver.get().findElement(By.className("oe_topbar_name")).getText();
        Assert.assertEquals("verify username", "POSManager10", actualUsername);

    }
    @When("the user enters the pos manager information")
    public void the_user_enters_the_pos_manager_information() throws InterruptedException {
        String username = ConfigurationReader.get("pos_manager_username");
        String password = ConfigurationReader.get("pos_manager_password");



        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);


    }

}
