package page.app.discover;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class DiscoverPage extends AbstractAppPage {

    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[@text='发现']")
    private WebElement discoverLabel;

    @FindBy(xpath = "//android.widget.TextView[@text='投资有道']")
    private WebElement MoneyJournalButton;

    public DiscoverPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(discoverLabel), DefaultWaitElementTime4Page);
    }

    public MoneyJournalPage clickMoneyJournalButton() throws Exception {
        return click(MoneyJournalButton, MoneyJournalPage.class);
    }

}
