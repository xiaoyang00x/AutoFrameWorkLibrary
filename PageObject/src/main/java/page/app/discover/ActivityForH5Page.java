package page.app.discover;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class ActivityForH5Page extends AbstractAppPage {

    @FindBy(xpath = "//UIAButton[@name='返回']")
    private WebElement returnButton;

    public ActivityForH5Page(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(returnButton), DefaultWaitElementTime4Page);
        new WebDriverWait(appiumDriver, 10);

    }

}
