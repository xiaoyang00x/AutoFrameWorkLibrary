package dataTool;

import java.io.FileNotFoundException;
import java.io.InputStream;

import org.ho.yaml.Yaml;

public class DataFactory {

    // yaml file's path should be same with bean's path
    public static <T> T GetData(Class<T> objectClass) {
        try {
            String objectClassName = objectClass.getName();
            if (null != objectClassName) {
                objectClassName = objectClassName.replace(".", "/").replace("dataBean", "yaml");
            }
            String path = objectClassName + ".yaml";
            InputStream inStream = ClassLoader.getSystemResourceAsStream(path);
            T tObject = Yaml.loadType(inStream, objectClass);
            return tObject;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
