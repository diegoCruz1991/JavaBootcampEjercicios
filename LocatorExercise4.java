package ejercicios.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;

public class LocatorExercise4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://es.wikipedia.org/wiki/Portada");
        driver.manage().window().maximize();

        WebElement portada = driver.findElement(By.linkText("Portada"));
        String hrefPortada = portada.getAttribute("href");
        System.out.println("hrefPortada = " + hrefPortada);

        List<WebElement> listaPagina = driver.findElements(By.partialLinkText("Página"));
        if (listaPagina.isEmpty()){
            System.out.println("No se encuentra la palabra Página");
        }
        for(WebElement paginas : listaPagina){
            System.out.println("href de la palabra página: "+paginas.getAttribute("href"));
        }

        List<WebElement> listaBotones = driver.findElements(By.tagName("button"));
        if (listaBotones.isEmpty()){
            System.out.println("No hay botones en la página");
        }
        for(WebElement botones : listaBotones){
            if (botones.getText().isEmpty()){
                System.out.println("No se cuenta con texto en los botones");
            }if (botones.getAttribute("title").isEmpty()){
                System.out.println("No cuenta con títulos los botones");
            }else{
                System.out.println("El título de los botones es: "+botones.getAttribute("title"));
            }
        }

        driver.close();//Cerrar el browser
        driver.quit();//Cerrar la sesión del driver
    }
}
