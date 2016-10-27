package page.app.discover;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.customize.reporter.WebReporter;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import page.app.AbstractAppPage;

public class DebtDetailPage extends AbstractAppPage {

    @FindBy(xpath = "//android.widget.TextView[@text='债务详情']|//UIAStaticText[@name='债务详情']")
    private WebElement debtDetailLabel;

    @FindBy(xpath = "//UIAStaticText[@name='出价记录']")
    private WebElement bidHistoryLabel;

    public DebtDetailPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(debtDetailLabel), DefaultWaitElementTime4Page);
    }

    public DidHistoryPage DebtDetailPageToDidHistoryPage() throws Exception {
        WebReporter.log(appiumDriver, true, true, true);
        int width = appiumDriver.manage().window().getSize().width;
        int height = appiumDriver.manage().window().getSize().height;
        TouchAction gesture = new TouchAction(appiumDriver).press(width / 2, height / 3).release();
        appiumDriver.performTouchAction(gesture);
        return new DidHistoryPage(appiumDriver);
    }
}
