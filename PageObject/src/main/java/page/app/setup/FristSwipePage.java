package page.app.setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class FristSwipePage extends AbstractAppPage {

    @FindBy(xpath = "//UIAApplication/UIAWindow/UIAScrollView/UIAButton")
    public WebElement runButton;

    public FristSwipePage(AppiumDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(runButton), DefaultWaitElementTime4Page);
    }

    public LoginPage finishSwipe() throws Exception {
        swipe(4, 2);
        return click(runButton, LoginPage.class);
    }

}
