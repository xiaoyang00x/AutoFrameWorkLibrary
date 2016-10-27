package page.app.discover;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.customize.reporter.WebReporter;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import page.app.AbstractAppPage;

public class FindOverduePage extends AbstractAppPage {

    @FindBy(xpath = "//android.widget.TextView[@text='查老赖']")
    private WebElement findOverdueLabel;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='输入手机号/身份证号查询']")
    private WebElement inputText;

    @FindBy(xpath = "//android.widget.Button[@content-desc='查询']")
    private WebElement searchButton;

    @FindBy(xpath = "//android.view.View[@content-desc='用户未注册或不存在超过45天未偿还的逾期记录']")
    private WebElement textView;

    public FindOverduePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(findOverdueLabel), DefaultWaitElementTime4Page);
    }

    public FindOverduePage search(String debtor) throws Exception {
        WebReporter.log(appiumDriver, true, true, true);
        int width = appiumDriver.manage().window().getSize().width;
        int height = appiumDriver.manage().window().getSize().height;
        TouchAction gesture = new TouchAction(appiumDriver).press(width / 2, height * 19 / 50).release();
        appiumDriver.performTouchAction(gesture);
        setInputText(inputText, debtor);
        click(searchButton, textView);
        return this;
    }

}
