package page.app.discover;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.customize.reporter.WebReporter;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import page.app.AbstractAppPage;

public class RrcEntrancePage extends AbstractAppPage {

    @FindBy(xpath = "//android.widget.TextView[@text='逾期债权']")
    private WebElement overdueLabel;

    @FindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.ImageView[1]")
    private WebElement findOverdueTab;
    
    

    public RrcEntrancePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(overdueLabel), DefaultWaitElementTime4Page);
    }

    // click rrc button and into rrc info page
    public RrcTaskListPage RrcEntranceToRrcTaskListPage() throws Exception {
        WebReporter.log(appiumDriver, true, true, true);
        int width = appiumDriver.manage().window().getSize().width;
        int height = appiumDriver.manage().window().getSize().height;
        TouchAction gesture = new TouchAction(appiumDriver).press(width - 10, height - 10).release();
        appiumDriver.performTouchAction(gesture);
        return new RrcTaskListPage(appiumDriver);
    }

    public FindOverduePage RrcEntranceToFindOverduePage() throws Exception {
        return click(findOverdueTab, FindOverduePage.class);
    }
}
	