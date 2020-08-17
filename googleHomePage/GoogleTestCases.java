package newGoogle;

import Googleusersteps.pageObjects.GoogleHomePageObject;
import Googleusersteps.steps.GoogleHomeUserSteps;
import Googleusersteps.steps.GoogleResultsUserSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class GoogleTestCases extends BaseTestCase{
    @Test(priority = 1)
    public void testSearchContent(){
        this.myDriver.get("https://www.google.com");
        GoogleHomePageObject googleHomePageObject = new GoogleHomePageObject(myDriver);
        googleHomePageObject.isLoaded();

        GoogleHomeUserSteps googleUserSteps = new GoogleHomeUserSteps(this.myDriver);
        googleUserSteps.searchContent("Youtube");

        //Verificar si se cargo la página de resultados
    }

    @Test(priority = 2)
    public void testSearchContentFeelingLucky(){
        this.myDriver.get("https://www.google.com");

        GoogleHomeUserSteps googleUserSteps = new GoogleHomeUserSteps(this.myDriver);
        googleUserSteps.searchContentFeelingLucky("Youtube");

        //Verificar si se cargo la página de youtube
        GoogleHomePageObject googleHomePageObject = new GoogleHomePageObject(myDriver);
    }

    @Test(priority = 3)
    public void testSearchContentContext(){
        this.myDriver.get("https://www.google.com");
        GoogleHomeUserSteps googleUserSteps = new GoogleHomeUserSteps(this.myDriver);
        GoogleResultsUserSteps googleResultsUserSteps = googleUserSteps.searchContent("Youtube");
        List<WebElement> subList = googleResultsUserSteps.getResultsSubList(0,4);
        SoftAssert softAssert = new SoftAssert();

        for (WebElement webElement : subList){
            softAssert.assertTrue(webElement.getText().contains("Youtube"),"Contiene la palabra Youtube dentro de la página");
            webElement.click();
            List<WebElement> tempList = myDriver.findElements(By.xpath("//*[contains(text(),'youtube')]"));
            softAssert.assertFalse(tempList.isEmpty());
            myDriver.navigate().back();
        }

        //Verificar si los primeros 5 resultados tienen que ver con Youtube
        //-Contengan la palabra Youtube
        //-Si se le da clic te llevan a alguná página que contenga la palabra Youtube
    }

}

/*

    Definir un page object para la págian de resultados de google
    Definir un objeto de tipo user steps apra la página de resultados de foofle
    Terminar de definir los test case y definir el nuevo test case testSearchContentContext

 */
