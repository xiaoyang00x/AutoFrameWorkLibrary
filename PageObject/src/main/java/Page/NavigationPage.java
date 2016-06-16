package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends AbstractPageObject{

	
	@FindBy(css="#common-header li a[href='/pcIndex.html']")
	private static WebElement HomePageLink;
	
	protected NavigationPage(WebDriver driver) {
		super(driver);

	}

}
