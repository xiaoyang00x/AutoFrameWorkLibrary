package BasicTool.QRCode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import BasicTool.Config.ConfigUtil;

public class PaymentLoginScanQRCodeUtils {
    private static PaymentLoginScanQRCodeUtils instance;
    private HttpClient httpClient;
    private HttpPost httpPost;
    private HttpResponse httpResponse;
    private List<NameValuePair> parameters;
    private UrlEncodedFormEntity uefEntity = null;

    private PaymentLoginScanQRCodeUtils() {
        this.httpClient = HttpClients.createDefault();
        this.httpPost = new HttpPost(ConfigUtil.getConfigUtil().getConfigFileContent("paymentURL"));
        this.parameters = new ArrayList<NameValuePair>();
    }

    public static PaymentLoginScanQRCodeUtils getInstance() {
        if (instance == null)
            return new PaymentLoginScanQRCodeUtils();
        return instance;
    }

    private NameValuePair setNameAndValue(String key, String value) {
        return new BasicNameValuePair(key, value);
    }

    public void setRequestParameters(String key, String value) {
        parameters.add(setNameAndValue(key, value));
    }

    public void setIOSRequestParams(String QRCode) {
        setRequestParameters("JDBID", "8E95BAE3-D222-4689-BBC6-9211360F990E");
        setRequestParameters("accessToken", "ACCESS_TOKEN6042909335648951931469070730500");
        setRequestParameters("appKey", "fb371c48e9a9b2a1174ed729ae888513");
        setRequestParameters("channel", "appstore");
        setRequestParameters("clientVersion", "2.3.1");
        setRequestParameters("deviceID", "2466ED05-4C09-4BD7-BFBA-9A2EFC0647A1");
        setRequestParameters("deviceType", "iPhone 6 Plus");
        setRequestParameters("h", "2208");
        setRequestParameters("jailbreak", "0");
        setRequestParameters("memberID", "604290933564895193");
        setRequestParameters("network", "5");
        setRequestParameters("phoneVen", "1");
        setRequestParameters("platform", "IOS");
        setRequestParameters("proxyType", "https");
        setRequestParameters("sysLaunchTimeInterval", "1555884");
        setRequestParameters("systemVersion", "9.3.2");
        setRequestParameters("token", QRCode);
        setRequestParameters("traceID", "0C6B53B1-B1F2-4DB7-A2C2-3BEFB96F10AB");
        setRequestParameters("udid", "b63ca8da8491c42df60b1e4edf408ca2a0ebaa1f");
        setRequestParameters("w", "1242");
    }

    public void setAndriodRequestParams(String QRCode) {
    }

    public void sendPostRequest() {
        try {
            uefEntity = new UrlEncodedFormEntity(parameters, "UTF-8");
            httpPost.setEntity(uefEntity);
            httpResponse = httpClient.execute(httpPost);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
