package com.tolikandco.atf.scenario_context;

import com.tolikandco.atf.page_object.Page;

import static com.tolikandco.atf.step_definition.Hooks.driver;

import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class ScenarioContext {

    private static Page currentPage;

    public void setCurrentPage(Page currentPage) {
        ScenarioContext.currentPage = currentPage;
        PageFactory.initElements(driver, currentPage);
    }

    public Page getCurrentPage() {
        return currentPage;
    }

}
