package Page.promoterApply;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.customize.reporter.WebReporter;

import BasicTool.WaitTool;
import DataBean.OpromoterBean;
import Page.AbstractPage;

public class OpromoterApplyPage extends AbstractPage{
	@FindBy(css="#check i[id='0']")
	private WebElement personRadioButton;
	
	@FindBy(css="#check i[id='1']")
	private WebElement companyRadioButton;
	
	@FindBy(css="#promoterName")
	private WebElement promoterNameTextFiled;
	
	@FindBy(css="#IdCardNo")
	private WebElement IdCardNoTextFiled;
	
	@FindBy(css="#telePhoneNo")
	private WebElement telePhoneNoTextFiled;
	
	@FindBy(css="#email")
	private WebElement emailTextFiled;
	
	@FindBy(css = "#province")
	private WebElement provinceTextFiled;
	
	@FindBy(css=".provinceContainer:not([style*='display: none']) .provinceA")
	private List<WebElement> provinceSelectList;
	
	@FindBy(css="#city")
	private WebElement cityTextFiled;
	
	@FindBy(css="#cooperSource")
	private WebElement cooperSourceTextFiled;
	
	@FindBy(css=".submit")
	private WebElement submitButton;
	
	@FindBy(css="a[href*='person']")
	private WebElement personOpromoterLink;
	
	@FindBy(css="a[href*='company']")
	private WebElement companyOpromoterLink;
	
	@FindBy(css=".blue_toast")
	private WebElement sucessToastLabel;

	public OpromoterApplyPage(WebDriver driver) {
		super(driver);
		WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(personRadioButton), 60);
	}
	public void applyForPersonOpromoter(OpromoterBean opromoter)throws Exception{
		click(personRadioButton,promoterNameTextFiled);
		fillOpromoterInformation(opromoter);
		WebReporter.log(driver, driver.getTitle(), true, true);
	}
	
	
	public void applyForCompanyOpromoter(OpromoterBean opromoter)throws Exception{
		click(companyRadioButton,promoterNameTextFiled);
		fillOpromoterInformation(opromoter);
		Thread.sleep(1000);
		WebReporter.log(driver, driver.getTitle(), true, true);
	}
	
    public void fillOpromoterInformation(OpromoterBean opromoter) throws Exception{
    	if(!opromoter.getPromoterName().equals("") || opromoter.getPromoterName()!=null){
    		setInputText(promoterNameTextFiled, opromoter.getPromoterName());
    	}
    	if(!opromoter.getIdCardNo().equals("") || opromoter.getIdCardNo()!=null){
    		setInputText(IdCardNoTextFiled, opromoter.getIdCardNo());
    	}
    	if(!opromoter.getTelePhoneNo().equals("") || opromoter.getTelePhoneNo()!=null){
    		setInputText(telePhoneNoTextFiled, opromoter.getTelePhoneNo());
    	}
    	if(!opromoter.getEmail().equals("") || opromoter.getEmail()!=null){
    		setInputText(emailTextFiled, opromoter.getEmail());
    	}
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", emailTextFiled);
    	if(!opromoter.getProvince().equals("") || opromoter.getProvince()!=null){
    		selectProvinceByLabel(opromoter.getProvince());
    	}
    	if(!opromoter.getCity().equals("") || opromoter.getCity()!=null){
    		setInputText(cityTextFiled, opromoter.getCity());
    	}
    	if(!opromoter.getCooperSource().equals("") || opromoter.getCooperSource()!=null){
    		setInputText(cooperSourceTextFiled, opromoter.getCooperSource());
    	}
	}
	
    public void selectProvinceByLabel(String option) throws Exception{
    	provinceTextFiled.click();
    	WaitTool.waitFor(this.driver, ExpectedConditions.visibilityOf(provinceSelectList.get(0)),
                WaitTool.getDefaultWait4Page());
    	for (WebElement optionElement : provinceSelectList) {
            if (optionElement.getText().trim().equals(option)) {
                optionElement.click();
                return;
            }
        }
    	throw new Exception("The expected option is not listed in select list options");
    }
    
	public void clickSubmitButton() throws Exception{
		click(submitButton,sucessToastLabel);
		WebReporter.log(driver, driver.getTitle(), true, true);
	}
	
	public PersonOpromoterPage clickPersonOpromoterLink() throws Exception{
		 return click(personOpromoterLink,PersonOpromoterPage.class);
	}
	
	public CompanyOpromoterPage clickCompanyOpromoterLink() throws Exception{
		return click(companyOpromoterLink, CompanyOpromoterPage.class);
	}

}
