package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2v {
    public static void main(String...args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.espn.com.mx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//*[contains(@class, 'button button-filter sm dropdown-toggle current-league-name')]"));
        button.click();

        List<WebElement> dropdownLigas = driver.findElements(By.xpath("//*[contains(@class, 'dropdown-menu league-nav med')]/child::li"));

        JavascriptExecutor je = (JavascriptExecutor) driver;

        for(int i=1; i<dropdownLigas.size(); i++){
            WebElement opcion =  dropdownLigas.get(i).findElement(By.xpath("./a"));
            if(opcion.isDisplayed()){
                System.out.println("Liga: " + opcion.getText());
                opcion.click();
            }else{
                WebElement button3 = driver.findElement(By.xpath("//*[contains(@class, 'button button-filter sm dropdown-toggle current-league-name')]"));
                button3.click();
                je.executeScript("arguments[0].scrollIntoView(true);", opcion);
                System.out.println("Liga: " + opcion.getText());
                opcion.click();
            }

            List<WebElement> liga = driver.findElements(By.xpath("//div[@class='scores-carousel']//ul[@class='cscore_competitors ']/li//span[@class='cscore_name cscore_name--long']"));
            List<WebElement> marcador = driver.findElements(By.xpath("//div[@class='scores-carousel']//ul[@class='cscore_competitors ']/li//div[@class='cscore_score update__score  ']"));

            for(int x=0; x<liga.size(); x++){

               if(x%2 == 0 && !marcador.isEmpty() && !marcador.get(x).getAttribute("innerText" ).isEmpty()){
                   if(Integer.parseInt(marcador.get(x).getAttribute("innerText" ) ) > Integer.parseInt(marcador.get(x + 1).getAttribute("innerText" ) )){
                       System.out.println("EL EQUIPO GANADOR ES : " + liga.get(x).getAttribute("innerHTML" ));
                   }else if(Integer.parseInt(marcador.get(x).getAttribute("innerText" ) ) < Integer.parseInt(marcador.get(x + 1).getAttribute("innerText" ) )){
                       System.out.println("EL EQUIPO GANADOR ES : " + liga.get(x + 1).getAttribute("innerHTML" ));
                   }else{
                       System.out.println("No hubo equipo ganador entre : " + liga.get(x).getAttribute("innerHTML" ) + " y " + liga.get(x + 1).getAttribute("innerHTML" ));
                   }
               }

                WebElement button2 = driver.findElement(By.xpath("//*[contains(@class, 'button button-filter sm dropdown-toggle current-league-name')]"));
                button2.click();
            }

        }

        driver.close();
        driver.quit();
    }
}
