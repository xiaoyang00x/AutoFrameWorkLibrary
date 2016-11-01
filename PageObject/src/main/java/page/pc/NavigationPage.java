package page.pc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import page.pc.aboutUsPage.AboutUsPage;
import page.pc.businessVersionPage.BusinessVersionPage;
import page.pc.enterprisePage.EnterprisePCPage;
import page.pc.functionDetailPage.FunctionDetailPage;
import page.pc.homePage.PCHomePage;
import page.pc.newListPage.NewListPage;
import page.pc.payment.PaymentLoginPage;
import page.pc.promoterApply.OpromoterApplyPage;

public class NavigationPage extends AbstractPCPage {

	@FindBy(css = "a[title='首页']")
	private WebElement HomePageLink;

	@FindBy(css = "a[title='在线充值']")
	private WebElement PayPageLink;

	@FindBy(css = "a[title='功能介绍']")
	private WebElement FunctionDetaillLink;

	@FindBy(css = "a[title='企业版']")
	private WebElement BusinessVersionLink;

	@FindBy(css = "a[title='信息动态']")
	private WebElement NewListLink;

	@FindBy(css = "a[title='推广合作']")
	private WebElement promoterApplyLink;

	@FindBy(css = "a[title='关于我们']")
	private WebElement aboutUsLink;

	public NavigationPage(WebDriver driver) {
		super(driver);
		switchFrame();
		WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(HomePageLink), DefaultWaitElementTime4Page);
	}

	public PaymentLoginPage clickPayPageLink() throws Exception {
		return click(PayPageLink, PaymentLoginPage.class);
	}

	public FunctionDetailPage clickFunctionDetaillLink() throws Exception {
		return click(FunctionDetaillLink, FunctionDetailPage.class);
	}

	public BusinessVersionPage clickBusinessVersionLink() throws Exception {
		return click(BusinessVersionLink, BusinessVersionPage.class);
	}

	public EnterprisePCPage clickEnterpriseLink() throws Exception {

		return click(BusinessVersionLink, EnterprisePCPage.class);

	}

	public NewListPage clickNewListLink() throws Exception {
		return click(NewListLink, NewListPage.class);
	}

	public OpromoterApplyPage clickPromoterApplyLink() throws Exception {
		return click(promoterApplyLink, OpromoterApplyPage.class);
	}

	public AboutUsPage clickAboutUsLink() throws Exception {
		return click(aboutUsLink, AboutUsPage.class);
	}

	public PCHomePage clickHomePageLink() throws Exception {
		return click(HomePageLink, PCHomePage.class);
	}

}
