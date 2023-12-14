package amazonProject.steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.utils.ConfigReader;
import utils.utils.DriverHelper;

public class AmazonProjectHook {
    WebDriver driver= DriverHelper.getDriver();
    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("amazonURL"));
    }
}
