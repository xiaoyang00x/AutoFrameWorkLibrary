package page.pc.navigationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;
import page.pc.livePage.LivePage;

public class NavigationPage extends AbstractPCPage {

    @FindBy(css = "div.header-nav a[href='http://www.shicaidai.com:80/']")
    private WebElement homePageButton;

    @FindBy(css = "div.header-nav a[href='https://s.shicaidai.com/index.html']")
    private WebElement liveButton;

    public NavigationPage(WebDriver driver) throws Exception {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, homePageButton);

    }
    
    public LivePage navigationLivePage() throws Exception{
        return click(liveButton,LivePage.class);
    }
    

}