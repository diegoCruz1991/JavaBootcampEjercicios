package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.nasa.gov/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchElement = driver.findElement(By.partialLinkText("Missions"));
        String typeValue=searchElement.getAttribute("href");
        System.out.println("Attribute Missions:"+typeValue);

        WebElement searchLink= driver.findElement(By.linkText("NASA TV"));
        String typeValueLink=searchElement.getAttribute("href");
        System.out.println("Attribute Nasa TV:"+typeValueLink);

        WebElement searchLink2= driver.findElement(By.partialLinkText("Mars"));
        String typeValueLink1=searchElement.getAttribute("href");
        System.out.println("Attribute Mars:"+typeValueLink1);

        List<WebElement> searchElements= driver.findElements((By.tagName("input")));
        for (int i=0; i<searchElements.size(); i++)
        {
            System.out.println("Value of attribute:"+searchElements.get(i).getAttribute("value"));
        }


        driver.close();
        driver.quit();
    }
}
