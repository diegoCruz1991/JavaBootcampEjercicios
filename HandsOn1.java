package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class HandsOn1 {
    public static void main(String...args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.mx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Nintendo Switch");
        search.submit();

        WebElement checkboxNintendo = driver.findElement(By.xpath("//li[@id='p_89/Nintendo']//a"));
        checkboxNintendo.click();

        WebElement fourStars = driver.findElement(By.cssSelector("[class~='a-star-medium-4']"));
        fourStars.click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s-result-sort-select")));

        WebElement dropdownOrder = driver.findElement(By.id("s-result-sort-select"));
        Select opcion = new Select(dropdownOrder);
        opcion.selectByIndex(1);

        Thread.sleep(10000);

        WebElement product = driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//a[@class = 'a-link-normal a-text-normal']"));
        System.out.println("EL PRODUCTO ES : " + product.getText());

        driver.close();
        driver.quit();
    }
}
