package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {
    public static void main(String... args) {
        WebDriver chromeBrowser = WebDriverFactory.getDriver("chrome");
        chromeBrowser.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        chromeBrowser.get("https://es.wikipedia.org/wiki/Portada");
        System.out.println(chromeBrowser.findElement(By.partialLinkText("Portada")).getAttribute("href"));
        List<WebElement> linksPagina = chromeBrowser.findElements(By.partialLinkText("Página"));
        if(linksPagina.isEmpty()){
            System.out.println("No hay elementos con partialLink: Página");
            chromeBrowser.close();
            chromeBrowser.quit();
        }
        System.out.println("Lista de textos de los elementos con PartialLink con Página");
        for(WebElement linkPag : linksPagina){
            System.out.println(linkPag.getText());
        }
        System.out.println("Lista de href de los elementos con PartialLink con Página");
        for (WebElement linkPag : linksPagina){
            System.out.println(linkPag.getAttribute("href"));
        }
        List<WebElement> botones = chromeBrowser.findElements(By.tagName("button"));
        if (botones.isEmpty()){
            System.out.println("No hay elementos con tag button");
            chromeBrowser.close();
            chromeBrowser.quit();
        }
        System.out.println("Lista de textos en botones");
        System.out.println(botones.size());
        for (WebElement boton : botones){
            System.out.println(boton.getText());
        }
        chromeBrowser.close();
        chromeBrowser.quit();
    }
}
