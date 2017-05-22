package dataTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.ho.yaml.Yaml;

import com.miaoqian.prod.api.dto.request.OrderQueryDto;

import dataBean.dubbo.productSys.MyOrderQueryDto;

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
        MyOrderQueryDto m1 = new MyOrderQueryDto();
        m1.setId("123");
        m1.setProductTypeList(a);
        m1.setTransferStatus(1);
        m1.setStatus(1);
        m1.setProductCode("1");
        m1.setOrderSeqNo("12345677");
        m1.setIsSettled(0);
        m1.setBuyerUid("432143214321");
        initYamlFile(m1);
        
        OrderQueryDto m2 = DataFactory.tansferData(m1, OrderQueryDto.class);
        System.out.println(m2.toString());
        
    }

}
