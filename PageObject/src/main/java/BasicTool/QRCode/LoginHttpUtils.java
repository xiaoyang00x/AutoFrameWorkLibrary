package BasicTool.QRCode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class LoginHttpUtils {
	private HttpClient httpClient = HttpClients.createDefault();
	private HttpPost httpPost = new HttpPost("https://tradeapi.jiedaibao.com/mybankv21/web/appLogin");
	private HttpGet httpGet;
	private HttpResponse httpResponse;
	private List<NameValuePair> parameters = new ArrayList<NameValuePair>();
	private UrlEncodedFormEntity uefEntity = null;
	
	private NameValuePair setNameAndValue(String key, String value) {
		return new BasicNameValuePair(key, value);
	}
	
	public void setRequestParameters(String key, String value) {
		parameters.add(setNameAndValue(key, value));
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
