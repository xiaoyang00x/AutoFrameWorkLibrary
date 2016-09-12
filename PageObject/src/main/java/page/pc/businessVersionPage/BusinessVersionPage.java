package page.pc.businessVersionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class BusinessVersionPage extends AbstractPCPage {

    @FindBy(css = "[href='news.html']")
    private WebElement newsLabel;

    @FindBy(css = ".media.banner-block .home-btn.btn-blue")
    private WebElement signupButtonOne;

    @FindBy(css = ".f4")
    private WebElement loginLink;

    @FindBy(css = "a[href='help-page.html#融资']")
    private WebElement knowMoreButton;

    public CompanySignUpPage clickSignUpOne() throws Exception {
        return click(signupButtonOne, CompanySignUpPage.class);
    }

    public CompanyLoginPage clickLoginLink() throws Exception {
        return click(loginLink, CompanyLoginPage.class);
    }

    public financingLabelPage clickKnowMoreButton() throws Exception {
        return click(knowMoreButton, financingLabelPage.class);
    }

    public BusinessVersionPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, newsLabel);
    }

}
