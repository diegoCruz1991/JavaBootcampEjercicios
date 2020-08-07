package MercadoLibre;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Excercise2{

	   Elements elements = new Elements();

    @Test(description = "INVALID TEST CASE")
    public void Test(){

        WebElement btnLogin = driver.findElement(elements.invalidLocator);
        System.out.println(btnLogin);
    }

    @AfterClass(alwaysRun = true)
    public void TearDown(){

        driver.quit();
    }
}
