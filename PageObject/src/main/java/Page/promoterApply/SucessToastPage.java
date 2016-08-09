package Page.promoterApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicTool.WaitTool;
import Page.AbstractPage;

public class SucessToastPage extends AbstractPage{
	@FindBy(css=".blue_toast")
	private WebElement sucessToastLabel;

	public SucessToastPage(WebDriver driver) {
		super(driver);
		WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(sucessToastLabel), 60);
	}

}
