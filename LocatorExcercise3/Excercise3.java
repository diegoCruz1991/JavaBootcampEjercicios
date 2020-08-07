package Nasa.TestCase;

import Nasa.Inputs.AttributsInputs;
import Nasa.Inputs.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.List;

public class Excercise3{
	
    Elements elements = new Elements();

    @Test(description = "NASA TEST SCRIP")
    public void Test(WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(elements.camp));

        assertTrue(driver.findElement(elements.camp).isDisplayed());

        WebElement $Missions = driver.findElement(elements.missions);
        System.out.println($Missions.getAttribute(AttributsInputs.name));

        WebElement $tVLink = driver.findElement(elements.tvSelect);
        System.out.println($tVLink.getAttribute(AttributsInputs.name));

        WebElement $Mars = driver.findElement(elements.Text);
        System.out.println($Mars.getAttribute(AttributsInputs.name));

        List<WebElement> input = driver.findElements(elements.input);
        assertEquals(AttributsInputs.Fonts + " " + input.get(2).getText());
        for(WebElement objet: input){
            System.out.println(objet.getAttribute(AttributsInputs.value));
        }

    }

    private void assertTrue(boolean displayed) {

        System.out.println("THE IMAGE IS VISIBLE" + " " + displayed);
    }

    private void assertEquals(String s) {

        System.out.println("THE FONT ELEMENT:" + " " + s);
    }
}