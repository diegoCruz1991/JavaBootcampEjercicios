package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ejercicioHandsOn4Apicasso {
    public static void main(String args[]) throws InterruptedException {
        File rootPath = new File("testngtest/src/test/resources/drivers");
        File chromeFilePath = new File(rootPath, "chromedriver");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.mx/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Thread.sleep(1000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");
        Thread.sleep(1000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        driver.close();
        driver.quit();
    }
}
