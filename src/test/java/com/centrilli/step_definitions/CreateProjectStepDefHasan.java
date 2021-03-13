package com.centrilli.step_definitions;

import com.centrilli.pages.CreateCalenderPageHasan;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateProjectStepDefHasan {
    CreateCalenderPageHasan createCalenderPageHasan=new CreateCalenderPageHasan();

    @When("user should be able to login As a Postmanager")
    public void user_should_be_able_to_login_As_a_Postmanager() {

        createCalenderPageHasan.LoginPosManager();

    }

    @When("user should enter Project and clicks the create")
    public void user_should_enter_Project_and_clicks_the_create() throws InterruptedException {
        BrowserUtils.waitFor(4);


        createCalenderPageHasan.project.click();
        Thread.sleep(4000);
        createCalenderPageHasan.create.click();

    }

    @Then("user should be able to see Project Box")
    public void user_should_be_able_to_see_Project_Box() {

        Assert.assertTrue(createCalenderPageHasan.create.isDisplayed());
    }

    @Then("Project Name message box contains “e.g Office Party” text")
    public void project_Name_message_box_contains_e_g_Office_Party_text() {

        BrowserUtils.waitFor(4);

        String expected="e.g. Office Party";
        String actual=createCalenderPageHasan.placeHolder.getAttribute("placeholder");

        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);

        Assert.assertEquals(expected,actual);
    }

    @Then("user can type a project name and save")
    public void user_can_type_a_project_name_and_save() {

         createCalenderPageHasan.projectName.sendKeys(createCalenderPageHasan.ProjectName());
         createCalenderPageHasan.create2.click();


    }

    @Then("user can provide an email")
    public void user_can_provide_an_email() throws InterruptedException {
        BrowserUtils.waitFor(3);
        createCalenderPageHasan.project.click();
        Thread.sleep(4000);
        createCalenderPageHasan.button1.click();
        Thread.sleep(2000);
        createCalenderPageHasan.settings.click();
        Thread.sleep(2000);
        createCalenderPageHasan.emails.click();

        Thread.sleep(3000);

        createCalenderPageHasan.writeEmail.sendKeys(createCalenderPageHasan.ProjectEmail());

        Thread.sleep(2000);
        createCalenderPageHasan.saveBtn.click();


    }

    @Then("if user does not give a name the project there is an error message about invalid box")
    public void if_user_does_not_give_a_name_the_project_there_is_an_error_message_about_invalid_box() throws InterruptedException {
        BrowserUtils.waitFor(4);


        createCalenderPageHasan.project.click();
        Thread.sleep(4000);
        createCalenderPageHasan.create.click();
        Thread.sleep(2000);
        createCalenderPageHasan.create2.click();

        Assert.assertTrue(createCalenderPageHasan.redProject.isDisplayed());

    }

    @Then("“Project Name” text and box get red if no name given")
    public void project_Name_text_and_box_get_red_if_no_name_given() throws InterruptedException {

        Thread.sleep(3000);

         Assert.assertTrue(createCalenderPageHasan.redBox.isDisplayed());
    }

    @Then("created Project appears in the project dashboard")
    public void created_Project_appears_in_the_project_dashboard() {

       Assert.assertTrue(createCalenderPageHasan.createdProject.isDisplayed());
    }

    @Then("total projects number increased {int} after creating a new project")
    public void total_projects_number_increased_after_creating_a_new_project(Integer newPageNum) {

    int actualPageNum= Integer.parseInt(createCalenderPageHasan.pageNum.getText());

        int expectedPageNum=createCalenderPageHasan.NewPageNum()+newPageNum;

        System.out.println("createCalenderPageHasan.NewPageNum() = " + createCalenderPageHasan.NewPageNum());

        System.out.println("expectedPageNum = " + expectedPageNum);
        System.out.println("actualPageNum = " + actualPageNum);

        Assert.assertEquals(expectedPageNum,actualPageNum);


    }

}
