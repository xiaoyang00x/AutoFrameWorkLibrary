package page.app.discover;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class MyCollectionPage extends AbstractAppPage{
	
	@FindBy(xpath = "//android.view.View[@content-desc='personMenu']")
    private WebElement myInformationLabel;

	public MyCollectionPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(myInformationLabel), DefaultWaitElementTime4Page);
	}

}
