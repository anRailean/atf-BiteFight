package com.tolikandco.atf.page_object;

import com.tolikandco.atf.page_object.custom_annotation.WebElementName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component(BiteFightMainPage.MAIN_PAGE)
public class BiteFightMainPage implements Page {

    public static final String MAIN_PAGE = "Main Page";

    public static final String GAME_ROUND_DROP_DOWN = "Game Round Drop Down";

    public static final String USER_NAME_FIELD = "User Name Field";

    public static final String PASSWORD_FIELD = "Password Field";

    public static final String LOGIN_BUTTON = "Login Button";

    public static final String COUNTY_34_VALUE = "County 34";

    public static final String LOGIN_FORM = "Login Form";

    @WebElementName(name = GAME_ROUND_DROP_DOWN)
    @FindBy(xpath = "//*[@id=\"loginSrv\"]")
    private WebElement gameRoundDropDown;

    @WebElementName(name = USER_NAME_FIELD)
    @FindBy(xpath = "//*[@id=\"loginName\"]")
    private WebElement userNameField;

    @WebElementName(name = PASSWORD_FIELD)
    @FindBy(xpath = "//*[@id=\"loginPw\"]")
    private WebElement passwordField;

    @WebElementName(name = LOGIN_BUTTON)
    @FindBy(xpath = "//*[@id=\"loginButton\"]")
    private WebElement loginButton;

    @WebElementName(name = LOGIN_FORM)
    @FindBy(name = "//*[@id=\"loginForm\"]")
    private WebElement loginForm;
}
