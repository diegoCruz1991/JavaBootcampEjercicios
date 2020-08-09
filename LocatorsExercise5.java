package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise5 {

    static WebDriver driver;
    public static void main(String[] args){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        amazonSearch();

        System.out.println("Everything went better than expected");

        driver.close();
        driver.quit();
    }

    static void amazonSearch(){
        driver.get("https://www.amazon.com.mx");

        WebElement dropdownMenu = driver.findElement(By.id("searchDropdownBox"));

        Select selectOption = new Select(dropdownMenu);
        List<WebElement> allOptions = selectOption.getOptions();

        System.out.println("Opciones disponibles: ");
        for(WebElement oneOption : allOptions){
            System.out.println(oneOption.getText());
        }
        System.out.println("Opciones disponibles: ");

        System.out.println("Is multiple: " + selectOption.isMultiple());
        selectOption.selectByIndex(0);
        System.out.println("First option: " + selectOption.getFirstSelectedOption().getText());
        selectOption.selectByVisibleText("Auto");
        System.out.println("Selected option: " + selectOption.getFirstSelectedOption().getText());


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
