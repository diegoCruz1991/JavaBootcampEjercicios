package ejercicios;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOnChallenge3  {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeTest (alwaysRun = true)
    public static void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,5);

    }

    @Test (priority = 1, groups = {"challenge"})
    public static void naturalistSearch() throws InterruptedException {
        driver.get("https://www.inaturalist.org/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement moreDropdown = driver.findElement(By.cssSelector("li[class='navtab moretab menutab']"));
        actions.moveToElement(moreDropdown).build().perform();;

        System.out.println("abrió el menú?");

        WebElement btnLugares = driver.findElement(By.cssSelector("a[href='/places']"));
        btnLugares.click();

        WebElement placeSearchbox = driver.findElement(By.id("q"));
        placeSearchbox.sendKeys("Colomos, Guadalajara");
        placeSearchbox.submit();

        String category;
        String lifeName;

        WebElement menuAnimales = driver.findElement(By.cssSelector("ul[class='taxon_links']"));
        List<WebElement> categorias = menuAnimales.findElements(By.cssSelector("a"));
        for (WebElement categoria : categorias) {
            category = categoria.getText();
            categoria.click();
            Thread.sleep(1000);
            try {
                WebElement elementoListado = driver.findElement(By.cssSelector("span[class='comname ']"));
                lifeName = elementoListado.getText();
                System.out.println("Categoría:" + category + " -> " + lifeName);
            } catch (NoSuchElementException nsee){
                System.out.println("Categoría:" + category + " -> Elementos no encontrados");
            }
        }

        System.out.println("Everything went better than expected");
    }

    @AfterTest (alwaysRun = true)
    public static void teardown(){
        driver.close();
        driver.quit();
    }

}
