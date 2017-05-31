package dataTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.miaoqian.prod.api.dto.request.ProductRelateProjectParamDto;
import dataBean.dubbo.productSys.MyProductDto;
import dataBean.dubbo.productSys.MyProductRelateProjectParamDto;
import org.ho.yaml.Yaml;

import com.miaoqian.prod.api.dto.request.ProjectRelateSubParamDto;


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

        MyProductDto myProductDto = new MyProductDto();
        myProductDto.setId("default");
        myProductDto.setProductCode("meishayong");
        myProductDto.setProductName("yangyutest");
        myProductDto.setPubUserId("yangyu");
        myProductDto.setPubUserType(1);
        myProductDto.setIpAddress("10.0.1.167");
        myProductDto.setStartTime(tansforDate("2017-07-27 17:48:01"));
        myProductDto.setEndTime(tansforDate("2017-09-27 17:48:01"));
        myProductDto.setProductType(1);
        myProductDto.setDescription("我就是来测试的");
        myProductDto.setStatus(1);
        myProductDto.setChannelCode("APP");
        myProductDto.setFullTime(tansforDate("2017-09-01 17:48:01"));
        myProductDto.setInterestAccrualMode("BMB");
        myProductDto.setBidType("PTB");
        myProductDto.setMaxInvestAmount(200000.0);
        myProductDto.setUnitAmount(100000.0);
        myProductDto.setMinInvestAmount(100.0);
        myProductDto.setMaxRate(12.0);
        myProductDto.setBidAmount(500000.0);
        myProductDto.setInvestedAmount(350000.0);
        myProductDto.setFrozenAmount(50000.0);
        myProductDto.setRemainAmount(150000.0);
        myProductDto.setYearRate(8.0);
        myProductDto.setAddInterestRate(0.0);
        myProductDto.setRepayStatus(0);
        myProductDto.setCreateTime(tansforDate("2017-07-26 17:48:01"));
        myProductDto.setTemplateCode("yangyuceshiyongde");
        myProductDto.setProductTag("yang|yu");
        myProductDto.setOperateRemark("shayisi");
        myProductDto.setIsTarget(0);
        myProductDto.setTargetCustomerId("");
        myProductDto.setMarketMakerId("ceshi");
        myProductDto.setDisplayWeight(3);
        myProductDto.setProductTerm(90);
        myProductDto.setCanTransfer(0);
        initYamlFile(myProductDto);

    }

}
