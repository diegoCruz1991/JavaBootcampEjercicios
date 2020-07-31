package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise5 {
    static WebDriver driver;
    public static void main(String[] args){
        driver = WebDriverFactory.getDriver("chrome");
        googleSearch();
        amazonSearch();

        System.out.println("Everything went better than expected");

        driver.close();
        driver.quit();
    }

    static void googleSearch() {
        //open driver and go to google
        driver.get("https://www.google.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        assert driver.getCurrentUrl().equals("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("everything went better than expected");
        searchBox.submit();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void amazonSearch(){
        driver.get("https://www.amazon.com.mx/");
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        assert driver.getCurrentUrl().equals("https://www.amazon.com.mx/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium");
        searchBox.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}