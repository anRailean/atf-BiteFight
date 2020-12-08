package com.tolikandco.atf.common_action;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class Action {

    public void clickOnWebElement(WebElement webElement) {
        webElement.click();
    }
}
