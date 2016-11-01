package page.pc.enterprisePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page.pc.AbstractPCPage;
import basicTool.WaitTool;
//定位企业版的页面
public class EnterprisePCPage extends AbstractPCPage{
@FindBy(css="#header")
WebElement daoHangLan;
//首页按钮
@FindBy(css="#header span a[href='index.html']")
WebElement indexLink;
//新闻按钮
@FindBy(css="#header span a[href='news.html']")
WebElement newsLink;
//金融服务按钮
@FindBy(css="#header span a[href='financial-service.html']")
WebElement  financialServiceLink;
//帮助按钮
@FindBy(css="#header span a[href='help-page.html']")
WebElement helpLink;

    public EnterprisePCPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, daoHangLan);
    }
    public FinancialServicePCPage clickFinancialServiceLink() throws Exception{
        return click(financialServiceLink, FinancialServicePCPage.class);
    }
    public HelpPCPage clickHelpLink() throws Exception{
        return click(helpLink, HelpPCPage.class);
    }
}
