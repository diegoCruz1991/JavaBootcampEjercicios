package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class GoogleSelenium {
    public static void main(String[] args) throws InterruptedException {
        File rootPath = new File("testngtest/src/test/resources/drivers");
        File ChromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", ChromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        System.out.println(driver.getCurrentUrl());
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Python");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
