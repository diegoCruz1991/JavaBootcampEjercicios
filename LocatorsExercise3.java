package ejercicios;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.WebDriverFactory;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {

    public static void main(String[] args) throws InterruptedException {

//        1.Open Firefox/Chrome

        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2.Goto https://www.nasa.gov/

        driver.get("https://www.nasa.gov");
        driver.manage().window().maximize();

 //       3.Find hyperlink with text "Missions"

        WebElement hyperLinkWebElement1 = driver.findElement(By.partialLinkText("Missions"));

 //       4.Print hyperlink "href" attibute (Hint: Use the method getAttribute from WebElement)

        System.out.println("Con el texto Missions");
        System.out.println(hyperLinkWebElement1.getAttribute("href"));

 //       5.Find hyperlink with text "NASA TV"

        WebElement hyperLinkWebElement2 = driver.findElement(By.partialLinkText("NASA TV"));

 //       6.Print hyperlink href attribute

        System.out.println("Con el texto NASA TV");
        System.out.println(hyperLinkWebElement2.getAttribute("href"));

//        7.Find hyperlink that contains text "Mars"

        WebElement hyperLinkWebElement3 = driver.findElement(By.partialLinkText("Mars"));

 //       8.Print hyperlink href attribute

        System.out.println("Con el texto Mars");
        System.out.println(hyperLinkWebElement3.getAttribute("href"));

 //       9.Find all elements with tag name input

        WebElement webElementList[] = driver.findElements(By.tagName("input")).toArray(new WebElement[0]);

//        10.For each element, print the value of the attibute "value"

        System.out.println("Con tag name input");
        List<WebElement> inputList = driver.findElements(By.tagName("input"));
        Iterator iterator = inputList.iterator();
        while (iterator.hasNext()) {
            WebElement temp = (WebElement) iterator.next();
            System.out.println(temp.getAttribute("value"));
        }

        driver.close();
        driver.quit();
    }
}
