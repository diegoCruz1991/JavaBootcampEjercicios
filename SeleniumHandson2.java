package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandson2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        assert driver.getCurrentUrl().equals("https://www.google.com"): "No es la pagina de google";
        WebElement searchElem = driver.findElement(By.xpath("//input[@name='q']"));
        searchElem.sendKeys("selenium");
        searchElem.submit();

        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
