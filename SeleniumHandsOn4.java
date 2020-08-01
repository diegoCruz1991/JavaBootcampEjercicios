package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // used to set the default waiting time for page loading timeout.
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://www.amazon.com.mx");
        assert driver.getCurrentUrl().equals("https://www.amazon.com.mx"): "No es la pagina de Amazon";

        //Resize current window to the set dimension
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text' and @id='twotabsearchtextbox']"));
        searchBox.sendKeys("Selenium", Keys.ENTER);

        Thread.sleep(10000);

        driver.close();
        driver.quit();

    }
}
