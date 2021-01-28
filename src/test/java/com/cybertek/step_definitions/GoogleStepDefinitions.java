package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GoogleStepDefinitions {

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get("https://www.google.com"); // we call Driver class from utilities and getDriver method
    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedResult = "Google";

        Assert.assertEquals(actualTitle,expectedResult);
    }



}
