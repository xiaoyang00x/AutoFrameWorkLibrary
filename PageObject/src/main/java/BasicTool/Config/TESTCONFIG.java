package BasicTool.Config;

import java.util.ArrayList;
import java.util.List;

/**
 * The enum class is to assign values to the test_config file.
 * 
 * @author yangyu
 *
 */
public enum TESTCONFIG {
    ISREMOTEDRIVER("isRemoteDriver"),
    BROSWERTYPE("broswerType"),
    CHROMEDRIVERPATH("chromeDriverPath"),
    INTERNETEXPLORERDRIVERPATH("internetExplorerDriverPath"),
    SAFARIVERSION("safariVersion"),
    DEFAULTURL("defaultURL"),
    TESTNAME("testName"),
    REMOTEDRIVER("remoteDriverURL"),
    PAYMENTURL("paymentURL");

    String value;

    TESTCONFIG(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static List<String> getAllEnumValue() {
        List<String> values = new ArrayList<>();
        for (TESTCONFIG value : TESTCONFIG.values())
            values.add(value.getValue());
        return values;
    }

}
