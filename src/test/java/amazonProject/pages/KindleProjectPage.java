package amazonProject.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KindleProjectPage {
    public  KindleProjectPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@data-csa-c-slot-id='apex_dp_center_column']//span[@class='a-price-symbol']")
    List<WebElement> pricesSymbol;
    @FindBy(xpath = "//div[@data-csa-c-slot-id='apex_dp_center_column']//span[@class='a-price-whole']")
    List<WebElement>priceWhole;
    @FindBy(xpath = "//div[@data-csa-c-slot-id='apex_dp_center_column']//span[.='.']")
    List<WebElement> dot;
    @FindBy(xpath = "//div[@data-csa-c-slot-id='apex_dp_center_column']//span[@class='a-price-fraction']")
    List<WebElement>priceDecimal;


//    @FindBy(xpath = "//a[.='Kindle']")
//    WebElement kindle;
    public void validatePrice(String price){
        System.out.println(dot.get(1));
       Assert.assertEquals(price,pricesSymbol.get(0).getText()+priceWhole.get(0).getText()+"."+priceDecimal.get(0).getText());





    }
}
