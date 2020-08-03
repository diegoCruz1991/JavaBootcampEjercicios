package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ejercicioHandsOn2Apicasso {
    public static void main(String[] args) throws InterruptedException {

        File rootPath = new File("testngtest/src/test/resources/drivers");
        File chromeFilePath = new File(rootPath, "chromedriver");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //System.out.println(driver.getCurrentUrl());
        assert driver.getCurrentUrl().equals("https://www.google.com/"): "La url no es la esperada";

        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Ps4");

        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        Thread.sleep(1000);
        searchBar.sendKeys(Keys.ENTER);

        driver.close();
        driver.quit();
    }
}
