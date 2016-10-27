package page.app.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class CertificationCenterPage extends AbstractAppPage {
    @FindBy(xpath = "//android.widget.TextView[@text='认证中心']|//UIAStaticText[@name='认证中心']")
    private WebElement certificationCenterLabel;

    public CertificationCenterPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(certificationCenterLabel),
                DefaultWaitElementTime4Page);

    }

}
