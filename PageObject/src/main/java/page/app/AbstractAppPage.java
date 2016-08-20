package page.app;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AbstractPage;

public class AbstractAppPage implements AbstractPage {
    protected WebDriver driver;
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

    protected AbstractAppPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
