package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicTool.WaitTool;

public class NavigationPage extends AbstractPage {

    @FindBy(css = "#common-header li a[href='/pcIndex.html']")
    private WebElement HomePageLink;

    @FindBy(css = "#common-header li a[href='https://chongzhi.jiedaibao.com']")
    private WebElement PayPageLink;

    @FindBy(css = "#common-header li a[href='/functionDetail.html']")
    private WebElement FunctionDetaillLink;

    @FindBy(css = "[href='https://qiye.jiedaibao.com/']")
    private WebElement BusinessVersionLink;

    @FindBy(css = "[href='/pcNewsList.html']")
    private WebElement NewListLink;

    @FindBy(css = "[href='/partials/aboutUs/promoterApply.html']")
    private WebElement PromotionAndCooperationLink;

    @FindBy(css = "[href='/pcAbout.html']")
    private WebElement AboutWeLink;

    public NavigationPage(WebDriver driver) {
        super(driver);
        switchFrame();
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(HomePageLink), DefaultWaitElementTime4Page);
    }

    public PaymentPage clickPayPageLink() throws Exception {
        return click(PayPageLink, PaymentPage.class);
    }

    public FunctionDetailPage clickFunctionDetaillLink() throws Exception {
        return click(FunctionDetaillLink, FunctionDetailPage.class);
    }

    public BusinessVersionPage clickBusinessVersionLink() throws Exception {
        return click(BusinessVersionLink, BusinessVersionPage.class);
    }

    public NewListPage clickNewListLink() throws Exception {
        return click(NewListLink, NewListPage.class);
    }

    public PromotionAndCooperationPage clickPromotionAndCooperationLink() throws Exception {
        return click(PromotionAndCooperationLink, PromotionAndCooperationPage.class);
    }

    public AboutWePage clickAboutWeLink() throws Exception {
        return click(AboutWeLink, AboutWePage.class);
    }

    public PCHomePage clickHomePageLink() throws Exception {
        return click(HomePageLink, PCHomePage.class);
    }

}
