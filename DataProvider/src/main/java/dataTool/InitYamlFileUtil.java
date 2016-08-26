package dataTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.ho.yaml.Yaml;

import dataBean.app.login.UserBean;

public class InitYamlFileUtil {

    public static void initYamlFile(Object object) {
        String className = object.getClass().getName();
        if (null != className) {
            className = className.replace(".", "/").replace("dataBean", "yaml");
        }
        File dumpFile = new File("src/main/resources/" + className + ".yaml");
        try {
            FileOutputStream fileOut = new FileOutputStream(dumpFile);
            Yaml.dump(object, fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserBean u = new UserBean();
        u.setUserName("13295412345");
        u.setPassWord("qqqqqq");
        initYamlFile(u);
    }

}
