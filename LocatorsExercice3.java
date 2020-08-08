package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercice3 {
    public static void main(String...args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https:www.nasa.gov/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement textMissions = driver.findElement(By.linkText("Missions"));
        System.out.println("El valor del atributo href : " + textMissions.getAttribute("href"));
        WebElement textNasaTV = driver.findElement(By.linkText("NASA TV"));
        System.out.println("El valor del atributo href : " + textNasaTV.getAttribute("href"));
        WebElement textMars =  driver.findElement(By.partialLinkText("Mars"));
        System.out.println("El valor del atributo href : " + textMars.getAttribute("href"));
        List<WebElement> elementsName = driver.findElements(By.tagName("input"));
        if(!elementsName.isEmpty()){
            for (int i= 0; i< elementsName.size(); i++){
                System.out.println("El valor del atributo value : " + elementsName.get(i).getAttribute("value"));
            }
        }
        driver.close();
        driver.quit();

    }
}
