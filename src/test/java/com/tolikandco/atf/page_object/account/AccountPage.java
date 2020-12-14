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

    public static final String OVERVIEW_BUTTON = "Overview Button";

    public static final String HUNT_BUTTON = "Hunt Button";

    public static final String HIDEOUT_BUTTON = "Hideout Button";

    @WebElementName(name = CITY_BUTTON)
    @FindBy(name = "//*[@id=\"menuHead\"]/li[5]/a")
    WebElement cityButton;

    @WebElementName(name = OVERVIEW_BUTTON)
    @FindBy(xpath = "//*[@id=\"menuHead\"]/li[2]/a")
    WebElement overviewButton;

    @WebElementName(name = HUNT_BUTTON)
    @FindBy(xpath = "//*[@id=\"menuHead\"]/li[6]/a")
    WebElement huntButton;

    @WebElementName(name = HIDEOUT_BUTTON)
    @FindBy(xpath = "//*[@id=\"menuHead\"]/li[4]/a")
    WebElement hideoutButton;
}
