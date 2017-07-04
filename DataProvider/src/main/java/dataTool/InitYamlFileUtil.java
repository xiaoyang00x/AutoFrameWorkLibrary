package dataTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.miaoqian.email.api.dubbo.request.MailAttachFile;
import com.miaoqian.email.api.dubbo.request.MailInfo;
import com.miaoqian.email.api.dubbo.request.MailMode;
import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryuserauthinfo.Platform;
import com.miaoqian.usersvc.model.enums.PageTradeTypeEnum;
import com.miaoqian.usersvc.model.enums.SmsJXTypeEnum;
import com.miaoqian.usersvc.model.enums.UserIdTypeEnum;
import dataBean.dubbo.emailSys.MyMailAttachFile;
import dataBean.dubbo.emailSys.MyMailSendRequest;
import dataBean.dubbo.userSys.*;
import org.ho.yaml.Yaml;

public class InitYamlFileUtil {

    public static void initYamlFile(Object object) {
        String className = object.getClass().getName();
        if (null != className) {
//            System.out.print("before: " + className);
            className = className.replace(".", "/").replace("dataBean", "yaml");
//            System.out.print("after :" + className);
        }
        File dumpFile = new File("/Users/guchenglong/workspace/auto_test/H5AutoFrameWorkLibrary/DataProvider/src/main/resources/" + className + ".yaml");
        try {
            FileOutputStream fileOut = new FileOutputStream(dumpFile);
            Yaml.dump(object, fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Date transforDate(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(time);
        return date;
    }


    public static void main(String[] args) throws Exception {

        String start = "2012-09-09";
        String end   = "2017-06-06";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

//        MyUpdateEnterpriseInfoReqDto item = new MyUpdateEnterpriseInfoReqDto();
//        item.setId("regular");
//        item.setEnterpriseName("北京测测测");
//        item.setEnterpriseAddress("北京朝阳");
//        item.setEnterpriseCode("4000500060007000");
//        item.setEnterpriseContact("123456789");
//        item.setMobile("17600012345");
//        item.setEmail("mq@163.com");
//        item.setLegalPersonName("社会法");
//        item.setLegalPersonSex("male");
//        item.setLegalPersonAge(33);
//        item.setLegalPersonIdno("411503198407184957");
//        item.setBusinessScope("金融");
//        item.setResponsiblePersonName("zhangpipi");
//        item.setResponsiblePersonId("230111199101236265");
//        item.setUid("000000000020170622141729350711");
//        item.setRegisteredCapital(new BigDecimal(10000000.00));
//        item.setBusinessTermBeginTime(simpleDateFormat.parse(start));
//        item.setBusinessTermEndTime(simpleDateFormat.parse(end));
//        item.setEstablishTime(simpleDateFormat.parse(start));
//        item.setEnterpriseType("民营");
//        item.setEnterpriseContact("pipipipipipi");
//        item.setContactPhone("13153591919");
//        initYamlFile(item);

//        MyUserCardBindPlusReqDto item = new MyUserCardBindPlusReqDto();
//        item.setId("regular");
//        item.setUid("6212462220000350017");
//        item.setSmsCode("111111");
//        item.setAuthCode("");
//        item.setBankCode("12345678");
//        item.setBankName("工行");
//        item.setCardNo("6222000266771100");
//        item.setIdType(UserIdTypeEnum.ID_CARD_18);
//        item.setIdNo("451201197508204789");
//        item.setMobile("1315359191");
//        item.setName("社会人");

        MyUserLogPasChaRecordReqDto item = new MyUserLogPasChaRecordReqDto();
        item.setId("regular");
        item.setMobile("11101234567");
        item.setBeginDate(simpleDateFormat.parse(start));
        item.setEndDate(simpleDateFormat.parse(end));
        item.setPageNo(1);
        item.setPageSize(10);

        initYamlFile(item);
    }

}