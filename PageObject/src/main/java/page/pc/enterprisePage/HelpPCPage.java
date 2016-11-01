package page.pc.enterprisePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;
public class HelpPCPage extends AbstractPCPage{
    
    @FindBy(css="#help-sidebar li")
    List<WebElement> selectList;
    @FindBy(css="#help-sidebar")
    WebElement helpSidebar;
    
    public HelpPCPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, helpSidebar);
    }
    public WebElement ClickAboutUs() throws Exception{
        return click(getWebElementByName("关于我们", selectList), helpSidebar);
    }
    public WebElement ClickPayBenefits() throws Exception{
        return click(getWebElementByName("发工资的好处", selectList), helpSidebar);
    }

    public WebElement ClickEmployeesFinancing()throws Exception{
        return click(getWebElementByName("借力员工融资", selectList), helpSidebar);
    }
    public WebElement ClickBorrowMoneyInvest()throws Exception{
        return click(getWebElementByName("借钱投资", selectList), helpSidebar);
    }
    public WebElement ClickRegistrationAndLogin()throws Exception{
        return click(getWebElementByName("注册和登录", selectList), helpSidebar);
    }
    public WebElement ClickRechargeAndWithdraw()throws Exception{
        return click(getWebElementByName("充值和提现", selectList), helpSidebar);
    }
    public WebElement ClickEmployeesAndWage()throws Exception{
        return click(getWebElementByName("员工和工资", selectList), helpSidebar);
    }
    public WebElement ClickFinancing()throws Exception{
        return click(getWebElementByName("融资", selectList), helpSidebar);
    }
}
