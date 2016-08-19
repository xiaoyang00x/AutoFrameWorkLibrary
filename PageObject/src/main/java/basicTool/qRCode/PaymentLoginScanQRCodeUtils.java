package basicTool.qRCode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import basicTool.config.ConfigUtil;

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
        setRequestParameters("JDBID", "87B34A57-69FD-4412-A921-57CB2A7C36B0");
        setRequestParameters("accessToken", "ACCESS_TOKEN6000728466550622931470056407967");
        setRequestParameters("appKey", "fb371c48e9a9b2a1174ed729ae888513");
        setRequestParameters("channel", "appstore");
        setRequestParameters("clientVersion", "2.4.0");
        setRequestParameters("deviceID", "14E4C308-68F5-4F51-B4D3-B9DBC437753D");
        setRequestParameters("deviceType", "iPhone 6 Plus");
        setRequestParameters("h", "2208");
        setRequestParameters("jailbreak", "0");
        setRequestParameters("memberID", "600072846655062293");
        setRequestParameters("network", "5");
        setRequestParameters("phoneVen", "2");
        setRequestParameters("platform", "IOS");
        setRequestParameters("proxyType", "http");
        setRequestParameters("sysLaunchTimeInterval", "41429");
        setRequestParameters("systemVersion", "9.3.3");
        setRequestParameters("token", QRCode);
        setRequestParameters("traceID", "71CE9B37-6653-4738-9986-17DAF4F4C9D2");
        setRequestParameters("udid", "00bd966d0b085e971336cd7cfb90c080606ecedf");
        setRequestParameters("w", "1242");
    }

    public void setAndriodRequestParams(String QRCode) {
        setRequestParameters("JDBID", "0000000061025371ffffffffc6f7122e"); // 设备唯一ID
        setRequestParameters("accessToken", "ACCESS_TOKEN6000728466550622931470056407967"); // 登录会话Token(和登录设备绑定关系，60天后自动失效)
        setRequestParameters("appKey", "fb371c48e9a9b2a1174ed729ae888513"); // 统一的客户端校验标示: 前端hardcode固定值
        setRequestParameters("channel", "jdb");
        setRequestParameters("clientVersion", "2.3.5");
        setRequestParameters("deviceID", "862095026322211"); // 设备唯一ID
        setRequestParameters("deviceType", "MX4");
        setRequestParameters("h", "1920");
        setRequestParameters("memberID", "604290933564895193"); // 借贷宝用户唯一ID
        setRequestParameters("network", "5"); // 当前网络类型, 1:不可达网络, 2:2G, 3:3G, 4:4G, 5:WiFi, 6:其它
        setRequestParameters("phoneVen", "1"); // 移动运营商, 1:中国移动, 2:中国联通, 3:中国电信, 0:其它
        setRequestParameters("platform", "android");
        setRequestParameters("proxyType", "https");
        setRequestParameters("sysLaunchTimeInterval", "165983");
        setRequestParameters("systemVersion", "4.4.2");
        setRequestParameters("token", QRCode);
        setRequestParameters("traceID", "cfc8bb83a5854e1db53924cde5b3b5c8"); // 日志追踪ID
        setRequestParameters("udid", "0000000061025371ffffffffc6f7122e"); // 设备唯一ID
        setRequestParameters("w", "1152");
        setRequestParameters("isHasCheatSoft", "0");
        setRequestParameters("manufacturer", "Meizu");
        setRequestParameters("apkSign", "6F01335F52FCA82276CC99E2F9E65865");
        setRequestParameters("fp", "36769dc40784420eae0d91f3a6aaabc1");
    }

    public void sendPostRequest() {
        try {
            uefEntity = new UrlEncodedFormEntity(parameters, "UTF-8");
            httpPost.setEntity(uefEntity);
            httpResponse = httpClient.execute(httpPost);
            HttpEntity entity = httpResponse.getEntity();
            System.out.println(EntityUtils.toString(entity));
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
