package page.pc.businessVersionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class financingLabelPage extends AbstractPCPage {

    @FindBy(css = ".float-left .active")
    private WebElement financingLabel;

    public financingLabelPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, financingLabel);
    }
}
