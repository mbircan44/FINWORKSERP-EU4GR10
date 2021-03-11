package com.centrilli.step_definitions;

import com.centrilli.pages.CalendarPage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalenderStepDefs {
    CalendarPage calendarPage=new CalendarPage();
    
    @Given("the user is on the calender page")
    public void the_user_is_on_the_calender_page() throws InterruptedException {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String username = ConfigurationReader.get("pos_manager_username");
        String password = ConfigurationReader.get("pos_manager_password");



        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);


       // calendarPage.webSide.click();

        Thread.sleep(2000);
        calendarPage.calendar.click();






    }

    @When("the user should be able to create any info")
    public void the_user_should_be_able_to_create_any_info() throws InterruptedException {

        BrowserUtils.waitFor(5);



        calendarPage.comment.click();
        Thread.sleep(2000);

        calendarPage.inputName.sendKeys("hunterman");

        calendarPage.createBtn.click();


    }

    @Then("the user should be able to delete any note")
    public void the_user_should_be_able_to_delete_any_note() throws InterruptedException {
        BrowserUtils.waitFor(5);


        calendarPage.comment2.click();
        Thread.sleep(2000);

        calendarPage.delete.click();
        calendarPage.ok.click();



    }


}
