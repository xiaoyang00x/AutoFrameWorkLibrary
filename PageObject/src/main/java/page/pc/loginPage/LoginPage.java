package page.pc.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;
import page.pc.homePage.PCHomePage;

public class LoginPage extends AbstractPCPage {

    @FindBy(css = "#userName")
    private WebElement userNameTextField;

    @FindBy(css = "#password")
    private WebElement passwordTextField;

    @FindBy(css = "#loginBtn")
    private WebElement loginButton;
    
    
    public LoginPage(WebDriver driver) throws Exception {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, userNameTextField);

    }

    
    public PCHomePage login(String userName,String password) throws Exception{
        setInputText(userNameTextField,userName);
        setInputText(passwordTextField,password);
        return click(loginButton,PCHomePage.class);
    }
    

}