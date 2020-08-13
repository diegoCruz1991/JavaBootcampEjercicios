package ejercicios.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class HO1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://amazon.com.mx");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nintendo Switch", Keys.ENTER);

        WebElement checkMarca = driver.findElement(By.xpath("//li[@id=\'p_89/Nintendo\']/span/a/div/label/i"));
        checkMarca.click();

        WebElement fourStars = driver.findElement(By.xpath("//li[@id=\'p_72/7073863011\']/span/a/section/i"));
        fourStars.click();

        WebElement orderBy = driver.findElement(By.xpath("//select[@id=\'s-result-sort-select\']"));
        Select selectDropdown = new Select(orderBy);
        selectDropdown.selectByVisibleText("Precio: de más bajo a más alto");

        WebElement firstText = driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
        String text = firstText.getText();
        System.out.println("texto del primer enlace = " + text);

        Thread.sleep(2000);

        driver.close();//Cerrar el browser
        driver.quit();//Cerrar la sesión del driver
    }
}
