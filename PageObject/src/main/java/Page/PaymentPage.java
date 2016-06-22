package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicTool.WaitTool;

public class PaymentPage extends AbstractPage {

    @FindBy(css = "#qrcode img.canvasStyle")
    private WebElement qrcodeIMG;

    public PaymentPage() {

    }

    public PaymentPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(qrcodeIMG), DefaultWaitElementTime4Page);
    }

}
