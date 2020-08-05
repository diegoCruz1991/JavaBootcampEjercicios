package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class locatorsExercise4Ap {
    public static void main (String args[]) throws InterruptedException {
        File rootPath = new File("testngtest/src/test/resources/drivers");
        File chromeFilePath = new File(rootPath, "chromedriver");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://es.wikipedia.org/wiki/Portada");
        //Thread.sleep(1000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //encuentra un link con el nombre "portada"
        WebElement portadaLink = driver.findElement(By.linkText("Portada"));
        //Thread.sleep(1000);
        //System.out.println(portadaLink.getText());

        //Imprimimos su href
        System.out.println(portadaLink.getAttribute("href"));

        //obtenemo del dom todos los links que tengan como href "Portada"
        List<WebElement> attributeList = driver.findElements(By.linkText("Portada"));
        //System.out.println(attributeList.size());
        //System.out.println(attributeList.get(0).getAttribute("href"));

        //iteramos para inprimir todos los links o hrefs encontrados.
        for (int i=0; i < attributeList.size(); i++) {
            System.out.println(attributeList.get(i).getAttribute("href"));
        }

        //obtenemos el "
        List<WebElement> enPortada = driver.findElements(By.tagName("button"));
        System.out.println(enPortada.get(0));

        //Thread.sleep(1000);
        driver.close();
        driver.quit();

    }
}
