package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Locators4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // used to set the default waiting time for page loading timeout.
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://es.wikipedia.org/wiki/Portada");

        //Resize current window to the set dimension
        driver.manage().window().maximize();

        WebElement portada = driver.findElement(By.xpath("//a[contains(text(),'Portada')]"));
        System.out.println(portada.getAttribute("href"));

        List<WebElement> paginas = driver.findElements(By.xpath("//a[contains(text(),'Página')]"));
        Iterator iter = paginas.iterator();
        while (iter.hasNext()){
            WebElement temp = (WebElement) iter.next();
            System.out.println(temp.getText());
            System.out.println(temp.getAttribute("href"));
        }

        List<WebElement> buttons = driver.findElements(By.xpath("//input"));
        iter = buttons.iterator();
        while (iter.hasNext()){
            WebElement temp = (WebElement) iter.next();
            System.out.println(temp.getText());
        }

        driver.close();
        driver.quit();
    }
}
