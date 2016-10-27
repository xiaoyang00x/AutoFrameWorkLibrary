package page.app.wallet;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import page.app.AbstractAppPage;
import basicTool.WaitTool;

public class PersonalInformationPage extends AbstractAppPage{
	
	@FindBy(xpath = "//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")
	private WebElement photoImage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='认证中心']")
	private WebElement certificationCenterButton;
	
	public PersonalInformationPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(photoImage), DefaultWaitElementTime4Page);

    }
	
	 public CertificationCenterPage ToCertificationCenterPage() throws Exception {
	        return click(certificationCenterButton, CertificationCenterPage.class);
	    }
	
	


}
