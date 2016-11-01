package page.pc.enterprisePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class JiuTaiFundPCPage extends AbstractPCPage{
    @FindBy(css=".web_nav_list")
    WebElement  jiuTaiFundPage;
    protected JiuTaiFundPCPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, jiuTaiFundPage);
    }

}
