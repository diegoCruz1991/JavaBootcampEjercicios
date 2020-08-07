package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {
    static WebDriver driver;
    public static void main(String[] args){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wikiSearch();

        System.out.println("Everything went better than expected");

        driver.close();
        driver.quit();
    }

    static void wikiSearch(){
        driver.get("https://es.wikipedia.org/wiki/Portada");

        WebElement portadaLink = driver.findElement(By.linkText("Portada"));
        System.out.println(portadaLink.getAttribute("href"));

        List<WebElement> paginas = driver.findElements(By.partialLinkText("Página"));
        for(WebElement pagina: paginas){
            System.out.println(pagina.getAttribute("value"));
            System.out.println(pagina.getAttribute("href"));
        }

        List<WebElement> botones = driver.findElements(By.tagName("button"));
        for(WebElement botone: botones){
            System.out.println(botone.getText());
        }

    }
}
