package amazonProject.steps;

//import com.amazonProject.pages.AmazonProjectMainPage;
//import com.amazonProject.pages.KindleProjectPage;
import amazonProject.pages.AmazonProjectMainPage;
import amazonProject.pages.KindleProjectPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.utils.DriverHelper;
//import utils.DriverHelper;

public class AmazonProjectStepDefinitions {
    WebDriver driver= DriverHelper.getDriver();
    AmazonProjectMainPage mainPage=new AmazonProjectMainPage(driver);
    KindleProjectPage kindleProjectPage=new KindleProjectPage(driver);
    @When("user on amazon main page clicks on All button and clicks on Kindle E-readers and clicks on Kindle")
    public void user_on_amazon_main_page_clicks_on_all_button_and_clicks_on_kindle_e_readers_and_clicks_on_kindle() throws InterruptedException {
    mainPage.clickOnAllAndClickOnKindle(driver);
    }
    @Then("user validates price as {string}")
    public void user_validates_price_as(String price) {
       kindleProjectPage.validatePrice(price);

    }
}
