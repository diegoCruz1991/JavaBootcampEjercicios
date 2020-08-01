package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;

public class Excercise5AmazonSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com.mx/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement searchElement = driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));

        if (searchElement.isDisplayed() && searchElement.isEnabled()) {
            searchElement.sendKeys("Selenium");
            searchElement.sendKeys(Keys.ENTER);
            Thread.sleep(1000);

        }
        driver.close();
        driver.quit();

    }
}
