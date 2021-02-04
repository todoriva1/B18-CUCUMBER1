package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleStepDefinitions {

    //creating the page object
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

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


    @When("User searches apple")
    public void userSearchesApple() {



        //sending value into search box using page object
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {

        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }



    @When("User searches {string}")
    public void userSearches(String searchValue) {  // we can only change argument here after generated in feature file to here


        //sending value into search box using page object
        googleSearchPage.searchBox.sendKeys(searchValue + Keys.ENTER); // this is "parametarization, because
        // we put "searchValue" inside method instead of "apple" like we did above

    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {

        String expectedTitle = searchValue + " - Google Search";  // parametrazition again - "searchValue"  and not apple
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }




    @Then("User can see five links in the footer")
    public void user_can_see_five_links_in_the_footer(List<String> linkStrings) {

       int expectedSize = linkStrings.size(); // this one is in feature file, tamo sabere koliko ima
       int actualSize = googleSearchPage.footerLinks.size(); // ovo je preko googleSearchPage objecta i metode footerLinks.

        Assert.assertEquals(actualSize,expectedSize);

    }
}
