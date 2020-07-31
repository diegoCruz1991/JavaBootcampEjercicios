package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {
    public static void main(String... args){
        WebDriver chromeBrowser = WebDriverFactory.getDriver("chrome");
        chromeBrowser.get("https://www.google.com");
        chromeBrowser.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        assert chromeBrowser.getCurrentUrl().equals("https://www.google.com/"): "No es google";
        WebElement searchBox = chromeBrowser.findElement(By.name("q"));
        searchBox.sendKeys("memes perrones");
        searchBox.submit();
        chromeBrowser.close();
        chromeBrowser.quit();
    }
}
