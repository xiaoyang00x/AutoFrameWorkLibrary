package page.pc.promoterApply;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import dataBean.pc.opromoter.OpromoterBean;
import page.pc.AbstractPCPage;

public class OpromoterApplyPage extends AbstractPCPage {
    @FindBy(css = "#check i[id='0']")
    private WebElement personRadioButton;

    @FindBy(css = "#check i[id='1']")
    private WebElement companyRadioButton;

    @FindBy(css = "#promoterName")
    private WebElement promoterNameTextFiled;

    @FindBy(css = "#IdCardNo")
    private WebElement IdCardNoTextFiled;

    @FindBy(css = "#telePhoneNo")
    private WebElement telePhoneNoTextFiled;

    @FindBy(css = "#email")
    private WebElement emailTextFiled;

    @FindBy(css = "#province")
    private WebElement provinceTextFiled;

    @FindBy(css = ".provinceContainer:not([style*='display: none']) .provinceA")
    private List<WebElement> provinceSelectList;

    @FindBy(css = "#city")
    private WebElement cityTextFiled;

    @FindBy(css = "#cooperSource")
    private WebElement cooperSourceTextFiled;

    @FindBy(css = ".submit")
    private WebElement submitButton;

    @FindBy(css = "a[href*='person']")
    private WebElement personOpromoterLink;

    @FindBy(css = "a[href*='company']")
    private WebElement companyOpromoterLink;

    public OpromoterApplyPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(companyOpromoterLink), 60);
    }

    public <expectPage extends AbstractPCPage> expectPage fillOpromoterInformation(OpromoterBean opromoter,
            Boolean passOrBlock) throws Exception {
        // if (StringUtils.isNoneEmpty(opromoter.getPromoterName())) {
        // if (opromoter.getPromotionDirection() == 0)
        // click(personRadioButton, promoterNameTextFiled);
        // else
        // click(companyRadioButton, promoterNameTextFiled);
        // }
        if (StringUtils.isNoneEmpty(opromoter.getPromoterName())) {
            setInputText(promoterNameTextFiled, opromoter.getPromoterName());
        }
        if (StringUtils.isNoneEmpty(opromoter.getIdCardNo())) {
			setInputText(IdCardNoTextFiled, opromoter.getIdCardNo());
        }
        if (StringUtils.isNoneEmpty(opromoter.getTelePhoneNo())) {
            setInputText(telePhoneNoTextFiled, opromoter.getTelePhoneNo());
        }
        if (StringUtils.isNoneEmpty(opromoter.getEmail())) {
            setInputText(emailTextFiled, opromoter.getEmail());
        }
        if (StringUtils.isNoneEmpty(opromoter.getProvince())) {
            setInputText(provinceTextFiled, opromoter.getProvince());
            emailTextFiled.click();
        }
        if (StringUtils.isNoneEmpty(opromoter.getCity())) {
            setInputText(cityTextFiled, opromoter.getCity());
        }
        if (StringUtils.isNoneEmpty(opromoter.getCooperSource())) {
            setInputText(cooperSourceTextFiled, opromoter.getCooperSource());
        }
        if (passOrBlock)
            return (expectPage) clickSubmitButton();
        else
            return (expectPage) clickSubmitButtonForVerify();

    }

    public SucessToastPage clickSubmitButton() throws Exception {
        return click(submitButton, SucessToastPage.class);
    }

    public OpromoterApplyPage clickSubmitButtonForVerify() throws Exception {
        return click(submitButton, OpromoterApplyPage.class);
    }

    public CompanyOpromoterPage clickPersonOpromoterLink() throws Exception {
        return click(personOpromoterLink, CompanyOpromoterPage.class);
    }

    public CompanyOpromoterPage clickCompanyOpromoterLink() throws Exception {
        return click(companyOpromoterLink, CompanyOpromoterPage.class);
    }

}
