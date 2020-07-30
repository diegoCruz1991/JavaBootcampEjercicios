package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn3_Facebook {
    public static void main(String... args) throws InterruptedException {
        File rootPath = new File("JavaBootcampEjercicios/drivers");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        WebElement fbEmail = driver.findElement(By.id("email"));
        fbEmail.sendKeys("dayan_na.31@hotmail.com");

        WebElement fbPwd = driver.findElement(By.id("pass"));
        fbPwd.sendKeys("pw100fake");

        WebElement fbLogin = driver.findElement(By.id("loginbutton"));
        fbLogin.click();

        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }
}
