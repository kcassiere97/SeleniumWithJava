import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/kizarcassiere/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.id("autocomplete"));
        address.click();
        address.sendKeys("13201 McCallen Pass, Austin, TX 78753");
        Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.className("pac_item"));
        autocompleteResult.click();
        Thread.sleep(1000);

        WebElement streetadd1 = driver.findElement(By.id("street_number"));
        streetadd1.click();
        streetadd1.sendKeys("13201 McCallen Pass");
        Thread.sleep(1000);

        WebElement city = driver.findElement(By.id("locality"));
        city.click();
        city.sendKeys("Austin");
        Thread.sleep(1000);

        WebElement state = driver.findElement(By.id("administrative_area_level_1"));
        state.click();
        state.sendKeys("Texas");
        Thread.sleep(1000);

        WebElement zipcode = driver.findElement(By.id("postal_code"));
        zipcode.click();
        zipcode.sendKeys("78753");
        Thread.sleep(1000);

        WebElement country = driver.findElement(By.id("country"));
        country.click();
        country.sendKeys("USA");
        Thread.sleep(1000);

        driver.quit();
    }
}
