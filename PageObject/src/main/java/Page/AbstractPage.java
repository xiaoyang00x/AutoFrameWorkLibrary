package Page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicTool.WaitTool;
import BasicTool.Frame.FrameNavigator;

public class AbstractPage {

    protected WebDriver driver;
    public static final int DefaultWaitElementTime4Page = 60;
    protected final FrameNavigator frameNavigator;

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
        PageFactory.initElements(driver, this);

    }

    /**
     * Is this element currently displayed or not? This method avoids the problem of having to parse an element's
     * "style" attribute.
     * 
     * @param driver
     *            the instance of WebDriver manipulated
     * @return Whether or not the element is displayed
     */

    protected static boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
        }
        return false;
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

    /**
     * A simple click mehtod
     * 
     * @param element
     *            You want to click element
     */
    protected void click(WebElement element) {
        switchFrame(element);
        isDisplayed(element);
        element.click();

    }

    /**
     * 
     * @param element
     *            click on element
     * @param nextPageClass
     *            expect pageobject's class
     * @return
     * @throws Exception
     */
    protected <W extends AbstractPage> W click(WebElement element, Class<W> nextPageClass) throws Exception {
        click(element);
        return nextPageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
    }

    /**
     * 
     * @param element
     *            click on element
     * @param expectedElement
     *            except to get element
     * @return
     * @throws Exception
     */
    protected WebElement click(WebElement element, WebElement expectedElement) throws Exception {
        click(element);
        return ((WebElement) WaitTool.waitFor(this.driver, ExpectedConditions.visibilityOf(expectedElement),
                WaitTool.getDefaultWait4Page()));
    }

}
