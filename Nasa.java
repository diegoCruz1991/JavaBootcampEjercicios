package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import sun.awt.image.ImageWatched;

import javax.xml.soap.Text;
import java.io.File;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class Nasa {
    public static void main(String[] args) {
        File rootPath = new File("testngtest/src/test/resources/drivers");
        File ChromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", ChromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nasa.gov");
        WebElement Missions = driver.findElement(By.partialLinkText("Missions"));
        System.out.println(Missions.getText());
        WebElement NasaTV = driver.findElement(By.partialLinkText("Nasa TV"));
        System.out.println(NasaTV.getText());
        WebElement Mars = driver.findElement(By.partialLinkText("Mars"));
        System.out.println(Mars.getText());
        java.util.List<WebElement> Input = driver.findElements(By.partialLinkText("input"));
        System.out.println(Input.size());
        for (int i = 1; i <= Input.size(); i = i + 1) {
            System.out.println(Input.get(i).getText());
            driver.quit();
            driver.close();
        }
    }
}