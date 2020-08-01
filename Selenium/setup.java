package Google.Case;

import Google.Inputs.InputAttributes;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Setup extends Elements {
    protected WebDriver driver;

    InputAttributes inputAttributes = new InputAttributes();


    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.setProperty(inputAttributes.getExe(), inputAttributes.getDirection());
        driver = new ChromeDriver();
        driver.get(inputAttributes.getUrl());
        driver.manage().deleteAllCookies();
        System.out.println("EL TITULO ES:" + " " + driver.getTitle());
        assert driver.getCurrentUrl().equals(inputAttributes.getUrl());
        System.out.println("LA URL EN CORRECTA" + " " + driver.getCurrentUrl());
        driver.manage().window().maximize();
        System.out.print("CARGANDO APLICACION WEB..." + " " + driver.getPageSource());
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

    }
    @Test(description = "BUSCADOR DE GOOGLE")
    public void TestCase() {

        try {
            Assert.assertEquals(inputAttributes.getGoogle(), driver.findElement(buttonSearch).getText());
            System.out.println("BIENVENIDO AL BUSCADOR DE GOOGLE" + " " + inputAttributes.getGoogle());

        }catch (Exception e){
            System.out.println("NO CORRESPONDE A LA LIGA DE GOOGLE" + " " + e.toString());
            return;
        }
        
        if (driver.findElement(campInput).isDisplayed()){
            driver.findElement(campInput).click();
            driver.findElement(campInput).sendKeys(inputAttributes.getCamp());
            driver.findElement(campInput).submit();
            System.out.println("SE INGRESO LA PALABRA" + " " + inputAttributes.getCamp() + " " + "EN EL CAMPO");

        }else {
            System.out.println("NO SE ENCONTRO EL CAMPO DE BUSQUEDA DE GOOGLE");
        }
    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){

        driver.quit();
    }
}
