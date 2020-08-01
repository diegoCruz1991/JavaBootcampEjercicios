package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        System.out.println("URL : " + driver.getCurrentUrl());

        assert driver.getCurrentUrl().equals("https://www.google.com/") : "No es la pagina de google";

        WebElement searchElem = driver.findElement(By.name("q"));

        searchElem.sendKeys("selenium");

        searchElem.submit();

        Thread.sleep(1000);

        driver.close();
    }
}