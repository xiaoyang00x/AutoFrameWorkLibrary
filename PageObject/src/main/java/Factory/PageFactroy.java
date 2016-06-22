package Factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import Page.AbstractPage;

public class PageFactroy {

    /**
     * 
     * @param initPageClass
     *            You want to get pageobject's class
     * @param driver
     *            Current driver which you operation
     * @return You want to get pageobject
     */
    public static <T extends AbstractPage> T getPageObject(Class<T> initPageClass, WebDriver driver) {
        T pageObject = (T) PageFactroy.initElements(driver, (Class<?>) initPageClass);
        return pageObject;
    }


    /**
     * 
     * @param driver
     *            Current driver which you operation
     * @param pageClassToProxy
     *            You want to init element page's class
     * @return T generic paradigm
     */
    public static <T> T initElements(WebDriver driver, Class<T> pageClassToProxy) {
        T page = instantiatePage(driver, pageClassToProxy);
        initElements(driver, page);
        return page;
    }

    /**
     * 
     * @param pageClassToProxy
     *            Use for reflex
     * @return T generic paradigm
     */
    private static <T> T instantiatePage(WebDriver driver, Class<T> pageClassToProxy) {
        try {
            try {
                Constructor<T> constructor = pageClassToProxy.getConstructor();
                return constructor.newInstance();
            } catch (NoSuchMethodException e) {
                return pageClassToProxy.newInstance();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    
    
    
    public static void initElements(WebDriver driver, Object page) {
        final WebDriver driverRef = driver;
        initElements(new DefaultElementLocatorFactory(driverRef), page);
    }

    /**
     * Similar to the other "initElements" methods, but takes an {@link ElementLocatorFactory} which is used for
     * providing the mechanism for finding elements. If the ElementLocatorFactory returns null then the field won't be
     * decorated.
     *
     * @param factory
     *            The factory to use
     * @param page
     *            The object to decorate the fields of
     */
    public static void initElements(ElementLocatorFactory factory, Object page) {
        final ElementLocatorFactory factoryRef = factory;
        initElements(new DefaultFieldDecorator(factoryRef), page);
    }

    public static void initElements(FieldDecorator decorator, Object page) {
        Class<?> proxyIn = page.getClass();
        while (proxyIn != Object.class) {
            proxyFields(decorator, page, proxyIn);
            proxyIn = proxyIn.getSuperclass();
        }
    }

    private static void proxyFields(FieldDecorator decorator, Object page, Class<?> proxyIn) {
        Field[] fields = proxyIn.getDeclaredFields();
        for (Field field : fields) {
            Object value = decorator.decorate(page.getClass().getClassLoader(), field);
            if (value != null) {
                try {
                    field.setAccessible(true);
                    field.set(page, value);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
