package ejercicios.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn3 {
    @Test
    public static void SearchAnimals() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.inaturalist.org");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        Actions actions =  new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[@class='navtab moretab menutab'][@class='navtab moretab menutab']"))));

        WebElement searchMoreNavTab =  driver.findElement(By.xpath("//li[@class='navtab moretab menutab']"));
        WebElement searchPlaces = driver.findElement(By.xpath("//*[@id='mainnav']/li[3]/div/ul/li[3]/a"));

        actions.moveToElement(searchMoreNavTab).moveToElement(searchPlaces).click().perform();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='q']"))));
        WebElement searchColomos = driver.findElement(By.xpath("//input[@name='q']"));
        searchColomos.sendKeys("Colomos, Guadalajara" + Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='taxon_links']"))));
        List<WebElement> searchCategories = driver.findElements(By.xpath("//ul[@class='taxon_links']//a"));
        for(WebElement element: searchCategories){
            System.out.println("Processing category " + element.getText());
            element.click();
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='shades']"))));
            try {
                String searchAnimal = driver.findElement(By.xpath("//span[@class='comname']")).getText();
                System.out.println(searchAnimal);
            } catch ( Exception e) {
                System.out.println("No Found Category");
            }
        }
        driver.close();
        driver.quit();
    }
}
