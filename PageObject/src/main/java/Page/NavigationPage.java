package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Tool.WaitTool;

public class NavigationPage extends AbstractPage {

	@FindBy(css = "#common-header li a[href='/pcIndex.html']")
	private WebElement HomePageLink;

	@FindBy(css = "#common-header li a[href='https://chongzhi.jiedaibao.com']")
	private WebElement PayPageLink;

	@FindBy(css = "#common-header li a[href='/functionDetail.html']")
	private WebElement FunctionDetialLink;

	public NavigationPage(WebDriver driver) {
		super(driver, NavigationPage.class);
		WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(HomePageLink), DefaultWaitElementTime4Page);
	}

	public void clickPayPageLink() {
		PayPageLink.click();
	}

	public void clickFunctionDetialLink() {
		FunctionDetialLink.click();
	}

}
