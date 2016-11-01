package page.pc.enterprisePage;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.customize.reporter.WebReporter;

import basicTool.WaitTool;
import basicTool.window.WindowsUtil;
import page.pc.AbstractPCPage;
import page.pc.aboutUsPage.JDBRecruitPage;

//金融服务页面
public class FinancialServicePCPage extends AbstractPCPage {
    @FindBy(css = ".fs-service span")
    List<WebElement> serviceSelectList;
    @FindBy(css = "#nav-static a")
    List<WebElement> navagationSelcet;
    @FindBy(css = "#nav-static")
    WebElement selectNavagation;
    @FindBy(css = "#fs-service1")
    WebElement specificationListing;

    /**
     * This Element is not function
     * @FindBy(css="#jd-capital a") WebElement goJiuDingInvestment;
     * @FindBy(css="#jz-securitiles div a") WebElement goJiuZhouSecurities;
     * @FindBy(css="#jt-management div a") WebElement goJiuTaiFund;
     * @FindBy(css="#jx-financial div a") WebElement goJiuXinFinance;
     * @FindBy(css="#ageas div a") WebElement goFuTongInsurance;
     */
    public FinancialServicePCPage(WebDriver driver) {
        super(driver);

        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, selectNavagation);
    }

    public FinancialServicePCPage MoveToSpecificationListing() throws Exception {
        return moveToElement(getWebElementByName("规范上市", serviceSelectList));
    }

    public FinancialServicePCPage MoveToMergerAndAcquisition() throws Exception {
        return moveToElement(getWebElementByName("并购重组", serviceSelectList));
    }

    public FinancialServicePCPage MoveToEquityManagement() throws Exception {
        return moveToElement(getWebElementByName("股权管理", serviceSelectList));
    }

    public FinancialServicePCPage MoveToFundManagement() throws Exception {
        return moveToElement(getWebElementByName("基金管理", serviceSelectList));
    }

    public FinancialServicePCPage MoveToComprehensiveInsurance() throws Exception {
        return moveToElement(getWebElementByName("综合保险", serviceSelectList));
    }

    public FinancialServicePCPage ClickJiuDingInvestment() throws Exception {
        return click(getWebElementByName("九鼎投资", navagationSelcet), FinancialServicePCPage.class);
    }

    public FinancialServicePCPage ClickJiuZhouSecurities() throws Exception {
        return click(getWebElementByName("九州证券", navagationSelcet), FinancialServicePCPage.class);
    }

    public FinancialServicePCPage ClickJiuTaiFund() throws Exception {
        return click(getWebElementByName("九泰基金", navagationSelcet), FinancialServicePCPage.class);
    }

    public FinancialServicePCPage ClickJiuXinFinance() throws Exception {
        return click(getWebElementByName("九信金融", navagationSelcet), FinancialServicePCPage.class);
    }

    public FinancialServicePCPage ClickFuTongInsurance() throws Exception {
        return click(getWebElementByName("富通保险", navagationSelcet), FinancialServicePCPage.class);
    }

    public JiuDingInvestmentPCPage GoToJiuDingInvestment() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByTagName('a')[14].click()");

        WindowsUtil.getInstance(driver).switchWindow();

        return new JiuDingInvestmentPCPage(driver);
        // 这个方法等不到返回的driver，无法使用
        // return click(goJiuDingInvestment,JiuDingInvestmentPCPage.class);
    }

    public JiuZhouSecuritiesPCPage GoToJiuZhouSecurities() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByTagName('a')[16].click()");

        WindowsUtil.getInstance(driver).switchWindow();

        return new JiuZhouSecuritiesPCPage(driver);
        
    }

    public JiuTaiFundPCPage GoToJiuTaiFund() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByTagName('a')[18].click()");

        WindowsUtil.getInstance(driver).switchWindow();

        return new JiuTaiFundPCPage(driver);
    }

    public JiuXinFinancePCPage GoToJiuXinFinance() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByTagName('a')[20].click()");

        WindowsUtil.getInstance(driver).switchWindow();

        return new JiuXinFinancePCPage(driver);
    }

    public FuTongInsurancePCPage GoToFuTongInsurance() throws Exception {
        WebReporter.log(driver, driver.getTitle(), true, true);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("document.getElementsByTagName('a')[22].click()");

        WindowsUtil.getInstance(driver).switchWindow();

        return new FuTongInsurancePCPage(driver);
    }

}
