package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercise2 {

    static WebDriver driver;
    public static void main(String[] args){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        amazonSearch();

        System.out.println("Everything went better than expected");

        driver.close();
        driver.quit();
    }

    static void amazonSearch() {
        driver.get("https://www.amazon.com.mx");

        List<WebElement> elementsA = driver.findElements(By.xpath("//a"));

        System.out.println("Elementos 'a': ");
        for (WebElement elemento : elementsA) {
            System.out.println(elemento.getAttribute("href"));
        }
        System.out.println("HEEEEEAAADSS");
        List<WebElement> elementsHead = driver.findElements(By.xpath("//head/*"));

        System.out.println("Elementos 'head': ");
        for (WebElement elemento : elementsHead) {
            System.out.println(elemento.getText());
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
