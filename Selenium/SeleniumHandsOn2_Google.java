package Selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHandsOn2_Google {

    public static void main(String... args) throws InterruptedException {
        File rootPath = new File("JavaBootcampEjercicios/drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        assert driver.getCurrentUrl().equals("https://www.google.com/") : "La URL no es la correcta" ;

        WebElement googleSearchInput = driver.findElement(By.name("q"));
        googleSearchInput.sendKeys("Navidad");
        //Thread.sleep(1000);

        driver.close();
        driver.quit();
    }
}
