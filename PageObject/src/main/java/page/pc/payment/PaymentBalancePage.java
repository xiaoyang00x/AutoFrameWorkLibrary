package page.pc.payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.customize.reporter.WebReporter;

import basicTool.WaitTool;
import basicTool.window.WindowsUtil;
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

    @FindBy(css = "div.recharge_method_top.clearfix a")
    private WebElement viewRechargeLimitLink;

    @FindBy(css = ".modal-content")
    private WebElement rechargeLimitLabel;

    @FindBy(css = "button[ng-click='cancel()']")
    private WebElement canelButton;

    @FindBy(css = "span.reverse2.fl")
    private WebElement choiceOtherBankLink;

    @FindBy(css = "div[ng-show='moreBanks'] div[ng-include=\"'components/footer/bottom.html'\"] div.btn.btn-primary.pull-right.clearfix")
    private WebElement choiceBankCardNextStepButton;

    @FindBy(css = "div[ng-include=\"'components/footer/bottom.html'\"][ng-hide='moreBanks'] button")
    private WebElement choiceBankCardConfirmRechargeButton;

    // other bank label
    @FindBy(css = "i.bankIcon-sm.ICBC.fl")
    private WebElement ICBCBankRadio;

    @FindBy(css = "#tabs")
    private WebElement ICBCRechargeLabel;

    @FindBy(css = "i.bankIcon-sm.CCB.fl")
    private WebElement CCBBankRadio;

    @FindBy(css = "div.PayForContainer_Head_Logo")
    private WebElement CCBRechargeLabel;

    @FindBy(css = "i.bankIcon-sm.PSBC.fl")
    private WebElement PSBCBankRadio;

    @FindBy(css = "form[name='form1']")
    private WebElement PSBCRechargeLabel;

    @FindBy(css = "i.bankIcon-sm.ABC.fl")
    private WebElement ABCBankRadio;

    @FindBy(css = "div.zh_home_head")
    private WebElement ABCRechargeLabel;

    @FindBy(css = "i.bankIcon-sm.CMB.fl")
    private WebElement CMBBankRadio;

    @FindBy(css = "#AllElementContainer")
    private WebElement CMBRechargeLabel;

    @FindBy(css = "i.bankIcon-sm.SPDB.fl")
    private WebElement SPDBBankRadio;

    @FindBy(css = "body[onload='onLogin();']")
    private WebElement SPDBRechargeLabel;

    @FindBy(css = "i.bankIcon-sm.GDB.fl")
    private WebElement GDBBankRadio;

    @FindBy(css = "table#layout")
    private WebElement GDBRechargeLabel;

    @FindBy(css = "i.bankIcon-sm.CMBC.fl")
    private WebElement CMBCBankRadio;

    @FindBy(css = "div.logtop_m")
    private WebElement CMBCRechargeLabel;

    @FindBy(css = "div.fl.union_pay_right i.bankIcon-sm.yinlian.fl")
    private WebElement bankGourpRadio;

    @FindBy(css = "div.pay_tab")
    private WebElement bankGourpRechargeLabel;

    // @FindBy(css = "i.bankIcon-sm.HXB.fl")
    // private WebElement HXBBankRadio;
    //
    // @FindBy(css = "")
    // private WebElement HXBRechargeLabel;

    // @FindBy(css = "i.bankIcon-sm.CEB.fl")
    // private WebElement CEBBankRadio;
    //
    // @FindBy(css = "")
    // private WebElement CEBRechargeLabel;

    @FindBy(css = "i.bankIcon-sm.PABC.fl")
    private WebElement PABCBankRadio;

    @FindBy(css = "div.tab_content.index_bg")
    private WebElement PABCRechargeLabel;

    @FindBy(css = "div.checkmy a[ng-href='/']")
    private WebElement rechargeSuccessButton;

    @FindBy(css = "i.glyphicon.glyphicon-remove")
    private WebElement rechargeFailedButton;

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

    public PaymentBalancePage clickViewRechargeLimitLink() throws Exception {
        click(viewRechargeLimitLink, rechargeLimitLabel);
        return click(canelButton, PaymentBalancePage.class);
    }

    public PaymentBalancePage rechargeByICBC() throws Exception {
        click(choiceOtherBankLink, ICBCBankRadio);
        return jumpToOtherBankRechargePage(ICBCBankRadio, ICBCRechargeLabel);
    }

    public PaymentBalancePage rechargeByCCB() throws Exception {
        click(choiceOtherBankLink, CCBBankRadio);
        return jumpToOtherBankRechargePage(CCBBankRadio, CCBRechargeLabel);
    }

    public PaymentBalancePage rechargeByPSBC() throws Exception {
        click(choiceOtherBankLink, PSBCBankRadio);
        return jumpToOtherBankRechargePage(PSBCBankRadio, PSBCRechargeLabel);
    }

    public PaymentBalancePage rechargeByABC() throws Exception {
        click(choiceOtherBankLink, ABCBankRadio);
        return jumpToOtherBankRechargePage(ABCBankRadio, ABCRechargeLabel);
    }

    public PaymentBalancePage rechargeByCMB() throws Exception {
        click(choiceOtherBankLink, CMBBankRadio);
        return jumpToOtherBankRechargePage(CMBBankRadio, CMBRechargeLabel);
    }

    public PaymentBalancePage rechargeBySPDB() throws Exception {
        click(choiceOtherBankLink, SPDBBankRadio);
        return jumpToOtherBankRechargePage(SPDBBankRadio, SPDBRechargeLabel);
    }

    public PaymentBalancePage rechargeByGDB() throws Exception {
        click(choiceOtherBankLink, GDBBankRadio);
        return jumpToOtherBankRechargePage(GDBBankRadio, GDBRechargeLabel);
    }

    public PaymentBalancePage rechargeByCMBC() throws Exception {
        click(choiceOtherBankLink, CMBCBankRadio);
        return jumpToOtherBankRechargePage(CMBCBankRadio, CMBCRechargeLabel);
    }

    public PaymentBalancePage rechargeByPABC() throws Exception {
        click(choiceOtherBankLink, PABCBankRadio);
        return jumpToOtherBankRechargePage(PABCBankRadio, PABCRechargeLabel);
    }

    public PaymentBalancePage rechargeByBankGroup() throws Exception {
        click(choiceOtherBankLink, bankGourpRadio);
        return jumpToOtherBankRechargePage(bankGourpRadio, bankGourpRechargeLabel);
    }

    public PaymentBalancePage jumpToOtherBankRechargePage(WebElement choiceBankRadio,
            WebElement rechargePageWaitElement) throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);
        click(choiceBankRadio, choiceBankCardNextStepButton);
        click(choiceBankCardNextStepButton, choiceBankCardConfirmRechargeButton);
        click(choiceBankCardConfirmRechargeButton);
        WindowsUtil.getInstance(driver).switchWindow();
        if (rechargePageWaitElement == ABCRechargeLabel) {
            driver.switchTo().alert().accept();
            driver.switchTo().alert().accept();
        } else if (rechargePageWaitElement == SPDBRechargeLabel)
            driver.switchTo().alert().accept();
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(rechargePageWaitElement), 60);
        WebReporter.log(driver, driver.getTitle(), true, true);
        WindowsUtil.getInstance(driver).switchBackToPreviousWindow();
        return this;
    }

    public PaymentBalancePage rechargeSuccess() throws Exception {
        return click(rechargeSuccessButton, PaymentBalancePage.class);
    }

    public RechargeErrorPage rechargeFailed() throws Exception {
        return click(rechargeFailedButton, RechargeErrorPage.class);
    }

}
