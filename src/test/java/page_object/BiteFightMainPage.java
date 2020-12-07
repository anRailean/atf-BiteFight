package page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;
import page_object.custom_annotation.WebElementName;

@Component("Main Page")
public class BiteFightMainPage extends Page{

    public BiteFightMainPage(){
        super();
    }

    @FindBy(xpath = "//*[@id=\"loginSrv\"]")
    private WebElement gameRound;

    @FindBy(xpath = "//*[@id=\"loginName\"]")
    private WebElement userNameField;

    @FindBy(xpath = "//*[@id=\"loginPw\"]")
    private WebElement passwordField;

    @WebElementName(name = "Login Button")
    @FindBy(xpath = "//*[@id=\"loginButton\"]")
    private WebElement loginButton;

    public WebElement getGameRound() {
        return gameRound;
    }

    public WebElement getUserNameField() {
        return userNameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
