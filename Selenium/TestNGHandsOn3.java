package ejemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestNGHandsOn3 extends HandsOn3 {

    @Test(alwaysRun = true)
    public void AnimalCategories() throws InterruptedException {
        driver.get("https://www.inaturalist.org/");

        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@class, 'btn btn-default btn-inat')]"));
        searchButton.click();

        WebElement search = driver.findElement(By.xpath("//input"));
        search.sendKeys("Colomos, Guadalajara");

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[1]"))));
        WebElement firstResult = driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[1]"));
        firstResult.click();

        WebElement spicies = driver.findElement(By.xpath("//div[@class='col-xs-2 statcol'][1]"));
        spicies.click();

        WebElement filters = driver.findElement(By.xpath("//div[@id='filter-container']/button[contains(@class,'btn btn-default dropdown-toggle')]"));
        filters.click();

        List<WebElement> categories = driver.findElements(By.xpath("//div[@id='filters-categories']/descendant::button"));
        int total = categories.size();
        int i = 0;
        while(i < total) {
            categories.get(i).click();
            wait.until(ExpectedConditions.visibilityOf
                    (driver.findElement(By.xpath("//div[@class='row grid']/descendant::a[@class='display-name comname'][1]"))));
            WebElement firstAnimal = driver.findElement(By.xpath("//div[@class='row grid']/descendant::a[contains(@class, 'display-name')][1]"));
            System.out.println("Category: " + categories.get(i).getAttribute("title") + " - Animal: " + firstAnimal.getText());
            categories.get(i).click();
            i++;
        }

        //Assert.assertEquals(i, 10);
    }
}
