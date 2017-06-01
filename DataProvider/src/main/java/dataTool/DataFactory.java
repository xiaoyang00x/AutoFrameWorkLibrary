package dataTool;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.ho.yaml.Yaml;

import dataBean.IDataBean;

public class DataFactory {

    // yaml file's path should be same with bean's path
    public static <T> T GetData(Class<T> objectClass) throws FileNotFoundException {
        String objectClassName = objectClass.getName();
        if (null != objectClassName) {
            objectClassName = objectClassName.replace(".", "/").replace("dataBean", "yaml");
        }
        String path = objectClassName + ".yaml";
        InputStream inStream = ClassLoader.getSystemResourceAsStream(path);
        T tObject = Yaml.loadType(inStream, objectClass);
        return tObject;

    }

    /**
     *
     * @param length 随机长度
     * @return
     */
    public static String getRandomString(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }


    public static <IDataBean> List GetDataList(Class<IDataBean> objectClass) {
        String objectClassName = objectClass.getName();
        if (null != objectClassName) {
            objectClassName = objectClassName.replace(".", "/").replace("dataBean", "yaml");
        }
        String path = objectClassName + ".yaml";
        InputStream inStream = ClassLoader.getSystemResourceAsStream(path);
        List<IDataBean> objList = new ArrayList<IDataBean>();
        for (Object obj : Yaml.loadStream(inStream)) {
            objList.add((IDataBean) obj);
        }

        return objList;
    }

    /**
     * @param objectClass you want to get the bean's class object.
     * @param id          selector for id
     * @return
     * @throws Exception
     */

    public static <T extends IDataBean> T getObject(Class<T> objectClass, String id) throws Exception {
        List<IDataBean> DataList = DataFactory.GetDataList(objectClass);
        for (IDataBean dataBean : DataList) {
            if (dataBean.getId().equals(id))
                return (T) dataBean;
        }
        throw new Exception("No data by use id in this yaml file!!!!");

    }

    /**
     * @param model yaml data
     * @param dto   dubbo interface need paramater
     * @param <T>
     * @return a dto obj
     * @throws Exception
     */
    public static <T> T tansferData(Object model, Class<T> dto) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Field[] field = model.getClass().getDeclaredFields(); // 获取实体类的所有属性，返回Field数组
        Object dtoBean = dto.newInstance();
        for (int j = 0; j < field.length; j++) { // 遍历所有属性
            String name = field[j].getName(); // 获取属性的名字
            if (name.equals("id")) {
            } else {
                name = name.substring(0, 1).toUpperCase() + name.substring(1); // 将属性的首字符大写，方便构造get，set方法
                Object obj = null;
                try {
                    Method m = model.getClass().getMethod("get" + name);
                    obj = m.invoke(model);
                } catch (NoSuchMethodException e) {
                } catch (InvocationTargetException e) {
                } catch (IllegalAccessException e) {
                }
                if (obj != null) {
                    Method[] dtoMethods = dto.getMethods();
                    for (Method method : dtoMethods) {
                        if (method.getName().equals("set" + name)) {
                            if(obj.equals("random")) {
                                method.invoke(dtoBean,getRandomString(16));
                            }else{
                                method.invoke(dtoBean, obj);
                            }
                            break;
                        }
                    }
                }
            }
        }
        return (T) dtoBean;
    }

}
