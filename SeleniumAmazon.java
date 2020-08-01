package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumAmazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        Thread.sleep(10000);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        WebElement inputSearch = driver.findElement(By.id("twotabsearchtextbox"));
        inputSearch.sendKeys("Selenium");
        WebElement submitButton = driver.findElement(By.id("nav-search-submit-text"));
        submitButton.submit();
        Thread.sleep(10000);
        driver.close();
        driver.quit();
        
    }
}
