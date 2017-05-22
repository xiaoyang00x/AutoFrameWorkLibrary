package dataTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.ho.yaml.Yaml;

import com.miaoqian.prod.api.dto.request.ProjectRelateSubParamDto;

import dataBean.dubbo.productSys.MyProjectRelateSubParamDto;

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
        List a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        List b = new ArrayList<String>();
        b.add("a");
        b.add("b");
        b.add("c");
        List <ProjectRelateSubParamDto> c = new ArrayList<ProjectRelateSubParamDto>();
        c.add(new ProjectRelateSubParamDto());
        c.add(new ProjectRelateSubParamDto());
        c.add(new ProjectRelateSubParamDto());


        MyProjectRelateSubParamDto m2 = new MyProjectRelateSubParamDto();
        m2.setId("default");
        m2.setProjectCode("2313");
        m2.setOccupyAmount(15.00);

        initYamlFile(m2);
        ProjectRelateSubParamDto m3 = DataFactory.tansferData(m2, ProjectRelateSubParamDto.class);
        System.out.println(m3.toString());
        
    }

}
