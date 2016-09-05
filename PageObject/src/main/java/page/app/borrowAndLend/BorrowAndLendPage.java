package page.app.borrowAndLend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.app.AbstractAppPage;

public class BorrowAndLendPage extends AbstractAppPage {

    @FindBy(xpath = "//UIAStaticText[@name='借贷']")
    private WebElement borrowTitleLable;

    public BorrowAndLendPage(AppiumDriver driver) {
        super(driver);
        WaitTool.waitFor(appiumDriver, ExpectedConditions.visibilityOf(borrowTitleLable), DefaultWaitElementTime4Page);
    }

}
