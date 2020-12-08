package com.tolikandco.atf.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;
import com.tolikandco.atf.page_object.custom_annotation.WebElementName;

@Component(BiteFightMainPage.MAIN_PAGE)
public class BiteFightMainPage extends Page {

    public static final String MAIN_PAGE = "Main Page";

    public static final String GAME_ROUND = "Game Round";

    public static final String USER_NAME_FIELD = "User Name Field";

    public static final String PASSWORD_FIELD = "Password Field";

    public static final String LOGIN_BUTTON = "Login Button";


    @FindBy(xpath = "//*[@id=\"loginSrv\"]")
    private WebElement gameRound;

    @FindBy(xpath = "//*[@id=\"loginName\"]")
    private WebElement userNameField;

    @FindBy(xpath = "//*[@id=\"loginPw\"]")
    private WebElement passwordField;

    @WebElementName(name = LOGIN_BUTTON)
    @FindBy(xpath = "//*[@id=\"loginButton\"]")
    private WebElement loginButton;

}
