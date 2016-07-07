package BasicTool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class ConfigUtil {

	private static ConfigUtil configUtil = new ConfigUtil();
	private static Properties testConfig;

	private ConfigUtil() {
		this.testConfig = getConfigProperties();
	}

	/**
	 * get a configutil obj instance
	 * 
	 * @return configutil obj
	 */
	public static ConfigUtil getConfigUtil() {
		if (configUtil == null)
			return configUtil = new ConfigUtil();
		else
			return configUtil;
	}

	/**
	 * 
	 * get value in config file
	 * 
	 * @param test_config
	 *            map key
	 * @return test_config map value
	 */
	public String getConfigFileContent(String key) {
		return testConfig.getProperty(key);
	}

	public static void setConfigValue(String... Paramater) {		
			for (String paramater : Paramater) {
				System.out.println("*********"+paramater+"*********");
				testConfig.setProperty(paramater, System.getProperty(paramater));
			}

	}

	public static Properties getConfigProperties() {
		Properties testconfigProperties = new Properties();
		String path = Thread.currentThread().getContextClassLoader().getResource("test_config.properties").getPath();
		try {
			testconfigProperties.load(new FileInputStream(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testconfigProperties;
	}

}
