package page.pc.aboutUsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page.pc.AbstractPCPage;
import basicTool.WaitTool;

public class AboutUsPage extends AbstractPCPage {

    @FindBy(css = ".article-list")
    private WebElement jieDaiBaoImage;

    @FindBy(css = "a[class='pc-about-more']")
    private WebElement joinUsLink;

    @FindBy(css = "a[class='promoterApply']")
    private WebElement joinExtensionTeamLink;

    public AboutUsPage(WebDriver driver) {
        super(driver);
        WaitTool.waitFor(driver, DefaultWaitElementTime4Page, jieDaiBaoImage);
    }

    public JDBRecruitPage clickJoinUsLink() throws Exception {
        return click(joinUsLink, JDBRecruitPage.class);
    }

    public JDBRecruitPage clickJoinExtensionTeamLink() throws Exception {
        return click(joinExtensionTeamLink, JDBRecruitPage.class);
    }
}
