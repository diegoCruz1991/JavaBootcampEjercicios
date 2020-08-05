package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class locatorsExercise3Ap {
    public static void main (String args[]) throws InterruptedException {
        File rootPath = new File("testngtest/src/test/resources/drivers");
        File chromeFilePath = new File(rootPath, "chromedriver");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.nasa.gov"); //Se abre el link de la nasa
        driver.manage().window().maximize(); //maximizamos pantall
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //timeout explisito de 10 seg

        WebElement missions = driver.findElement(By.linkText("Missions"));
        System.out.println(missions.getAttribute("href"));

        WebElement nasaTv = driver.findElement(By.linkText("NASA TV"));
        System.out.println(nasaTv.getAttribute("href"));

        WebElement moonToMars = driver.findElement(By.linkText("Moon to Mars"));
        System.out.println(moonToMars.getAttribute("href"));

        WebElement contanMars = driver.findElement(By.partialLinkText("Mars"));
        System.out.println(contanMars.getAttribute("href"));

        List <WebElement> tagNames = driver.findElements(By.tagName("input"));
        //System.out.println(tagNames.size());
        for(int i=0; i < tagNames.size(); i++) {
            System.out.println(tagNames.get(i).getAttribute("value"));
        }

        /*for(int i = 0; i < moonToMars.size(); i++) {
            System.out.println(i);
            System.out.println(moonToMars.get(i).getText());
            if(moonToMars.get(i).getText() == "Moon to Mars"){
                moonToMars.get(i).click();
            }
        }*/
        //Thread.sleep(10000);

        driver.close();
        driver.quit();

    }
}
