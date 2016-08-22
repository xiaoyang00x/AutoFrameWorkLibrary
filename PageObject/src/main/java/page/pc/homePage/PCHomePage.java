package page.pc.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class PCHomePage extends AbstractPCPage {

    @FindBy(css = "div.downloads")
    private WebElement DownLoadButton;
    
    @FindBy(css = "#downloadContainer>.buttonContainer>a[href='https://qiye.jiedaibao.com']")
    private WebElement goQiYeButton;
    
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

    public PCHomePage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, DownLoadButton);
    }

    public PCHomePage moveToDownloadNowBySystem() throws Exception {
        return moveToElement(sysDownloadButton);
    }
    
    public PCHomePage moveToTempPart2() throws Exception{
        return moveToElement(tempPart2Area);
    }

    public PCHomePage moveToDownloadNowByQRCode() throws Exception {
        return moveToElement(qrDownloadButton);
    }
    
    public PCHomePage moveToDownloadNowByiOS() throws Exception{
        return clickAndHold(sysDownloadButton_iosButton);
    }
    
    public PCHomePage moveToDownloadNowByAndroid() throws Exception {
        return clickAndHold(sysDownloadButton_androidButton);
    }

}
