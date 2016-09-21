package page.pc.payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class RechargeErrorPage extends AbstractPCPage {

    @FindBy(css = "div.checkMC a")
    private WebElement checkoutMineLink;

    @FindBy(css = "button.usherbtn")
    private WebElement logoutButton;

    public RechargeErrorPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(checkoutMineLink), 60);
    }

    public PaymentBalancePage clickCheckoutMineLink() throws Exception {
        return click(checkoutMineLink, PaymentBalancePage.class);
    }

    public PaymentLoginPage clickLogoutButton() throws Exception {
        return click(logoutButton, PaymentLoginPage.class);
    }

}
