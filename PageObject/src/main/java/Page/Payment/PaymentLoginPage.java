package Page.Payment;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicTool.WaitTool;
import BasicTool.QRCode.PaymentLoginScanQRCodeUtils;
import Page.AbstractPage;

public class PaymentLoginPage extends AbstractPage {

    @FindBy(css = "#qrcode img.canvasStyle")
    private WebElement qrcodeIMG;

    @FindBy(css = "qrcode")
    private WebElement qrCode;

    PaymentLoginScanQRCodeUtils login = PaymentLoginScanQRCodeUtils.getInstance();

    public PaymentLoginPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(qrcodeIMG), 60);
    }

    private String getTokenFromQrCode() {
        String qrCodeContent = qrCode.getAttribute("data");
        JSONObject jsonObj = new JSONObject(qrCodeContent);
        return (String) jsonObj.get("content");
    }

    public PaymentBalancePage scanQrCodeByIOS() {
        login.setIOSRequestParams(getTokenFromQrCode());
        login.sendPostRequest();
        return new PaymentBalancePage(driver);
    }

    public PaymentBalancePage scanQrCodeByANDRIOD() {
        login.setAndriodRequestParams(getTokenFromQrCode());
        login.sendPostRequest();
        return new PaymentBalancePage(driver);
    }

}
