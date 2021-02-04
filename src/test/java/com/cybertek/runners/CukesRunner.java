package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html", // grouping the things - cucumber report -> mozes videti inside target folder kad run this class
        features = "src/test/resources/features", // path to feature file
        glue = "com/cybertek/step_definitions", // step definition path
        dryRun = false, // false will run our code actually,
        tags = "@googleTable"

)
public class CukesRunner {



}
