package Animals.TestCase;

import Animals.Inputs.SetUp;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class TestCaseAnimals extends SetUp {

    Elements elements = new Elements();

    @Test(description = "ANIMALS TEST SCRIP")
    public void Test(WebDriver driver) {

        assertTrue(driver.findElement(elements.searchLocator).isDisplayed());
        System.out.println("SE ENCONTRO EL ELEMENTO" + " " + elements.searchLocator);

        WebDriverWait search = new WebDriverWait(driver, 5);
        search.until(ExpectedConditions.visibilityOfElementLocated(elements.searchLocator));

        WebElement $Search = driver.findElement(elements.searchLocator);
        $Search.click();
        System.out.println("SE HA DADO CLIC SOBRE EL CAMPO BUSQUEDA" + " " + elements.searchLocator);

        WebElement searchCamp = driver.findElement(elements.searhCampLocator);
        searchCamp.sendKeys("Colomos, Guadalajara");
        System.out.println("SE HA INGRESADO LA LOCALIZACION" + " " + elements.searhCampLocator);

        WebDriverWait $result =  new WebDriverWait(driver, 5);
        $result.until(ExpectedConditions.visibilityOfElementLocated(elements.resultLocator));

        List<WebElement> ResultLIST = driver.findElements(elements.resultLocator);
        for(int i=0; i<ResultLIST.size(); i++){
            ResultLIST.get(i).getTagName();
            WebElement list = driver.findElement(elements.resultLocator);
            System.out.println("------------------------------");
            System.out.println(list.getText() + " " +ResultLIST.get(i).isEnabled());
            System.out.println("------------------------------");
        }

        WebElement Result = driver.findElement(elements.resultLocator);
        Result.click();
        System.out.println("PRIMER RESULTADO" + " " + elements.resultLocator);

        WebDriverWait $espicies =  new WebDriverWait(driver, 5);
        $espicies.until(ExpectedConditions.visibilityOfElementLocated(elements.especiesLocator));

        WebElement espicies = driver.findElement(elements.especiesLocator);
        espicies.click();
        System.out.println("SE HA INGRESADO A LA SECCION DE ESPECIONES" + " " + elements.especiesLocator);

        WebDriverWait $filters =  new WebDriverWait(driver, 5);
        $filters.until(ExpectedConditions.visibilityOfElementLocated(elements.filters));

        WebElement filtro = driver.findElement(elements.filters);
        filtro.click();
        System.out.println("SE HA DADO CLIC SOBRE EL FILTRO" + " " + elements.filters);

        List<WebElement> Categoria = driver.findElements(elements.categoriesLocator);
        int objet_Animal = Categoria.size();
        int i = 0;
        while(i < objet_Animal) {
            Categoria.get(i).click();
            WebDriverWait objet = new WebDriverWait(driver, 2);
            objet.until(ExpectedConditions.visibilityOf(driver.findElement(elements.animalLocator)));
            WebElement Animal = driver.findElement(elements.animalLocator);
            System.out.println("------------------------------");
            System.out.println("CATEGORIA: " + Categoria.get(i).getAttribute("title") + "ANIMALES: " + Animal.getText());
            System.out.println("------------------------------");
            Categoria.get(i).click();
            i++;
        }

    }

}
