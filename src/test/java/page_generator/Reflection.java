package page_generator;

import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import page_object.Page;
import page_object.custom_annotation.WebElementName;
import spring_config.SpringConfig;

import java.lang.reflect.Field;

public class Reflection {

    public Page getPageByName(String pageName) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        return context.getBean(pageName, Page.class);
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
