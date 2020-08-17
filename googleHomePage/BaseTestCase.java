package newGoogle;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTestCase {

    protected WebDriver myDriver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        myDriver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        myDriver.close();
        myDriver.quit();
    }
}
