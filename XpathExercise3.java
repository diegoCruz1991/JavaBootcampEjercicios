package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.awt.*;
import java.util.List;

public class XpathExercise3 {
    static public void main(String... args){
        WebDriver chromeBrowser = WebDriverFactory.getDriver("chrome");
        chromeBrowser.get("https://www.amazon.com.mx/");
        WebElement FirstDivChild = chromeBrowser.findElement(By.xpath("//body/child::div[1]"));
        System.out.println("First Div child in Body text: " + FirstDivChild.getText());
        WebElement DivLastChild = chromeBrowser.findElement(By.xpath("//body/div[last()]"));
        System.out.println("Last Div child in body text: " + DivLastChild.getText());
        WebElement navRoleElement = chromeBrowser.findElement(By.xpath("//*[@role='navigation']"));
        System.out.println("navigation role text: " + navRoleElement.getText());
        WebElement navClassRole = chromeBrowser.findElement(By.xpath("//*[contains(@class,'nav')]"));
        System.out.println("class contains nav: " + navClassRole.getText());
        WebElement tSubmitcNav = chromeBrowser.findElement(By.xpath("//*[@type='submit' and @class='nav-input']"));
        System.out.println("Text Type Submit and Class nav-input: " + tSubmitcNav.getText());
        chromeBrowser.close();
        chromeBrowser.quit();
    }
}
