//https://www.andreyolegovich.ru/i/selenium_java/#intellij

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.smirnov\\Downloads\\JAVA\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        //wd.get("https://finviz.com/news.ashx");
       // wd.findElement(By.id("news"));
       wd.get("http://www.urn.su/i/selenium/basic_test/");
       // wd.get("http://localhost:8080");

        WebElement searchField =
                wd.findElement(By.id("name1"));

        searchField.sendKeys("topbicycle.ru");
        searchField.submit();

        WebElement renovationLink =
                wd.findElements(By.linkText("Renovation")).get(0);
        renovationLink.click();

    }
}
