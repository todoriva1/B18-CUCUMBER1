package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {

        Driver.getDriver().get("https://en.wikipedia.org/wiki/Main_Page");

    }


    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String kuracNeki) {

        wikiSearchPage.searchBox.sendKeys(kuracNeki + Keys.ENTER);

    }


    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expectedNekiKurac) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedNekiKurac));

    }





    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expected) {

   String actualHeaderText = wikiSearchPage.mainHeaderAfterSearch.getText();

    Assert.assertEquals(actualHeaderText, expected); // nije radio ovaj test, nemam pojma zasto

    }
}
