package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static java.lang.Thread.sleep;

public class LocatorsExercise5 {
    public static void main(String... args) throws InterruptedException {

        File rootpath = new File("src/test/resources/drivers");
        File chromeFilePath = new File(rootpath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.mx/\n");
        System.out.println("Titulo de Pagina: Amazon Mexico");
        System.out.println("https://www.amazon.com.mx/");

        sleep(5000);
    }
}
