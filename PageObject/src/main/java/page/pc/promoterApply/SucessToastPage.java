package page.pc.promoterApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class SucessToastPage extends AbstractPCPage {
    @FindBy(css = "p.p-mask-title")
    private WebElement sucessToastLabel;

    public SucessToastPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(sucessToastLabel), 60);
    }

}
