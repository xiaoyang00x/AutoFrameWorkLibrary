package page.app.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class PersonalInformationPage extends AbstractAppPage {

    @FindBy(xpath = "//android.widget.TextView[@text='认证中心']|//UIAStaticText[@name='认证中心']")
    private WebElement certificationCenterButton;

    public PersonalInformationPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(certificationCenterButton),
                DefaultWaitElementTime4Page);

    }

    public CertificationCenterPage ToCertificationCenterPage() throws Exception {
        return click(certificationCenterButton, CertificationCenterPage.class);
    }

}
