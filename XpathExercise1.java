package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;

public class XpathExercise1 {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        amazonXpathSearch();

        System.out.println("Everything went better than expected");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();

    }

    static void amazonXpathSearch() {
        driver.get("https://www.amazon.com.mx/");

        WebElement elementHtml = driver.findElement(By.xpath("/html"));
        System.out.println("Vaamos a imprimir el html, vaya fiesta:---------------------\n"
                + elementHtml.getText());

        WebElement elementBody = driver.findElement(By.xpath("//body"));
        System.out.println("Vaamos a imprimir hora todos lo bodyses, ahi va:---------------------\n"
                + elementBody.getText());

        WebElement elementDiv = driver.findElement(By.xpath("//Div"));
        System.out.println("Ahora los del DIv, cómo que no:---------------------\n"
                + elementDiv.getText());

    }
}
