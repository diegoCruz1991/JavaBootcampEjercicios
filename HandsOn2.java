package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // used to set the default waiting time for page loading timeout.
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://www.espn.com.mx");

        // Select
        Select select = new Select(driver.findElement(By.xpath("//select[@id='league-nav']")));
        int sizeOfSelect = select.getOptions().size();
        int lastIndex = 2;

        while (lastIndex <= sizeOfSelect){

            if(lastIndex == 9){
                // Skip following options that break the script
                break;
            }

            if(lastIndex > 2){
                // Wait for scoreboard to load after first loop
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='scoreboard-top no-tabs']"))));

                // Procesar resultados de pagina ------------------------------------------------------------
                List<WebElement> nombreEquipos = driver.findElements(By.xpath("//span[@class='short-name']"));
                List<WebElement> resultados = driver.findElements(By.xpath("//div[@class='score-container']/span"));

                int teamIndex = nombreEquipos.size();
                int teamCurrentIndex = 0;

                while (teamCurrentIndex < teamIndex){
                    System.out.println("----------Current Match----------");
                    System.out.print(nombreEquipos.get(teamCurrentIndex).getText() + " Score = ");
                    System.out.println(resultados.get(teamCurrentIndex).getText());

                    System.out.print(nombreEquipos.get(teamCurrentIndex+1).getText() + " Score = ");
                    System.out.println(resultados.get(teamCurrentIndex+1).getText());

                    String nombreEquipo1 = nombreEquipos.get(teamCurrentIndex).getText();
                    String nombreEquipo2 = nombreEquipos.get(teamCurrentIndex+1).getText();

                    try {
                        int resultadoEquipo1 = Integer.parseInt(resultados.get(teamCurrentIndex).getText());
                        int resultadoEquipo2 = Integer.parseInt(resultados.get(teamCurrentIndex+1).getText());

                        if(resultadoEquipo1 == resultadoEquipo2){
                            System.out.println("Es un empate");
                        } else if (resultadoEquipo1 > resultadoEquipo2){
                            System.out.println("El ganador es " + nombreEquipo1);
                        } else {
                            System.out.println("El ganador es " + nombreEquipo2);
                        }
                        System.out.println("----------Next----------");
                        System.out.println("");
                    } catch (Exception e){
                        System.out.println("No hay resultados para este juego");
                        System.out.println("----------Next----------");
                        System.out.println("");
                    }
                    teamCurrentIndex++;
                    teamCurrentIndex++;
                }
                // Fin de procesar resultados de pagina ---------------------------------------------------------
            }

            WebElement navMenu = driver.findElement(By.xpath("//button[@class='button button-filter sm dropdown-toggle current-league-name']"));
            WebElement navOption = driver.findElement(By.xpath("//ul[@class='dropdown-menu league-nav med']/li["+lastIndex+"]"));

            Actions actions = new Actions(driver);
            actions.moveToElement(navMenu).moveToElement(navOption).click().perform();

            //Resultados
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Resultados »')]"))));
            WebElement resultados = driver.findElement(By.xpath("//a[contains(text(),'Resultados »')]"));
            resultados.click();

            lastIndex++;
        }
        driver.close();
        driver.quit();

    }
}
