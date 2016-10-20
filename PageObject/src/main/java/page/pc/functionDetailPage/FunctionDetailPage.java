package page.pc.functionDetailPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class FunctionDetailPage extends AbstractPCPage {

    @FindBy(css = "h2.cat-line-v.func-line.cat-title")
    private WebElement functionDetailListField;

    @FindBy(css = "a.cat-line-v.func-line")
    private List<WebElement> functionLinkList;

    public FunctionDetailPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, functionDetailListField);
    }

    public FunctionDetailPage clickInvestmentLink() throws Exception {
        return click(getWebElementByName("投资", functionLinkList), FunctionDetailPage.class);
    }

    public FunctionDetailPage clickLendLink() throws Exception {
        return click(getWebElementByName("借钱", functionLinkList), FunctionDetailPage.class);
    }

    public FunctionDetailPage clickRewardLink() throws Exception {
        return click(getWebElementByName("悬赏", functionLinkList), FunctionDetailPage.class);
    }

    public FunctionDetailPage clickJiaofeiLink() throws Exception {
        return click(getWebElementByName("缴费", functionLinkList), FunctionDetailPage.class);
    }

    public FunctionDetailPage clickVoipLink() throws Exception {
        return click(getWebElementByName("免费电话", functionLinkList), FunctionDetailPage.class);
    }

    public FunctionDetailPage clickEarnSpreadsLink() throws Exception {
        return click(getWebElementByName("赚利差", functionLinkList), FunctionDetailPage.class);
    }

}
