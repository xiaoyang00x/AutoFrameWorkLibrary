package page.app.borrowAndLend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;
import page.app.discover.DiscoverPage;

public class BorrowAndLendPage extends AbstractAppPage {

    @FindBy(xpath = "//UIAStaticText[@name='借贷']|//android.widget.TextView[@text='借钱']")
    private WebElement borrowTitleLable;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[@text='发现']")
    private WebElement discoverButton;

    public BorrowAndLendPage(AppiumDriver driver) {
        super(driver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(borrowTitleLable), DefaultWaitElementTime4Page);
    }

    public DiscoverPage navigationToDiscover() throws Exception {
        return click(discoverButton, DiscoverPage.class);
    }

}
