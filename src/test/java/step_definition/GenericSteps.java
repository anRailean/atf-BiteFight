package step_definition;


import common_action.Action;
import cucumber.api.java.en.Given;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import page_generator.Reflection;
import scenario_context.ScenarioContext;
import spring_config.SpringConfig;

public class GenericSteps {

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);

    ScenarioContext scenarioContext = context.getBean("scenarioContext", ScenarioContext.class);

    Action action = context.getBean("action", Action.class);

    Reflection reflection = context.getBean("reflection", Reflection.class);


    @Given("User is logged in bite fight")
    public void userIsLoggedInBiteFight() throws Exception {
        scenarioContext.setCurrentPage
                (reflection.getPageByName("Main Page"));
        action.clickOnWebElement(reflection.getWebElementByName
                (scenarioContext.getCurrentPage(), "Login Button"));
    }
}
