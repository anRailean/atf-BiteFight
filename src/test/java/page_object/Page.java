package page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static step_definition.Hooks.driver;

@Component
public abstract class Page {

    private WebElement webElement;

    public Page() {
        PageFactory.initElements(driver, this);
    }
}
