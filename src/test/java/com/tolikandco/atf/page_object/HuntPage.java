package com.tolikandco.atf.page_object;

import com.tolikandco.atf.page_object.custom_annotation.WebElementName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component(HuntPage.HUNT_PAGE)
public class HuntPage implements Page {

    public static final String HUNT_PAGE = "Hunt Page";

    public static final String FARM_BUTTON = "Farm Button";

    public static final String BATTLE_REPORT = "Battle Report";

    public static final String HUNT_CONTENT = "Hunt Content";

    @WebElementName(name = FARM_BUTTON)
    @FindBy(xpath = "//*[@id=\"humanhunt\"]/div[2]/div/button")
    WebElement farmButton;

    @WebElementName(name = BATTLE_REPORT)
    @FindBy(xpath = "//*[@id=\"reportResult\"]/div[2]/div")
    private WebElement battleReport;

    @WebElementName(name = HUNT_CONTENT)
    @FindBy(xpath = "//*[@id=\"content\"]/div[3]")
    WebElement huntContent;

}
