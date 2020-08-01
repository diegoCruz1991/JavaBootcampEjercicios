package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com.mx");

        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

        WebElement searchTextBox = driver.findElement(By.name("field-keywords"));

        //aparece 2 veces
 //       WebElement searchTextBox = driver.findElement(By.id("twotabsearchtexbox"));

        searchTextBox.sendKeys("Selenium");

 //       searchTextBox.submit();
        searchTextBox.click();

        Thread.sleep(10000);

        driver.close();

        driver.quit();

    }

}