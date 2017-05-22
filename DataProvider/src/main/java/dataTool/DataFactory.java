package dataTool;

import dataBean.IDataBean;
import org.ho.yaml.Yaml;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
     * 
     * @param objectClass
     *            you want to get the bean's class object.
     * @param id
     *            selector for id
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
     *
     * @param model yaml data
     * @param dto dubbo interface need paramater
     * @param <T>
     * @return a dto obj
     * @throws Exception
     */
    public static <T> T tansferData(Object model, Class<T> dto) throws Exception {
        Field[] field = model.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组
        Object dtoBean = dto.newInstance();
        for (int j = 0; j < field.length; j++) {     //遍历所有属性
            String name = field[j].getName();    //获取属性的名字
            if (name.equals("id")) {

            } else {
                name = name.substring(0, 1).toUpperCase() + name.substring(1); //将属性的首字符大写，方便构造get，set方法
                String type = field[j].getGenericType().toString();    //获取属性的类型
                if (type.equals("class java.lang.String")) {   //如果type是类类型，则前面包含"class "，后面跟类名
                    Method m = model.getClass().getMethod("get" + name);
                    String value = (String) m.invoke(model);    //调用getter方法获取属性值
                    if (value != null) {
                        Method set = dto.getMethod("set" + name, String.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.lang.Integer")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Integer value = (Integer) m.invoke(model);
                    if (value != null) {
                        Method set = dto.getMethod("set" + name, Integer.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.lang.Short")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Short value = (Short) m.invoke(model);
                    if (value != null) {
                        Method set = dto.getMethod("set" + name, Short.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.lang.Double")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Double value = (Double) m.invoke(model);
                    if (value != null) {
                        Method set = dto.getMethod("set" + name, Double.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.lang.Boolean")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Boolean value = (Boolean) m.invoke(model);
                    if (value != null) {
                        Method set = dto.getMethod("set" + name, Boolean.class);
                        set.invoke(dtoBean, value);
                    }
                }
                if (type.equals("class java.util.Date")) {
                    Method m = model.getClass().getMethod("get" + name);
                    Date value = (Date) m.invoke(model);
                    if (value != null) {
                        Method set = dto.getMethod("set" + name, Date.class);
                        set.invoke(dtoBean, value);
                    }
                }
                
                if (type.contains("java.util.List")) {
                    Method m = model.getClass().getMethod("get" + name);
                    List value = (List) m.invoke(model);
                    if (value != null) {
                        System.out.println("进来了");
                        Method set = dto.getMethod("set" + name, List.class);
                        set.invoke(dtoBean, value);
                    }
                }
                
                
            }

        }
        return (T) dtoBean;
    }


}
