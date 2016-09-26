package basicTool.qRCode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.ConfigUtil.ConfigUtil;
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

    public void setBindBankCardRequestParams(String QRCode) {
        setRequestParameters("accessToken", "ACCESS_TOKEN6000728466550622931474360642284"); // 登录会话Token(和登录设备绑定关系，60天后自动失效)
        setRequestParameters("appKey", "fb371c48e9a9b2a1174ed729ae888513"); // 统一的客户端校验标示: 前端hardcode固定值
        setRequestParameters("memberID", "600072846655062293"); // 借贷宝用户唯一ID
        setRequestParameters("token", QRCode);
        setRequestParameters("udid", "d2aaef63c96264a4097891cd211fe4100f2c792f"); // 设备唯一ID
    }

    public void setNoBindBankCardRequestParams(String QRCode) {
        setRequestParameters("accessToken", "ACCESS_TOKEN6380923401329018041474276848627"); // 登录会话Token(和登录设备绑定关系，60天后自动失效)
        setRequestParameters("appKey", "fb371c48e9a9b2a1174ed729ae888513"); // 统一的客户端校验标示: 前端hardcode固定值
        setRequestParameters("memberID", "638092340132901804"); // 借贷宝用户唯一ID
        setRequestParameters("token", QRCode);
        setRequestParameters("udid", "ffffffff97d26e3bffffffffd05377aa"); // 设备唯一ID
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
