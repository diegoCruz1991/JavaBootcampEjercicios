package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOnChallenge1 {
    static WebDriver driver;
    public static void main(String[] args){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        amazonSearch();

        System.out.println("Everything went better than expected");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
        driver.quit();
    }

    static void amazonSearch() {
        driver.get("https://www.amazon.com.mx");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("nintendo switch");
        searchBox.submit();

        WebElement nintendoCheckBox = driver.findElement(By.xpath("//li[@id='p_89/Nintendo']"));
        nintendoCheckBox.click();
        System.out.println("buscando solo nintendo de nintendo");

        WebElement fourStarsCheckBox = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']"));
        fourStarsCheckBox.click();
        System.out.println("puro premium maestro");


        WebElement sortDropdown = driver.findElement(By.id("s-result-sort-select"));
        Select selectOption = new Select(sortDropdown);
        selectOption.selectByValue("price-asc-rank");

        List<WebElement> mainResults = driver.findElements(By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS']/descendant::a[@class='a-link-normal a-text-normal']"));
        System.out.println(mainResults.get(0).getText());

    }
}
