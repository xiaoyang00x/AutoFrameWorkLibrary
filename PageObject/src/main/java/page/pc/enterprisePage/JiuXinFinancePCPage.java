package page.pc.enterprisePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class JiuXinFinancePCPage extends AbstractPCPage{
    @FindBy(css="#homePageModule")
    WebElement jiuXinFinancePage;
    
    public JiuXinFinancePCPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, jiuXinFinancePage);
    }

}
