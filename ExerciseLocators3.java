package ejercicios;

       import org.openqa.selenium.By;
       import org.openqa.selenium.WebDriver;
       import org.openqa.selenium.WebElement;
       import org.openqa.selenium.support.ui.WebDriverWait;
       import utils.WebDriverFactory;
       import java.util.Iterator;
       import java.util.List;
       import java.util.concurrent.TimeUnit;

public class ExerciseLocators3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://www.nasa.gov");
        driver.manage().window().maximize();

        WebElement missions = driver.findElement(By.xpath("//a[contains(text(),'Missions')]"));
        System.out.println(missions.getAttribute("href"));

        WebElement nasaTV = driver.findElement(By.xpath("//*[contains(text(),'NASA TV')]"));
        System.out.println(nasaTV.getText());

        WebElement mars = driver.findElement(By.xpath("//a[contains(text(),'Mars')]"));
        System.out.println(mars.getAttribute("href"));

        List<WebElement> input = driver.findElements(By.xpath("//input"));
        Iterator iter = input.iterator();
        while (iter.hasNext()){
            WebElement temp = (WebElement) iter.next();
            System.out.println(temp.getAttribute("value"));
        }

        driver.close();
        driver.quit();
    }
}

