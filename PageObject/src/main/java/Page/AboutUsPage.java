package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasicTool.WaitTool;

public class AboutUsPage extends AbstractPage {

    @FindBy(css = "img[src='images/about_li_1.png']")
    private WebElement aboutUsPageIMG;

    protected AboutUsPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, aboutUsPageIMG);

    }

}
