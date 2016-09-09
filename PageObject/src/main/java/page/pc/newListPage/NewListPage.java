package page.pc.newListPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page.pc.AbstractPCPage;
import basicTool.WaitTool;

public class NewListPage extends AbstractPCPage {

    @FindBy(css = "img[src='images/news_words.png']")
    private WebElement newListPageIMG;
    
    @FindBy(css= "a[class='cat']")
    private List<WebElement> newList;

    public NewListPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, WaitTool.DEFAULT_WAIT_4_ELEMENT, newListPageIMG);
    }
    
    public NewListPage clickcompanyNewsList() throws Exception {
        return click(getWebElementByName("公司新闻",newList),NewListPage.class);
    }

    public NewListPage clickProductNewsList() throws Exception {
        return click(getWebElementByName("产品新闻",newList),NewListPage.class);
    }
    
    public WebElement getWebElementByName(String name,List<WebElement> elementList) throws Exception{
    	for(WebElement a : elementList) {
    		if(a.getText().trim().equals(name))
    			return a;
    	}
    	
    	 throw new Exception("No such element in this List");
    }

}
