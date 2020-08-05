package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {
    public static void main(String... args){
        WebDriver chromeBrowser = WebDriverFactory.getDriver("chrome");
        chromeBrowser.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        chromeBrowser.get("https://www.nasa.gov/");
        System.out.println("Este es el Href de Missions: " + chromeBrowser.findElement(By.partialLinkText("Missions")).getAttribute("href"));
        System.out.println("Este es el Href de NASA TV: " + chromeBrowser.findElement(By.partialLinkText("NASA TV")).getAttribute("href"));
        System.out.println("Este es el Href de Mars: " + chromeBrowser.findElement(By.partialLinkText("Mars")).getAttribute("href"));
        List<WebElement> inputElements = chromeBrowser.findElements(By.tagName("input"));
        if(inputElements.isEmpty()){
            System.out.println("No se encontro ningun elemento con el tag input");
            chromeBrowser.close();
            chromeBrowser.quit();
        }
        System.out.println("Lista de valores de los Elements con tag input con tag input:");
        for(WebElement inputE : inputElements){
            System.out.println(inputE.getAttribute("value"));
        }
        chromeBrowser.close();
        chromeBrowser.quit();
    }
}
