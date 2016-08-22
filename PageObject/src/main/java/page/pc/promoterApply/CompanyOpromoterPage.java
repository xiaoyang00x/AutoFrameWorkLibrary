package page.pc.promoterApply;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class CompanyOpromoterPage extends AbstractPCPage {

    @FindBy(id = "typeText")
    private WebElement titleLabel;
    
    @FindBy(css = ".provinceA")
    private List<WebElement> proviceSelectList;

    public CompanyOpromoterPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(titleLabel), 60);
    }
    
    public CompanyOpromoterPage searchCompanyPromoter(String provinceStr) throws Exception{
    	for(WebElement provice:proviceSelectList){
    		if(provice.getText().equals(provinceStr.trim())){
    			click(provice);
    			return this;
    		}
    	}
    	
    	throw new Exception("no this province");
    }

}
