package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class XpathExercise3 {

    public static void main(String[] args){

//        2.Open Amazon Page: https://www.amazon.com.mx/

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.mx/");

//       5.Create XPATHs to search this elements. For every one execute getText()
//        a.Select first div child of body element: XPATH  //body/child::div

        WebElement webElement1 = driver.findElement(By.xpath("//body/child::div[1]"));
        System.out.println("----------------------------------------> Inciso a)");
        System.out.println(webElement1.getText());

//        b.Select last div child of body element

        WebElement webElement2 = driver.findElement(By.xpath("//body/child::div[2]"));
        System.out.println("----------------------------------------> Inciso b)");
        System.out.println(webElement2.getText());

//        c.Select any element with attribute role equal to navigation  XPATH  //*[@role='navigation']

       WebElement webElement3 = driver.findElement(By.xpath("//*[@role='navigation']"));
       System.out.println("----------------------------------------> Inciso c)");
       System.out.println(webElement3.getText());

//        d.Select any element that contains nav under class attribute  XPATH  //*[contains(@class,'nav')]

        WebElement webElement4 = driver.findElement(By.xpath("//*[contains(@class,'nav')]"));
        System.out.println("----------------------------------------> Inciso d)");
        System.out.println(webElement4.getText());

 //       e.Select any element with type attribute equal submit and class attribute equal nav-input PATH //*[@type='submit'][@class='nav-input']

        WebElement webElement5 = driver.findElement(By.xpath("//*[@type='submit'][@class='nav-input']"));
        System.out.println("----------------------------------------> Inciso e)");
        System.out.println(webElement5.getText());

        driver.close();
        driver.quit();
    }
}
