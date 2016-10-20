package page.pc.aboutUsPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.customize.reporter.WebReporter;

import basicTool.WaitTool;
import basicTool.window.WindowsUtil;
import page.pc.AbstractPCPage;

public class AboutUsPage extends AbstractPCPage {

    @FindBy(css = "img[alt='借贷宝']")
    private WebElement jieDaiBaoImage;

    @FindBy(css = "a[href='http://www.hotjob.cn/wt/rrxjdb/web/index']")
    private WebElement joinUsLink;

    @FindBy(css = "a[class='promoterApply']")
    private WebElement joinExtensionTeamLink;

    public AboutUsPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, jieDaiBaoImage);
    }

    public JDBRecruitPage clickJoinUsLink() throws Exception {

        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByTagName('a')[7].click()");

        WindowsUtil.getInstance(driver).switchWindow();

        return new JDBRecruitPage(driver);
    }

    public JDBRecruitPage clickJoinExtensionTeamLink() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByTagName('a')[8].click()");

        WindowsUtil.getInstance(driver).switchWindow();

        return new JDBRecruitPage(driver);

    }
}
