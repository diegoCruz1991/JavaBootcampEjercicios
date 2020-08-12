package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn3 {
    private WebDriver driver;
    private String webBrowser = "chrome";
    private String baseURL = "https://www.inaturalist.org";
    private WebDriverWait wait;

    @BeforeTest // methods under this annotation will be executed prior to the first test case in the TestNG file.
    public void beforeTest(){
        // Init chrome driver
        driver = WebDriverFactory.getDriver(webBrowser);

        // used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // used to set the default page load time
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        wait = new WebDriverWait(driver,10);

        // open web page
        driver.get(baseURL);
    }

    @AfterTest // methods under this annotation will be executed after all test cases in the TestNG file are executed.
    public void afterTest(){
        if(webBrowser.toLowerCase().equals("chrome")){
            driver.close();
            driver.quit();
        } else if (webBrowser.toLowerCase().equals("firefox")){
            driver.close();
        }
    }

    @Test
    public void BuscarAnimalesEnColomosGDL(){
        Actions actions =  new Actions(driver);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[@class='navtab moretab menutab']"))));
        WebElement moreNavTab =  driver.findElement(By.xpath("//li[@class='navtab moretab menutab']"));
        WebElement places = driver.findElement(By.xpath("//a[contains(text(),'Places')]"));

        actions.moveToElement(moreNavTab).moveToElement(places).click().perform();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='q']"))));
        WebElement buscar = driver.findElement(By.xpath("//input[@name='q']"));
        buscar.sendKeys("Colomos, Guadalajara" + Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='taxon_links']"))));
        List<WebElement> categorias = driver.findElements(By.xpath("//ul[@class='taxon_links']//a"));

        int size = categorias.size();
        int lastIndex = 0;
        while (lastIndex < size){
            System.out.println("Processing category " + categorias.get(lastIndex).getText());
            categorias.get(lastIndex).click();
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='shades']"))));
            try {
                String animalName = driver.findElement(By.xpath("//span[@class='comname ']")).getText();
                System.out.println("---> " + animalName);
                System.out.println("");
            } catch ( Exception e) {
                System.out.println("---> " + "No results found for this category");
                System.out.println("");
            }
            lastIndex++;
        }
    }
}
