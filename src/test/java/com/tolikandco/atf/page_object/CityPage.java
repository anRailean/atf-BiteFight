package com.tolikandco.atf.page_object;

import com.tolikandco.atf.page_object.custom_annotation.WebElementName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component(CityPage.CITY_PAGE)
public class CityPage implements Page {

    public static final String CITY_PAGE = "City Page";

    public static final String WEB_ELEMENT_FOR_ASSERTION = "Web Element Assertion";

    @FindBy(xpath = "//*[@id=\"addBuddy\"]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/a")
    private WebElement merchant;

    @FindBy(xpath = "//*[@id=\"addBuddy\"]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/a")
    private WebElement graveyard;

    @FindBy(xpath = "//*[@id=\"addBuddy\"]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]/a")
    private WebElement tavern;

    @FindBy(xpath = "//*[@id=\"addBuddy\"]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]/a")
    private WebElement grotto;

    @WebElementName(name = WEB_ELEMENT_FOR_ASSERTION)
    @FindBy(name = "//*[@id=\"header\"]/h1")
    private WebElement webElementForAssertion;

    @Override
    public String getWebElementForAssertion() {
        return WEB_ELEMENT_FOR_ASSERTION;
    }

}
