package dataTool;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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

}
