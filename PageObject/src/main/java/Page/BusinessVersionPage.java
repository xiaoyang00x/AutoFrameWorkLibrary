package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasicTool.WaitTool;

public class BusinessVersionPage extends AbstractPage{

	@FindBy(css = "[href='#/news']")
	private WebElement newsLabel;
	
	protected BusinessVersionPage(WebDriver driver) {
		super(driver);
		WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT,newsLabel);
	}

}
