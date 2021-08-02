import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTables {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.smirnov\\Downloads\\JAVA\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.urn.su/i/selenium/basic_test/");

        WebElement outerTable =
                driver.findElement(By.tagName("table"));
        WebElement innerTable =
                outerTable.findElement(By.tagName("table"));
        WebElement row =
                innerTable.findElements(By.tagName("td")).get(2);
        System.out.println(row.getText());

    }
} 