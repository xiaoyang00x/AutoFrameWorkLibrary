package page.app.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class WalletPage extends AbstractAppPage {

    @FindBy(xpath = "//UIAStaticText[@name='钱包']|//android.widget.RelativeLayout/android.widget.TextView[@text='钱包']")
    private WebElement walletLabel;

    @FindBy(xpath = "//UIATableCell[3]/UIAButton[1]|//android.widget.TextView[@text='余额生息']")
    private WebElement tradeCaptialButton;

    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.view.View[1]|//UIAApplication/UIAWindow/UIATableView/UIAButton[1]")
    private WebElement photoButton;

    public WalletPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(walletLabel), DefaultWaitElementTime4Page);

    }

    public TradeCaptialPage NavigationToTradeCaptialPage() throws Exception {
        return click(tradeCaptialButton, TradeCaptialPage.class);
    }

    public PersonalInformationPage ToPersonalInformatinPage() throws Exception {
        return click(photoButton, PersonalInformationPage.class);
    }

}
