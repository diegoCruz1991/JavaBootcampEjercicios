package ejercicios;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Excercise4FacebookSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.facebook.com.mx/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement buttonElement1 = driver.findElement(By.xpath("//*[@id='details-button']"));
        buttonElement1.click();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        WebElement linkElement = driver.findElement(By.xpath("//*[@id='proceed-link']"));
        linkElement.click();
        Thread.sleep(1000);

        WebElement inputElement = driver.findElement(By.xpath("//*[@id=\'email\']"));
        WebElement inputElement1 = driver.findElement(By.xpath("//*[@id=\'pass\']"));
        WebElement buttonElement = driver.findElement(By.xpath("//*[@id=\'loginbutton\']"));

        if (inputElement.isDisplayed() && inputElement.isEnabled() && inputElement1.isDisplayed() && inputElement1.isEnabled()) {
            inputElement.sendKeys("");
            inputElement.sendKeys("");
            buttonElement.click();
            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        }
        driver.close();
        driver.quit();

    }
}
