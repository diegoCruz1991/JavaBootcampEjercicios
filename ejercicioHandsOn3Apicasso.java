package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ejercicioHandsOn3Apicasso {
    public static void main(String args[]) throws InterruptedException {
        File rootPath = new File("testngtest/src/test/resources/drivers");
        File chromeFilePath = new File(rootPath, "chromedriver");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://es-la.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("picassoa12@live.com");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("unam308135561");
        Thread.sleep(1000);
        driver.findElement(By.id("u_0_b")).click();
        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }
}
