package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class AmazonSelenium {
        public static void main(String[] args) {
            File rootPath = new File("testngtest/src/test/resources/drivers");
            File ChromeFilePath = new File(rootPath, "chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", ChromeFilePath.getPath());
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com");
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
            search.sendKeys("Selenium");
            search.sendKeys(Keys.ENTER);
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.close();
            driver.quit();


        }
    }