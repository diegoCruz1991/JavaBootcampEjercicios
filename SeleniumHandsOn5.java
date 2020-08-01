package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class SeleniumHandsOn5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com.mx");

        WebElement searchField = driver.findElement(By.xpath("//div[@class = 'nav-search-field ']/input[@name = 'field-keywords']"));

        if (searchField.isEnabled()) {
            searchField.sendKeys("Nintendo Switch");

            WebElement searchButton = driver.findElement(By.cssSelector("div  input[type=submit][class=nav-input]"));

            searchButton.click();

            Thread.sleep(5000);

            //i[contains(@class, 'a-star-medium-3')]
            //i[contains(@class, 'a-star-medium-4')]
        }

        driver.close();
    }
}
