package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;

public class Excercise3GoogleSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com/");

        System.out.println("Current URL:" + driver.getCurrentUrl());
        assert driver.getCurrentUrl().equals("https://google.com/"): "Lá página mostrada no es la esperada";
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement searchElement = driver.findElement(By.xpath("//input[@id='lst-ib' or @name='q']"));


        if (searchElement.isDisplayed() && searchElement.isEnabled()) {
            searchElement.sendKeys("Selenium");
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            searchElement.sendKeys(Keys.ENTER);
        }
        driver.close();
        driver.quit();

    }
}
