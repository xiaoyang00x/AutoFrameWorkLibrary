package page.app.discover;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class MoneyJournalPage extends AbstractAppPage {

    @FindBy(xpath = "//android.view.View[@content-desc='全部头条攻略理财']|//UIAStaticText[@name='全部']")
    private WebElement pageLabel;

    public MoneyJournalPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(pageLabel), DefaultWaitElementTime4Page);

    }

}
