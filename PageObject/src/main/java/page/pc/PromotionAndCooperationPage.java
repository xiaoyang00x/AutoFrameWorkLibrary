package page.pc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;

public class PromotionAndCooperationPage extends AbstractPCPage {

    @FindBy(css = "#promoterName")
    private WebElement nameTextField;

    protected PromotionAndCooperationPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, nameTextField);
    }

}
