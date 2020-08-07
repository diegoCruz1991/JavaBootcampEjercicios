package MercadoLibre;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Excersice1{

	    Elements elements = new Elements();

    @Test(description = "SCRIPT DE MERCADO LIBRE")
    public void Test(){
        assertTrue(driver.findElement(elements.campSearch).isSelected());

        WebElement campSearch = driver.findElement(elements.campSearch);
        campSearch.click();
        campSearch.sendKeys("PS4");
        campSearch.submit();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(elements.producto));

        WebElement product = driver.findElement(elements.producto);
        product.click();
    }

    private static void assertTrue(boolean as_word) {
        System.out.println("SE HA SELECCIONADO EL CAMPO DE BUSQUEDA" + " " + as_word);
    }

    @AfterClass(alwaysRun = true)
    public void TearDown(){

        driver.quit();
    }
}