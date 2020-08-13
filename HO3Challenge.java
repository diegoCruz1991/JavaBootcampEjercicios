package tareas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HO3Challenge {
    private static WebDriver driver;
    private String webBrowser = "chrome";
    private String baseURL = "https://www.inaturalist.org/";
    private static WebDriverWait wait;

    @BeforeTest (description = "Abrir e ingresar a www.inaturalist.orf", alwaysRun = true)
    public void beforeTest(){
        driver = WebDriverFactory.getDriver(webBrowser);
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(groups = "Challenge", priority = 0)
    public static void places() throws InterruptedException {
        Actions actions = new Actions(driver);

        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[@class='navtab moretab menutab']"))));
        WebElement moreNav = driver.findElement(By.xpath("//li[@class='navtab moretab menutab']"));
        WebElement places= driver.findElement(By.xpath("//a[contains(text(), 'Places')]"));

        actions.moveToElement(moreNav).moveToElement(places).click().perform();

        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name=''q]"))));
        WebElement searchBox = driver.findElement(By.id("q"));
        searchBox.sendKeys("Colomos,Guadalajara");
        WebElement searchButton = driver.findElement(By.name("commit"));
        searchButton.click();

        Thread.sleep(3000);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("ul[class='taxon_links']"))));
        WebElement menuAnimales = driver.findElement(By.xpath("//ul[@class='taxon_links']"));
        List<WebElement> categories = menuAnimales.findElements(By.xpath("//ul[@class='taxon_links']//a"));

        int tamañoCategoria  = categories.size();
        int lastInd =0;

        while (lastInd < tamañoCategoria){
            System.out.println("Categoria : " + categories.get(lastInd).getText());
            categories.get(lastInd).click();

            String animal = driver.findElement(By.xpath("//span[@class='comname ']")).getText();
            System.out.println("animal = " + animal + "");
            lastInd++;
        }
    }

    @AfterTest
    public static void afterTest(){
            driver.close();
            driver.quit();
    }
}
