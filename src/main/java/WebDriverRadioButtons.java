import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButtons {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.smirnov\\Downloads\\JAVA\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.urn.su/i/selenium/basic_test/");

        List<WebElement> radioButtons =
                driver.findElements(By.name("house"));
        radioButtons.get(1).click();

        for (WebElement radioButton : radioButtons) {

            if (radioButton.isSelected()) {
                System.out.println(radioButton.getAttribute("value"));
            }
        }

    }
}    