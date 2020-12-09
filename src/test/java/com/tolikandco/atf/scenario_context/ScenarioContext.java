package com.tolikandco.atf.scenario_context;

import com.tolikandco.atf.page_object.Page;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static com.tolikandco.atf.step_definition.Hooks.driver;

@Component
public class ScenarioContext {

    private Page currentPage;


    public void setCurrentPage(Page currentPage) {
        this.currentPage = currentPage;
        PageFactory.initElements(driver, currentPage);
    }

    public Page getCurrentPage() {
        return currentPage;
    }

}
