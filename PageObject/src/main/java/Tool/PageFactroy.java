package Tool;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.AbstractPage;

public class PageFactroy {
    public static <T extends AbstractPage> T getPageObject(Class<T> initPageClass, WebDriver driver) {
        T pageObject = (T) PageFactroy.initElements(driver, (Class<?>) initPageClass);
        return pageObject;
    }

    private static <T> T instantiatePage(Class<T> pageClassToProxy) {
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

    public static <T> T initElements(WebDriver driver, Class<T> pageClassToProxy) {
        T page = instantiatePage(pageClassToProxy);
        PageFactory.initElements(driver, page);
        return page;
    }
}
