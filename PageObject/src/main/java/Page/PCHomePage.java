package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasicTool.WaitTool;

public class PCHomePage extends AbstractPage {

	@FindBy(css = "div.downloads")
	private WebElement DownLoadButton;
	
    public PCHomePage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, DownLoadButton);
    }

}
