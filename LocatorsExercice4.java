package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercice4 {
    public static void main(String...args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://es.wikipedia.org/wiki/Portada");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement textPortada = driver.findElement(By.linkText("Portada"));
        System.out.println("El valor de atributo href para Portada es : " + textPortada.getAttribute("href"));
        List<WebElement> textPagina = driver.findElements(By.partialLinkText("Página"));
        if(!textPagina.isEmpty()){
            for(int i =0; i<textPagina.size(); i++){
                System.out.println("El valor del Atributo href  para Pagina es: " + textPagina.get(i).getAttribute("href"));
                System.out.println("Y el texto es: " + textPagina.get(i).getText());
            }
        }
        List<WebElement> nameButton = driver.findElements(By.tagName("button"));
        if(!nameButton.isEmpty()){
            for(int i =0; i<nameButton.size(); i++){
                System.out.println("El valor text es: " + nameButton.get(i) + nameButton.get(i).getText());
            }
        }

        driver.close();
        driver.quit();
    }
}
