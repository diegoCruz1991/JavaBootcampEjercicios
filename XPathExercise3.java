
package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;

public class XPathExercise3 {

    public static void main(String[] args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com.mx/");

        WebElement element = driver.findElement(By.xpath("//body/div[1]"));

        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.xpath("//body/div[last()]"));
        System.out.println(element1.getText());

        WebElement element2 = driver.findElement(By.xpath("//*[@role='navigation']"));
        System.out.println(element2.getText());

        List<WebElement> elementlist = driver.findElements(By.xpath("//*[contains(@class,'nav')]"));

        for(int i=0; i<elementlist.size();i++)
            System.out.println(elementlist.get(i).getText());

        WebElement element3 = driver.findElement(By.xpath("//*[@type='submit'][@class='nav-input']"));
            System.out.println(element3.getText());

            driver.close();
            driver.quit();
    }
}