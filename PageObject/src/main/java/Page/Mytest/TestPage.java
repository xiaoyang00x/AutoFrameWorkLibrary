package Page.Mytest;

import org.openqa.selenium.WebDriver;

import BasicTool.Frame.IFrame;
import Page.AbstractPage;

@IFrame(name = "a.b.c")
public class TestPage extends AbstractPage {

    public TestPage() {

    }

    public TestPage(WebDriver driver) {
        super(driver);
        switchFrame();
    }

}
