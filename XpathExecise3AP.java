package ejercicios;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.io.File;
import java.util.concurrent.TimeUnit;


public class XpathExecise3AP {
    public static void main(String args[]) {
        File roothPath = new File("testngtest/src/test/resources/drivers");
        File chromeFilePath = new File(roothPath,"chromedriver");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.mx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //the WebElement list returns a list of all div childs of bofy
        List<WebElement> firstStep = driver.findElements(By.xpath("//body/div"));

        /*This Script only found two elements div childs of body. this elements are printed in console
        //with this iterator we're finish the bolow requirements
        Select first c11V child of body element - getText()
        Select last div child of body element*/
        for(WebElement divs : firstStep) {
            System.out.println(divs.getText());
        }
        System.out.println(firstStep.size()); //get the List size

        //Select any element with attribute role equal to navigation
        WebElement secondStep = driver.findElement(By.xpath("//*[@role='navigation']"));
        System.out.println(" ");
        System.out.println(secondStep.getText());

        //Select any element that contains nav under class attribute
        WebElement thirdStep = driver.findElement(By.xpath("//*[contains(@class,'nav')]"));
        System.out.println(" ");
        System.out.println(thirdStep.getText());

        //Select any element with type attribute equal submit and class attribute equal nav-input
        WebElement fourthStep = driver.findElement(By.xpath("//*[@type='submit' and  @class='nav-input']"));
        System.out.println(" ");
        System.out.println(fourthStep.getText());


        driver.close();
        driver.quit();
    }
}
