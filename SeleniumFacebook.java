package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumFacebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://es-la.facebook.com/");
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("jcgarj@gmail.com");
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("elpass");
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.id("u_0_b"));
        button.click();
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
