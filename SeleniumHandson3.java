package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandson3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com");

        assert driver.getCurrentUrl().equals("https://www.facebook.com"): "No es la pagina de google";

        WebElement emailElem = driver.findElement(By.id("email"));
        WebElement passElem = driver.findElement(By.id("pass"));
        WebElement signInElem = driver.findElement(By.id("loginbutton"));

        emailElem.sendKeys("selenium");
        passElem.sendKeys("selenium");
        signInElem.click();

        Thread.sleep(10000);

        driver.close();
    }
}
