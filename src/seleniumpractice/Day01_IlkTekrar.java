package seleniumpractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_IlkTekrar {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\kayao\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);




    }
}
