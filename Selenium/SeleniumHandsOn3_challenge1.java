package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn3_challenge1 {
    public static void main(String... args) throws InterruptedException {
        File rootPath = new File("JavaBootcampEjercicios/drivers");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement fbEmail = driver.findElement(By.id("email"));
        fbEmail.sendKeys("dayan_na.31@hotmail.com");

        WebElement fbPwd = driver.findElement(By.id("pass"));
        fbPwd.sendKeys("Tequiero31");

        WebElement fbLogin = driver.findElement(By.id("loginbutton"));
        fbLogin.click();

        Thread.sleep(10000);

        WebElement fbSearch = driver.findElement(By.xpath("//input[@type='search']"));
        fbSearch.sendKeys("QA Minds");
        fbSearch.sendKeys(Keys.ENTER);

        driver.close();
        driver.quit();
    }
}
