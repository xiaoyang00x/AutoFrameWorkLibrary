package page.pc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;

public class BusinessVersionPage extends AbstractPCPage {

    @FindBy(css = "[href='news.html']")
    private WebElement newsLabel;

    protected BusinessVersionPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, newsLabel);
    }

}
