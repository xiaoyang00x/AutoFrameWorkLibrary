package page.pc.payment;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import basicTool.qRCode.PaymentLoginScanQRCodeUtils;
import page.pc.AbstractPCPage;

public class PaymentLoginPage extends AbstractPCPage {

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

    public PaymentBalancePage scanQrCodeByNoBankCard() {
        login.setNoBindBankCardRequestParams(getTokenFromQrCode());
        login.sendPostRequest();
        return new PaymentBalancePage(driver);
    }

    public PaymentBalancePage scanQrCode() {
        login.setBindBankCardRequestParams(getTokenFromQrCode());
        login.sendPostRequest();
        return new PaymentBalancePage(driver);
    }

}
