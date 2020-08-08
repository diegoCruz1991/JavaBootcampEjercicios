package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {

    public static void main(String... args){

//        1.Open Firefox/Chrome

        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2.Goto https://es.wikipedia.org/wiki/Portada

        driver.get("https://es.wikipedia.org/wiki/Portada");
        driver.manage().window().maximize();

//        3.Find link with text "Portada"

        WebElement linkWebElement = driver.findElement(By.partialLinkText("Portada"));

//        4.Print hyperlink "href" attibute

        System.out.println("Con el texto Portada");
        System.out.println(linkWebElement.getAttribute("href"));

//        5.Find all links that contain "Página" and print their text

        List<WebElement> linkstWebElementList = driver.findElements(By.partialLinkText("Página"));

//        6.Print hyperlink "href" attibute for each element found

        System.out.println("URLs que contienen la palabra Página");
        Iterator iterator1 = linkstWebElementList.iterator();
        while (iterator1.hasNext()) {
            WebElement webElement = (WebElement) iterator1.next();
            System.out.println(webElement.getAttribute("href"));
        }

//        7.Find all elements with tag name "button"

       List<WebElement> buttonWebElementList = driver.findElements(By.tagName("button"));

//        8.Print text of each element found

        System.out.println("Texto de cada objeto de tipo button");
        Iterator iterator2 = buttonWebElementList.iterator();
        while (iterator2.hasNext()) {
            WebElement webElement = (WebElement) iterator2.next();
            System.out.println(webElement.getAttribute("title"));
        }

        driver.close();
        driver.quit();
    }
}
