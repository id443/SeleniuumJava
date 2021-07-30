import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class WebDriverExplicitWait {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.smirnov\\Downloads\\JAVA\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // explicit wait                                                                                    
        WebDriverWait wait = new WebDriverWait(driver, 50);

        driver.get("http://www.urn.su/search.php");

        try {
            WebElement yandexField =
                    wait.until(presenceOfElementLocated(By.name("text")));
            yandexField.sendKeys("python");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            WebElement yButton =
                    wait.until(presenceOfElementLocated(By.className("ya-site-form__submit")));
            yButton.click();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}            