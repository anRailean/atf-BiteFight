package com.tolikandco.atf.step_definition;

import com.tolikandco.atf.common_action.Action;
import com.tolikandco.atf.page_generator.Reflection;
import com.tolikandco.atf.page_object.BiteFightMainPage;
import com.tolikandco.atf.scenario_context.ScenarioContext;
import com.tolikandco.atf.spring_config.SpringConfig;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.tolikandco.atf.util.PropertyConfigurator.getProperty;

public class GenericSteps {

    ApplicationContext context =
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
        action.selectValueFromDropDown(dropDownButton, BiteFightMainPage.COUNTY_34_VALUE);

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
    public void userIsOnPage(String pageName) {
        scenarioContext.setCurrentPage(
                reflection.getPageByName(pageName)
        );
    }

    @Then("{string} is displayed")
    public void webElementIsDisplayed(String webElement) {
        action.isAt(
                reflection.getWebElementByName(
                        scenarioContext.getCurrentPage(), webElement
                )
        );
    }

    @And("User clicks on {string} in {string}")
    public void userNavigateToPageOnAccount(String webElement, String pageName) {
        scenarioContext.setCurrentPage(
                reflection.getPageByName(pageName)
        );
        scenarioContext.setWebElement(
                reflection.getWebElementByName(
                        scenarioContext.getCurrentPage(), webElement
                )
        );
        action.clickOnWebElement(
                scenarioContext.getWebElement()
        );
    }

    @When("User clicks in {string}")
    public void userClicksIn(String webElement) {
        scenarioContext.setWebElement(
                reflection.getWebElementByName(
                        scenarioContext.getCurrentPage(), webElement
                )
        );
        action.clickOnWebElement(
                scenarioContext.getWebElement()
        );
    }

    @And("User provides (.*) in (.*)")
    public void userEntersIn(String credentials, String field) {
        scenarioContext.getCurrentPage();
        scenarioContext.setWebElement(
                reflection.getWebElementByName(
                        scenarioContext.getCurrentPage(), field
                )
        );
        action.sendKeys(scenarioContext.getWebElement(), credentials);
    }

    @And("User selects (.*) from (.*)")
    public void userSelectsValueFromDropDown(String value, String field) {
        scenarioContext.getCurrentPage();
        scenarioContext.setWebElement(
                reflection.getWebElementByName(
                        scenarioContext.getCurrentPage(), field
                )
        );
        action.selectValueFromDropDown(
                scenarioContext.getWebElement(), value
        );
    }
}
