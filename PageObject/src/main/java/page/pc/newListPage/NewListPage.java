package page.pc.newListPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class NewListPage extends AbstractPCPage {

    @FindBy(css = "h2.cat-line-v.cat-title")
    private WebElement newListPageIMG;

    @FindBy(css = "a.cat-line-v")
    private List<WebElement> newList;

    public NewListPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, newListPageIMG);
    }

    public NewListPage clickcompanyNewsList() throws Exception {
        return click(getWebElementByName("公司新闻", newList), NewListPage.class);
    }

    public NewListPage clickProductNewsList() throws Exception {
        return click(getWebElementByName("产品新闻", newList), NewListPage.class);
    }

    public NewListPage clickUserNewsList() throws Exception {
        return click(getWebElementByName("用户故事", newList), NewListPage.class);
    }

}
