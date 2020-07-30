package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4_Amazon {
    public static void main(String... args) throws InterruptedException {
        File rootPath = new File("JavaBootcampEjercicios/drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.mx/");
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

        WebElement amazonSearchInput = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchInput.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-text"));
        searchButton.submit();

        Thread.sleep(10000);

        driver.close();
        driver.quit();
    }
}
