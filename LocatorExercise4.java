package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;

public class LocatorExercise4 {

    public static void main(String[] args){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://es.wikipedia.org/wiki/Portada");

        List<WebElement> elemportlist = driver.findElements(By.partialLinkText("Portada"));

        for(int i=0; i<elemportlist.size();i++)
            System.out.println(elemportlist.get(i).getAttribute("href"));
System.out.println("----Page----------");
       List<WebElement> elempagelist = driver.findElements(By.partialLinkText("Página"));
        for(int i=0; i<elempagelist.size();i++)
            System.out.println(elempagelist.get(i).getAttribute("href"));
        System.out.println("----Button----------");
        List<WebElement> elemtags = driver.findElements(By.tagName("button"));

        if(elemtags.isEmpty()){

                System.out.println("La lista esta vacia");

        }else {
        for(int i=0; i<elemtags.size();i++){
            System.out.println(elemtags.get(i).getAttribute("text"));
        }
        }

        driver.close();

        driver.quit();

    }
}