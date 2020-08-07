package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExcercise4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://es.wikipedia.org/wiki/Portada");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchElementLink = driver.findElement(By.partialLinkText("Portada"));
        String typeValue=searchElementLink.getAttribute("href");
        System.out.println("Attribute Portada:"+typeValue);

        List<WebElement> searchLinks= driver.findElements(By.partialLinkText("Página"));
        for (int i=0; i<searchLinks.size(); i++)
        {
            System.out.println("Value of Href attribute:"+searchLinks.get(i).getAttribute("href"));
        }

        List<WebElement> searchElements= driver.findElements((By.tagName("button")));
        for (int j=0; j<searchElements.size(); j++)
        {
            System.out.println("Text of each element:"+searchElements.get(j).getText());
        }

        driver.close();
        driver.quit();

    }
}
