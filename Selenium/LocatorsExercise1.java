package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class LocatorsExercise1 {

    public static void main(String... args) throws InterruptedException {
        File rootPath = new File("JavaBootcampEjercicios/drivers");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.mercadolibre.com.mx/");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.name("as_word"));
        searchBox.sendKeys("PS4");

        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.and(ExpectedConditions.presenceOfElementLocated(By.className("nav-search-btn")),
                ExpectedConditions.elementToBeClickable(By.className("nav-search-btn"))));

        WebElement searchBtn = driver.findElement(By.className("nav-search-btn"));
        searchBtn.sendKeys(Keys.ENTER);

        WebElement firstProduct = driver.findElement(By.className("main-title"));
        firstProduct.click();

        driver.close();
        driver.quit();
    }
}
