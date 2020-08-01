package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHO4 {
    public static void main(String...args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.mx");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
        searchText.sendKeys("Selenium");
        searchText.submit();
        Thread.sleep(10000);
        driver.quit();
        driver.close();
    }
}
