package ejemplos;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class HandsOn3 extends BaseTest {

    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
