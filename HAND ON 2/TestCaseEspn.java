package ESPN.TestCase;

import ESPN.Inputs.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Instant;
import java.util.List;

public class TestCaseEspn extends SetUp {

    public String lastIndex;
    Elements elements = new Elements();

    @Test(description = "AMAZON TEST SCRIP")
    public void Test(WebDriver driver){

        Select select = new Select (driver.findElement(elements.select));
        int Select = select.getOptions().size();
        int lastIndex = 2;

        while (lastIndex <= Select){

            if(lastIndex == 9){
                break;
            }

            WebDriverWait score = new WebDriverWait(driver, 5);
            score.until(ExpectedConditions.visibilityOf(driver.findElement(elements.score)));

            if(lastIndex > 2){

                List<WebElement> TeamName = driver.findElements(elements.Team);
                List<WebElement> results = driver.findElements(elements.Result);

                int teamIndex = TeamName.size();
                int teamCurrentIndex = 0;

                while (teamCurrentIndex < teamIndex){
                    System.out.println("PARTIDO ACTUAL");
                    System.out.print(TeamName.get(teamCurrentIndex).getText() + " PUNTUNCION = ");
                    System.out.println(results.get(teamCurrentIndex).getText());

                    System.out.print(TeamName.get(teamCurrentIndex+1).getText() + " PUNTUNCION = ");
                    System.out.println(results.get(teamCurrentIndex+1).getText());

                    String TeamNameOne = TeamName.get(teamCurrentIndex).getText();
                    String TeamNameTwo = TeamName.get(teamCurrentIndex+1).getText();

                    try {
                        int resultadoEquipo1 = Integer.parseInt(results.get(teamCurrentIndex).getText());
                        int resultadoEquipo2 = Integer.parseInt(results.get(teamCurrentIndex+1).getText());

                        if(resultadoEquipo1 == resultadoEquipo2){
                            System.out.println("Es un empate");
                        } else if (resultadoEquipo1 > resultadoEquipo2){
                            System.out.println("EL GANADOR ES:" + nombreEquipo1);
                        } else {
                            System.out.println("EL GANADOR ES:" + nombreEquipo2);
                        }
                        System.out.println("-----------------------------");
                        System.out.println("");
                    } catch (Exception e){
                        System.out.println("NO SE ENCONTRARON RESULTADO");
                        System.out.println("-----------------------------");
                        System.out.println("");
                    }
                    teamCurrentIndex++;
                    teamCurrentIndex++;
                }
            }

            WebElement Menu = driver.findElement(elements.Menu);
            WebElement Option = driver.findElement(By.xpath("//ul[@class='dropdown-menu league-nav med']/li["+lastIndex+"]"));

            Actions actions = new Actions(driver);
            actions.moveToElement(Menu).moveToElement(Option).click().perform();

            WebDriverWait result = new WebDriverWait(driver, 5);
            result.until(ExpectedConditions.visibilityOf(driver.findElement(elements.visibilityLocator)));
            WebElement $Result = driver.findElement(elements.consultResult);

                try {
                    Thread.sleep(10000);
                }catch (Exception e){
                    e.printStackTrace();
                }

            $Result.click();

            lastIndex++;
        }

    }

}