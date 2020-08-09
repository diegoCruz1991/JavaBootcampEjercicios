
package Excercise.TestCase;

import Excercise.Inputs.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Exercice3Xpath{

	    Elements elements = new Elements();

    @Test(description = "AMAZON TEST SCRIPT")
    public void Test(WebDriver driver){


        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(elements.ChildDiv));

        assertTrue(driver.findElement(elements.ChildDiv).isDisplayed());

        WebElement $First_Child_Div = driver.findElement(elements.ChildDiv);
        System.out.println("THE FIRST CHILD DIV ID: " + " " + $First_Child_Div.getAttribute("id"));

        List<WebElement> $Divs_list = driver.findElements(elements.listDivs);
        WebElement $LastChildDiv = $Divs_list.get($Divs_list.size()-1);
        System.out.println("THE LAST CHILD DIV ID:" + " " + $LastChildDiv.getAttribute("id"));

        List<WebElement> $navigationElements = driver.findElements(elements.navigation);
        for(WebElement objet : $navigationElements){
            System.out.println("ANY ElEMENT OF THE ROLE WITH ATTRIBUTE:" + " " + objet.getText());
        }

        List<WebElement> $Nav_class = driver.findElements(elements.nav);
        for(WebElement List_One : $Nav_class){
            System.out.println("THE CLASS ELEMENT:" + " " + List_One.getText());
        }

        List<WebElement> $Type_class = driver.findElements(elements.type);
        for(WebElement ListTwo : $Type_class){
            System.out.println("CLASSES AND SUBMITS OF THE NAV INPUT ELEMENT WHIT TYPE ATTRIBUTE:" + " " + ListTwo.getText());
        }


    }


    private void assertTrue(boolean displayed) {

        System.out.println("THE THE FIRST CHILD DIV IS VISIBLE" + " " + displayed);
    }
}