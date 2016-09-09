package page.pc.aboutUsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class JDBRecruitPage extends AbstractPCPage {

    @FindBy(css = ".index_search_div")
    WebElement workSeach;

    public JDBRecruitPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, workSeach);

    }

}
