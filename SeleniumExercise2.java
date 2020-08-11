package ejercicios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static java.lang.Thread.*;

public class SeleniumExercise2 {
    public static void main(String... args) throws InterruptedException {

        File rootpath = new File ("src/test/resources/drivers");
        File chromeFilePath = new File(rootpath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/\n");
        System.out.println("Titulo de Pagina: Google.com");
        System.out.println("https://www.google.com");

        sleep(5000);
        driver.navigate().to("https://www.facebook.com/");
        System.out.println("https://www.facebook.com/");
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        driver.navigate().to("https://www.espn.com/");
        System.out.println("https://www.espn.com/");
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        driver.navigate().back();
        sleep(1000);
        driver.navigate().forward();

        assert driver.getCurrentUrl().equals("https://www.facebook.com/");
        sleep(1000);
        driver.navigate().refresh();
        driver.close();
        driver.quit();


    }
}