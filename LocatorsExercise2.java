package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorExercise2 {
    static WebDriver driver;
    public static void main(String[] args){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        googleSearch();

        System.out.println("Everything went better than expected");

        driver.close();
        driver.quit();
    }

    static void googleSearch(){
        driver.get("https://www.google.com");

        WebElement btnLogin = driver.findElement(By.id("InvalidElement"));
    }
}
