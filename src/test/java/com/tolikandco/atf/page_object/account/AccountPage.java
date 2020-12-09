package com.tolikandco.atf.page_object.account;

import com.tolikandco.atf.page_object.Page;
import com.tolikandco.atf.page_object.custom_annotation.WebElementName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component(AccountPage.ACCOUNT_PAGE)
public class AccountPage implements Page {

    public static final String ACCOUNT_PAGE = "Account Page";

    public static final String CITY_BUTTON = "City Button";

    public static final String WEB_ELEMENT_FOR_ASSERTION = "Web Element Assertion";

    @WebElementName(name = CITY_BUTTON)
    @FindBy(name = "//*[@id=\"menuHead\"]/li[5]/a")
    WebElement cityButton;

    @WebElementName(name = WEB_ELEMENT_FOR_ASSERTION)
    @FindBy(name = "//*[@id=\"menuHead\"]/li[2]/a")
    WebElement webElementForAssertion;

    public String getWebElementForAssertion() {
        return WEB_ELEMENT_FOR_ASSERTION;
    }
}
