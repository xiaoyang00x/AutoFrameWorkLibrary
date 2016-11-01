package page.pc.enterprisePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class JiuZhouSecuritiesPCPage  extends AbstractPCPage{
    @FindBy(css=".header")
    WebElement jiuZhouSecuritiesPage;
    
    public JiuZhouSecuritiesPCPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, jiuZhouSecuritiesPage);
    }

}
