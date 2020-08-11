package ejercicios;

//import com.sun.deploy.net.proxy.WFirefoxProxyConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class SeleniumExercise3 {
    public static void main(String... args) throws InterruptedException{
        File rootpath = new File ("src/test/resources/drivers");
        File chromeFilePath = new File(rootpath, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/\n");
        Thread.sleep(5000);
        WebElement searchElement = driver.findElement(By.xpath("//input[@id = 'search']\n"));
        searchElement.sendKeys("selenium");
        Thread.sleep(5000);
        driver.close();
        driver.quit();


    }
}