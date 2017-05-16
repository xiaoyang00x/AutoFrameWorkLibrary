package dataTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.ho.yaml.Yaml;

import dataBean.dubbo.productSys.mytestBean;

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

    public static void main(String[] args) throws Exception {
        mytestBean u = new mytestBean();
        u.setId("mytest");
        u.setName("13295412345");
        u.setAge(17);
        u.setBrithday(new Date());
        mytestBean u2 = DataFactory.getObject(mytestBean.class, "mytest");
        System.out.println(u2.getId());
        initYamlFile(u);
    }

}
