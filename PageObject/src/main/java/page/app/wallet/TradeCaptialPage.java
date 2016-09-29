package page.app.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class TradeCaptialPage extends AbstractAppPage {

    @FindBy(xpath = "//UIAStaticText[@name='余额生息']|//android.widget.TextView[@text='余额生息']")
    private WebElement tradeCaptialLabel;

    public TradeCaptialPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(tradeCaptialLabel), DefaultWaitElementTime4Page);
    }

}
