package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasicTool.WaitTool;

public class PromotionAndCooperationPage extends AbstractPage {

    @FindBy(css = "#promoterName")
    private WebElement nameTextField;

    protected PromotionAndCooperationPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, nameTextField);
    }

}
