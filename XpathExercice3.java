package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExercice3 {
    public static void main(String[] args) {
        File rootPath = new File("testngtest/src/test/resources/drivers");
        File ChromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", ChromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.mx");

        WebElement PrimerHijo = driver.findElement(By.xpath("//body/div"));
        System.out.println("El ID del primer hijo es " + PrimerHijo.getAttribute("id"));

        List<WebElement> lista = driver.findElements(By.xpath("//body/child::div"));
        WebElement UltimoHijo = lista.get(lista.size()-1);
        System.out.println("El ID del ultimo hijo es " + UltimoHijo.getAttribute("id"));

        List<WebElement> CualquierElemento = driver.findElements(By.xpath("//*[@role='navigation']"));
        for(WebElement Nave : CualquierElemento){
            System.out.println("Cualquier Elemento del rol con atributo  "+Nave.getText());
        }

        List<WebElement> CualquierAtributo = driver.findElements(By.xpath("//*[contains(@class,'nav')]"));
        for(WebElement Nave : CualquierAtributo){
            System.out.println("Clase del elemento nav " + Nave.getText());
        }

        List<WebElement> NavInput = driver.findElements(By.xpath("//*[@type='submit' and @class='nav-input']"));
        for(WebElement CualquierTipo : NavInput){
            System.out.println("Cualquier clase y Submit del elemento nav input y atributo type: "+CualquierTipo.getText());
        }
    }
}