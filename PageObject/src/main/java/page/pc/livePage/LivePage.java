package page.pc.livePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class LivePage extends AbstractPCPage {

    @FindBy(css = "#demoBtn3")
    private WebElement buyNowButton;

    @FindBy(css = "div.tp-info.clearfix")
    private WebElement liveInfomationLabel;
    
    public LivePage(WebDriver driver) throws Exception {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, liveInfomationLabel);

    }
    
    

}