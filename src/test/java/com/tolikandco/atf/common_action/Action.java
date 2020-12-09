package com.tolikandco.atf.common_action;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import static com.tolikandco.atf.step_definition.Hooks.driver;

@Component
public class Action {

    final Wait<WebDriver> wait = new WebDriverWait(driver, 5).
            ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);

    public void clickOnWebElement(WebElement webElement) {
//        wait.until(ExpectedConditions.visibilityOf(webElement));
//        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public void sendKeys(WebElement field, String inputData) {
        wait.until(ExpectedConditions.visibilityOf(field));
        wait.until(ExpectedConditions.elementToBeClickable(field));
        field.clear();
        field.sendKeys(inputData);
    }

    public void webElementContainsText(WebElement webElement, String text) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void selectValueFromDropDown(WebElement webElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        Select dropDown = new Select(webElement);
        dropDown.selectByValue(value);
    }

    public void isAt(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        Assert.assertTrue(webElement.isDisplayed());
    }

}
