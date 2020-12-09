package com.tolikandco.atf.page_generator;

import com.tolikandco.atf.page_object.Page;
import com.tolikandco.atf.page_object.custom_annotation.WebElementName;
import org.openqa.selenium.WebElement;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class Reflection {

    private final ApplicationContext applicationContext;

    public Reflection(final ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public Page getPageByName(String pageName) {
        return applicationContext.getBean(pageName, Page.class);
    }


    public WebElement getWebElementByName(Page page, String webElementName) {
        Field[] fields = page.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(WebElementName.class) &&
                    field.getAnnotation(WebElementName.class).name().equals(webElementName)) {
                try {
                    field.setAccessible(true);
                    return (WebElement) field.get(page);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
