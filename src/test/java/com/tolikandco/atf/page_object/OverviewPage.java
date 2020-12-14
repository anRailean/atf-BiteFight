package com.tolikandco.atf.page_object;

import com.tolikandco.atf.page_object.custom_annotation.WebElementName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component(OverviewPage.OVERVIEW_PAGE)
public class OverviewPage implements Page {

    public static final String OVERVIEW_PAGE = "Overview Page";

    public static final String OVERVIEW_CONTENT = "Overview Header";

    @WebElementName(name = OVERVIEW_CONTENT)
    @FindBy(name = "//*[@id=\"userLogo\"]/img")
    private WebElement overviewContent;
}
