import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class WebDriverSelectItems {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.smirnov\\Downloads\\JAVA\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.urn.su/i/selenium/basic_test/");

        WebElement selectElement =
                driver.findElement(By.id("swords"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Dawn");


    }
}                                                                      
    