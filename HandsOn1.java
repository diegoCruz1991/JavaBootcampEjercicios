package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class HandsOn1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // used to set the default waiting time for page loading timeout.
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // used to set the default waiting time throughout the program
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // used to set the waiting time for a particular instance only
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://www.amazon.com.mx");

        // Searchbox
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("Nintendo Switch" + Keys.ENTER);

        // Nintendo Checkbox
        WebElement nintendoCheckBox = driver.findElement(By.xpath("//li[contains(@id,'Nintendo')]//i"));
        nintendoCheckBox.click();

        // 4 or more stars
        WebElement starFilter = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']"));
        starFilter.click();

        // From lowest to highest
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@name='s']"))));
        Select select = new Select(driver.findElement(By.xpath("//select[@name='s']")));
        select.selectByIndex(1);

        // Print product with lowest price
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS']//a/span"))));
        WebElement firstResult = driver.findElement(By.xpath("//span[@cel_widget_id='MAIN-SEARCH_RESULTS']//a/span"));
        System.out.println(firstResult.getText());

        driver.close();
        driver.quit();

    }
}
