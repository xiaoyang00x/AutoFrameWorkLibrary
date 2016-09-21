package page.pc.payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class PaymentBalancePage extends AbstractPCPage {

    @FindBy(css = "a[ng-href='/pay']")
    private WebElement paymentNowButton;

    @FindBy(css = ".usherbtn")
    private WebElement logoutButton;

    @FindBy(css = ".btn_dis_prompt")
    private WebElement warningBindBankCardLabel;

    @FindBy(css = ".bottom_account.ng-binding")
    private WebElement accountLabel;

    @FindBy(css = "a.btn.btn-primary")
    private WebElement rechargeButton;

    @FindBy(css = "div.recharge_amount_in input")
    private WebElement rechargeTextField;

    @FindBy(css = "div[ng-hide='moreBanks'].ng-scope .nextstep div.btn")
    private WebElement nextStepButton;

    @FindBy(css = "span[ng-bind-html='limitModalContent']")
    private WebElement limitForLessLimitMoneyLabel;

    public PaymentBalancePage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(accountLabel), 60);
    }

    public PaymentLoginPage logout() throws Exception {
        return click(logoutButton, PaymentLoginPage.class);
    }

    public PaymentBalancePage clickRechargeButton() throws Exception {
        return click(rechargeButton, PaymentBalancePage.class);
    }

    public PaymentBalancePage setInputRechargeTextField(String money) {
        setInputText(rechargeTextField, money);
        return new PaymentBalancePage(driver);
    }

    public PaymentBalancePage clickNextStepButton() throws Exception {
        click(nextStepButton, limitForLessLimitMoneyLabel);
        return this;
    }

}
