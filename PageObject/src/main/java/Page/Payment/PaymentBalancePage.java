package Page.Payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicTool.WaitTool;
import Page.AbstractPage;

public class PaymentBalancePage extends AbstractPage {

    @FindBy(css = "a[ng-href='/pay']")
    private WebElement paymentNowButton;

    @FindBy(css = ".usherbtn")
    private WebElement logoutButton;

    public PaymentBalancePage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(paymentNowButton), 60);
    }

    public PaymentLoginPage logout() throws Exception {
        return click(logoutButton, PaymentLoginPage.class);
    }
}
