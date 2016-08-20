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

    @FindBy()
    public WebElement a;

    public MyTestPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void swipe(String isLeft, int times) {

        int widht = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        for (int i = 0; i < times; i++)
            // 向左滑动！
            driver.swipe(widht * 6 / 7, height / 2, widht / 7, height / 2, 2);

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
        myTestPage.swipe("true", 3);

    }

}
