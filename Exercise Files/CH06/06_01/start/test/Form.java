import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kizarcassiere/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        //*[@id="first-name"]
        //*[@id="last-name"]
        WebElement fname = driver.findElement(By.id("first-name"));
        fname.sendKeys("Kizar");

        WebElement lname = driver.findElement(By.id("last-name"));
        lname.sendKeys("Cassiere");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Software Engineer");

        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys();
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

//        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

       // driver.quit();
    }
}
