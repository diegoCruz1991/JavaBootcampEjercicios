package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise1 {
    static WebDriver driver;
    public static void main(String[] args) {

        driver = WebDriverFactory.getDriver("chrome");
        mercadolibreSearch();

        System.out.println("Everything went better than expected");

        driver.close();
        driver.quit();
    }

    private static void mercadolibreSearch(){
        //open driver and go to google
        driver.get("https://www.mercadolibre.com.mx/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        assert driver.getCurrentUrl().equals("https://www.mercadolibre.com.mx/");

        WebElement searchBox = driver.findElement(By.name("as_word"));
        searchBox.sendKeys("PS4");
        WebElement searchBtn = driver.findElement(By.className("nav-search-btn"));
        searchBtn.click();
        WebElement firstElement = driver.findElement(By.className("main-title"));
        firstElement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
