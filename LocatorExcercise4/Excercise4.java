package Wikipedia.TestCase;

import Wikipedia.Inputs.AttributsInputs;
import Wikipedia.Inputs.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.List;

public class Excercise4 extends SetUp{
	
    Elements elements = new Elements();

    @Test(description = "WIKIPEDIA TEST SCRIP")
    public void Test(WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(elements.portada));

        assertTrue(driver.findElement(elements.portada).isDisplayed());

        WebElement $Cover_page = driver.findElement(elements.portada);
        System.out.println($Cover_page.getAttribute(AttributsInputs.name));

        List<WebElement> $Page = driver.findElements(elements.page);
        for(WebElement page: $Page){
            System.out.println(page.getAttribute(AttributsInputs.value));
            System.out.println(page.getAttribute(AttributsInputs.name));
        }

        List<WebElement> Buttons$ = driver.findElements(elements.button);
        assertEquals(AttributsInputs.Fonts + " " + Buttons$.get(0).getText());
        for(WebElement buttons: Buttons$){
            System.out.println(buttons.getText());
        }

    }

    private void assertTrue(boolean displayed) {

        System.out.println("THE COVER IS VISIBLE" + " " + displayed);
    }

    private void assertEquals(String s) {

        System.out.println("THE FONT ELEMENT:" + " " + s);
    }
}