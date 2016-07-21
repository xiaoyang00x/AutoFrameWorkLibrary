package Page.Payment;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicTool.WaitTool;
import BasicTool.QRCode.LoginHttpUtils;
import Page.AbstractPage;

public class PaymentLoginPage extends AbstractPage {

    @FindBy(css = "#qrcode img.canvasStyle")
    private WebElement qrcodeIMG;
    
    @FindBy(tagName = "qrcode")
    private WebElement qrCode;

    LoginHttpUtils login = new LoginHttpUtils();
    
    public PaymentLoginPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(qrcodeIMG), 60);
    }
    
    private String getTokenFromQrCode() {
    	String qrCodeContent = qrCode.getAttribute("data");
    	JSONObject jsonObj = new JSONObject(qrCodeContent);
    	return (String) jsonObj.get("content");
    }
    
    private void setRequestParams() {
    	login.setRequestParameters("JDBID","8E95BAE3-D222-4689-BBC6-9211360F990E");
    	login.setRequestParameters("accessToken","ACCESS_TOKEN6042909335648951931469070730500");
    	login.setRequestParameters("appKey","fb371c48e9a9b2a1174ed729ae888513");
    	login.setRequestParameters("channel","appstore");
    	login.setRequestParameters("clientVersion","2.3.1");
    	login.setRequestParameters("deviceID","2466ED05-4C09-4BD7-BFBA-9A2EFC0647A1");
    	login.setRequestParameters("deviceType","iPhone 6 Plus");
    	login.setRequestParameters("h","2208");
    	login.setRequestParameters("jailbreak","0");
    	login.setRequestParameters("memberID","604290933564895193");
    	login.setRequestParameters("network","5");
    	login.setRequestParameters("phoneVen","1");
    	login.setRequestParameters("platform","IOS");
    	login.setRequestParameters("proxyType","https");
    	login.setRequestParameters("sysLaunchTimeInterval","1555884");
    	login.setRequestParameters("systemVersion","9.3.2");
    	login.setRequestParameters("token",getTokenFromQrCode());
    	login.setRequestParameters("traceID", "0C6B53B1-B1F2-4DB7-A2C2-3BEFB96F10AB");
    	login.setRequestParameters("udid", "b63ca8da8491c42df60b1e4edf408ca2a0ebaa1f");
    	login.setRequestParameters("w", "1242");
    }
    
    public PaymentBalancePage scanQrCode() {
    	setRequestParams();
    	login.sendPostRequest();
    	return new PaymentBalancePage(driver);
    }

}
