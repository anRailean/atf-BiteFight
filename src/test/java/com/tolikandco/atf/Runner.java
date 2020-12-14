package com.tolikandco.atf;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature"},
        glue = {"com/tolikandco/atf/step_definition"},
        tags = "@LoginProcess")
public class Runner {
}
