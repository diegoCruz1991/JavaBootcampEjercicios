package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExecise3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // used to set the default waiting time for page loading timeout.
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://www.amazon.com.mx");

        // 5.a
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("first div child of body");
        WebElement firstDiv = driver.findElement(By.xpath("//body/div"));
        System.out.println(firstDiv.getText());
        System.out.println("");

        // 5.b
        System.out.println("----------------------");
        System.out.println("last div child of body");
        List<WebElement> allBodyDivs = driver.findElements(By.xpath("//body/child::div"));
        WebElement lastDiv = allBodyDivs.get(allBodyDivs.size()-1);
        System.out.println(lastDiv.getText());
        System.out.println("");

        // 5.c
        System.out.println("----------------------");
        System.out.println("role attribute == navigation");
        List<WebElement> navigationElements = driver.findElements(By.xpath("//*[@role='navigation']"));
        Iterator iter = navigationElements.iterator();
        while(iter.hasNext()){
            WebElement temp = (WebElement) iter.next();
            System.out.println(temp.getText());
        }
        System.out.println("");

        // 5.d
        System.out.println("----------------------");
        System.out.println("class attribute contains nav");
        List<WebElement> classElements = driver.findElements(By.xpath("//*[contains(@class,'nav')]"));
        iter = classElements.iterator();
        while(iter.hasNext()){
            WebElement temp = (WebElement) iter.next();
            System.out.println(temp.getText());
        }
        System.out.println("");

        // 5.e
        System.out.println("----------------------");
        System.out.println("type attribute == submit && class attribute == nav-input");
        List<WebElement> Elements = driver.findElements(By.xpath("//*[@type='submit' and @class='nav-input']"));
        iter = Elements.iterator();
        while(iter.hasNext()){
            WebElement temp = (WebElement) iter.next();
            System.out.println(temp.getText());
        }
        System.out.println("");

        driver.close();
        driver.quit();
    }
}
