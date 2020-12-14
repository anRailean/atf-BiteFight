package com.tolikandco.atf.page_object;

import com.tolikandco.atf.page_object.custom_annotation.WebElementName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component(LoginPage.LOGIN_PAGE)
public class LoginPage implements Page {

    public static final String LOGIN_PAGE = "Login Page";

    public static final String LOGIN_ERROR_MESSAGE = "Error Message";

    @WebElementName(name = LOGIN_ERROR_MESSAGE)
    @FindBy(xpath = "//*[@id=\"fullContent\"]/div/h2")
    private WebElement loginErrorMessage;
}
