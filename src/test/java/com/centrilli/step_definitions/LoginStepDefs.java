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

    @Then("the user should be able to login as sales manager")
    public void the_user_should_be_able_to_login_as_sales_manager() {
        BrowserUtils.waitFor(3);
        String actualUsername = Driver.get().findElement(By.className("oe_topbar_name")).getText();
        Assert.assertEquals("verify username", "SalesManager15", actualUsername);
    }

    @When("the user enters the pos manager information")
    public void the_user_enters_the_pos_manager_information() {
        String username = ConfigurationReader.get("pos_manager_username");
        String password = ConfigurationReader.get("pos_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login as pos manager")
    public void the_user_should_be_able_to_login_as_pos_manager() {
        BrowserUtils.waitFor(3);
        String actualUsername = Driver.get().findElement(By.className("oe_topbar_name")).getText();
        Assert.assertEquals("verify username", "POSManager10", actualUsername);
    }

    @When("the user enters the inventory manager information")
    public void the_user_enters_the_inventory_manager_information() {
        String username = ConfigurationReader.get("inventory_manager_username");
        String password = ConfigurationReader.get("inventory_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login as inventory manager")
    public void the_user_should_be_able_to_login_as_inventory_manager() {
        BrowserUtils.waitFor(3);
        String actualUsername = Driver.get().findElement(By.className("oe_topbar_name")).getText();
        Assert.assertEquals("verify username", "InventoryManager10", actualUsername);
    }

    @When("the user enters the expenses manager information")
    public void the_user_enters_the_expenses_manager_information() {
        String username = ConfigurationReader.get("expenses_manager_username");
        String password = ConfigurationReader.get("expenses_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login as expenses manager")
    public void the_user_should_be_able_to_login_as_expenses_manager() {
        BrowserUtils.waitFor(3);
        String actualUsername = Driver.get().findElement(By.className("oe_topbar_name")).getText();
        Assert.assertEquals("verify username", "ExpensesManager10", actualUsername);
    }

    @When("the user enters the manufacturing User information")
    public void the_user_enters_the_manufacturing_User_information() {
        String username = ConfigurationReader.get("manufacturing_User_username");
        String password = ConfigurationReader.get("manufacturing_User_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login as manufacturing User")
    public void the_user_should_be_able_to_login_as_manufacturing_User() {
        BrowserUtils.waitFor(3);
        String actualUsername = Driver.get().findElement(By.className("oe_topbar_name")).getText();
        Assert.assertEquals("verify username", "ManufacturingUser10", actualUsername);
    }

}
