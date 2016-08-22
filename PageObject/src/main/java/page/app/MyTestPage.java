package page.app;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;

public class MyTestPage {

    public static IOSDriver driver;

    @FindBy(xpath = "//UIAApplication/UIAWindow/UIAScrollView/UIAButton[@type='UIAButton']")
    // @type='UIAButton'
    public static WebElement a;

    public MyTestPage(IOSDriver driver) {
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

            for (int i = 0; i < times; i++)
                driver.swipe(widht / 2, height / 2, widht / 2, height, 2);
            break;

        case 2:

            for (int i = 0; i < times; i++)
                driver.swipe(widht / 2, height, widht / 2, height / 2, 2);
            break;
        case 3:

            for (int i = 0; i < times; i++)
                driver.swipe(widht / 2, height / 2, widht, height / 2, 2);
            break;

        case 4:

            for (int i = 0; i < times; i++)
                driver.swipe(widht, height / 2, widht / 2, height / 2, 2);
            break;

        default:
            break;
        }

    }

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "9.3");
        capabilities.setCapability("deviceName", "iPhone 6s Plus");
        capabilities.setCapability("app", "/Users/yangyu/Desktop/apps/JDBClient.app");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        MyTestPage myTestPage = new MyTestPage(driver);
        myTestPage.swipe(4, 2);
        a.click();
    }

}
