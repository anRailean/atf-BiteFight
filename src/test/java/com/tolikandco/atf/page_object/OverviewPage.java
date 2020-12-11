package com.tolikandco.atf.page_object;

import com.tolikandco.atf.page_object.custom_annotation.WebElementName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component(OverviewPage.OVERVIEW_PAGE)
public class OverviewPage implements Page {

    public static final String OVERVIEW_PAGE = "Overview Page";

    public static final String WEB_ELEMENT_FOR_ASSERTION = "Web Element Assertion";

    @WebElementName(name = WEB_ELEMENT_FOR_ASSERTION)
    @FindBy(name = "//*[@id=\"menuHead\"]/li[2]")
    WebElement webElementForAssertion;

    @Override
    public String getWebElementForAssertion() {
        return WEB_ELEMENT_FOR_ASSERTION;
    }
}
