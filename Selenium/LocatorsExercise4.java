package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {

    public static void main(String... args) throws InterruptedException {
        File rootPath = new File("JavaBootcampEjercicios/drivers");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://es.wikipedia.org/wiki/Portada");
        driver.manage().window().maximize();


        WebElement searchPortada = driver.findElement(By.linkText("Portada"));
        String portada = searchPortada.getAttribute("href");
        System.out.println(portada);

        System.out.println("--------------------------------------------------------");

        List<WebElement> searchPagina = driver.findElements(By.partialLinkText("Página"));
        for(int i = 0; i < searchPagina.size(); i++) {
            System.out.println(searchPagina.get(i).getText());
            System.out.println(searchPagina.get(i).getAttribute("href"));
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Elementos con tag name 'Button' son: ");
        List<WebElement> searchButton = driver.findElements(By.tagName("button"));
        if(searchButton.size() == 0) {
            System.out.println("No se encontraron tags de button");
        }else {
            for(int i = 0; i < searchButton.size(); i++ ) {
                System.out.println(searchButton.get(i).getText());
            }
        }


        driver.close();
        driver.quit();
    }
}
