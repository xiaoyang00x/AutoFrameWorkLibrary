package page.app.setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;
import page.app.borrowAndLend.BorrowAndLendPage;

public class ControlDirectoriesPage extends AbstractAppPage {

    @FindBy(xpath = "//UIAApplication/UIAWindow/UIAButton[@name='开始匹配']|//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[@text='我知道了']")
    private WebElement startMatchButton;

    public ControlDirectoriesPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(startMatchButton), DefaultWaitElementTime4Page);
    }

    public BorrowAndLendPage clickstartMatchOnBorrowAndLendPage() throws Exception {
        return click(startMatchButton, BorrowAndLendPage.class);
    }

}
