package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;

public class NewListPage extends AbstractPage {

    @FindBy(css = "img[src='images/news_words.png']")
    private WebElement newListPageIMG;

    protected NewListPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, newListPageIMG);
    }

}
