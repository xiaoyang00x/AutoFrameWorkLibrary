package page.app;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.customize.reporter.WebReporter;

import basicTool.WaitTool;
import io.appium.java_client.AppiumDriver;
import page.AbstractPage;

public class AbstractAppPage implements AbstractPage {
    protected AppiumDriver driver;
    public static final int DefaultWaitElementTime4Page = 60;

    /**
     * Construct a Component Page Object until the page loaded.
     * 
     * @param driver
     *            the Selenium 2 WebDriver used by this class to manipulate the application
     * 
     * @throws TimeoutException
     *             if the timeout expires
     * 
     */

    protected AbstractAppPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * 
     * @param type
     *            1： From top to bottom 2： From bottom to top 3： From left to right 4： From right to left
     * @param times
     *            swipe times
     */
    public void swipe(int type, int times) {

        int widht = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;

        switch (type) {
        case 1:

            for (int i = 0; i < times; i++) {
                WebReporter.log(driver, true, true, true);
                driver.swipe(widht / 2, height / 2, widht / 2, height, 2);
            }
            break;

        case 2:

            for (int i = 0; i < times; i++) {
                WebReporter.log(driver, true, true, true);
                driver.swipe(widht / 2, height, widht / 2, height / 2, 2);
            }
            break;
        case 3:

            for (int i = 0; i < times; i++) {
                WebReporter.log(driver, true, true, true);
                driver.swipe(widht / 2, height / 2, widht, height / 2, 2);
            }

            break;

        case 4:

            for (int i = 0; i < times; i++) {
                WebReporter.log(driver, true, true, true);
                driver.swipe(widht, height / 2, widht / 2, height / 2, 2);
            }
            break;

        default:
            break;
        }

    }

    /**
     * A simple click mehtod
     * 
     * @param element
     *            You want to click element
     */
    protected void click(WebElement element) {
        isDisplayed(element);
        element.click();

    }

    /**
     * Click one webElement to wait next page
     * 
     * @param element
     *            click on element
     * @param nextPageClass
     *            expect pageobject's class
     * @return
     * @throws Exception
     */
    protected <W extends AbstractAppPage> W click(WebElement element, Class<W> nextPageClass) throws Exception {
        WebReporter.log(driver, true, true, true);
        click(element);
        return nextPageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
    }

    /**
     * Click one webElement to wait next webElement
     * 
     * @param element
     *            click on element
     * @param expectedElement
     *            except to get element
     * @return
     * @throws Exception
     */
    protected WebElement click(WebElement element, WebElement expectedElement) throws Exception {
        WebReporter.log(driver, true, true, true);
        click(element);
        return ((WebElement) WaitTool.waitFor(this.driver, ExpectedConditions.visibilityOf(expectedElement),
                WaitTool.getDefaultWait4Page()));
    }

    /**
     * Is this element currently displayed or not? This method avoids the problem of having to parse an element's
     * "style" attribute.
     * 
     * @param driver
     *            the instance of WebDriver manipulated
     * @return Whether or not the element is displayed
     */

    protected boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
        }
        return false;
    }

    protected void setInputText(WebElement element, String content) {
        element.clear();
        element.sendKeys(new CharSequence[] { content });
    }

}
