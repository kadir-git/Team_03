package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kayao\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.manage().window().maximize();

        String sayfaUrl = driver.getCurrentUrl();
        System.out.println(sayfaUrl);

        String sayfaTitle = driver.getTitle();
        System.out.println(sayfaTitle);

        driver.quit();




    }
}
