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

        WebElement UltimoHijo = driver.findElement(By.xpath("//body/child::div"));
        System.out.println("El ID del ultimo hijo es " + UltimoHijo.getAttribute("id"));

        WebElement CualquierElemento = driver.findElement(By.xpath("//*[@role='navigation']"));
        System.out.println("Cualquier Elemento del rol con atributo  "+ CualquierElemento.getText());

        WebElement CualquierAtributo = driver.findElement(By.xpath("//*[contains(@class,'nav')]"));
        System.out.println("Clase del elemento nav " + CualquierAtributo.getText());

        WebElement NavInput = driver.findElement(By.xpath("//*[@type='submit' and @class='nav-input']"));
        System.out.println("Cualquier clase y Submit del elemento nav input y atributo type: "+ NavInput.getText());

    }
}