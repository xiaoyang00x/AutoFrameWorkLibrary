package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasicTool.WaitTool;

public class FunctionDetailPage extends AbstractPage {

    @FindBy(css = "#news-catetory")
    private WebElement functionDetailListField;

    public FunctionDetailPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, functionDetailListField);
    }

}
