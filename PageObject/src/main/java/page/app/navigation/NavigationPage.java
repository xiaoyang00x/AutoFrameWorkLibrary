package page.app.navigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;
import page.app.discover.DiscoverPage;

public class NavigationPage extends AbstractAppPage {

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='借贷']")
    private WebElement borrowAndLendButton;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='好友']")
    private WebElement friendButton;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='发现']")
    private WebElement discoverButton;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='钱包']")
    private WebElement walletButton;

    public NavigationPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(borrowAndLendButton),
                DefaultWaitElementTime4Page);
    }

    public DiscoverPage navigationToDiscover() throws Exception {
        return click(discoverButton, DiscoverPage.class);
    }

}
