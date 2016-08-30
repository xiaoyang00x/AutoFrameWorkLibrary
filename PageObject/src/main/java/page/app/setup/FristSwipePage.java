package page.app.setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import basicTool.config.ConfigUtil;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class FristSwipePage extends AbstractAppPage {

    @FindBy(xpath = "//UIAApplication/UIAWindow/UIAScrollView/UIAButton|//android.widget.Button")
    public WebElement runButton;

    @FindBy(xpath = "//UIAApplication/UIAWindow/UIAPageIndicator|//android.widget.RelativeLayout/android.widget.LinearLayout")
    public WebElement nextSwipeLabel;

    public FristSwipePage(AppiumDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(nextSwipeLabel), DefaultWaitElementTime4Page);
    }

    public LoginPage finishSwipe() throws Exception {
        swipe(4, Integer.parseInt(ConfigUtil.getConfigUtil().getConfigFileContent("swipeTimes")));
        return click(runButton, LoginPage.class);
    }

}
