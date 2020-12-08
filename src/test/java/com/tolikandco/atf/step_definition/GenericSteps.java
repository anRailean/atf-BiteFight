package com.tolikandco.atf.step_definition;

import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tolikandco.atf.common_action.Action;

import cucumber.api.java.en.Given;

import com.tolikandco.atf.page_generator.Reflection;
import com.tolikandco.atf.page_object.BiteFightMainPage;
import com.tolikandco.atf.scenario_context.ScenarioContext;
import com.tolikandco.atf.spring_config.SpringConfig;

public class GenericSteps {

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);

    ScenarioContext scenarioContext = context.getBean("scenarioContext", ScenarioContext.class);

    Action action = context.getBean("action", Action.class);

    Reflection reflection = context.getBean("reflection", Reflection.class);

    @Given("User is logged in bite fight")
    public void userIsLoggedInBiteFight() throws Exception {
        scenarioContext.setCurrentPage(
                reflection.getPageByName(BiteFightMainPage.MAIN_PAGE
                )
        );
        WebElement loginButton = reflection.getWebElementByName(
                scenarioContext.getCurrentPage(),BiteFightMainPage.LOGIN_BUTTON
        );
        action.clickOnWebElement(loginButton);
    }
}
