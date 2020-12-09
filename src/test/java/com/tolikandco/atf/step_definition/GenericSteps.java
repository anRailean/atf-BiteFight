package com.tolikandco.atf.step_definition;

import com.tolikandco.atf.common_action.Action;
import com.tolikandco.atf.page_generator.Reflection;
import com.tolikandco.atf.page_object.BiteFightMainPage;
import com.tolikandco.atf.scenario_context.ScenarioContext;
import com.tolikandco.atf.spring_config.SpringConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.tolikandco.atf.util.PropertyConfigurator.getProperty;

public class GenericSteps {

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);

    ScenarioContext scenarioContext = context.getBean("scenarioContext", ScenarioContext.class);

    Action action = context.getBean("action", Action.class);

    Reflection reflection = context.getBean("reflection", Reflection.class);

    @Given("User is logged in bite fight")
    public void userIsLoggedInBiteFight() {
        scenarioContext.setCurrentPage(
                reflection.getPageByName(BiteFightMainPage.MAIN_PAGE
                )
        );
        WebElement dropDownButton = reflection.getWebElementByName(
                scenarioContext.getCurrentPage(), BiteFightMainPage.GAME_ROUND_DROP_DOWN
        );
        action.selectValueFromDropDown(dropDownButton, BiteFightMainPage.VALUE_FROM_DROP_DOWN);

        WebElement userNameField = reflection.getWebElementByName(
                scenarioContext.getCurrentPage(), BiteFightMainPage.USER_NAME_FIELD
        );
        action.sendKeys(userNameField, getProperty("USERNAME"));

        WebElement passwordField = reflection.getWebElementByName(
                scenarioContext.getCurrentPage(), BiteFightMainPage.PASSWORD_FIELD
        );
        action.sendKeys(passwordField, getProperty("PASSWORD"));

        WebElement loginButton = reflection.getWebElementByName(
                scenarioContext.getCurrentPage(), BiteFightMainPage.LOGIN_BUTTON
        );
        action.clickOnWebElement(loginButton);
    }


    @Then("User is on {string}")
    public void userIsOnMainPage(String pageName) {
        scenarioContext.setCurrentPage(reflection.getPageByName(pageName));
        WebElement webElementForAssertion = reflection.getWebElementByName(
                scenarioContext.getCurrentPage(), "City Button"
        );
        action.clickOnWebElement(webElementForAssertion);
    }


    @Then("{string} is displayed")
    public void webElementIsDisplayed(String webElement) {
        action.isAt(reflection.getWebElementByName(scenarioContext.getCurrentPage(), webElement));
    }
}
