package com.tolikandco.atf.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component("City Page")
public class CityPage {

    public CityPage(){
        super();
    }

    @FindBy(xpath = "//*[@id=\"addBuddy\"]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/a")
    private WebElement merchant;

    @FindBy(xpath = "//*[@id=\"addBuddy\"]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/a")
    private WebElement graveyard;

    @FindBy(xpath = "//*[@id=\"addBuddy\"]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]/a")
    private WebElement tavern;

    @FindBy(xpath = "//*[@id=\"addBuddy\"]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]/a")
    private WebElement grotto;

}
