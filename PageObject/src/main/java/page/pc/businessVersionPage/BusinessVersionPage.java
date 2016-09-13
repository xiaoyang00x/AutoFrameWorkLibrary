package page.pc.businessVersionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class BusinessVersionPage extends AbstractPCPage {

    @FindBy(css = "[href='news.html']")
    private WebElement newsLabel;

    @FindBy(css = ".media.banner-block .home-btn.btn-blue")
    private WebElement signupButtonOne;

    @FindBy(css = ".f4")
    private WebElement loginLink;
    
    @FindBy(css = ".vjs-big-play-button")
    private WebElement startPlayButton;
    
    @FindBy(css = ".vjs-play-control.vjs-control.vjs-playing")
    private WebElement playingButton;
    
    @FindBy(css = ".vjs-play-control.vjs-control.vjs-paused")
    private WebElement pausingButton;

    @FindBy(css = "a[href='help-page.html#融资']")
    private WebElement knowMoreButton;
    
    @FindBy(css = ".carousel-indicators>li:nth-of-type(1)")
    private WebElement enrollIcon;
    
    @FindBy(css = ".carousel-indicators>li:nth-of-type(2)")
    private WebElement chargeIcon;
    
    @FindBy(css = ".carousel-indicators>li:nth-of-type(3)")
    private WebElement payoffIcon;
    
    @FindBy(css = ".carousel-indicators>li:nth-of-type(4)")
    private WebElement financingIcon;
    
    @FindBy(css = ".carousel-indicators>li:nth-of-type(5)")
    private WebElement withdrawIcon;

    public CompanySignUpPage clickSignUpOne() throws Exception {
        return click(signupButtonOne, CompanySignUpPage.class);
    }

    public CompanyLoginPage clickLoginLink() throws Exception {
        return click(loginLink, CompanyLoginPage.class);
    }
    
    public WebElement clickStartPlayButton() throws Exception {
    	return click(startPlayButton, playingButton);
    }

    public financingLabelPage clickKnowMoreButton() throws Exception {
        return click(knowMoreButton, financingLabelPage.class);
    }
    
    public void clickEnrollIcon() throws Exception {
    	click(enrollIcon);
    }
    
    public void clickChargeIcon() throws Exception {
    	click(chargeIcon);
    }
    
    public void clickPayoffIcon() throws Exception {
    	click(payoffIcon);
    }
    
    public void clickFinancingIcon() throws Exception {
    	click(financingIcon);
    }
    
    public void clickWithdrawIcon() throws Exception {
    	click(withdrawIcon);
    }

    public BusinessVersionPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, newsLabel);
    }

}
