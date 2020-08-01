package tareas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SHO2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        assert driver.getCurrentUrl().equals("https://www.google.com/"): "La página esperada no es la esperada";
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("QA MINDS", Keys.ENTER);
        Thread.sleep(2000);

        driver.close();//Cerrar el browser
        driver.quit();//Cerrar la sesión del driver
    }
}
