
Exercise 3

package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;

public class LocatorExercise3 {

    public static void main(String[] args){

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.nasa.gov");

        WebElement element = driver.findElement(By.partialLinkText("Missions"));

     System.out.println(element.getAttribute("href"));

     WebElement elemM = driver.findElement(By.linkText("NASA TV"));
     System.out.println(elemM.getAttribute("href"));

     WebElement elem = driver.findElement(By.partialLinkText("Mars"));

     System.out.println(elem.getAttribute("href"));

     List<WebElement> elemtaglist = driver.findElements(By.tagName("input"));

     if(elemtaglist.isEmpty()){
         System.out.println("La lista esta vacia");
     }

for (int i=0; i< elemtaglist.size();i++)
    System.out.println(elemtaglist.get(i).getAttribute("value"));


     driver.close();
     driver.quit();

    }
}
