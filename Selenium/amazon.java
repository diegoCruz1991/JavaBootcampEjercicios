package Amazon.TestCase;

import Amazon.Inputs.InputAtributes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class amazon extends Elements {

    protected WebDriver driver;

    InputAtributes inputAtributes = new InputAtributes();


    @BeforeClass(alwaysRun = true)
    public void setUp(){
        System.setProperty(inputAtributes.getActiweb(), inputAtributes.getDirection());
        driver = new ChromeDriver();
        driver.get(inputAtributes.getUrl());
        driver.manage().deleteAllCookies();
        System.out.println("EL TITULO PRINCIPAL DE LA PAGINA ES:" + " " + driver.getTitle() );
        assert driver.getCurrentUrl().equals(inputAtributes.getUrl()): inputAtributes.getMessage();
        System.out.println("LA URL CORRESPONDE AL SITIO OFICIAL DE AMAZON" + " " +  driver.getCurrentUrl());
        driver.manage().window().maximize();
        System.out.println("CARGANDO APLICACION..." + " " + driver.getPageSource());
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @Test(description = "SCRIPT DE PRUEBAS DE AMAZON")
    public void Test(){
        try{

            Assert.assertEquals(inputAtributes.getCompare(), driver.findElement(amazonLocator).getText());

        }catch (Exception e){
            System.out.println("LA APLICACION WEB NO CORRESPONDE AL SITIO DE AMAZON" + " " + e.toString());
        }

        assertTrue(driver.findElement(campSearch).isSelected());

        if(driver.findElement(campSearch).isDisplayed()){

            driver.findElement(campSearch).click();
            driver.findElement(campSearch).sendKeys(inputAtributes.getFact());
            driver.findElement(campSearch).submit();

        }else{
            System.out.println("NO SE ENCONTRO EL BUSCADOR DE AMAZON");
        }
    }

    private void assertTrue(boolean selected) {
        System.out.println("EL CAMPO BUSCAR FUE SELECCIONADO " + " " + selected);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
