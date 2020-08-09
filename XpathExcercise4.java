package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathExcercise4 {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        seleniumWikiSearch();

        System.out.println("Everything went better than expected");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();

    }

    static void seleniumWikiSearch() {
        driver.get("https://es.wikipedia.org/wiki/selenium");

        List<WebElement> seleniumLinks = driver.findElements(By.xpath("//a[contains(text(),'Selenium')]"));
        System.out.println("Elementos 'a': ");
        for (WebElement link : seleniumLinks) {
            System.out.println(link.getAttribute("href"));
            link.click();
            List<WebElement> descendants = driver.findElements(By.xpath("//body/descendant::a/following-sibling::*"));
            for(WebElement descendant : descendants){
                System.out.println(descendant.getText());
            }
            driver.navigate().back();
        }
    }
}
