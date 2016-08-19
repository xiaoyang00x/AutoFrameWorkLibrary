package page.payment;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import basicTool.config.ConfigUtil;
import basicTool.qRCode.PaymentLoginScanQRCodeUtils;
import page.AbstractPage;

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

    public PaymentBalancePage loginPaymentPage(String loginDevice) throws Exception {
        System.out.println(ConfigUtil.getConfigUtil().getConfigFileContent("phonePlatform"));
        if ("IOS".equals(loginDevice))
            return scanQrCodeByIOS();
        else
            return scanQrCodeByANDRIOD();
    }

}
