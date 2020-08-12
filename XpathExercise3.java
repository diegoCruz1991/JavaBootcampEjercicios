package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercise3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com.mx/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchDivChild= driver.findElement(By.xpath("/html/body/div[1]"));
        System.out.println("Child Div:"+ searchDivChild.getText());

        List<WebElement> searchLastDiv= driver.findElements(By.xpath("/html/body/div[last()]"));
        for(WebElement element: searchLastDiv) {
            System.out.println("Last Div:" + element.getText());
        }

        List<WebElement>  searchElement= driver.findElements(By.xpath("//*[@role='navigation']"));
        for(WebElement element: searchElement) {
            System.out.println("Element Role Navigation:"+ element.getText());
        }
        List<WebElement> searchElement1= driver.findElements(By.xpath("//*[@*[contains(.,'nav')]]"));
        for(WebElement element: searchElement1) {
            System.out.println("Element Nav under Class:" + element.getText());
        }

        WebElement searchElement2= driver.findElement(By.xpath("//*[@type='submit' and @class='nav-input']"));
        System.out.println("Element Type Submit: "+ searchElement2.getText());


        driver.close();
        driver.quit();
    }
    }
