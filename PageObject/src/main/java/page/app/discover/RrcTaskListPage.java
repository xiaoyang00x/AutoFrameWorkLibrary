package page.app.discover;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.customize.reporter.WebReporter;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import page.app.AbstractAppPage;

public class RrcTaskListPage extends AbstractAppPage {

    @FindBy(xpath = "//android.widget.ListView")
    private List<WebElement> taskLabel;
    


    public RrcTaskListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOfAllElements(taskLabel),
                DefaultWaitElementTime4Page);
    }

    public DebtDetailPage ToDebtDetailPage() throws Exception {
    	 WebReporter.log(appiumDriver, true, true, true);
         int width = appiumDriver.manage().window().getSize().width;
         int height = appiumDriver.manage().window().getSize().height;
         TouchAction gesture = new TouchAction(appiumDriver).press(width/2, height/4).release();
         appiumDriver.performTouchAction(gesture);
         return new DebtDetailPage(appiumDriver);
    }
    
    public MyCollectionPage ToMyCollectionPage() throws Exception {
   	 WebReporter.log(appiumDriver, true, true, true);
        int width = appiumDriver.manage().window().getSize().width;
        int height = appiumDriver.manage().window().getSize().height;
        TouchAction gesture = new TouchAction(appiumDriver).press(width/2, height*13/100).release();
        appiumDriver.performTouchAction(gesture);
        return new MyCollectionPage(appiumDriver);
   }
    
    
}
