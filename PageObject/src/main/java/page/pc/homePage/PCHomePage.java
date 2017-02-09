package page.pc.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;
import page.pc.loginPage.LoginPage;

public class PCHomePage extends AbstractPCPage {

    @FindBy(css = "span.guide-all-close")
    private WebElement closeButton;

    @FindBy(css = "div.header-nav a[href='http://www.shicaidai.com:80/']")
    private WebElement homePageButton;
    
    @FindBy(css = "div.top-login-info a[href='https://s.shicaidai.com/login.html']")
    private WebElement loginNowButton;

    public PCHomePage(WebDriver driver) throws Exception {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, homePageButton);
        if(isDisplayed(closeButton))
            click(closeButton, PCHomePage.class);
      
    }

    public LoginPage gotoLoginPage() throws Exception {
        return click(loginNowButton, LoginPage.class);
    }

}
