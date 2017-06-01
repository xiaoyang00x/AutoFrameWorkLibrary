package dataTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dataBean.dubbo.projectSys.MyPublisherDto;
import org.ho.yaml.Yaml;

import dataBean.dubbo.projectSys.MyContractDto;


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


    public static Date tansforDate(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(time);
        return date;
    }


    public static void main(String[] args) throws Exception {


        InitYamlFileUtil.initYamlFile(null);

    }

}