import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kizarcassiere/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitForm formpage = new submitForm();
        formpage.submitForm(driver);

        ConfirmationPage banner = new ConfirmationPage();
        banner.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", banner.getAlertBannerText(driver));

        driver.quit();
    }
}
