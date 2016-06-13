package DataTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.ho.yaml.Yaml;

public class DataFactory {

	// yaml file's path should be same with bean's path
	public static <T> T GetData(Class<T> objectClass) {
		try {
			String defaultPath = "src/main/resources/";
			String objectClassName = objectClass.getName();
			if (null != objectClassName) {
				objectClassName = objectClassName.replace(".", "/").replace(
						"DataBean", "Yaml");
			}
			String path = defaultPath + objectClassName + ".yaml";
			File yamlFile = new File(path);
			FileInputStream fileInputStream = new FileInputStream(yamlFile);
			T tObject = Yaml.loadType(fileInputStream, objectClass);
			return tObject;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
