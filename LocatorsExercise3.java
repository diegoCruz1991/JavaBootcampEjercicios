package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {
    static WebDriver driver;
    public static void main(String[] args){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        nasaSearch();

        System.out.println("Everything went better than expected");

        driver.close();
        driver.quit();
    }

    static void nasaSearch(){
        driver.get("https://www.nasa.gov");

        WebElement missionsLink = driver.findElement(By.partialLinkText("Missions"));
        System.out.println(missionsLink.getAttribute("href"));

        WebElement televisionLink = driver.findElement(By.linkText("NASA TV"));
        System.out.println(televisionLink.getAttribute("href"));

        WebElement marsLink = driver.findElement(By.partialLinkText("Mars"));
        System.out.println(marsLink.getAttribute("href"));

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        for(WebElement element: inputs){
            System.out.println(element.getAttribute("value"));
        }

    }
}
