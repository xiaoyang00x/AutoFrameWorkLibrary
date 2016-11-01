package page.pc.enterprisePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class JiuDingInvestmentPCPage extends AbstractPCPage{
    @FindBy(css=".top-l")
    WebElement jiuDingPage;

    public JiuDingInvestmentPCPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, jiuDingPage);
    }

}
