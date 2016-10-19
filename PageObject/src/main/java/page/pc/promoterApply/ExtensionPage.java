package page.pc.promoterApply;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import basicTool.WaitTool;
import page.pc.AbstractPCPage;

public class ExtensionPage extends AbstractPCPage {

    @FindBy(css = "input[placeholder='请选择所要查看的省份']")
    private WebElement selectorForProvinceLabel;

    @FindBy(css = "p.p-province-area a")
    private List<WebElement> cityList;

    @FindBy(css = "div.c-desc")
    private WebElement ownerForCityTitle;

    public ExtensionPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(selectorForProvinceLabel), 60);

    }

    public ExtensionPage viewOwnerByCity(String cityName) throws Exception {
        for (WebElement city : cityList) {
            if (city.getText().trim().equals(cityName)) {
                System.out.println(city.getText().trim());
                click(city, ownerForCityTitle);
                return this;
            }
        }

        throw new Exception("no this city in selector for city!!!!");
    }

}
