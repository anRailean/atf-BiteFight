package com.tolikandco.atf.scenario_context;

import com.tolikandco.atf.page_object.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static com.tolikandco.atf.step_definition.Hooks.driver;

@Component
public class ScenarioContext {

    private Page currentPage;
    private WebElement webElement;

    public void setCurrentPage(Page currentPage) {
        this.currentPage = currentPage;
        PageFactory.initElements(driver, currentPage);
    }

    public Page getCurrentPage() {
        return currentPage;
    }

    public void setWebElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public WebElement getWebElement() {
        return webElement;
    }

}
