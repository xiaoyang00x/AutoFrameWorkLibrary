package Page;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Tool.WaitTool;

public class AbstractPage {
    public static final int DefaultWaitElementTime4Page = 60;


    /**
     * Construct a Component Page Object until the page loaded.
     * 
     * @param <T>
     * 
     * @param driver
     *            the Selenium 2 WebDriver used by this class to manipulate the application
     * 
     * @throws TimeoutException
     *             if the timeout expires
     * 
     */
    public <PageObjectStyle extends AbstractPage> AbstractPage() {
    }

    public <PageObjectStyle extends AbstractPage> AbstractPage(WebDriver driver) {
        WaitTool.waitFor(driver, WaitTool.pageLoadDone());

    }

    protected <PageObjectStyle extends AbstractPage> AbstractPage(WebDriver driver, WebElement webElement, int waitTime) {
        WaitTool.waitFor(driver, waitTime, webElement);

    }

    /**
     * Is this element currently displayed or not? This method avoids the problem of having to parse an element's
     * "style" attribute.
     * 
     * @param driver
     *            the instance of WebDriver manipulated
     * @return Whether or not the element is displayed
     */

    public static boolean isDisplayed(final WebDriver driver, final WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
