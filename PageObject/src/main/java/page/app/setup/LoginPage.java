package page.app.setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class LoginPage extends AbstractAppPage {

    @FindBy(xpath = "//UIAApplication/UIAWindow/UIAButton[@name='登录']")
    private WebElement loginButton;

    @FindBy(xpath = "//UIAApplication/UIAWindow/UIAButton[@name='注册']")
    private WebElement registerButton;

    @FindBy(xpath = "//UIAApplication/UIAWindow/UIATextField/UIATextField[@value=请输入手机号]")
    private WebElement userNameTextField;

    @FindBy(xpath = "//UIAApplication/UIAWindow/UIATextField/UIATextField[@value=请输入借贷宝登录密码]")
    private WebElement passWordTextField;

    protected LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public LoginPage login(String userName, String passWord) {
        setInputText(userNameTextField, userName);
        setInputText(userNameTextField, passWord);
        return this;
    }

}
