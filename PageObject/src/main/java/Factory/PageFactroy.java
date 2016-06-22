package Factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
     * @param pageClassToProxy
     *            Use for reflex
     * @return T generic paradigm
     */
    private static <T> T instantiatePage(WebDriver driver, Class<T> pageClassToProxy) {
        try {
            try {
                Constructor<T> constructor = pageClassToProxy.getConstructor(WebDriver.class);
                return constructor.newInstance(driver);
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
        PageFactory.initElements(driver, page);
        return page;
    }
}
