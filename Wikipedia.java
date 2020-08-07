package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import sun.awt.image.ImageWatched;

import javax.sound.sampled.Port;
import javax.xml.soap.Text;
import java.io.File;
import java.security.Key;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes;

public class Wikipedia {
    public static void main(String[] args) {
        File rootPath = new File("testngtest/src/test/resources/drivers");
        File ChromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", ChromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://es.wikipedia.com/wiki/Portada");
        WebElement Portada = driver.findElement(By.partialLinkText("Portada"));
        java.util.List<WebElement> links = driver.findElements(By.partialLinkText("Portada"));
        System.out.println(links.size());
        for (int i = 1; i <= links.size(); i = i + 1) {
            System.out.println(links.get(i).getText());
            //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            //driver.close();
            //driver.quit();
            //Decidi comentar estas lineas porque al correrlo no le da el tiempo suficiente para imprimir los textos y solo imprime 2 si lo corro sin comentar lineas
        }
    }
}