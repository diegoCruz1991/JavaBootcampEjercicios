package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercise3 {
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

        WebElement firstDivBody = driver.findElement(By.xpath("//body/div[1]"));
        System.out.println("Primer div dentro de body: \n"
                + firstDivBody.getText());

        WebElement lastDivBody = driver.findElement(By.xpath("//body/div[last()]"));
        System.out.println("último div dentro de body: \n"
                + lastDivBody.getText());

        WebElement anyNavigation = driver.findElement(By.xpath("//*[@role='navigation']"));
        System.out.println("Cualquiera con role navigation: \n"
                + anyNavigation.getText());

        WebElement anyClassNav = driver.findElement(By.xpath("//*[contains(@class, 'nav')]"));
        System.out.println("Cualquiera con class cque contenga nav: \n"
                + anyClassNav.getText());

        WebElement anySubmitNavInput = driver.findElement(By.xpath("//*[@class='nav-input' and @type='submit']"));
        System.out.println("Cualquiera de tipo submit y class igual a nav-input: \n"
                + anySubmitNavInput.getText());

    }
}
