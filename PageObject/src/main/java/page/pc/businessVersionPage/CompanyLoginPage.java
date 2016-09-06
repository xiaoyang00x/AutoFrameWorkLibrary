package page.pc.businessVersionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class CompanyLoginPage extends AbstractPCPage{
	
	@FindBy(css = ".login-title")
	private WebElement loginLabel;
	
	public CompanyLoginPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, loginLabel);
    }

}
