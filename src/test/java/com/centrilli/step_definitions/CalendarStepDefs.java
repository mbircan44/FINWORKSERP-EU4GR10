package com.centrilli.step_definitions;

import com.centrilli.pages.CalendarPage;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarStepDefs {

    CalendarPage calendarPage = new CalendarPage();
    BasePage basepage = new BasePage();

    @When("User goes to Calendar page")
    public void userGoesToCalendarPage() throws InterruptedException {
        Thread.sleep(3000);
        basepage.CalendarTab.click();
        Thread.sleep(3000);
        BrowserUtils.waitForPageToLoad(3000);
    }
    @When("Click any cell, create note as Team Meeting and click create")
    public void clicksAnyCellCreatesNoteAndClickCreate() throws InterruptedException {

        calendarPage.calendarInput.click();
        calendarPage.createInput.sendKeys("Team Meeting");
        calendarPage.createButton.click();

    }
    @Then("Verify that Open: Team Meeting is displayed")
    public void verifyThatOpenBODMeetingIsDisplayed() {

        calendarPage.meetingLog.click();
        String expectedMessage = "Open: Team Meeting";
        String actualMessage = calendarPage.meetingLog.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @When("User goes to Notes page")
    public void userGoesToNotesPage() {
        calendarPage.notesTab.click();
    }
}
