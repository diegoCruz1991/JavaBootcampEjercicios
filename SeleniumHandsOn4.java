package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4 {
    public static void main(String... args)throws Exception{
        WebDriver chromeBrowser = WebDriverFactory.getDriver("chrome");
        chromeBrowser.get("https://www.amazon.com.mx/");
        chromeBrowser.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        WebElement searchBox = chromeBrowser.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        Thread.sleep(10000);
        chromeBrowser.close();
        chromeBrowser.quit();
    }
}
