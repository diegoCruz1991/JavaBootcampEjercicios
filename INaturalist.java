package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class INaturalist {

    @Test
    public static void buscarAnimales() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.inaturalist.org");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement dropdownMore = driver.findElement(By.xpath("//li[@class='navtab moretab menutab']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(dropdownMore).build().perform();
        WebElement places = driver.findElement(By.xpath("//a[contains(@href,'places')]"));
        places.click();

        WebElement search = driver.findElement(By.id("q"));
        search.sendKeys("Colomos, Guadalajara");
        search.submit();

        List<WebElement> categories = driver.findElements(By.xpath("//div[@id='browsingtaxa']//a"));
        for(WebElement element : categories){
            element.click();
            //WebDriverWait wait = new WebDriverWait(driver, 120);
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='listed_taxa']")));
            Thread.sleep(5000);

            if(driver.findElement(By.xpath("//div[@id='listed_taxa']")).getText().equals("No hay especies que concuerden.")){
                System.out.println(element.getText() + "  :  "  + "No hay Especies");
            }else{
                WebElement thing = driver.findElement(By.xpath("//div[@id='listed_taxa']//span[@class='comname ']"));
                System.out.println(element.getText() + "  :  "  + thing.getText());
            }


        }

        driver.close();
        driver.quit();
    }
}
