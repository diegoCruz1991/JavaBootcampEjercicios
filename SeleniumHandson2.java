package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandson2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // used to set the default waiting time for page loading timeout.
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://www.google.com");

        //Resize current window to the set dimension
        driver.manage().window().maximize();

        assert driver.getCurrentUrl().equals("https://www.google.com"): "No es la pagina de google";

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));

        searchBox.sendKeys("selenium");
        searchBox.submit();

        Thread.sleep(1000);

        driver.close();
    }
}
