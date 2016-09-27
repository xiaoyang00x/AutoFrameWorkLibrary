package page.app.discover;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class ActivityPage extends AbstractAppPage {

    @FindBy(xpath = "//UIAStaticText[@name='活动']")
    private WebElement activeLabel;

    @FindBy(xpath = "//UIALink/UIALink/UIAImage")
    private List<WebElement> activeList;

    public ActivityPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(activeLabel), DefaultWaitElementTime4Page);
    }

    /**
     * 
     * @param index
     *            you want to into page's index (eg:start from 0)
     * @return common activity page
     * @throws Exception
     */
    public ActivityForH5Page intoActivelPageByNum(int index) throws Exception {
        return click(activeList.get(index), ActivityForH5Page.class);
    }

}
