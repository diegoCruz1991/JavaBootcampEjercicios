package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {

    public static void main(String... args) throws InterruptedException {
        File rootPath = new File("JavaBootcampEjercicios/drivers");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        File chromeFilePath = new File(rootPath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.nasa.gov/");
        driver.manage().window().maximize();


        WebElement searchMissions = driver.findElement(By.partialLinkText("Missions"));
        String missions = searchMissions.getAttribute("href");
        System.out.println(missions);

        WebElement searchNasaTv = driver.findElement(By.partialLinkText("NASA TV"));
        String nasaTv = searchNasaTv.getAttribute("href");
        System.out.println(nasaTv);

        WebElement searchMars = driver.findElement(By.partialLinkText("Mars"));
        String mars = searchMars.getAttribute("href");
        System.out.println(mars);

        List<WebElement> searchInput = driver.findElements(By.tagName("input"));

        for(int i = 0; i < searchInput.size(); i++ ) {
            if(searchInput.isEmpty()){
                System.out.println("No hay elementos con atributo value");
            }
            else {
                System.out.println(searchInput.get(i).getAttribute("value"));
            }
        }

        driver.close();
        driver.quit();
    }
}
