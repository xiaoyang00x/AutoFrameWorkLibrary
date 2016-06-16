package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Tool.WaitTool;

public class AbstractPageObject {

	/**
	 * Construct a Component Page Object until the page loaded.
	 
	 * 
	 * @throws TimeoutException
	 *             if the timeout expires
	 * 
	 */
	protected AbstractPageObject() {
		
	}
	
	
	/**
	 * Construct a Component Page Object until the page loaded.
	 * 
	 * @param driver
	 *            the Selenium 2 WebDriver used by this class to manipulate the
	 *            application
	 * 
	 * @throws TimeoutException
	 *             if the timeout expires
	 * 
	 */
	protected AbstractPageObject(WebDriver driver) {
		WaitTool.waitFor(driver, WaitTool.pageLoadDone());

	}


}
