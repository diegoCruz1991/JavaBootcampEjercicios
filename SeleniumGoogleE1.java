package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumGoogleE1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        WebElement myElement = driver.findElement(By.name("q"));
        myElement.sendKeys("Bitso");
        Thread.sleep(1000);
        driver.close();
        driver.quit();
        assert driver.getCurrentUrl().equals("https://www.google.com/"): "La pagina es correcta";
    }

}
