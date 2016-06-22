package Page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasicTool.WaitTool;
import BasicTool.Frame.FrameNavigator;

public class AbstractPage {

    protected final WebDriver driver;
    public static final int DefaultWaitElementTime4Page = 60;
    private final FrameNavigator frameNavigator;

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

    protected <PageObjectStyle extends AbstractPage> AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.frameNavigator = new FrameNavigator(driver, this);
        WaitTool.waitFor(driver, WaitTool.pageLoadDone());

    }

    /**
     * Is this element currently displayed or not? This method avoids the problem of having to parse an element's
     * "style" attribute.
     * 
     * @param driver
     *            the instance of WebDriver manipulated
     * @return Whether or not the element is displayed
     */

    protected static boolean isDisplayed(final WebDriver driver, final WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Explicitly switch the current frame to the default frame for this page. This method is already invoked by all
     * methods in this class, where applicable.
     */
    protected void switchFrame() {
        frameNavigator.switchFrame();
    }

    /**
     * Explicitly switch the current frame to the frame of a WebElement. This method is already invoked by all methods
     * in this class, where applicable.
     * 
     * @param element
     *            the WebElement used to determine the target frame.
     */
    protected void switchFrame(WebElement element) {
        frameNavigator.switchFrame(element);
    }

}
