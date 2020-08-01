package Facebook;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Facebook extends Elements{

    protected WebDriver driver;

    InputsAttributes inputsAttributes = new InputsAttributes();

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        System.setProperty(inputsAttributes.getActiweb(), inputsAttributes.getDirection());
        driver = new ChromeDriver();
        driver.get(inputsAttributes.getUrl());
        driver.manage().deleteAllCookies();
        System.out.println("EL TITULO DE LA PAGINA ES:" + " " + driver.getTitle());
        assert driver.getCurrentUrl().equals(inputsAttributes.getUrl()): inputsAttributes.getMessage();
        System.out.println("LA URL CORRESPONDE AL SITIO:" + " " + driver.getCurrentUrl());
        driver.manage().window().maximize();
        System.out.println("CARGANDO APLICACION ..." + " " + driver.getPageSource());
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

    }
    @Test(description = "SCRIPT DE PRUEBA DE FACEBOOK")
    public void Test(){

        try{
            Assert.assertEquals(inputsAttributes.getMessage01(), driver.findElement(createdLocator).getText());

        }catch (Exception e){
            System.out.println("NO SE HA INGRESADO AL SITIO DE FACEBOOK" + " " + e.toString());
        }

        if (driver.findElement(usercamp).isDisplayed()){

            driver.findElement(usercamp).click();
            driver.findElement(usercamp).sendKeys(inputsAttributes.getUser() + Keys.SHIFT);
            System.out.println("SE HA INGRESADO EL USUARIO:" + " " + inputsAttributes.getUser() + " " + "EN EL CAMPO");

            driver.findElement(password).click();
            driver.findElement(password).sendKeys(inputsAttributes.getPassword());
            driver.findElement(password).submit();
            System.out.println("SE HA INGRESADO LA CONTRASEÑA:" + " " + inputsAttributes.getPassword());

            driver.findElement(closeSesion).click();
            System.out.println("SE HA CERRADO LA SESION" + " " +  closeSesion);

        }else{
            System.out.println("NO SE PUDO INCIAR SESION EXITO");
        }

    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){

        //driver.quit();
    }

}
