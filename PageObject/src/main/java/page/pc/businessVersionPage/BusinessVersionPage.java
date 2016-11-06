package page.pc.businessVersionPage;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.customize.reporter.WebReporter;

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

    @FindBy(css = ".carousel-indicators>li:nth-of-type(3)")
    private WebElement payoffIcon;

    @FindBy(css = ".carousel-indicators>li:nth-of-type(4)")
    private WebElement financingIcon;

    @FindBy(css = ".carousel-indicators>li:nth-of-type(5)")
    private WebElement withdrawIcon;

    @FindBy(css = ".ng-binding")
    private static List<WebElement> processIconList;

    public BusinessVersionPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, newsLabel);
    }

    public CompanySignUpPage clickSignUpOne() throws Exception {
        return click(signupButtonOne, CompanySignUpPage.class);
    }

    public CompanyLoginPage clickLoginLink() throws Exception {
        return click(loginLink, CompanyLoginPage.class);
    }
    
    public WebElement clickStartPlayButton() throws Exception {
    	return click(startPlayButton, playingButton);
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

    public BusinessVersionPage clickEnrollIcon() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByClassName('ng-binding')[0].click()");

        return new BusinessVersionPage(driver);
    }

    public BusinessVersionPage clickRechargeIcon() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByClassName('ng-binding')[1].click()");

        return new BusinessVersionPage(driver);
    }

    public BusinessVersionPage clickPayoffIcon() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByClassName('ng-binding')[2].click()");

        return new BusinessVersionPage(driver);
    }

    public BusinessVersionPage clickFinancingIcon() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByClassName('ng-binding')[3].click()");

        return new BusinessVersionPage(driver);
    }

    public BusinessVersionPage clickWithdrawIcon() throws Exception {

        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("$('.ng-binding')[4].click()");

        return new BusinessVersionPage(driver);
    }

}
