package ejercicios.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;

public class LocatorExercise3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.nasa.gov/");
        driver.manage().window().maximize();

        //driver.findElement(By.linkText(""));//Encuentra los links especificamente
        WebElement allMissions = driver.findElement(By.partialLinkText("Missions"));
        String enlace = allMissions.getAttribute("href");//Contiene el string en la cadena pero toma mayúsculas y minúscula
        System.out.println("enlace.getAttribute(\'href\') = " + enlace);

        WebElement nasaTV = driver.findElement(By.partialLinkText("NASA TV"));
        String hrefNasaTV = nasaTV.getAttribute("href");
        System.out.println("hrefNasaTV = " + hrefNasaTV);

        WebElement mars = driver.findElement(By.partialLinkText("Mars"));
        String hrefMars = mars.getAttribute("href");
        System.out.println("hrefNasaTV = " + hrefMars);

        List<WebElement> listaInputs = driver.findElements(By.tagName("input"));
        for(WebElement inputs : listaInputs){
            System.out.println("Inputs por id "+inputs.getAttribute("id"));
        }

        driver.close();//Cerrar el browser
        driver.quit();//Cerrar la sesión del driver
    }
}
