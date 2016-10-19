package page.pc.promoterApply;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import dataBean.pc.opromoter.OpromoterBean;
import page.pc.AbstractPCPage;

public class OpromoterApplyPage extends AbstractPCPage {

    @FindBy(css = "input[name='name']")
    private WebElement promoterNameTextFiled;

    @FindBy(css = "input[name='idNo']")
    private WebElement IdCardNoTextFiled;

    @FindBy(css = "input[name='telNO']")
    private WebElement telePhoneNoTextFiled;

    @FindBy(css = "input[name='email']")
    private WebElement emailTextFiled;

    @FindBy(css = "input[name='province']")
    private WebElement provinceTextFiled;

    @FindBy(css = "input[name='city']")
    private WebElement cityTextFiled;

    @FindBy(css = "textarea[name='coSource']")
    private WebElement cooperSourceTextFiled;

    @FindBy(css = ".p-submit")
    private WebElement submitButton;

    @FindBy(css = "a[href='/contact/']")
    private WebElement viewContactLink;

    public OpromoterApplyPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(submitButton), 60);
    }

    public <expectPage extends AbstractPCPage> expectPage fillOpromoterInformation(OpromoterBean opromoter,
            Boolean passOrBlock) throws Exception {

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
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.getElementsByTagName('input')[4].readOnly=false");
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

    public ExtensionPage clickViewContactLink() throws Exception {
        return click(viewContactLink, ExtensionPage.class);
    }

}
