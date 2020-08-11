package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumExercise4 {

    public static void main(String[] args) throws InterruptedException {
        File rootPath = new File("src/test/resources/drivers/chromedriver");

        System.setProperty("webdriver.chrome.driver", rootPath.getPath());

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");

        WebElement searchElement = driver.findElement(By.cssSelector("//input[@id='search']"));

        if (searchElement.isDisplayed() && searchElement.isEnabled()) {
            searchElement.sendKeys("Selenium");

            WebElement searchIconElement = driver.findElement(By.id("search-icon-legacy"));

            searchIconElement.click();

            Thread.sleep(5000);
        }

        driver.close();
    }
}
