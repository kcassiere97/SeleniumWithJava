import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kizarcassiere/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();

//        WebElement dropdownMenu = driver.findElement(By.xpath("/html/body/div/div/div"));
//        dropdownMenu.click();

        WebElement autoCompleteItem = driver.findElement(By.id("autocomplete"));
        autoCompleteItem.click();





//        driver.quit();
    }
}
