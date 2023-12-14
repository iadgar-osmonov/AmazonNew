package amazonProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.utils.BrowserUtils;

import java.util.List;

public class AmazonProjectMainPage {
    public AmazonProjectMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#nav-hamburger-menu")
    WebElement allButton;
    @FindBy(xpath = "//div[.='Kindle E-readers & Books']")
    List<WebElement> kindlesEreadersBtn;

    @FindBy(xpath = "//a[.='Kindle']")
   List<WebElement> kindleBtn;


    public void clickOnAllAndClickOnKindle(WebDriver driver) throws InterruptedException {

        BrowserUtils.clickOnElement(allButton);
        Thread.sleep(1000);
        for (int i = 0; i < 1; i++) {
            BrowserUtils.clickOnElement(kindlesEreadersBtn.get(i));

        }
        Thread.sleep(1000);
        BrowserUtils.hoverOver(driver, kindleBtn.get(0));
        Thread.sleep(1000);
        BrowserUtils.clickOnElement(kindleBtn.get(1));




    }
}
