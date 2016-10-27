package page.app.discover;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class DidHistoryPage extends AbstractAppPage {
    @FindBy(xpath = "//android.widget.TextView[@text='出价记录']|//UIAStaticText[@name='出价记录']")
    private WebElement bidHistoryLabel;

    public DidHistoryPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(bidHistoryLabel), DefaultWaitElementTime4Page);
    }

}
