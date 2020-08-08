package ejercicios.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercise3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com.mx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement firstChildDiv = driver.findElement(By.xpath("//body/div"));
        System.out.println("firstChildDiv id = " + firstChildDiv.getAttribute("id"));

        List<WebElement> listaDivs = driver.findElements(By.xpath("//body/child::div"));
        WebElement lastChildDiv = listaDivs.get(listaDivs.size()-1);
        System.out.println("lastChildDiv id = " + lastChildDiv.getAttribute("id"));

        List<WebElement> navigationElements = driver.findElements(By.xpath("//*[@role='navigation']"));
        for(WebElement Lista : navigationElements){
            System.out.println("Elementos con el rol 'navigation': "+Lista.getText());
        }

        List<WebElement> navClass = driver.findElements(By.xpath("//*[contains(@class,'nav')]"));
        for(WebElement Lista : navClass){
            System.out.println("Clases del elemento nav: "+Lista.getText());
        }

        List<WebElement> typeClass = driver.findElements(By.xpath("//*[@type='submit' and @class='nav-input']"));
        for(WebElement Lista : typeClass){
            System.out.println("Clases y Submits del elemento nav input con atributo type: "+Lista.getText());
        }

        driver.close();//Cerrar el browser
        driver.quit();//Cerrar la sesión del driver
    }
}
