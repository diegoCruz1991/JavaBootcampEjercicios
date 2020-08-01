package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHO2 {
    public static void main(String...args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        System.out.println("URL ES: " + driver.getCurrentUrl());
        assert driver.getCurrentUrl().equals("https://www.google.com/") : "No es la pagina esperada...";
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("maven");
        textBox.submit();
        driver.close();
        driver.quit();
    }
}
