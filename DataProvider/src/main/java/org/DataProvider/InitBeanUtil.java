package org.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.ho.yaml.Yaml;

public class InitBeanUtil {

	//yaml file's path should be same with bean's path
	public static <T> T initBeanViaYamlFile(Class<T> objectClass) {
		try {
			String defaultPath = "src/main/resources/";
			String objectClassName = objectClass.getName();
			if (null != objectClassName) {
				objectClassName = objectClassName.replace(".", "/");
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
