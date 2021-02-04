package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "//h1[@id='firstHeading']")
    public WebElement mainHeaderAfterSearch;

    @FindBy (className= "fn")
    public WebElement imageHeaderAfterSearch;



}
