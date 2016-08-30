package page.pc.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;
import page.pc.BusinessVersionPage;
import page.pc.NewListPage;

public class PCHomePage extends AbstractPCPage {

    @FindBy(css = "div.downloads")
    private WebElement DownLoadButton;
    
    
    @FindBy(css = "#downloadContainer a[href*='qiye'] .innerContainer")
    private WebElement goQiYeLink;
    
    @FindBy(css = ".pointContainr>:first-child")
    private WebElement pointerFirstBannerButton;
    
    @FindBy(css = ".pointContainr>:last-child")
    private WebElement pointerSecondBannerButton;
    
    @FindBy(css = "#downloadContainer .buttonContainer .downloadNow")
    private WebElement downloadNowButton;
    
    @FindBy(css = "#toSeeVideo .custom-button-text")
    private WebElement toViewVideoButton;
    
    @FindBy(css = "#my-video_html5_api")
    private WebElement videoPlayArea;
    
    @FindBy(css = "#my-video .vjs-big-play-button")
    private WebElement videoPlayButton;
    
    
    @FindBy(css = "#part2>.container")
    private WebElement tempPart2Area;
    
    @FindBy(css = ".downloads .qr-area>.has-tips .custom-button-text")
    //@FindBy(css = "div.tips-area.qr-area")
    private WebElement qrDownloadButton;

    @FindBy(css = "div.tips-area.buttons-area.btn-margin")
    private WebElement sysDownloadButton;
    
    @FindBy(css = ".downloads>.btn-margin>.buttons-tip .ios-download-btn")
    private WebElement sysDownloadButton_iosButton;
    
    @FindBy(css = ".downloads>.btn-margin>.buttons-tip .android-download-btn")
    private WebElement sysDownloadButton_androidButton;
    
    @FindBy(css = "#part3-news .news-list-item.item2")
    private WebElement tempPart3Area;
    
    @FindBy(css =".more-news-list .custom-button")
    private WebElement readMoreNewsLink;
    
    
    public PCHomePage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, DownLoadButton);
    }

    
    
    public PCHomePage pointerFirstBannerButton() throws Exception{
         click(pointerFirstBannerButton, goQiYeLink);
         return this;
    }
    
    public BusinessVersionPage goToBusinessVersionPage() throws Exception{
        pointerFirstBannerButton();
        return click(goQiYeLink, BusinessVersionPage.class);
    }
    
    public PCHomePage pointerSecondBannerButton() throws Exception{
        click(pointerSecondBannerButton, toViewVideoButton);
        return this;
    }
    
    public PCHomePage downloadNow() throws Exception{
        pointerSecondBannerButton();
        return moveToElement(downloadNowButton);
    }
    
    public PCHomePage toWatchVideo() throws Exception{
        pointerSecondBannerButton();
        click(toViewVideoButton, videoPlayArea);
        return this;
    }
    
    public PCHomePage clickAndPlayVideo() throws Exception{
        toWatchVideo();
        return click(videoPlayButton, PCHomePage.class);
    }
    
    
    public PCHomePage moveToTempPart2() throws Exception{
        return moveToElement(tempPart2Area);
    }

    public PCHomePage moveToDownloadNowByQRCode() throws Exception {
        return moveToElement(qrDownloadButton);
    }
    
    public PCHomePage moveToDownloadNowBySystem() throws Exception {
        return moveToElement(sysDownloadButton);
    }
    
    public PCHomePage moveToDownloadNowByiOS() throws Exception{
        return clickAndHold(sysDownloadButton_iosButton);
    }
    
    public PCHomePage moveToDownloadNowByAndroid() throws Exception {
        return clickAndHold(sysDownloadButton_androidButton);
    }
    
    
    public PCHomePage moveToTempPart3() throws Exception{
        return moveToElement(tempPart3Area);
    }
    
    public NewListPage readMoreNews() throws Exception{
        moveToTempPart3();
        return click(readMoreNewsLink, NewListPage.class);
    }

}
