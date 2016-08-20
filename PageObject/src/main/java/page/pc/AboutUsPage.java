package page.pc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;

public class AboutUsPage extends AbstractPCPage {

    @FindBy(css = "img[src='images/about_li_1.png']")
    private WebElement aboutUsPageIMG;

    protected AboutUsPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, aboutUsPageIMG);

    }

}
